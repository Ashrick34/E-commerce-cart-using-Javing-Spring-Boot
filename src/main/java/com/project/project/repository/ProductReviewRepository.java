package com.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.project.entity.ProductReview;

public interface ProductReviewRepository extends JpaRepository<ProductReview, Long>{

}
