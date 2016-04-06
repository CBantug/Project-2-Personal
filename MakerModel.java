import java.awt.event.*;
import java.util.*;

/**
 * Project #4
 * CS 2334, Section 010
 * 1 April 2016
 * <p>
 * Each object of this class represents a GUI enhanced model of maker.
 * The model of an MVC GUI.
 * </p>
 *
 */
public class MakerModel {

	/**
	 * List to keep track of who is registered to listen for events from the MediaModel.
	 */
	private ArrayList<ActionListener> actionListenerLIst;
	
	/**
	 * Constructor for a new MakerModel
	 */
	public MakerModel () {
		// TODO write method
	}
	
	/**
	 * Method to add a maker entry to the model
	 * @param maker
	 * @return success
	 */
	public boolean addMaker (MediaMaker maker) {
		// TODO write method
		return true;
	}
	
	/**
	 * Method to remove a maker entry from the model
	 * @param maker
	 * @return success
	 */
	public boolean removeMaker (MediaMaker maker) {
		// TODO write method
		return true;
	}
	
	/**
	 * Method to update a maker entry in the model
	 * @param maker
	 * @return success
	 */
	public boolean updateMaker (MediaMaker maker) {
		// TODO write method
		return true;
	}
	
	/**
	 * Method to clear all entries of a certain data type 
	 * from the database
	 * @param type
	 * @return success
	 */
	public boolean clearEntryType (String type) {
		// TODO write method
		return true;
	}
	
	/**
	 * Method to clear ALL entries, regardless of type, from
	 * the database
	 * @return success
	 */
	public boolean clearAllEntries () {
		// TODO write method
		return true;
	}
	
	/**
	 * Register an action event listener
	 * @param al
	 */
	public synchronized void addActionListener(ActionListener al) {
		// TODO write method
	}
	
	/**
	 * Remove an action even listener
	 * @param al
	 */
	public synchronized void removeActionListener(ActionListener al) {
		// TODO write method
	}
	
	/**
	 * Fire event
	 * @param ae
	 */
	private void processEvent(ActionEvent ae) {
		// TODO write method
	}
}
