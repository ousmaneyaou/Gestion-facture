package com.example.demo.service;
import com.example.demo.entities.*;

import java.util.List;
public interface DemoService {
    Produit saveproduit(Produit produit);   //ajout d'un nouveau produit
    List<Produit> getAllProduit();  //lister l'ensemble des produit

    Client saveclient(Client client);
    List<Client> getAllClient();

    Facture savefacture(Facture facture);
    List<Facture> getAllFacture();

    User saveuser(User user);
    List<User> getAllUser();

    Role saverole(Role role);
    List<Role> getAllRole();
}

