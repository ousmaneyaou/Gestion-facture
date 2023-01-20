package com.example.demo.controller;

import com.example.demo.entities.Produit;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private DemoService demoIplm;
    @RequestMapping(value = "/produits", method = RequestMethod.POST)
    public Produit saveproduit(@RequestBody Produit produit) {
        return demoIplm.saveproduit(produit);
    }
    @RequestMapping(value = "/produits", method = RequestMethod.GET)
    public List<Produit> getAllproduit() {
        return demoIplm.getAllProduit();
    }
}
