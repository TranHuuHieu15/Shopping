package edu.poly.shopping.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @GetMapping("admin/dashboard")
    public String dashboard(Model model) {
        return "admin/dashboard";
    }
}
