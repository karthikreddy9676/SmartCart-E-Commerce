package com.smartcart.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="category")

public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long category_id;
	@Column(nullable = false, length = 30, unique = true)
	private String category_name;
	private String category_description;
	@OneToMany(mappedBy = "category")
	private List<Product> products;
	
}
