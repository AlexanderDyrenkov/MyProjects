package testSite;

import org.openqa.selenium.By;
import util.WebElementAction;

public class LoginPage {

    static final By userName = By.cssSelector("input[type=\"email\"]");
    static final By buttonNext = By.xpath("//button[.//span[contains(text(), \"Далее\")]]");

    public static void username(String strUserName){
        WebElementAction.send(userName, strUserName, buttonNext);
    }

}
