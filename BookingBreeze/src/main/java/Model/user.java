package model;

public class User {

	private int userID;
	private String fullName;
	private String userEmail;
	private String userName;
	private String password;
	private String contactNumber;
	private String address;

	//getters and setters for variables defined above

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFullName() {
		return fullName;
	}
	public int getUserID() {
		return userID;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public String getPassword() {
		return password;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String getAddress() {
		return address;
	}

	//Default constructor
	public User() {
	}
	//Overloaded constructor
	public User(int userID,String fullName, String userEmail, String userName, String password,String contactNumber,String address){

		this.userID=userID;
		this.fullName=fullName;
		this.userEmail=userEmail;
		this.userName=userName;
		this.password=password;
		this.contactNumber=contactNumber;
		this.address=address;
	}

	//this string method is defined to display data in a string format
	//otherwise data will not be displayed
	@Override
    public String toString() {
    return "user{" +
        "userID=" + userID +
        ", fullName='" + fullName + '\'' +
        ", userEmail='" + userEmail + '\'' +
        ", userName='" + userName + '\'' +
        ", password='" + password + '\'' +
        ", contactNumber='" + contactNumber + '\'' +
        ", address='" + address + '\'' +
        '}';
}
	
	
}
