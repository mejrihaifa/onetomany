package org.sid.catservice;

import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import sun.tools.jar.CommandLine;

import javax.swing.*;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {
    @Autowired
    private ProduitRepository produitRepository ;
    @Autowired
    private RepositoryRestConfiguration restConfiguration ;
    public static void main(String[] args) {
        SpringApplication.run(CatServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Produit.class);
        /*produitRepository.save(new Produit(null,"Ordinateur Lx 45",6700,3));
        produitRepository.save(new Produit(null,"Imprimande HP",6700,3));
        produitRepository.save(new Produit(null,"Smartphne Sumsung 59",800,13));
        produitRepository.findAll().forEach(p ->{
            System.out.println(p.toString());
        } );*/

    }
}
