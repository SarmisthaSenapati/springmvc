package com.example.springmvcnew.Controller;

import com.example.springmvcnew.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MvcController {
    @GetMapping("/")
    public String exampleDemo(@RequestParam(value="name",
            defaultValue = "World!!",required = true)                      //required is used to set the parameter
                              String name1, Model model){
        model.addAttribute("name2",name1);                                    //name1 has the data
        return "home";
    }
    @GetMapping("/greeting")
    public String greetingPage(Model model,Greeting greeting){           //greeting is used to call method
        model.addAttribute("greeting1",new Greeting());
        return "greeting";
    }
    @PostMapping("/greeting")
    public String resultpage(@ModelAttribute Greeting greeting1,Model model){
        model.addAttribute("greeting2",greeting1);
        return"result";
    }
}
