/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;

/**
 *
 * @author andre_000
 */
public class FornecedorDAO {
    
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public int insert(Fornecedor reg) {
        int codigo = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Fornecedor ");
        sql.append("(CNPJ,Nome,Telefone,Email) ");
        sql.append("VALUES(?,?,?,?)");
        try {
            con = ConnectionFactory.getConnection();
            pst = con.prepareStatement(sql.toString(), PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, reg.getCnpj());
            pst.setString(2, reg.getNome());
            pst.setString(3, reg.getTelefone());
            pst.setString(4, reg.getEmail());
            pst.executeUpdate();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                codigo = rs.getInt(1);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con,pst,rs);
        }
        return codigo;

    }
    
    public List<Fornecedor> selectAll(){
        return (selectAll("Nome"));
    }
    
     public List<Fornecedor> selectAll(String ordem){
        List<Fornecedor> lista = new ArrayList<Fornecedor>();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT Codigo,Nome,CNPJ,Telefone,Email FROM Fornecedor ");
        sql.append("ORDER BY ? ");
        try {
            con = ConnectionFactory.getConnection();
            pst = con.prepareStatement(sql.toString());
            pst.setString(1, ordem);
            rs = pst.executeQuery();
            while (rs.next()) {
                int rsCodigo = rs.getInt("Codigo");
                String rsNome = rs.getString("Nome");
                String rsCNPJ = rs.getString("CNPJ");
                String rsTelefone = rs.getString("Telefone");
                String rsEmail = rs.getString("Email");
                Fornecedor c = new Fornecedor(rsCodigo,rsCNPJ,rsNome,rsTelefone,rsEmail);
                lista.add(c);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con,pst,rs);
        }
        return lista;
    }
    
}
