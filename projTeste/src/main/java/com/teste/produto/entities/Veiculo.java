package com.teste.produto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String marca;
	
	private String modelo;
	private int ano;
	private String cor;

}