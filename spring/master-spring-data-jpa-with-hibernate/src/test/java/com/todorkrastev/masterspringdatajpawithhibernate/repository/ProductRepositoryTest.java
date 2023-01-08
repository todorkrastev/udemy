package com.todorkrastev.masterspringdatajpawithhibernate.repository;

import com.todorkrastev.masterspringdatajpawithhibernate.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;


@SpringBootTest
class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void saveMethod() {
        Product product = new Product();
        product.setName("product 1");
        product.setDescription("product 1 description");
        product.setSku("100ABC");
        product.setPrice(new BigDecimal(100));
        product.setActive(true);
        product.setImageUrl("product1.png");

        Product savedObject = productRepository.save(product);

        System.out.println(savedObject.getId());
        System.out.println(savedObject);
    }

    @Test
    void updateUsingSaveMethod() {
        Long id = 1L;
        Product product = productRepository.findById(id).get();

        product.setName("updated product 1");
        product.setDescription("updated product 1 desc");

        productRepository.save(product);
    }

    @Test
    void findByIdMethod() {
        Long id = 1L;

        Product product = productRepository.findById(id).get();
    }

    @Test
    void saveAllMethod() {
        Product product2 = new Product();
        product2.setName("product 2");
        product2.setDescription("product 2 description");
        product2.setSku("100ABCD");
        product2.setPrice(new BigDecimal(200));
        product2.setActive(true);
        product2.setImageUrl("product2.png");

        Product product3 = new Product();
        product3.setName("product 3");
        product3.setDescription("product 3 description");
        product3.setSku("100ABCDE");
        product3.setPrice(new BigDecimal(300));
        product3.setActive(true);
        product3.setImageUrl("product3.png");

        productRepository.saveAll(List.of(product2, product3));
    }

    @Test
    void findAllMethod() {

        List<Product> products = productRepository.findAll();

        products.forEach((p) -> {
            System.out.println(p.getName());
        });
    }

    @Test
    void deleteByIdMethod() {
        Long id = 1L;
        productRepository.deleteById(id);
    }

    @Test
    void deleteMethod() {

        Long id = 2L;
        Product product = productRepository.findById(id).get();

        productRepository.delete(product);
    }

    @Test
    void deleteAllMethod() {

        // productRepository.deleteAll();

        Product product5 = productRepository.findById(5L).get();
        Product product6 = productRepository.findById(6L).get();

        productRepository.deleteAll(List.of(product5, product6));
    }

    @Test
    void countMethod() {
        long count = productRepository.count();
        System.out.println(count);
    }

    @Test
    void existsByIdMethod() {
        Long id = 1L;

        boolean result = productRepository.existsById(id);

        System.out.println(result);
    }


}