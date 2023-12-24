package com.apkmechanik.league.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

/**
 * @author Fraud47
 * @project league
 * @website www.apkmechanic.co.zw
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    
    private String isbn;
    @OneToMany(mappedBy = "book")
    private List<Chapter> chapters;
    // Other properties, getters, setters, and relationships
}