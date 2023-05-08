package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class CategoryMainPage {

    private final SelenideElement bookListDiv = $(By.xpath("//*[@id=\"viewport\"]/div[9]/div[1]/div[3]/div[2]/div[2]/div"));

    public void clickRandomBook() {
        List<SelenideElement> innerDivs2 = bookListDiv.$$("a");
        Random random = new Random();
        int randomIndex = random.nextInt(innerDivs2.size());
        SelenideElement randomBookDiv = innerDivs2.get(randomIndex);
        randomBookDiv.click();
    }
}
