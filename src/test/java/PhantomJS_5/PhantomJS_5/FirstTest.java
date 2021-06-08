package PhantomJS_5.PhantomJS_5;

import java.net.MalformedURLException;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

//import junit.framework.Assert;

public class FirstTest {
	
WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "lib/phantomjs.exe");
		WebDriver driver = new PhantomJSDriver(caps);

	}
	
	@Test
	public void firsttest()
	{
		driver.get("https://www.google.com/");
		driver.close();
		
	}
	
}



