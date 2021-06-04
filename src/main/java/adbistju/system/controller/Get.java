package adbistju.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/get")
public class Get {
    @GetMapping
    public String indexPage (Model model) {
        return "getter.html";
    }
}
