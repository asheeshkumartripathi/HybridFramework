package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.google.common.base.Throwables;
import com.util.TestUtil;
import com.util.TestUtil;

public class BaseClass {
	
	
	public static WebDriver driver;
	public static Properties prop;
	private static Object chrome;
	
	public BaseClass() {
		try {
			 prop = new Properties();
			FileInputStream fip = new FileInputStream("F:\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse\\"
					+ "New folder\\HybridFramework\\src\\main\\java\\com\\configuration\\Configuration.properties");
			prop.get(fip);
			}
		
			catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			
			catch (IOException e) {
				
				e.printStackTrace();
			}
		} 
	

	public static void initilization() {
		String bname=prop.getProperty("browser");
		//String browsername=prop.getProperty("browser");
		
		
		if(bname.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\eclipse-java-oxygen-3a-win32-x86_64\\"
					+ "eclipse\\Jars\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		else if(bname.equals("FF")){
			System.setProperty("webdriver.chrome.driver", "F:\\eclipse-java-oxygen-3a-win32-x86_64\\"
					+ "eclipse\\Jars\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		else if(bname.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "F:\\eclipse-java-oxygen-3a-win32-x86_64\\"
					+ "eclipse\\Jars\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			
		}
		else {
			System.out.println("Connection could not be established");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().pageLoadTimeout(15., TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		}

		
		
	}


