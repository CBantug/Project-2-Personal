import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 * Project 4
 * CS 2334, Section 010
 * 1 April 2016
 * <p>
 * Each object of this class represents a GUI movie entry window (MVC view).
 * </p> 
 *
 */

public class MovieEntryWindow extends JFrame {

	/** Button to click to create new movie entry */
	JButton jbtCreateEntry;
	
	/** Button to click to clear input fields */
	JButton jbtClearInput;
	
	/** Button to click to cancel the entry creation */
	JButton jbtCancel;
	
	/** Button to update entries when editing */
	JButton jbtUpdate;
	
	/** TextField to enter movie title */
	JTextField jtfTitle;
	JLabel lblTitle;
	
	/** TextField to enter release year */
	JTextField jtfYear;
	JLabel lblYear;
	
	/** TextField to enter disambiguation numeral */
	JTextField jtfNumeral;
	JLabel lblNumeral;
	
	/** TextField to enter the venue */
	JTextField jtfVenue;
	JLabel lblVenue;
	
	// Create Panels for all of the input fields and buttons
	JPanel jplTitle; // Panel for Title JTF and LBL
	JPanel jplYear; // Panel for Year JTF and LBL
	JPanel jplNumeral; // Panel for Numeral JTF and LBL
	JPanel jplVenue; // Panel for Venue JTF and LBL
	JPanel jplButtons; // Panel for buttons
	
	/**
	 * Method to clear all input fields for the movie entry
	 */
	public void clearInputFields() {
		// TODO write method
	}
	
	/**
	 *  Method to pre-populate all input fields when editing an existing entry
	 *  and changes "Create Entry" button to the "Update Entry" button.
	 */
	public void prePopulateInputFields() {
		// TODO write method
	}
	
	/**
	 * Constructor for a Movie Entry Window
	 */
	public void MovieEntryWindow () {
		// Intentionally Left Empty
	}

	/**
	 * Method to add listener to Create Entry button
	 */
	public void addCreateEntryButtonListener (ActionListener createEntryListener) {
		// TODO write method 
	}
	
	/**
	 * Method to add listener to Clear Input Fields button
	 */
	public void addClearInputFieldsListener (ActionListener clearInputFieldsListener) {
		// TODO write method 
	}
	
	/**
	 * Method to add listener to Cancel button
	 */
	public void addCancelButtonListener (ActionListener cancelListener) {
		// TODO write method 
	}
	
	/**
	 * Method to add listener to Update Entry Button
	 */
	public void addUpdateEntryButtonListener (ActionListener updateEntryListener) {
		// TODO write method 
	}
	

} // ENDS MOVIE ENTRY WINDOW CLASS
