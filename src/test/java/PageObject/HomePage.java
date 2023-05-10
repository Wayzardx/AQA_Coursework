package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import com.codeborne.selenide.*;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private final SelenideElement homeSideBarBookCategoryButton = $(By.xpath("//button[@class='ui-btn-chapter' and @data-v-08e59b76='' and normalize-space(span[@class='ui-btn-chapter__text'])='Категорії книг']"));

    public void clickBookCategoryButton() {
        homeSideBarBookCategoryButton.shouldBe(Condition.exist, Duration.ofSeconds(5000)).click();
    }
}
