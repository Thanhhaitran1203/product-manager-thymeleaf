package com.productmanagementthymeleaf.controller;

import com.productmanagementthymeleaf.model.Product;
import com.productmanagementthymeleaf.service.IProductService;
import com.productmanagementthymeleaf.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final IProductService productService = new ProductService();

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        List<Product> productList = productService.findAll();
        modelAndView.addObject("products",productList);
        System.out.println(productList);
        return modelAndView;
    }
    @GetMapping("/{id}/view")
    public ModelAndView view(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("view");
        Product product = productService.findById(id);
        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @GetMapping("/{id}/update")
    public ModelAndView update(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject(productService.findById(id));
        return modelAndView;
    }
    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirect){
        productService.update(product.getId(),product);
        redirect.addFlashAttribute("success","Update product success");
        return "redirect:/product/";
    }
}
