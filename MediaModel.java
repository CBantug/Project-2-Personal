import java.awt.event.*;
import java.util.*;

/**
 * Project #4
 * CS 2334, Section 010
 * 1 April 2016
 * <p>
 * Each object of this class represents a GUI enhanced model of media.
 * The model of an MVC GUI.
 * </p>
 *
 */
public class MediaModel {

	/**
	 * List to keep track of who is registered to listen for events from the MediaModel.
	 */
	private ArrayList<ActionListener> actionListenerLIst;
	
	/**
	 * Constructor for a new MediaModel
	 */
	public MediaModel() {
		// TODO write method
	}
	
	/**
	 * Method to add a movie entry to the model
	 * @param movie
	 * @return success
	 */
	public boolean addMovie (Movie movie) {
		// TODO write method
	return true;
	}
	
	/**
	 * Method to remove a movie entry from the model
	 * @param movie
	 * @return success
	 */
	public boolean removeMovie (Movie movie) {
		// TODO write method
		return true;
	}
	
	/**
	 * Method to update a movie entry in the model
	 * @param movie
	 * @return success;
	 */
	public boolean updateMovie (Movie movie) {
		// TODO write method
		return true;
	}

	/**
	 * Method to add a series entry to the model
	 * @param series
	 * @return success
	 */
	public boolean addSeries (Series series) {
		// TODO write method
	return true;
	}
	
	/**
	 * Method to remove a series entry from the model
	 * @param series
	 * @return success
	 */
	public boolean removeSeries (Series series) {
		// TODO write method
		return true;
	}
	
	/**
	 * Method to update a series entry in the model
	 * @param series
	 * @return success
	 */
	public boolean udpateSeries (Series series) {
		// TODO write method
		return true;
	}
	
	/**
	 * Method to add a episode entry to the model
	 * @param episode
	 * @return success
	 */
	public boolean addEpisode (Episode episode) {
		// TODO write method
	return true;
	}
	
	/**
	 * Method to remove a movie entry from the model
	 * @param episode
	 * @return success
	 */
	public boolean removeEpisode (Episode episode) {
		// TODO write method
		return true;
	}
	
	/**
	 * Method to update a movie entry in the model
	 * @param episode
	 * @return success
	 */
	public boolean updateEpisode (Episode episode) {
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

} // ENDS MEDIAMODEL CLASS
