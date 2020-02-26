package com.complex.tests;


import java.sql.*;

public class DatabaseHandling {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
        String dbUrl = "jdbc:mysql://127.0.0.1:3306/product";

        //Database Username
        String username = "root";

        //Database Password
        String password = "Dibash1993";

        //Query to Execute
        String query = "select *  from login;";

        //Load mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,username,password);

        //Create Statement Object
        Statement stmt = con.createStatement();




/*
        String query_insert = " Insert into login (id, username , password) values(?,?,?)";
        // create the mysql insert preparedstatement
        PreparedStatement preparedStmt = con.prepareStatement(query_insert);
        for(int i=2;i<=50;i++){
            preparedStmt.setInt(1, i);
            preparedStmt.setString(2, "test_"+i);
            preparedStmt.setString(3, "testingpassword_"+i);
        }
        // execute the preparedstatement
        preparedStmt.execute();
*/


















        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){

            String myName = rs.getString(1);
            String myAge = rs.getString(2);
            System. out.println(myName+"  "+myAge);
        }
        // closing DB Connection
        con.close();


    }

}
