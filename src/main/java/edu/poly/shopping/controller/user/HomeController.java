package edu.poly.shopping.controller.user;

import edu.poly.shopping.entity.Slides;
import edu.poly.shopping.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    SlideService slideService;

    @GetMapping({"/", "/home","/index"})
    public String home(Model model) {
        //Làm hiển thị phần slide
        List<Slides> slide = slideService.findAll();
        model.addAttribute("slides", slide);
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

    @GetMapping("/product-detail")
    public String productDetail(Model model) {
        return "user/product-detail";
    }

    //?demo ni để test coi cái slide lấy được dữ liệu từ database ko
    @GetMapping("/demo")
    @ResponseBody
    public String demo(Model model) {
        List<Slides> slide = slideService.findAll();
        System.out.println(slide);
        return "Hehehe";
    }
}
