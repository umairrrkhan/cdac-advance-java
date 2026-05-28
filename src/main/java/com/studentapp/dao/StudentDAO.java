package com.studentapp.dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.sql.*;
import com.studentapp.model.User;


public class UserDAO{
	private static final String LOGIN_QUERY  = "SELECT id, username FROM users WHERE username = ? AND password = ?";
	
	try {
		Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(LOGIN_QUERY);
        {
        	ps.setStrign(1,username);
        	ps.setString(2, password);
        	try {
        		ResultSet rs = ps.executeQuery()){
        			if(rs.next()) {
        				user user = new user ();
        				thissl;nkfl;ankvzxlnk/
        			}
        		}
        	}
        }
	}
}
