package testSite;

import org.openqa.selenium.By;
import util.WebElementAction;

public class PasswordPage {

    static final By password = By.cssSelector("input[type=\"password\"]");
    static final By buttonNext = By.xpath("//button[.//span[contains(text(), \"Далее\")]]");
    static final By buttonMain = By.xpath("//a[@href=\"./\" and .//div[contains(text(), \"Главная\")] and @data-nav-type=\"9\"]");

    public static void password(String strPassword){
        WebElementAction.send(password, strPassword, buttonNext);
        WebElementAction.click(buttonMain);
    }

}
