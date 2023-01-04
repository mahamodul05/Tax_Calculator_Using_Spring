package com.controller;

import com.domain.User;
import com.domain.Admin;
import com.service.AdminService;
import com.service.UserService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final AdminService adminService;

    public UserController(UserService userService, AdminService adminService) {
        this.userService = userService;
        this.adminService = adminService;
    }


    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/registration")
    public String registration(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user-reg-login";
    }

    @RequestMapping("createuser")
    public String createuser(@ModelAttribute("user") User user) {
        userService.insert(user);
        return "redirect:/user/registration";
    }

    @RequestMapping("/userlogin")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpServletRequest request) {
        User requser = new User();
        requser.setUsername(username);
        requser.setPassword(password);
        User user = userService.getuser(requser);
        System.out.println("Break");
        if (user != null) {
            if (user.getPassword().equals(requser.getPassword())) {
                return "redirect:/api/login";
            }
            else{
                return "redirect:/user/registration";
            }
        } else {
            model.addAttribute("msg", "failed");
            return "redirect:/user/registration";
        }
    }








    @RequestMapping("/adminregistration")
    public String adminregistration(Model model) {
        Admin admin = new Admin();
        model.addAttribute("admin", admin);
        return "admin-reg-login";
    }
    @RequestMapping("createadmin")
    public String createadmin(@ModelAttribute("admin") Admin admin) {
        adminService.insert(admin);
        return "redirect:/user/registration";
    }
    @RequestMapping("/adminlogin")
    public String adminlogin(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpServletRequest request) {
        Admin reqadmin = new Admin();
        reqadmin.setUsername(username);
        reqadmin.setPassword(password);

        Admin admin = adminService.getuser(reqadmin);
        if (admin != null) {

            if (admin.getPassword().equals(reqadmin.getPassword())) {
                model.addAttribute("admin", admin);
                request.getSession().setAttribute("admin", admin);
                return "redirect:/admin/adminlogin";
            }
            else{
                return "redirect:/user/adminregistration";
            }
        } else {
            model.addAttribute("msg", "failed");
            return "redirect:/user/adminregistration";
        }
    }















}

