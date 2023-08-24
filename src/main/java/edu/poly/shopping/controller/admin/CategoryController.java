package edu.poly.shopping.controller.admin;

import edu.poly.shopping.entity.Category;
import edu.poly.shopping.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @GetMapping("")
    public String categoryHome(Model model) {
        // hiển thị danh sách sản phẩm
        List<Category> list = categoryService.findAll();
        model.addAttribute("categories", list);
        return "admin/category";
    }
}
