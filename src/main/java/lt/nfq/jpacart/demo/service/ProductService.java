package lt.nfq.jpacart.demo.service;


import lt.nfq.jpacart.demo.model.Product;
import lt.nfq.jpacart.demo.model.ProductDTO;
import lt.nfq.jpacart.demo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.util.List;

@Service

public class ProductService {

    private ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product registerNewproduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setCategory(productDTO.getCategory());
        product.setDescription(productDTO.getDescription());

        productRepo.save(product);
        return product;
    }
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public Product findByNameAndCategory(String name, String category) {
        return productRepo.findProductByNameIgnoreCaseAndCategoryIgnoreCase(name, category);
    }



}