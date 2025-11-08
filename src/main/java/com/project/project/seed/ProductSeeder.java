package com.project.project.seed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.project.entity.Product;
import com.project.project.repository.ProductRepository;

@Component
public class ProductSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        if (productRepository.count() == 0) {
            List<Product> demoProducts = List.of(
                new Product(null, "Apple iPhone 15", 799.0, "Late Iphone", "Mobile Phone",4.8, "Amazon", 5,List.of("/products/1.jpg")),
                new Product(null, "Apple iPhone 16", 999.0, "Latest iphone", "Mobile Phone",3.8, "Flipkart", 6,List.of("/products/2.jpg")),
                new Product(null, "Lenovo Thinkpad 4", 1000.0, "Good for devs", "Laptop",4.0, "Amazon", 7,List.of("/products/3.jpg")),
                new Product(null, "MSI Predator", 999.0, "Good for gaming", "Laptop",3.8, "Flipkart", 8,List.of("/products/4.jpg")),
                new Product(null, "Sony Bravia 7", 1000.0, "Long Screen TV", "TV",3.9, "Amazon", 9,List.of("/products/5.jpg")),
                new Product(null, "Boat Musics", 900.0, "Headset with good sound", "Headset",4.8, "Amazon", 4,List.of("/products/6.jpg")),
                new Product(null, "HP Performance 5", 600.0, "Average gaming laptop", "Laptop",2.8, "Flipkart", 4,List.of("/products/7.jpg")),
                new Product(null, "Realme 9", 1000.0, "GOAT mobile phone", "Mobile Phone",4.8, "Amazon", 6,List.of("/products/8.jpg")));

            productRepository.saveAll(demoProducts);
            System.out.println("Seeded demo products successfully.");
        } else {
            System.out.println("Skipping seeding — products already exist.");
        }
    }
}
