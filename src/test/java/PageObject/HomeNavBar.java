package PageObject;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

public class HomeNavBar {

    private final SelenideElement categoryListDiv = $(By.xpath("//*[@id=\"viewport\"]/div[5]/section/div[2]/div[1]/div"));

    public void clickRandomDivElement() {
        List<SelenideElement> innerDivs = categoryListDiv.$$("div");
        Random random = new Random();
        int randomIndex = random.nextInt(innerDivs.size());
        SelenideElement randomDiv = innerDivs.get(randomIndex);
        randomDiv.click();
    }
}
