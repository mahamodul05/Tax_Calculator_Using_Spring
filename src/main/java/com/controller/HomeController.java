package com.controller;

import com.domain.*;
import com.service.TaxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class HomeController {

    private final TaxService taxService;

    public HomeController(TaxService taxService) {
        this.taxService = taxService;
    }

    @RequestMapping("/login")
    public String login() {
        return "homepage";
    }
    @RequestMapping("/logout")
    public String logout() {
        return "redirect:/user/registration";
    }
    @RequestMapping("/taxhistory")
    public String taxhistory(Model model, HttpServletRequest request) {

        Taxhistory reqtax = new Taxhistory();
        reqtax.setUsername("sakif");
        Taxhistory taxhistory = taxService.gettaxhistory(reqtax);
        model.addAttribute("taxhistory", taxhistory);
        return "history";
    }
    @RequestMapping("/taxcalculate")
    public String taxcalculate(Model model, HttpServletRequest request) {
        Inputdata inputdata = new Inputdata();
        model.addAttribute("inputdata", inputdata);
        return "taxcalculate";
    }







}

