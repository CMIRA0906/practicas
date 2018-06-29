package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageMyAcount {

    @FindBy(id = "email")
    private WebElement txtEmail;


    @FindBy(id = "passwd")
    private WebElement txtPasswd;



}
