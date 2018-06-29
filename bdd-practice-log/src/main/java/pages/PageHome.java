package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageHome {

    @FindBy(how = How.CLASS_NAME, using = "login")
    private WebElement lnkLogin;


}
