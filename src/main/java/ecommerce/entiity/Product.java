package ecommerce.entiity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String productName;
    private String productDescription;
    private String quantity;
    private String inStock;
    private String imageUrl;
    private int originalPrice;
    private int discountedPrice;
    private String sellerEmail;


}
