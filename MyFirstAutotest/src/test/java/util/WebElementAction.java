package util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testSite.MyTest;

public class WebElementAction {

    public static void click(By selector) { MyTest.wait.until(ExpectedConditions.elementToBeClickable(selector)).click(); }
    public static void send(By selector, String text, By button) { MyTest.wait.until(ExpectedConditions.elementToBeClickable(selector)).sendKeys(text); click(button); }
    public static void present(By selector) { MyTest.wait.until(ExpectedConditions.presenceOfElementLocated(selector)); }
    public static String find(By selector) { return MyTest.wait.until(ExpectedConditions.presenceOfElementLocated(selector)).getText(); }

}
