package model;

import java.awt.Image;

public class coordonnees {
	private int hauteur, largeur;
	private int x;
	private int y; 
	private Image img;
	 
	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public coordonnees(int x, int y, int hauteur, int largeur) {
		this.x = x;
		this.y = y;
		this.hauteur=32;
		this.largeur=32;
		}

	public coordonnees() {
		// TODO Auto-generated constructor stub
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	

	
}
