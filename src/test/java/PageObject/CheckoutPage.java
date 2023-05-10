package PageObject;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    private final SelenideElement nameFild = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div/div[1]/section[1]/div/div/div[1]/div/div[2]/input"));
    private final SelenideElement secondNameFild = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div/div[1]/section[1]/div/div/div[2]/div/div[2]/input"));
    private final SelenideElement phoneNumberFild = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div/div[1]/section[1]/div/div/div[3]/div/div[2]/div[2]/div/div/div/input"));
    private final SelenideElement emailFild = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div/div[1]/section[1]/div/div/div[4]/div/div[2]/input"));
    private final SelenideElement cityFild = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div/div[1]/section[2]/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div/input"));
    private final SelenideElement choseCity = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div/div[1]/section[2]/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/ul/li[1]"));
    private final SelenideElement deliveryMethod = $(By.xpath("//*[@id=\"khreschatyk\"]"));
    private final SelenideElement commentFild = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div/div[1]/div[1]/div[2]/div/div/textarea"));
    private final SelenideElement editProductBtn = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div/div[2]/div/div[1]/div[1]/div"));
    private final SelenideElement removeProductBtn = $(By.xpath("/html/body/div[1]/div/div/div[9]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[2]/span"));

    public void enterPersonalDetailsInCheckoutBlock() {
        nameFild.sendKeys("TestNameAlex");
        secondNameFild.sendKeys("SecondTestNameAlex");
        phoneNumberFild.sendKeys("0935556677");
        emailFild.sendKeys("TestAlex@gmail.com");
    }

    public void choseCountryCityPayMethod() {
        cityFild.sendKeys("Київ");
        Selenide.sleep(500);
        choseCity.click();
        Selenide.sleep(1500);
        deliveryMethod.click();
    }

    public void chosePayMethod() {
        System.out.println("Log: >>> Chose Pay Method");
    }

    public void enterComent() {
        commentFild.sendKeys("TestComment");
    }

    public void clickProductEditBtn() {
        editProductBtn.click();
    }

    public void removeProduct() {
        removeProductBtn.click();
    }

    public void clickConfirmOrderBtn() {
        System.out.println("Log: >>>> Im click on confirm button and my order was created success!!!");
    }
}
