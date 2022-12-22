package MVC_Login;

public class LoginModel {
	private String user;
	private String pass;
	
	public LoginModel(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}
	
	public LoginModel() {
		// TODO Auto-generated constructor stub
	}

	public void setuser(String user) {
		this.user = user;
	}
	
	public String getuser() {
		return this.user;
	}
	
	public void setpass(String pass) {
		this.pass = pass;
	}
	
	public String getpass() {
		return this.pass;
	}
}
