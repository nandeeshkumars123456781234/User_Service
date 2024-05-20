package com.example.java.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Rating_Micro")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String ratingId;
	private Long rating1;
}
