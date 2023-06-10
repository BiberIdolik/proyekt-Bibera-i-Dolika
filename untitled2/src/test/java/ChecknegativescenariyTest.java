// Generated by Selenium IDE

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ChecknegativescenariyTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeTest
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterClass
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void checknegativescenariy() {
    driver.get("https://localhost:3000/");
    driver.manage().window().setSize(new Dimension(1050, 708));
    driver.findElement(By.cssSelector(".header-actions__item--user svg")).click();
    driver.findElement(By.id("auth_email")).click();
    driver.findElement(By.id("auth_email")).sendKeys("sdf");
    driver.findElement(By.cssSelector(".auth-modal__submit")).click();
    driver.findElement(By.cssSelector(".error-message")).click();
  }
}
