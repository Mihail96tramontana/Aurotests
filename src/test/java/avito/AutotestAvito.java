package avito;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class AutotestAvito {


    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
    void atomTest() {

        StepsWithAnnotations steps = new StepsWithAnnotations();

        //открываем страницу сайта
        steps.openSite();
        //ввод искомого запроса в поисковую строку сайта
        steps.inputValues();
        //фильтруем по самым дешёвым
        steps.filter();
        //сохраняем поиск
        steps.saveSearch();
        //клик по кнопке регистрации
        steps.clickRegister();

        //проверка результатов
        steps.checkResults();
    }
}
