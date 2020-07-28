package testSite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import util.Browsers;
import util.Buttons;
import util.WebDriverFactory;
import java.util.concurrent.TimeUnit;
import static util.WebElementAction.waitingTime;

public class MyTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setUpBrowser() {
        driver = WebDriverFactory.getDriver(Browsers.CHROME);
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
