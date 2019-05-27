package main;


import controller.Controller;
import view.View;
import model.Model;



/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
	 public static void main(final String[] args) {
      
		 final Controller controller = new Controller(new View(), new Model());
              
		controller.start();
		System.out.println("Ca marche");
    }
}
