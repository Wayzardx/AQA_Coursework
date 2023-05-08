package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private final SelenideElement homeSideBarBookCategoryButton = $(By.xpath("//*[@id=\"home\"]/div/div[1]/section/div/div[1]/button[1]"));

    public void clickBookCategoryButton() {
        homeSideBarBookCategoryButton.click();
    }
}
