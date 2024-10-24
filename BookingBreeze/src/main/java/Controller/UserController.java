package controller;

import com.bs.dao.UserDAO;
import com.bs.interfaces.IUserDAO;
import java.com.bs.model.User;

public class UserserController {

    private final IUserDAO userDAO;

    public UserController(){
        this.userDAO = new UserDAO();
    }

    public void insertData(String fullName, String userEmail, String userName, String password, String contactNumber, String address) {
        User user = new User();
        user.setFullName(fullName);
        user.setUserEmail(userEmail);
        user.setUserName(userName);
        user.setPassword(password);
        user.setContactNumber(contactNumber);
        user.setAddress(address);
    }

    public void deleteProfile(int userID) {
        userDAO.deleteDatauser(userID);
    }

    // public void validateData() {
    //     try {
    //         // Validation logic
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    // public void showDetails() {
    //     try {
    //         // Logic to show user details
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }

    // public void updateDetails() {
        
    // }
}
