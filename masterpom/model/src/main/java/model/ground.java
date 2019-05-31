package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ground extends coordonnees{
	
	public ground(int x, int y, int hauteur, int largeur) {
		super(x, y, hauteur, largeur);
		 this.setImg(new ImageIcon("C:\\Users\\NGASSAM Fabiola\\Documents\\Projets\\Projet 5\\Images\\terre.png").getImage());
		// TODO Auto-generated constructor stub
	}

	public ground() {
		super();
		// TODO Auto-generated constructor stub
	}	


}