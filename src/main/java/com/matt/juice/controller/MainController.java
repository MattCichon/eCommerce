package com.matt.juice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.matt.juice.model.Product;
import com.matt.juice.service.ProductService;
import com.matt.juice.service.UserService;

import lombok.Data;

@Data
@Controller
@ControllerAdvice
public class MainController {
    @Autowired
    ProductService productService;
    
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String main(Model model) {
        return "main";
    }

    @ModelAttribute("products")
    public List<Product> products() {
        return productService.findAll();
    }

    @ModelAttribute("categories")
    public List<String> categories() {
        return productService.findDistinctCategories();
    }

    @ModelAttribute("brands")
    public List<String> brands() {
        return productService.findDistinctBrands();
    }
    

    @GetMapping("/filter")
    public String filter(@RequestParam(required = false) String category,
                         @RequestParam(required = false) String brand,
                         Model model) {
        List<Product> filtered = productService.findByBrandAndOrCategory(brand, category);
        model.addAttribute("products", filtered); // Overrides the @ModelAttribute above.
        return "main";
    }
    


    @GetMapping("/about")
    public String about() {
        return "about";
    }
    
    @GetMapping("/support")
    public String support() {
        return "support";
    }
    
    @GetMapping("/privacy")
    public String privacy() {
        return "privacy";
    }
}