package com.controller;

import com.domain.Catagory;
import com.domain.Zone;
import com.service.AdminService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/adminlogin")
    public String dashboard(){
        return "admindashboard";
    }

    @RequestMapping("/catagory")
    public String catagory(Model model, HttpServletRequest request){
        Catagory catagory = new Catagory();
        catagory = adminService.getcatagory(1);

        model.addAttribute("catagory", catagory);
        request.getSession().setAttribute("catagory", catagory);
        return "update-catagory";
    }
    @RequestMapping("/updatecatagory")
    public String updatecatagory(@RequestParam("id") int id, @RequestParam("general") Long general, @RequestParam("female") Long female, @RequestParam("disable") Long disable, @RequestParam("gazeted") Long gazeted, Model model, HttpServletRequest request) {
        Catagory reqcatagory = new Catagory();
        reqcatagory.setId(id);
        reqcatagory.setGeneral(general);
        reqcatagory.setFemale(female);
        reqcatagory.setDisable(disable);
        reqcatagory.setGazeted(gazeted);

        adminService.updatecalagory(reqcatagory);

        Catagory catagory = adminService.getcatagory(1);
        model.addAttribute("catagory", catagory);
        request.getSession().setAttribute("catagory", catagory);
        return "view-catagory";
    }

    @RequestMapping("/zone")
    public String zone(Model model, HttpServletRequest request){
        Zone zone = new Zone();
        zone = adminService.getzone(1);

        model.addAttribute("zone", zone);
        request.getSession().setAttribute("zone", zone);
        return "update-zone";
    }
    @RequestMapping("/updatezone")
    public String updatezone(@RequestParam("id") int id, @RequestParam("dhaka") Long dhaka, @RequestParam("other") Long other, @RequestParam("rest") Long rest, Model model, HttpServletRequest request) {
        Zone reqzone = new Zone();
        reqzone.setId(id);
        reqzone.setDhaka(dhaka);
        reqzone.setOther(other);
        reqzone.setRest(rest);

        adminService.updatezone(reqzone);

        Zone zone = adminService.getzone(1);
        model.addAttribute("zone", zone);
        request.getSession().setAttribute("zone", zone);
        return "view-zone";
    }



}
