package avito;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutotestAvito {


    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
    void testTwo() {
        //открываем страницу сайта
        open("https://www.avito.ru");
        //ввод искомого запроса в поисковую строку сайта
        $(".input-input-Zpzc1").setValue("Atomic Heart на пк").pressEnter();
        //фильтруем по самым дешёвым
        $(".select-select-IdfiC").click();
        $(byText("Дешевле")).click();
        //сохраняем поиск
        $(".styles-module-root-_uNWU").click();
        //клик по кнопке регистрации
        $(".css-1gud50c").click();

    }
}
