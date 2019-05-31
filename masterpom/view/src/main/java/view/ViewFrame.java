package view;


import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
//import java.awt.Event.KeyListener;
import contract.IController;
import contract.IModel;



/**
 * The Class ViewFrame.
 *
 * @author Jean-Aymeric Diet
 */
public class ViewFrame extends JFrame {
	/** the model.*/
	private IModel model; 
	/** the controller*/
	private IController controller;
	/** the Constant serialVersionUID.*/
	private static final long serialVersionUID = -697358409737458175L;

/** The panel. */
	private ViewPanel viewPanel;
	

private final static int HEIGHT=742;

 
private final static int WIDTH=1000;
	
/**
	 * Instantiates a new view frame.
 * @throws SQLException 
 
	 */

  public ViewFrame(final IModel model) throws HeadlessException{

  this.buildViewFrame(model);

   }

 
  //public ViewFrame() {
	
//}

/**

 * Instantiates a new view frame.

 *

 * @param model

 *          the model

 * @param gc

 *          the gc
 * @throws SQLException 

 */

public ViewFrame(final IModel model, final GraphicsConfiguration gc){

 super(gc);

 this.buildViewFrame(model);

}



/**

 * Instantiates a new view frame.

 *

 * @param model

 *          the model

 * @param title

 *          the title

 * @throws HeadlessException

 *           the headless exception
 * @throws SQLException 

 */

public ViewFrame(final IModel model, final String title) throws HeadlessException{

 super(title);

 this.buildViewFrame(model);

}



/**

 * Instantiates a new view frame.

 *

 * @param model

 *          the model

 * @param title

 *          the title

 * @param gc

 *          the gc 
 * @throws SQLException 

 */

      public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {

      super(title, gc);

         this.buildViewFrame(model);

}



/**

 * Gets the controller.

 *

 * @return the controller

 */

     private IController getController() {

       return this.controller;

         }



/**

 * Sets the controller.

 *

 * @param controller

 *          the new controller

 */

     protected void setController(final IController controller) {

     this.controller = controller;

      }
     
     



/**

 * Gets the model.

 *

 * @return the model

 */

protected IModel getModel() {

 return this.model;

}



/**

 * Sets the model.

 *

 * @param model

 *          the new model

 */

private void setModel(final IModel model) {

 this.model = model;

}



/**

 * Builds the view frame.
 * @param model2 

 *

 * @param model

 *          the model
 * @throws SQLException 

 */

	private void buildViewFrame(IModel model) {
		ViewPanel pan = new ViewPanel();
	    this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("BoulderDash");
		this.setResizable(false);
		this.addKeyListener(new KeyBoard(pan));
		this.setContentPane(pan);
		this.setSize(WIDTH,HEIGHT);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
		System.out.println(ViewFrame.HEIGHT+" "+ViewFrame.WIDTH);
		
	}



}
