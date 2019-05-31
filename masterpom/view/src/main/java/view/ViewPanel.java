package view;

import java.awt.Graphics;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;
import model.*;

import javax.swing.JPanel;

import contract.IModel;
import javafx.scene.paint.Color;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
public class ViewPanel extends JPanel implements Observer{
	/**the view frame. */
	private ViewFrame viewFrame;
	private IModel model;
	Hero h = new Hero();
	
	/**The constant serialVersionUID */
	private static final long serialVersionUID = -998294702363713521L;
	static DAOlevel daolevel = new DAOlevel();
	coordonnees[][] objects = new coordonnees[50][23];
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	

	public ViewPanel(final ViewFrame viewFrame ){
		//this.model = new Model();
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		
	}
	public ViewPanel( ){
		remplissage();
	}
	
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame; 
	}
	
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}
	
	public void remplissage() {
		int j=0;
		for(int i=0;i<50;i++) {
			for(j=0; j<23; j++) {
				//System.out.print(daolevel.getScenetest()[i][j]);
				if(daolevel.getScenetest()[i][j]=='G') {
					objects[i][j]= new ground(i*32, j*32, i, j);
					//g.drawImage(objects[i][j].getImg(), /*j*32, i*32,*/objects[i][j].getX(),objects[i][j].getY(), this);
					//System.out.println("Je suis exécuté ground");
				}
				else if(daolevel.getScenetest()[i][j]=='W') {
					objects[i][j]= new Wall(i*32, j*32, i ,j) ;
					//g.drawImage(objects[i][j].getImg(), objects[i][j].getX(), objects[i][j].getY(), this);
					//System.out.println("Je suis exécuté wall");	
				}
			else if(daolevel.getScenetest()[i][j]=='S') {
					objects[i][j]= new Stone(i*32, j*32, i ,j) ;
					//g.drawImage(objects[i][j].getImg(), objects[i][j].getX(), objects[i][j].getY(), this);
					//System.out.println("Je suis exécuté sol");	
				}
				else if(daolevel.getScenetest()[i][j]=='D') {
					objects[i][j]= new Diamond(i*32, j*32, i ,j) ;
					//g.drawImage(objects[i][j].getImg(), objects[i][j].getX(), objects[i][j].getY(), this);
					//System.out.println("Je suis exécuté diamant");	
				}
				else if(daolevel.getScenetest()[i][j]=='M') {
					objects[i][j]= new Monster(i*32, j*32, i ,j) ;
					//g.drawImage(objects[i][j].getImg(), objects[i][j].getX(), objects[i][j].getY(), this);
					//System.out.println("Je suis exécuté diamant");	
				}
				/**else if(daolevel.getScenetest()[i][j]=='R') {
					objects[i][j]= new Hero(i*32, j*32, i ,j) ;
					g.drawImage(objects[i][j].getImg(), objects[i][j].getX(), objects[i][j].getY(), this);
					//System.out.println("Je suis exécuté rocher");	
			}*/
				else if(daolevel.getScenetest()[i][j]==' ') {
					objects[i][j]= new Background(i*32, j*32, i ,j) ;
					//g.drawImage(objects[i][j].getImg(), objects[i][j].getX(), objects[i][j].getY(), this);
					}
				
				}
		}
		
	}
	
	public void movementup() {
		int a= h.getY();
	    a-=32;
	    h.setY(a);
	    
	    for(int i=0; i<50;i++) {
	    	for(int j=0; j<23; j++) {
	    		if(objects[i][j] != null) {
	    		if(h.getX()==objects[i][j].getX() && h.getY()== objects[i][j].getY() && objects[i][j].getClass().toString().equals(new ground().getClass().toString())) {
	    			
	    			int a1 = objects[i][j].getX();
	    			int b1 = objects[i][j].getY();
	    			objects[i][j]=new Background(i*32, j*32, i, j);
	    			objects[i][j].setX(a1);
	    			objects[i][j].setY(b1);
	    			System.out.println("je suis exécutée");
	    		}
	    	}
	    	}
	    }
	}
	
	public void movementdown() {
		int a= h.getY();
	    a+=32;
	    h.setY(a);
	    
	    for(int i=0; i<50;i++) {
	    	for(int j=0; j<23; j++) {
	    		if(objects[i][j] != null) {
	    		if(h.getX()==objects[i][j].getX() && h.getY()== objects[i][j].getY() && objects[i][j].getClass().toString().equals(new ground().getClass().toString())) {
	    			
	    			int a1 = objects[i][j].getX();
	    			int b1 = objects[i][j].getY();
	    			objects[i][j]=new Background(i*32, j*32, i, j);
	    			objects[i][j].setX(a1);
	    			objects[i][j].setY(b1);
	    			System.out.println("je suis exécutée");
	    		}
	    	}
	    	}
	    }
	}
	
	public void movementLeft() {
		int a= h.getX();
	    a-=32;
	    h.setX(a);
	    
	    for(int i=0; i<50;i++) {
	    	for(int j=0; j<23; j++) {
	    		if(objects[i][j] != null) {
	    		if(h.getX()==objects[i][j].getX() && h.getY()== objects[i][j].getY() && objects[i][j].getClass().toString().equals(new ground().getClass().toString())) {
	    			
	    			int a1 = objects[i][j].getX();
	    			int b1 = objects[i][j].getY();
	    			objects[i][j]=new Background(i*32, j*32, i, j);
	    			objects[i][j].setX(a1);
	    			objects[i][j].setY(b1);
	    			System.out.println("je suis exécutée");
	    		}
	    	}
	    	}
	    }
	}
	
	public void movemenRight() {
		int a= h.getX();
	    a+=32;
	    h.setX(a);
	    for(int i=0; i<50;i++) {
	    	for(int j=0; j<23; j++) {
	    		if(objects[i][j] != null) {
	    		if(h.getX()==objects[i][j].getX() && h.getY()== objects[i][j].getY() && objects[i][j].getClass().toString().equals(new ground().getClass().toString())) {
	    			
	    			int a1 = objects[i][j].getX();
	    			int b1 = objects[i][j].getY();
	    			objects[i][j]=new Background(i*32, j*32, i, j);
	    			objects[i][j].setX(a1);
	    			objects[i][j].setY(b1);
	    			System.out.println("je suis exécutée");
	    		}
	    	}
	    	}
	    }
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override 
	protected void paintComponent(final Graphics g) {

		for(int i=0;i<50;i++) {
			for(int j=0;j<23;j++) {
				//System.out.println(i+" "+j+objects[i][j]);
				if(objects[i][j] != null)
				g.drawImage(objects[i][j].getImg(),objects[i][j].getX(),objects[i][j].getY(),this);
			}
			//System.out.println("");
		}
		g.drawImage(h.getImg1(), h.getX(), h.getY(), this);
	   repaint();
	}

}

