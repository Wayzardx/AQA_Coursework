package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductContainerPage {

    private final SelenideElement addToCartButton = $(By.xpath("//*[@id=\"product\"]/div[1]/div/div/section[2]/div/div/div[4]/button[2]"));
    private final SelenideElement BuyNowButton = $(By.xpath("//*[@id=\"product\"]/div[1]/div/div/section[2]/div/div/div[4]/button[1]"));

    public void clickAddToCartBtn() {
        addToCartButton.click();
    }

    public void clickBuyNowBtn() {
        BuyNowButton.click();
    }
}
