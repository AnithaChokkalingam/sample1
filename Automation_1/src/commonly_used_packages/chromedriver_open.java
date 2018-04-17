package commonly_used_packages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class chromedriver_open {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	      WebDriver driver = new ChromeDriver();              
	      driver.get("http://www.google.com");
	      System.out.println("entered chrome");
	      driver.close();
	}
	
}

