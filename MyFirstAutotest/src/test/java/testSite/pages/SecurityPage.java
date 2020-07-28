package testSite.pages;

import org.openqa.selenium.By;
import util.Buttons;

public class SecurityPage {

    static final By mainHeader = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //header[.//div[contains(text(), \"Настройки и рекомендации, которые помогают защитить аккаунт.\")]] //h1");
    static final String keyWord = "Безопасность";

    public static void pressButton(Buttons button) { LeftMenu.pressButton(mainHeader, keyWord, button); }

}
