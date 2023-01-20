package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity // @Entity et @Id sont les annotations indispensables pour que la classe soit une entité jpa
@Data @NoArgsConstructor @AllArgsConstructor //Lombok
public class Produit implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //@GeneratedValue --> pour que l'Id soit auto_INCREMENT
    private Long id;
    private String name;
    private int price;
    private int qte;
    @OneToOne(mappedBy = "produit")
    private Facture facture;
}

