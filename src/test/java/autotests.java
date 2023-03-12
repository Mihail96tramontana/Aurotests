import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class autotests {


    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://passport.yandex.ru";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }

 @Test
 void testOne() {
     //шаг 1 открываем страницу
     open("https://passport.yandex.ru/registration");
     //шаг 2 поле имени
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
     //чекбокс соглашения на обработку данных
     //кнопка регистрации
    }
}
