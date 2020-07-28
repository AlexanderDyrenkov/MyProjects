package testSite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.Browsers;
import util.Buttons;
import util.WebDriverFactory;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyTest {

    public static WebDriver driver;
    public static final long waitingTime = 30;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setUpBrowser() {
        driver = WebDriverFactory.getDriver(Browsers.CHROME);
        wait = new WebDriverWait(driver, Duration.ofSeconds(waitingTime));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(waitingTime, TimeUnit.SECONDS);
    }

    @Test
    public void loginTest() {

        driver.get("https://accounts.google.com/signin");
        LoginPage.username("testaldyr@gmail.com");
        PasswordPage.password("rf6ff6~%");
        MainPage.pressButton(Buttons.Личная_информация);
        PersonalInfoPage.pressButton(Buttons.Данные_и_персонализация);
        DataAndPersonalizationPage.pressButton(Buttons.Безопасность);
        SecurityPage.pressButton(Buttons.Настройки_доступа);
        AccessSettingsPage.pressButton(Buttons.Платежи_и_подписки);
        PaymentsAndSubscriptionsPage.pressButton(Buttons.Главная);

    }

    @AfterClass
    public static void tearDown() {

    }

}
