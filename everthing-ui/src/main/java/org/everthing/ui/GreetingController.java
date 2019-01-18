package org.everthing.ui;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    

    @GetMapping({"/starter","/"})
    public String starter(HttpSession session) {
    	System.out.println("ggggggggggg");
    	session.setAttribute("AdminLTE_URL", "https://adminlte.io/themes/AdminLTE");
        return "starter";
    }

}