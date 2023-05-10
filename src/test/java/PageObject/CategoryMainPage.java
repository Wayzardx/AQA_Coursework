package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class CategoryMainPage {

    private final SelenideElement bookListDiv = $(By.xpath("//div[@class=\"category__cards\"]//div[@class=\"product-listing view-category\"]"));

    public void clickRandomBook() {
        bookListDiv.shouldBe(Condition.exist);
        List<SelenideElement> innerDivs2 = bookListDiv.$$x(".//a[contains(@class, 'category-card__image')]");
        Random random = new Random();
        int randomIndex = random.nextInt(innerDivs2.size());
        SelenideElement randomBookDiv = innerDivs2.get(randomIndex);
        System.out.println("Log: >>>> Random chose this book ---> " + randomBookDiv);
        randomBookDiv.shouldBe(Condition.visible).click();
    }
}
