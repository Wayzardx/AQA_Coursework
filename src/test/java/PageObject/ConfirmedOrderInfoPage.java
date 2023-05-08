package PageObject;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmedOrderInfoPage {

    private final SelenideElement confirmOrderInfoBlock = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div/div[2]/div/div[2]/div/section/div/div[5]/button"));

    public void confirmOrderInfoBlockSuccess() {
        confirmOrderInfoBlock.shouldBe(Condition.visible);
        System.out.println("Log: >>>> I see window with my success order information!!!");
    }
}
