package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Stone extends coordonnees{
 

public Stone(int x, int y, int hauteur, int largeur) {
		super(x, y, hauteur, largeur);
		// TODO Auto-generated constructor stub
	  this.setImg(new ImageIcon("C:\\Users\\NGASSAM Fabiola\\Documents\\Projets\\Projet 5\\Images\\roche.png").getImage());
	  
}
}
