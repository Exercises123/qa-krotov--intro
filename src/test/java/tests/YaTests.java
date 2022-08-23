package tests;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class YaTests {


    @Test
    void yandexTest() {
        open("https://www.yandex.ru/");

        $("#text").setValue("геральт из ривии").pressEnter();

        $(".main__center").shouldHave(Condition.text("геральт из чувашии"));

    }

}

