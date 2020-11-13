/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.attempmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fullm
 */
public class Language implements Crud{
    
    private static final String url = "jdbc:mysql://localhost:3306/javapractice";
    private static final String user = "root";
    private static final String password = "";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    
    int id;
    String name;
    
    public Language(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    private Connection mysqlConnection() {
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }
        return con;
    }
    
    @Override
    public String getLanguage(){
        String query = String.format("SELECT * FROM languages WHERE id = %d", id);
        String result = "";
        try {
            Connection connect = this.mysqlConnection();
            stmt = connect.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                result = String.format("The ID %d corresponds to %s", rs.getInt(1), rs.getString(2));
            }
            return result;
        } catch (Exception e) {
            return e.getMessage();
        }        
    };
    
    @Override
    public String createLanguage(){
        String query = String.format("INSERT INTO languages (id, name) VALUES (%d, '%s')", id, name);
        String result = "";
        try {
            Connection connect = this.mysqlConnection();
            stmt = connect.createStatement();
            stmt.executeUpdate(query);
            result = String.format("Created language %s with id %d", name, id);
            return result;
        } catch(Exception e) {
            return e.getMessage();
        }
    }
    
    @Override
    public String deleteLanguage(){
        String query = String.format("DELETE FROM languages WHERE id = %d", id);
        String result = "";
        try {
            Connection connect = this.mysqlConnection();
            stmt = connect.createStatement();
            stmt.executeUpdate(query);
            result = String.format("Deleted %s languge with id %d", name, id);
            return result;
        } catch(Exception e) {
            return e.getMessage();
        }
    }
    
    @Override
    public String updateLanguage(){
        String query = String.format("UPDATE languages SET name = '%s' where id = %d", name, id);
        String result = "";
        try {
            Connection connect = this.mysqlConnection();
            stmt = connect.createStatement();
            stmt.executeUpdate(query);
            result = String.format("Updated language with id %d with new name %s", id, name);
            return result;
        } catch(Exception e) {
            return e.getMessage();
        }
    }           
}
