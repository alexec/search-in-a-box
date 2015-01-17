package searchinabox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class App {

    @Autowired
    private JokeSearchService jokeSearchService;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String search(@RequestParam("query") String query, Model model) {
        model.addAttribute("results", jokeSearchService.search(query));
        return "results";
    }
}
