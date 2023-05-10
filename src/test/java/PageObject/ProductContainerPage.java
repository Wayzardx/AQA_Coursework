package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.$;

public class ProductContainerPage {

    private final SelenideElement addToCartButton = $(By.xpath("//div[@class=\"product-sidebar__ordering\"]//button[@class=\"ui-btn-secondary add-to-cart\"]"));
    private final SelenideElement BuyNowButton = $(By.xpath("//div[@class=\"product-sidebar__ordering\"]//button[@class=\"ui-btn-primary add-to-cart\"]"));

    public void clickAddToCartBtn() {
        addToCartButton.shouldBe(Condition.exist, Duration.ofSeconds(5000)).click();
    }

    public void clickBuyNowBtn() {
        BuyNowButton.shouldBe(Condition.exist, Duration.ofSeconds(5000)).click();
    }
}
