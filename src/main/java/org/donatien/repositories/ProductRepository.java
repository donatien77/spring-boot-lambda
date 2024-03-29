package org.donatien.repositories;

import org.donatien.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by macosmonterey on 27 Mar, 2024
 */
public interface ProductRepository extends JpaRepository<Product, String> {
}
