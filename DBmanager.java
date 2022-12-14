package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class DBmanager{
    private String driver = "com.mysql.jdbc.driver";
    private String url = "jdbc:mysql://localhost/cont";
    private String uid = "root";
    private String password ="Ghule9688$";
    
    public void readDataBase(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, uid, password);
            Statement smt= conn.createStatement();
            ResultSet result = smt.executeQuery("select * from sc");
            System.out.println("id\t\tname\t\tnumber");
            while(result.next()) {
            	
            	System.out.println(result.getInt(1)+"\t\t"+result.getString(2)+"\t\t"+result.getInt(3));
            	
            	
            }
            conn.close();

        } catch (Exception e) {
        	System.out.println(e);
        }

    }
    
    public void insert(){
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, uid, password);
            Statement smt= conn.createStatement();
            System.out.println("Inserting records into the table...");
            System.out.println("Enter name and number of person :");
            Scanner s= new Scanner(System.in);
            Scanner p= new Scanner(System.in);
			int a= s.nextInt();
			String b= p.nextLine();
			int c= s.nextInt();
            
            String sql = "INSERT INTO sc VALUES('"+a+"', '"+b+"','"+c+"')";
            smt.executeUpdate(sql);
            conn.close();
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
    }
    
    public void update(){
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, uid, password);
            Statement smt= conn.createStatement();
            System.out.println("Enter id to update details :");
            Scanner s= new Scanner(System.in);
            Scanner p= new Scanner(System.in);
			int i= s.nextInt();
			System.out.println("Enter new name and number of person :");
			String a= p.nextLine();
			int b= s.nextInt();
			
            String sql = "UPDATE sc set name='"+a+"', num='"+b+"' WHERE id='"+i+"'  ";
            smt.executeUpdate(sql);
            conn.close();
        }
        catch (Exception e) {
        	System.out.println(e);
        }
        
    }
    
    public void delete(){
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, uid, password);
            Statement smt= conn.createStatement();
            System.out.println("Enter id to delete details :");
            Scanner s= new Scanner(System.in);
			int i= s.nextInt();
			
            String sql = "DELETE FROM sc WHERE id='"+i+"'";
            smt.executeUpdate(sql);
            conn.close();
        }
        catch (Exception e) {
        	System.out.println(e);
        }
    }
        
}