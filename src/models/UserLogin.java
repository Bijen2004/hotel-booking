package models;

public class UserLogin {
private int user_id;
private String userName;
private String userPass;




public UserLogin(int user_id, String userName, String userPass) {
	super();
	this.user_id = user_id;
	this.userName = userName;
	this.userPass = userPass;
}


public UserLogin() {
	this.user_id = 0;
	this.userName = "";
	this.userPass = "";
}


public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPass() {
	return userPass;
}
public void setUserPass(String userPass) {
	this.userPass = userPass;
}


@Override
public String toString() {
	return "User [uid=" + user_id + ", userName=" + userName + ", userPass=" + userPass + "]";
}


}
