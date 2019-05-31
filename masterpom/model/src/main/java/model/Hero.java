package model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Hero{
 
	/** public Hero(int x, int y, int hauteur, int largeur) {
		super(x, y, hauteur, largeur);
		this.setImg(new ImageIcon("C:\\Users\\NGASSAM Fabiola\\Documents\\Projets\\Projet 5\\Images\\persoface.png").getImage());
		// TODO Auto-generated constructor stub
	}*/
private static int x; 
private static int y; 
private static Image img1;
private Image img2;
private Image img3;
private Image img4;
public  int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public static int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public  Image getImg1() {
	return img1;
}
public  void setImg1(Image i) {
	img1 = i;
}
public Image getImg2() {
	return img2;
}
public void setImg2(Image img2) {
	this.img2 = img2;
}
public Image getImg3() {
	return img3;
}
public void setImg3(Image img3) {
	this.img3 = img3;
}
public Image getImg4() {
	return img4;
}
public void setImg4(Image img4) {
	this.img4 = img4;
}
public Hero() {
	super();
	this.x =320;
	this.y =160;
	try {
		this.img1= ImageIO.read(new File("C:\\Users\\NGASSAM Fabiola\\Documents\\Projets\\Projet 5\\Images\\persoface.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
} 




}
