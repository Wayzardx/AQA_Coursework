package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class HomeNavBar {

    private final SelenideElement categoryListDiv = $(By.xpath("//div[@class='books-list']"));

    public void clickRandomDivElement() {
        categoryListDiv.shouldBe(Condition.exist, Duration.ofSeconds(5000));
        List<SelenideElement> innerDivs = categoryListDiv.$$("div");
        Random random = new Random();
        int randomIndex = random.nextInt(innerDivs.size());
        SelenideElement randomDiv = innerDivs.get(randomIndex);
        randomDiv.click();
    }
}
