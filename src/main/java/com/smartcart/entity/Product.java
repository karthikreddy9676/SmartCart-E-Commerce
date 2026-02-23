package com.smartcart.entity;

/*import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Product_id;
	@Column(nullable = false, length = 30)
	private String Product_name;
	private String Product_description;
	private int stock;
	private double Product_price;
	private String Product_category;


}

*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String productImage;
    private String description;
    private Integer quantity;
    private Double price;
    private Double discount;
    private Double specialPrice;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(
            name = "seller_id"
    )
    private User user;

    @OneToMany(
            mappedBy = "product",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            fetch = FetchType.EAGER
    )
    private List<CartItem> cartItems = new ArrayList<>();

}



