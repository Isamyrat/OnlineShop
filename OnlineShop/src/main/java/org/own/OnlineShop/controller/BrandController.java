package org.own.OnlineShop.controller;

import org.own.OnlineShop.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping("/saveBrand")
    public String saveBrandOfDevice(@RequestParam("file") MultipartFile file,
                                   @RequestParam("name") String name){

        brandService.saveBrandOfProduct(file,name);
        return "redirect:/" ;
    }
    @GetMapping("/addBrandOfDevice")
    public String addBrand() {
        return "manager/addBrand";
    }

}
