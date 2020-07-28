package testSite;

import org.openqa.selenium.By;
import util.Buttons;

public class DataAndPersonalizationPage {

    static final By mainHeader = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //header[.//div[contains(text(), \"Ваши данные и действия, а также настройки, которые помогают делать сервисы Google более полезными для вас.\")]] //h1");
    static final String keyWord = "Данные и персонализация";

    public static void pressButton(Buttons button) { LeftMenu.pressButton(mainHeader, keyWord, button); }

}
