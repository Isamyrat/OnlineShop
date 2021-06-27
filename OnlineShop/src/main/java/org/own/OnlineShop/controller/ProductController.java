package org.own.OnlineShop.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/product")
    public String mainPage() {
        return "products/product";
    }
    @GetMapping("/profile")
    public String profile() {
        return "account/profile";
    }
    @GetMapping("/logInS")
    public String logInS() {
        return "log/log in";
    }
    @GetMapping("/flue")
    public String flue() {
        return "flueMarket/flueMarket";
    }

    @GetMapping("/order")
    public String order() {
        return "products/orders";
    }
    @GetMapping("/review")
    public String review() {
        return "products/reviews";
    }
    @GetMapping("/shops")
    public String shops() {
        return "products/shops";
    }
}
