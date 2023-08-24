package edu.poly.shopping.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "slides")
public class Slides {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(columnDefinition = "nvarchar(255)")
    String photo;

    @Column(columnDefinition = "nvarchar(255)")
    String caption;

    @Column(columnDefinition = "nvarchar(255)")
    String content;

}
