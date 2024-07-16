package SummerPractice.MyWebSite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting(Model model) {
        return "greeting";
    }
    @GetMapping("/next")
    public String nextPage(Model model) {
        return "next";
    }

}
