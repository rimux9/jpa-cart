package lt.nfq.jpacart.demo.model;


import lombok.Data;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private String category;
    private String description;

}
