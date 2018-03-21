package selenium;

import org.openqa.selenium.By;
import selenium.AutomateSystem;

public class Login extends UserData{
	

	public Login(String username, String password) {
		super(username, password);
		setUsername("danial_k007");
		setPassword("arash007");
	}

	static AutomateSystem automateSystem;
	

	
	public void Main() {
		automateSystem = new AutomateSystem("chrome", "https://www.instagram.com/accounts/login/");
		automateSystem.writeToElement(By.name("username"), getUsername());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		automateSystem.writeToElement(By.name("password"), getPassword());
		automateSystem.submitElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/article/div/div[1]/div/form/span/button"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		automateSystem.submitElement(By.xpath("/html/body/div[4]/div/button"));
	}
	
}
