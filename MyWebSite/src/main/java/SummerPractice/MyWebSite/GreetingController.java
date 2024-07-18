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
    @GetMapping("/butter")
    public String butterPage(Model model) {

        model.addAttribute("title", "Наше Сливочное Масло");
        model.addAttribute("subtitleText", "Именно наше сливочное масло запомнится вам своим натуральным свежим вкусом. Идеальная структура и отличное качество. Попробуйте!");
        List<String> slides = new ArrayList<>();
        slides.add("images/butterPage/butter1.png");
        slides.add("images/butterPage/butter2.png");
        model.addAttribute("slides", slides);
        return "usualPage";
    }
    @GetMapping("/cottage_cheese")
    public String cottage_cheesePage(Model model) {

        model.addAttribute("title", "Наш Творог");
        model.addAttribute("subtitleText", "Вкус нашего творога очень похож на домашний. Еще больше он раскрывается с нашей сметаной. Попробуйте!");
        List<String> slides = new ArrayList<>();
        slides.add("images/cottage_cheesePage/cottage_cheese1.png");
        slides.add("images/cottage_cheesePage/cottage_cheese2.png");
        slides.add("images/cottage_cheesePage/cottage_cheese3.png");
        slides.add("images/cottage_cheesePage/cottage_cheese4.png");
        model.addAttribute("slides", slides);
        return "usualPage";
    }


}
