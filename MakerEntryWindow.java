import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
 * Each object of this class represents a GUI maker entry window (MVC view).
 * </p> 
 *
 */
public class MakerEntryWindow extends JFrame {
	
	/** Button to click to create new episode entry */
	JButton jbtCreateEntry;

	/** Button to clear text fields of episode info. */
	JButton jbtClearInput;

	/** Button to cancel entry */
	JButton jbtCancel; 
	
	/** Button to update entries when editing */
	JButton jbtUpdate;
	
	/** Button to make new media entry for acting credits */
	JButton jbtActingNewEntry;
	
	/** Button to make new media entry for directing credits */
	JButton jbtDirectingNewEntry;
	
	/** Button to make new media entry for producing credits */
	JButton jbtProducingNewEntry;
	
	/** TextFields to input maker name and disambiguation number */
	JTextField jtfFirstName;
	JLabel lblFirstName;
	JTextField jtfLastName;
	JLabel lblLastName;
	JTextField jtfDisambigNumber;
	JLabel lblDisambigNumber;
	
	/** Drop down menus for maker's credits */
	// Acting Credits
	JComboBox<Media> jcbActingCredits;
	JLabel lblActingCredits;
	
	// Directing Credits
	JComboBox<Media> jcbDirectingCredits;
	JLabel lblDirectingCredits;
	
	// Producing Credits
	JComboBox<Media> jcbProducingCredits;
	JLabel lblProducingCredits;
	
	// Create Panels for all of the input fields and buttons
	JPanel jplFirstName;
	JPanel jplLastName;
	JPanel jplDisambigNumber;
	JPanel jplActingCredits;
	JPanel jplDirectingCredits;
	JPanel jplProducingCredits;
	JPanel jplButtons;
	
	/**
	 * Constructor for a Maker Entry Window
	 */
	public void MakerEntryWindow() {
		// Intentionally Left Empty
	}
	
	/**
	 * Method to add listener to Create Entry button
	 */
	public void addCreateEntryButtonListener (ActionListener createEntryListener) {
		// TODO write method 
	}
	
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

} // ENDS MAKER ENTRY WINDOW CLASS
