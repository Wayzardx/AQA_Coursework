package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    private final SelenideElement nameFild = $(By.xpath("//input[@class='ui-base-input' and @name='first name']"));
    private final SelenideElement secondNameFild = $(By.xpath("//input[@class='ui-base-input' and @name='last name']\n"));
    private final SelenideElement phoneNumberFild = $(By.xpath("//input[@class='ui-base-input' and @type='tel']"));
    private final SelenideElement emailFild = $(By.xpath("//input[@name=\"email\"]\n"));
    private final SelenideElement cityFild = $(By.xpath("//input[@name=\"base-select-search\" and @placeholder=\"Введіть назву міста...\"]"));
    private final SelenideElement choseCity = $(By.xpath("//ul[@class=\"item-with-list__options\"]/li[contains(text(), \"Київ\")]"));
    private final SelenideElement deliveryMethod = $(By.xpath("//*[@id=\"khreschatyk\"]"));
    private final SelenideElement commentFild = $(By.xpath("//textarea[@placeholder='' and @class='ui-base-textarea']\n"));
    private final SelenideElement editProductBtn = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div/div[2]/div/div[1]/div[1]/div"));
    private final SelenideElement removeProductBtn = $(By.xpath("//span[@class='product-action-remove' and text()='Видалити']"));

    public void enterPersonalDetailsInCheckoutBlock() {
        nameFild.shouldBe(Condition.exist).sendKeys("TestNameAlex");
        secondNameFild.shouldBe(Condition.exist).sendKeys("SecondTestNameAlex");
        phoneNumberFild.shouldBe(Condition.exist).sendKeys("0935556677");
        emailFild.shouldBe(Condition.exist).sendKeys("TestAlex@gmail.com");
    }

    public void choseCountryCityPayMethod() {
        cityFild.shouldBe(Condition.exist).sendKeys("Київ");
        choseCity.shouldBe(Condition.exist).click();
        deliveryMethod.shouldBe(Condition.exist).click();
    }

    public void chosePayMethod() {
        System.out.println("Log: >>>> Chose Pay Method");
    }

    public void enterComent() {
        commentFild.shouldBe(Condition.exist).sendKeys("TestComment");
    }

    public void clickProductEditBtn() {
        editProductBtn.shouldBe(Condition.exist).click();
    }

    public void removeProduct() {
        removeProductBtn.shouldBe(Condition.exist).click();
    }

    public void clickConfirmOrderBtn() {
        System.out.println("Log: >>>> Im click on confirm button and my order was created success!!!");
    }
}
