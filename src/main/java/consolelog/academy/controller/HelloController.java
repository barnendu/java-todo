package consolelog.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hello")
    public String Hello(){
        return "Hello..";
    }

    @GetMapping("/welcome")
    public String weilcome( Model model){
        model.addAttribute("name", "Barnendu");
        return "welcome";
    }

    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        return " Welcome java world...";
    }
}
