package it.panda.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello() {
        return "index";
    }


    @RequestMapping(value = "/basicForm", method = RequestMethod.GET)
    public String showBasicForm() {
        return "basic-form";
    }


    @GetMapping("/processForm")
    public String processForm(@RequestParam("studentName") String studentNames, Model model) {

        System.out.println(studentNames);


        model.addAttribute("studentka", studentNames);

        return "processed-form";
    }
}
