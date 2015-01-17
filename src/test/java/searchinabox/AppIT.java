package searchinabox;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AppIT {

    @Test
    public void homepageShowsSearchBox() throws Exception {
        open("/");
        $(By.cssSelector("input[name='query']")).should(exist);
    }
}