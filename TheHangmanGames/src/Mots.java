/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException; 
/**
 *
 * @author mingsop
 */
public class Mots {
    //Lire le fichier texte et choisir un mot aléatoire dedant
    //En attendant de trouver la solution, j'ai mit des mots dans un tableau
    String tableauMots[] = {"Fer à souder","Revolution","Joueur","accolades","temps"};
    
    
    //Choisir un mot aéléatoirement
    Random rand=new Random();
    int nombreAleatoire=rand.nextInt(tableauMots.length);
    
      public void ReadLineTxt() throws IOException{
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\mingsop\\Downloads\\dictionnaire\\dictionnaire.txt"));
        String line;
	while ((line = in.readLine()) != null){
            // Afficher le contenu du fichier
            System.out.println (line);
	}
	in.close();
          

  }
          
}

