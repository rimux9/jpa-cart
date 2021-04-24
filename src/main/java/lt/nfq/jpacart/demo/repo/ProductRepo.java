package lt.nfq.jpacart.demo.repo;


import lt.nfq.jpacart.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    public Product findProductByNameIgnoreCaseAndCategoryIgnoreCase(String name, String surname);

}