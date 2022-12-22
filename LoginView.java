package MVC_Login;

import java.util.Scanner;

public class LoginView {
	public static Scanner sc = new Scanner(System.in);
	
	public void showMessage(String msg) {
		System.out.println(msg);
	}
	
	public LoginModel getInfo() {
		System.out.println("________LOGIN______");
		System.out.println();
		
		LoginModel userlogin = new LoginModel();
		System.out.print("User name: ");
		userlogin.setuser(sc.next());
		System.out.println("Password: ");
		userlogin.setpass(sc.next());
		return userlogin;
	}
}
