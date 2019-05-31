package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Hero;
import view.ViewPanel;

public class KeyBoard implements KeyListener {
	
	ViewPanel p;
	public static Hero hero;
	 
	
	public KeyBoard(ViewPanel p) {
		this.p = p;
		this.hero= new Hero();
	}
	@Override
	public void keyPressed(KeyEvent k) {
		
		// TODO Auto-generated method stub
		if(k.getKeyCode()==KeyEvent.VK_UP) {
			p.movementup();
			
		}
		if(k.getKeyCode()==KeyEvent.VK_DOWN) {
			p.movementdown();
			
		}
		if(k.getKeyCode()==KeyEvent.VK_LEFT) {
			p.movementLeft();
			
		}
		if(k.getKeyCode()==KeyEvent.VK_RIGHT) {
			p.movemenRight();
			
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
