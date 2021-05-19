package org.own.OnlineShop.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.own.OnlineShop.model.TypeOfDevice;
import org.own.OnlineShop.service.TypeOfDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@Controller
public class TypeController {

    @Autowired
    private TypeOfDeviceService typeOfDeviceService;

    private static final Logger logger = LogManager.getLogger(TypeController.class);


    @PostMapping("/addTypeOfDevice")
    public String saveTypeOfDevice(@RequestParam("file")MultipartFile file,
                                   @RequestParam("name") String name){
        logger.info("GET request /login");

        typeOfDeviceService.saveTypeOfProduct(file,name);
        return "redirect:/" ;
    }


    @GetMapping("/listTypeOfDevices")
    public String showTypeOfDevices(Model model){
        logger.info("GET request /login");

        model.addAttribute("typeOfDevices", typeOfDeviceService.getAllTypes());
        return "type/showTypes";
    }

    @GetMapping("/product/display/{id}")
    @ResponseBody
    void showImage(@PathVariable("id") Short id, HttpServletResponse response, Optional<TypeOfDevice> typeOfDeviceOptional)
            throws ServletException, IOException {
        typeOfDeviceOptional = typeOfDeviceService.getType(id);
        response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.getOutputStream().write(typeOfDeviceOptional.get().getImg());
        response.getOutputStream().close();
    }


}
