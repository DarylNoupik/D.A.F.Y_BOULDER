package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Wall extends coordonnees{
	

	public Wall(int x, int y, int hauteur, int largeur) {
		super(x, y, hauteur, largeur);
	 this.setImg(new ImageIcon("C:\\Users\\NGASSAM Fabiola\\Documents\\Projets\\Projet 5\\Images\\mur.png").getImage());
		// TODO Auto-generated constructor stub

}
}
