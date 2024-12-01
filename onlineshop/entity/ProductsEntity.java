package de.telran.onlineshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Products")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProductID")
    private Long productId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private Double price;

    @Column(name = "ImageURL")
    private String imageUrl;

    @Column(name = "DiscountPrice")
    private Double discountPrice;

    @Column(name = "CreatedAt")
    private Timestamp createdAt;

    @Column(name = "UpdatedAt")
    private Timestamp updatedAt;

    @ManyToOne
    @JoinColumn(name = "CategoryID") // имя колонки для связи с CategoriesEntity
    private CategoriesEntity category;

    @OneToMany(mappedBy = "productId")
    private Set<FavoritesEntity> favorites=new HashSet<>();

    @OneToMany(mappedBy = "productId")
    private Set<OrderItemsEntity> orderItemsEntities=new HashSet<>();

    @OneToMany(mappedBy = "productId")
    private Set<CartItemsEntity> cartItemsEntities=new HashSet<>();

    public ProductsEntity(Long productId, String name, String description, Double price, String imageUrl, Double discountPrice, Timestamp createdAt, Timestamp updatedAt) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.discountPrice = discountPrice;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}
