package Steps;
import PageObject.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

    final String browser = "chrome";
    final String url = "https://www.yakaboo.ua/";

    @Given("configure browser")
    public void confChrome() {
        Configuration.browser = browser;
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
    }

    @And("the user is on the site Yakaboo")
    public void openYakabooWebSite() {
        Selenide.open(url);
    }

    @When("user click on book category in home side bar")
    public void ClickOnBookCategory() {
        HomePage homePage = new HomePage();
        homePage.clickBookCategoryButton();
    }

    @And("user click on random category in books category menu")
    public void clickOnRandomCategory() {
        HomeNavBar homeNavBar = new HomeNavBar();
        homeNavBar.clickRandomDivElement();
    }

    @And("user click on random book in book list")
    public void clickOnRandomBook() {
        CategoryMainPage bookList = new CategoryMainPage();
        bookList.clickRandomBook();
    }

    @And("user click on button add to cart")
    public void clickButtonAddToCart() {
        ProductContainerPage cartBtn = new ProductContainerPage();
        cartBtn.clickAddToCartBtn();
    }

    @And("user clicks back in the browser")
    public void moveBackInBrowser() {
        Selenide.back();
    }

    @And("user click on button buy now")
    public void clickBuyNowBtn() {
        ProductContainerPage buyNowBtn = new ProductContainerPage();
        buyNowBtn.clickBuyNowBtn();
    }

    @And("user enter personal details in checkout block")
    public void enterPersonalInfo() {
        CheckoutPage personalInfo = new CheckoutPage();
        personalInfo.enterPersonalDetailsInCheckoutBlock();

    }

    @And("user chose country,citi and method in delivery method")
    public void choseCountryCityDeliveryMethod() {
        CheckoutPage countryCityDelivery = new CheckoutPage();
        countryCityDelivery.choseCountryCityPayMethod();
    }

    @And("user chose payment method in payment method menu")
    public void chosePayMethod() {
        CheckoutPage payMethod = new CheckoutPage();
        payMethod.chosePayMethod();
    }

    @And("user create comments in comment title")
    public void enterComent() {
        CheckoutPage enterComent = new CheckoutPage();
        enterComent.enterComent();
    }

    @And("user click on button edit products in product list")
    public void clickEditProductBtn() {
        CheckoutPage clickEditProdBtn = new CheckoutPage();
        clickEditProdBtn.clickProductEditBtn();
    }

    @And("user click on button delete product in checkout product card")
    public void removeProduct() {
        CheckoutPage removeProduct = new CheckoutPage();
        removeProduct.removeProduct();
    }

    @And("user click on button confirm the order")
    public void confirmOrder() {
        CheckoutPage confirmOrder = new CheckoutPage();
        confirmOrder.clickConfirmOrderBtn();
    }

    @Then("user order was created")
    public void checkOrderSuccessInfoBlock() {
        ConfirmedOrderInfoPage orderInfoBlock = new ConfirmedOrderInfoPage();
        orderInfoBlock.confirmOrderInfoBlockSuccess();
    }
}
