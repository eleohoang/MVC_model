package MVC_Login;
	
public class LoginController {
	private LoginView view;
	
	public LoginController(LoginView view) {
		this.view = view;
	}
	
	private boolean check(LoginModel loginuser) {
		if ((loginuser.getuser().equals("admin")) &&
		   (loginuser.getpass().equals("123"))) {
			return true;
		}
		return false;
	}
	
	public void login() {
		while (true) {
			LoginModel loginuser = view.getInfo();
			if(check(loginuser)) {
				view.showMessage("Login successfully");
				break;
			} else {
				view.showMessage("Wrong username or password");
			}
		}
	}
}
