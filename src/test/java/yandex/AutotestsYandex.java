package yandex;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutotestsYandex {


    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://passport.yandex.ru";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

 @Test
 void testRegisrtation() {

     //открываем страницу
     open("/registration");

     //поле имени
     $("#firstname").setValue("Михаил");
     //поле фамилии
     $("#lastname").setValue("Любезнов");
     //поле логина
     $("#login").setValue("mihail123lubeznow");
     //поле пароля
     $("#password").setValue("Fh[fyutk123");
     //поле повторения пароля
     $("#password_confirm").setValue("Fh[fyutk123");
     //клик по глазику
     $(".field-type__toggler").click();
     //номер мобильного телефона
     $("#phone").setValue("9951896940");
     //чекбокс соглашения на обработку данных (выключение)
     $("#eula_accepted").click();
     //кнопка регистрации
     $(".Button2").click();
     //кнопка получения кода
     $(".Button2").click();

     //проверка результата
     $(".registration__form-text").shouldHave(text("Минутку, код подтверждения отправлен на указанный номер"));
    }
}
