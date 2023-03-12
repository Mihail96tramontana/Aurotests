package avito;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutotestAvito {


    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://www.avito.ru";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
    void testTwo() {
        //открываем страницу сайта
        open("https://www.avito.ru");
        //клик по кнопке категорий
        $(".top-rubricator-newRoot-_S44L").click();
        //выбираем категорию
        $(".new-rubricator-content-rootCategory-S2VPI").click();

    }
}
