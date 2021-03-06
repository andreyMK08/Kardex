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
import model.Cliente;

/**
 *
 * @author andre_000
 */
public class ClienteDAO {

    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public int insert(Cliente reg) {
        int codigo = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Cliente ");
        sql.append("(CPF,Nome,Celular,Email) ");
        sql.append("VALUES(?,?,?,?)");
        try {
            con = ConnectionFactory.getConnection();
            pst = con.prepareStatement(sql.toString(), PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, reg.getCpf());
            pst.setString(2, reg.getNome());
            pst.setString(3, reg.getCelular());
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
    
    public List<Cliente> selectAll(){
        return (selectAll("Nome"));
    }
    
    public List<Cliente> selectAll(String ordem){
        List<Cliente> lista = new ArrayList<Cliente>();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT Codigo,CPF,Nome,Celular,Email FROM Cliente ");
        sql.append("ORDER BY ? ");
        try {
            con = ConnectionFactory.getConnection();
            pst = con.prepareStatement(sql.toString());
            pst.setString(1,ordem);
            rs = pst.executeQuery();
            while (rs.next()) {
                int rsCodigo = rs.getInt("Codigo");
                String rsCPF = rs.getString("CPF");
                String rsNome = rs.getString("Nome");
                String rsCelular = rs.getString("Celular");
                String rsEmail = rs.getString("Email");
                Cliente c = new Cliente(rsCodigo,rsCPF,rsNome,rsCelular,rsEmail);
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
