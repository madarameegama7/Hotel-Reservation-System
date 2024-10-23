package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Controller.DBConnect;
import Model.user;

public class userServices {
	public void insertData(user userModel) {
	    String sql = "INSERT INTO users (fullname, email, username, password, contactNumber, address) VALUES (?, ?, ?, ?, ?, ?)";

	    try (Connection con = DBConnect.getConnection(); 
	         PreparedStatement stmt = con.prepareStatement(sql)) {

	        System.out.println("Database connection successful.");

	        // Extract data from user model
	        String fullname = userModel.getFullName();
	        String email = userModel.getUserEmail();
	        String username = userModel.getUserName();
	        String password = userModel.getPassword(); // Consider hashing the password here
	        String contactNumber = userModel.getContactNumber();
	        String address = userModel.getAddress();

	        // Print the values being inserted
	        System.out.println("Inserting user: " + fullname + ", " + email + ", " + username);

	        // Set the values for each placeholder
	        stmt.setString(1, fullname);
	        stmt.setString(2, email);
	        stmt.setString(3, username);
	        stmt.setString(4, password);
	        stmt.setString(5, contactNumber);
	        stmt.setString(6, address);

	        // Execute the query
	        int rowsInserted = stmt.executeUpdate();
	        if (rowsInserted > 0) {
	            System.out.println("A new user was inserted successfully!");
	        } else {
	            System.out.println("No user was inserted.");
	        }
	        
	    } catch (Exception e) {
	        System.err.println("Error while inserting data: " + e.getMessage());
	        e.printStackTrace();
	    }
	}


    public void validateData() {
        try {
            // Validation logic
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showDetails() {
        try {
            // Logic to show user details
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateDetails() {
        try {
            // Logic to update user details
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteProfile() {
        try {
            // Logic to delete user profile
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
