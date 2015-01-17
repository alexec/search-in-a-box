package searchinabox;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class AppIT {

    @Test
    public void homepageShowsSearchBox() throws Exception {
        open("/");
        $(By.cssSelector("input[name='query']")).should(exist);
    }

    @Test
    public void searchingForBearsFindsTheNorthPollJoke() throws Exception {

        open("/");
        $(By.name("query")).sendKeys("bears");
        $(By.cssSelector("input[type='submit']")).submit();

        $$(By.tagName("td")).find(exactText("The North Poll!")).should(exist);
    }
}