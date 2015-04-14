package searchinabox;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class AppIT {

    @Test
    public void searchingForBearsFindsTheNorthPollJoke() throws Exception {

        open("/");
        $(By.name("query")).sendKeys("bears");
        $(By.cssSelector("input[type='submit']")).submit();

        $$(By.tagName("span")).find(exactText("The North Poll!")).should(exist);
    }
}
