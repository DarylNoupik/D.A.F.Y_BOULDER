package main;


import java.awt.HeadlessException;
import java.sql.SQLException;

import controller.Controller;
import view.View;
import view.ViewFrame;
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
     * @throws SQLException 
     * @throws HeadlessException 
     */
	public static View view;
	 public static void main(final String[] args) throws HeadlessException, SQLException {
      final Model model=new Model();
      view = new View(model);
		 final Controller controller = new Controller(view,model);
              //ViewFrame viewFrame = new ViewFrame(null);
		controller.start();
		//System.out.println("Ca marche");
    }
}
