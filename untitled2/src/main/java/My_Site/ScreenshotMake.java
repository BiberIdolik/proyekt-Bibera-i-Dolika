package My_Site;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotMake {
    private WebDriver driver;
    public void Screenshot(WebDriver driver, String namePNGFile) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String filePath = "C:QA/myproject/lab-1-main/test/screenshot" + namePNGFile;
        FileUtils.copyFile(srcFile, new File(filePath));
    }

}
