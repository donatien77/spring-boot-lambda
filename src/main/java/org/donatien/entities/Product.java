package org.donatien.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by macosmonterey on 27 Mar, 2024
 */

@Entity
@Builder @NoArgsConstructor @AllArgsConstructor @Data
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
}
