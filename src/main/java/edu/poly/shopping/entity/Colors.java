package edu.poly.shopping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name = "colors")
public class Colors implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "nvarchar(255) not null")
    private String name;

    @Column(columnDefinition = "nvarchar(255) not null")
    private String code;

    @Column(columnDefinition = "nvarchar(255)")
    private String img;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
}
