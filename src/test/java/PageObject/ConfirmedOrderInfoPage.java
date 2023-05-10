package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmedOrderInfoPage {

    private final SelenideElement confirmOrderInfoBlock = $(By.xpath("//button[@class='ui-btn-secondary' and contains(text(), 'Підтвердити замовлення')]"));

    public void confirmOrderInfoBlockSuccess() {
        confirmOrderInfoBlock.shouldBe(Condition.exist);
        System.out.println("Log: >>>> I see window with my success order information!!!");
    }
}
