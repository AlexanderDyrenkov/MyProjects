package testSite.pages;

import org.openqa.selenium.By;
import testSite.base.Base;

public class LoginPage {

    static final By userName = By.cssSelector("input[type=\"email\"]");
    static final By buttonNext = By.xpath("//button[.//span[contains(text(), \"Далее\")]]");

    public static void username(String strUserName){
        Base.send(userName, strUserName, buttonNext);
    }

}
