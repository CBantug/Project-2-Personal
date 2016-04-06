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
 * Each object of this class represents a GUI episode entry window (MVC view).
 * </p> 
 *
 */
public class EpisodeEntryWindow extends JFrame {

	/** Button to click to create new episode entry */
	JButton jbtCreateEntry;

	/** Button to clear text fields of episode info. */
	JButton jbtClearInput;

	/** Button to cancel entry */
	JButton jbtCancel; 
	
	/** Button to update entries when editing */
	JButton jbtUpdate;

	/** Drop Down options for series selection */
	JComboBox<Series> jcbSeries;
	JLabel lblSeries;
	Series[] seriesChoices; // Array to hold all of the series options from which to choose
	
	/** TextField to input new episode title. */
	JTextField jtfTitle;
	JLabel lblTitle;

	/** TextField to input episode's season number. */
	JTextField jtfSeasonNumber;
	JLabel lblSeasonNumber;

	/** TextField to input episode's episode number. */
	JTextField jtfEpisodeNumber;
	JLabel lblEpisodeNumber;
	
	/** TextField to input episode's year. */
	JTextField jtfYear;
	JLabel lblYear;
	
	// Create Panels for all of the input fields and buttons
	JPanel jplSeriesDropdown; // Panel for Series JCB and LBL
	JPanel jplTitle; // Panel for Title JTF and LBL
	JPanel jplSeasonNumber; // Panel for SeasonNumber JTF and LBL
	JPanel jplEpisodeNumber; // Panel for EpisodeNumber JTF and LBL
	JPanel jplYear; // Panel for Year JTF and LBL
	
	/**
	 * Constructor for a Episode Entry Window
	 */
	public void EpisodeEntryWindow () {
		// Intentionally Left Empty
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
	
} // ENDS EPISODE ENTRY WINDOW CLASS
