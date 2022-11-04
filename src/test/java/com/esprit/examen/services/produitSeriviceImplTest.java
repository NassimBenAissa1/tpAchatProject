package com.esprit.examen.services;

import com.esprit.examen.entities.Operateur;
import java.text.ParseException;

import java.util.List;
import static org.junit.Assert.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class produitSeriviceImplTest {
	    @Autowired
	       IOperateurService operateurService;
	       private static final Logger l = LogManager.getLogger(OperateurServiceImpl.class);

	       @Test
	       public void testRetrieveAllOperateur() throws ParseException {

	         List<Operateur> operateur = operateurService.retrieveAllOperateurs();
	         Operateur op = new Operateur();
	         Operateur savedOperateur = operateurService.addOperateur(op);
	         l.info(" Operateur : " + op);

	         assertNotNull(op.getIdOperateur());

	         operateurService.retrieveOperateur(op.getIdOperateur());

	         List<Operateur> Operateurs = operateurService.retrieveAllOperateurs();
	         l.info("Les  Operateurs : " + Operateurs);
	      }
	       
	       
	   //@Test
	  // public void testDeleteProduit() throws ParseException {

	      // List<Produit> Produits = produitService.retrieveAllProduits();
	       //  int expected = Produits.size();
	       //  Long idFour=(long) 2;
	         //assertEquals(expected + 1, produitService.retrieveAllProduits().size());
	     //  System.out.print("size "+Produits.size());
	       //  l.info(" count" + Produits.size());
	      // produitService.deleteProduit(1L);
	    //  l.info("size2 "+produitService.retrieveAllProduits().size());

	  // }
	   
	   
	  // @Test
	   // public void testAddProduit() throws ParseException{
	     // List<Produit> Produits = produitService.retrieveAllProduits();
	     // SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	      // Date date1 = dateFormat.parse("10/02/2020");
	      // Date date2 = dateFormat.parse("12/09/2022");
	      //Produit p = new Produit(date1, date2);
	      // l.info("produit \n "+p);

	     // Produit savedProduit= produitService.addProduit(p);
	      // l.info("size1 "+Produits.size());
	      // System.out.print("size1 "+Produits.size());
	      // produitService.deleteProduit(savedProduit.getIdProduit());
	      // List<Produit> Produits1 = produitService.retrieveAllProduits();

	      // l.info("size2 "+Produits1.size());
	  // }
	
}
