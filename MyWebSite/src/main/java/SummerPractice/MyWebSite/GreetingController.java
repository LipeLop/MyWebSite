package SummerPractice.MyWebSite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting(Model model) {
        return "greeting";
    }
    @GetMapping("/milk")
    public String milkPage(Model model) {
        List<String> slides = new ArrayList<>();
        slides.add("images/milkPage/milk1.png");
        slides.add("images/milkPage/milk2.png");
        slides.add("images/milkPage/milk3.png");
        model.addAttribute("slides", slides);
        return "usualPage";
    }

}
