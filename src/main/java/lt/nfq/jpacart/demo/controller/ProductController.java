package lt.nfq.jpacart.demo.controller;


import lt.nfq.jpacart.demo.model.Product;
import lt.nfq.jpacart.demo.model.ProductDTO;
import lt.nfq.jpacart.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product registerNewProduct(@RequestBody ProductDTO productDTO){
        return productService.registerNewproduct(productDTO);
    }
    @GetMapping
    public List<Product> findAll(){

        return productService.findAll();
    }
    @GetMapping(value = "/find")
    public Product findByNameAndSurname(@RequestParam String name, @RequestParam String category){
        return productService.findByNameAndCategory(name, category);
    }


}
