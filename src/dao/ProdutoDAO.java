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
import model.Produto;

/**
 *
 * @author andre_000
 */
public class ProdutoDAO {
    
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public int insert(Produto reg) {
        int codigo = 0;
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO Produto ");
        sql.append("(Descricao,Qtde,CustoMedio) ");
        sql.append("VALUES(?,?,?)");
        try {
            con = ConnectionFactory.getConnection();
            pst = con.prepareStatement(sql.toString(), PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, reg.getDescricao());
            pst.setInt(2, reg.getQtde());
            pst.setDouble(3, reg.getCustoMedio());
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
    
    public List<Produto> selectAll(){
        return (selectAll("Descricao"));
    }
    
      public List<Produto> selectAll(String ordem){
        List<Produto> lista = new ArrayList<Produto>();
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT Codigo,Descricao,Qtde,CustoMedio FROM Produto ");
        sql.append("ORDER BY ? ");
        try {
            con = ConnectionFactory.getConnection();
            pst = con.prepareStatement(sql.toString());
            pst.setString(1, ordem);
            rs = pst.executeQuery();
            while (rs.next()) {
                int rsCodigo = rs.getInt("Codigo");
                String rsDescricao = rs.getString("Descricao");
                int rsQtde = rs.getInt("Qtde");
                double rsCustoMedio = rs.getDouble("CustoMedio");
                Produto c = new Produto(rsCodigo,rsDescricao,rsQtde,rsCustoMedio);
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
