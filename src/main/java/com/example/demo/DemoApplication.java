package com.example.demo;

import com.example.demo.entities.Client;
import com.example.demo.entities.Facture;
import com.example.demo.entities.Produit;
import com.example.demo.service.Democlasseimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;
import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private Democlasseimpl democlasseimpl;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Produit produit = new Produit();
		produit.setName("sac");
		produit.setPrice(800);
		produit.setQte(20);
		democlasseimpl.saveproduit(produit);

		Produit produitUn = new Produit();
		produitUn.setName("Riz");
		produitUn.setPrice(1000);
		produitUn.setQte(5);
		democlasseimpl.saveproduit(produitUn);

		Client client = new Client();
		client.setNom("!!!!!!!!");
		client.setPrenom("??????");
		client.setEmail("ousmane@gmail.com");
		democlasseimpl.saveclient(client);
		Client client1 = new Client();
		client1.setNom("ali");
		client1.setPrenom("souley");
		client1.setEmail("gl@gmail.com");
		democlasseimpl.saveclient(client1);

		Facture facture = new Facture();
		facture.setNumfac(001);
		facture.setDate(new Date());
		democlasseimpl.savefacture(facture);
		Facture facture1 = new Facture();
		facture1.setNumfac(002);
		facture1.setDate(new Date());
		democlasseimpl.savefacture(facture);
		System.out.println(democlasseimpl.getAllProduit().toString());
	}
}

