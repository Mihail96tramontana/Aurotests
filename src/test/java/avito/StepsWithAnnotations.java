package avito;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StepsWithAnnotations {

    @Step("Открываем страницу сайта")
    public void openSite() {
        open("https://www.avito.ru");
    }

    @Step("Ввод искомого запроса в поисковую строку сайта")
    public void inputValues() {
        $(".input-input-Zpzc1").setValue("Atomic Heart на пк").pressEnter();
    }

    @Step("Фильтруем по самым дешёвым")
    public void filter() {
        $(".select-select-IdfiC").click();
        $(byText("Дешевле")).click();
    }

    @Step("Сохраняем поисковый запрос")
    public void saveSearch() {
        $(".styles-module-root-_uNWU").click();
    }

    @Step("Клик по кнопке регистрации")
    public void clickRegister() {
        $(".css-1gud50c").click();
    }

    @Step("Проверка результатов")
    public void checkResults() {
        $("[name=username]").shouldBe(empty);
        $(".EnterPhoneForm-container-ihcDc").shouldHave(text("Регистрация"),
                text("Уже есть профиль?"));
    }
}
