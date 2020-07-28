package testSite.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testSite.MyTest;
import java.time.Duration;

public class Base {

    public static final long waitingTime = 30;
    static WebDriver driver;
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime));

    public static void click(By selector) { wait.until(ExpectedConditions.elementToBeClickable(selector)).click(); }
    public static void send(By selector, String text, By button) { wait.until(ExpectedConditions.elementToBeClickable(selector)).sendKeys(text); click(button); }
    public static void present(By selector) { wait.until(ExpectedConditions.presenceOfElementLocated(selector)); }
    public static String find(By selector) { return wait.until(ExpectedConditions.presenceOfElementLocated(selector)).getText(); }

}
