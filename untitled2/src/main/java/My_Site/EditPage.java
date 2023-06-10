package My_Site;

import BasedPage.Based_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EditPage extends Based_Page {

    public EditPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }
}
