package testSite.pages;

import org.openqa.selenium.By;
import util.Buttons;

public class AccessSettingsPage {

    static final By mainHeader = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //header[.//div[contains(text(), \"Люди, с которыми вы общаетесь, и настройки доступа к вашей информации в сервисах Google.\")]] //h1");
    static final String keyWord = "Настройки доступа";

    public static void pressButton(Buttons button) { LeftMenu.pressButton(mainHeader, keyWord, button); }

}
