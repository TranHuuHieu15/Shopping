package edu.poly.shopping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long productId;

    @Column(columnDefinition = "nvarchar(50) not null")
    String name;

    @Column(nullable = false)
    double price;

    @Column(columnDefinition = "nvarchar(50) not null")
    String sizes;

    @Column(columnDefinition = "nvarchar(255)")
    String description;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    Date created_dated;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    Date updated_dated;

    @Column(nullable = false)
    Boolean newProduct;

    @Column(nullable = false)
    Boolean highlight;

    @Column(nullable = false)
    Integer sale;

    //? nối với categories
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    //? nối với colors
    @OneToMany(mappedBy = "product")
    Set<Colors> colors;
}
