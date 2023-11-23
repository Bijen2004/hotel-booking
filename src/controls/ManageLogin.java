package controls;

import models.UserLogin;

public class ManageLogin {
	//receive
	private UserLogin user;
	public ManageLogin() {
		this.user=new UserLogin();
	}
	
	public ManageLogin(UserLogin user) {
		this.user=user;
	}
	public UserLogin getUser() {
		return user;
	}
	public void setUser(UserLogin user) {
		this.user = user;
	}
	//process
	public void login() {
		this.user = new JdbcLogin().login(this.user);
	}
	//send
}