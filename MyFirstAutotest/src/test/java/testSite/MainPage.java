package testSite;

import org.openqa.selenium.By;
import util.Buttons;
import util.WebElementAction;

public class MainPage {

    static final By mainHeader = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //header[.//div[contains(text(), \"Настройте параметры конфиденциальности и безопасности, чтобы вам было ещё удобнее пользоваться сервисами Google.\")]] //h1");
    static final String keyWord = "Добро пожаловать";

    public static void pressButton(Buttons button) { LeftMenu.pressButton(mainHeader, keyWord, button); }
    public static void setAvatar() { WebElementAction.click(By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //button[@aria-label=\"изменить фото профиля\"]")); }

}
