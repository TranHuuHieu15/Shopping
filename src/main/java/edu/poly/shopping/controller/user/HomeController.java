package edu.poly.shopping.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "/home"})
    public String home(Model model) {
        return "user/index";
    }

    @GetMapping("/product")
    public String product(Model model) {
        return "user/product";
    }

    @GetMapping("/shoping-cart")
    public String shopingCart(Model model) {
        return "user/shoping-cart";
    }
}
