package view;

import java.awt.HeadlessException;
import java.sql.SQLException;

import javax.swing.SwingUtilities;

import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Jean-Aymeric Diet
 */
public final class View implements IView,Runnable{

	/** The frame. */
	private ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 * @throws SQLException 
	 * @throws HeadlessException 
	 */
	public View(final IModel model) throws HeadlessException, SQLException{
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);		
	}

	public ViewFrame getViewFrame() {
		return viewFrame;
	}

	public void setViewFrame(ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	@Override
	public void printMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.viewFrame.setVisible(true);
	}



}
