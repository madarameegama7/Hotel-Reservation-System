package com.bs.dao;

import java.sql.Connection;

import com.bs.interfaces.IUserDAO;
import com.bs.model.User;
import com.bs.utility.DBConnect;

public class UserDAO implements IUserDAO {

    private static final String INSERT_USER="INSERT INTO users (fullname, email, username, password,"
    +"contactNumber, address) VALUES (?, ?, ?, ?, ?, ?);";

    private static final String UPDATE_USER = "UPDATE users SET " +
    "fullname = ?, " +
    "email = ?, " +
    "username = ?, " +
    "password = ?, " +
    "contactNumber = ?, " +
    "address = ? " +
    "WHERE userID = ?;";

    private static final String DELETE_USER = "DELETE FROM users WHERE userID = ?;";


	@Override
	public boolean insertDatauser(User user) {

        System.out.println(INSERT_USER);
        boolean rowInserted=false;

        try{
            Connection con = DBConnect.getConnection();
            java.sql.PreparedStatement pstmt = con.prepareStatement(INSERT_USER);

            pstmt.setString(1, user.getFullName());
            pstmt.setString(2, user.getUserEmail());
            pstmt.setString(3, user.getUserName());
            pstmt.setString(4, user.getPassword());
            pstmt.setString(5, user.getContactNumber());
            pstmt.setString(6, user.getAddress());

            pstmt.executeUpdate();
            
            rowInserted=true;
            

        }catch(Exception e){
            e.printStackTrace();

        }
		
		return rowInserted;
	}

	@Override
	public boolean updateDatauser(User user) {

        System.out.println(UPDATE_USER);
        boolean rowUpdated=false;

        try{
            Connection con = DBConnect.getConnection();
            java.sql.PreparedStatement pstmt = con.prepareStatement(UPDATE_USER);

            pstmt.setString(1, user.getFullName());
            pstmt.setString(2, user.getUserEmail());
            pstmt.setString(3, user.getUserName());
            pstmt.setString(4, user.getPassword());
            pstmt.setString(5, user.getContactNumber());
            pstmt.setString(6, user.getAddress());

            pstmt.setInt(7, user.getUserID());

            rowUpdated=pstmt.executeUpdate()>0;

            

        }catch(Exception e){
            e.printStackTrace();

        }
		
		return rowUpdated;
	}

	@Override
	public boolean deleteDatauser(int userID) {

        System.out.println(DELETE_USER);
        boolean rowDeleted=false;

        try{
            Connection con = DBConnect.getConnection();
            java.sql.PreparedStatement pstmt = con.prepareStatement(DELETE_USER);

            pstmt.setInt(1, userID);

            rowDeleted=pstmt.executeUpdate()>0;

        }catch(Exception e){
            e.printStackTrace();
        }
		
		return rowDeleted;
	}

    
}
