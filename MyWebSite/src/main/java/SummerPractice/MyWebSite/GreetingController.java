package SummerPractice.MyWebSite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {
    private final MessageSource messageSource;

    @Autowired
    public GreetingController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }


    @GetMapping("/")
    public String greeting(Model model) {
        return "greeting";
    }

    @GetMapping("/milk")
    public String milkPage(Model model) {

        model.addAttribute("title", "Наше Молоко");
        model.addAttribute("subtitleText", "Наше молоко производится только на высококлассных фермах. Коровки питаются самой вкусной травкой, из-за чего молоко получается очень вкусным. Попробуйте!");
        List<String> slides = new ArrayList<>();
        slides.add("images/milkPage/milk1.png");
        slides.add("images/milkPage/milk2test.png");
        slides.add("images/milkPage/milk3test.png");
        model.addAttribute("slides", slides);
        return "usualPage";
    }

}
