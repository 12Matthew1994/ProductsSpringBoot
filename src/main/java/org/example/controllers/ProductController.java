package org.example.controllers;

import jakarta.validation.Valid;
import org.example.models.dto.ProductDTO;
import org.example.models.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public String renderIndex(Model model) {
        List<ProductDTO> products = productService.getAll();
        model.addAttribute("products", products);

        return "pages/products/index";
    }

    @GetMapping("create")
    public String renderCreateForm(@ModelAttribute
                                   ProductDTO product) {
        return "pages/products/create";
    }

    @PostMapping("create")
    public String createArticle(
            @Valid @ModelAttribute ProductDTO product,
            BindingResult result,
            RedirectAttributes redirectAttributes
    ) {
        if (result.hasErrors())
            return renderCreateForm(product);

        productService.create(product);
        redirectAttributes.addFlashAttribute("success", "Produkt vytvořen.");

        return "redirect:/products";
    }
}


