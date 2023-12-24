package com.apkmechanik.league.models;

import com.apkmechanik.league.models.Chapter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Fraud47
 * @project league
 * @website www.apkmechanic.co.zw
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    private String textContent; // Store the text content here
    @ManyToOne
    private Chapter chapter;
    // Other properties, getters, setters, and relationships
}