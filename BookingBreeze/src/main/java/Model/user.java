package Model;

public class user {

	private int userID;
	private String fullName;
	private String userEmail;
	private String userName;
	private String password;
	private String contactNumber;
	private String address;

	
	public String getFullName() {
		return fullName;
	}
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
	
	
	
}
