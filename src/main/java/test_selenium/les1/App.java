package test_selenium.les1;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;  
import org.openqa.selenium.support.ui.WebDriverWait; 
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty(  
                 "webdriver.ie.driver",  
                 "C:\\Program Files\\Internet Explorer\\IEDriverServer.exe");
    	
    	WebDriver driver = new InternetExplorerDriver();
    	driver.get("www.baidu.com");
    }
}
