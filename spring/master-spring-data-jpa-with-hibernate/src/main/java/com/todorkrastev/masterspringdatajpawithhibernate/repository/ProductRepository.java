package com.todorkrastev.masterspringdatajpawithhibernate.repository;

import com.todorkrastev.masterspringdatajpawithhibernate.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
