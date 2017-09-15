package com.declanbutler.ehic.home;

import com.declanbutler.ehic.model.ApplicationEhic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
class MainController {

    @GetMapping("/application")
    String index(Model model) {
        ApplicationEhic app = new ApplicationEhic();
        app.setName("Declan");
        model.addAttribute("application", app);
        return "application";
    }
}
