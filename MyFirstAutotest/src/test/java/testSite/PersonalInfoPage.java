package testSite;

import org.openqa.selenium.By;
import util.Buttons;

public class PersonalInfoPage {

    static final By mainHeader = By.xpath("//c-wiz[@data-savescroll = \"0\" and not(@data-savedfocusid)] //header[.//div[contains(text(), \"Основная информация (например, имя и фото), которую вы используете в сервисах Google.\")]] //h1");
    static final String keyWord = "Личная информация";

    public static void pressButton(Buttons button) { LeftMenu.pressButton(mainHeader, keyWord, button); }

}
