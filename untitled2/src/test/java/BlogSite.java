import My_Site.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class BlogSite {

    WebDriver driver;
    HomePage homePage;
    SignInPage signInPage;
    SignUpPage signUpPage;
    StartPage startPage;
    ScreenshotMake makeScreenshot;
    EditPage editPage;

    private String site = "http://localhost:3000";

    @BeforeClass
    public void initDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @Test
    public void RegisterNewUser(){
        String email = "TEST@gmail.com", password = "qwerty12", name = "TEST";
        driver.get(site);
        startPage = new StartPage(driver);
        startPage.registerButton();
        signUpPage = new SignUpPage(driver);
        signUpPage.registerName(name);
        signUpPage.registerEmail(email);
        signUpPage.registerPassword(password);
        signUpPage.registerConfirmPass(password);
        signUpPage.buttonClick();
    }

    @Test
    public void AddNewPost(){
        String email = "TEST@gmail.com", password = "qwerty12", textPost = "I love my mom and dad";
        driver.get(site);
    }

    @AfterClass
    public void endtestclass() throws IOException, InterruptedException {
        makeScreenshot.Screenshot(driver,"rezultMyTest");
        driver.quit();

    }

}
