import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\WAYZARD\\IdeaProjects\\AQA_Coursework\\src\\test\\resources\\scenarios",
        glue = "Steps",
        tags = "@CriticalPath"
)
public class TestRunner {
}
