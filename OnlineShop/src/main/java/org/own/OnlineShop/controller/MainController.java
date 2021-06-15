package org.own.OnlineShop.controller;

import org.own.OnlineShop.service.TypeOfDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private TypeOfDeviceService typeOfDeviceService;


    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("typeOfDevices", typeOfDeviceService.getAllTypes());
        return "mainPage";
    }
}
