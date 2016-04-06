import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
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
 * Each object of this class represents a GUI selection window (MVC view).
 * </p> 
 *
 */

public class SelectionViewWindow extends JFrame implements Serializable {

	private static final long serialVersionUID = (Long) null;
	
	// Radio Button declarations
	/** Radio Button to display Media content in scroll pane */
	JButton jbtRadioMedia;
	
	/** Radio Button to display Movie content in scroll pane */
	JButton jbtRadioMovies;
	
	/** Radio Button to display Series content in scroll pane */
	JButton jbtRadioSeries;
	
	/** Radio BUtton to display Episode content in scroll pane */
	JButton jbtRadioEpisodes;
	
	/** Radio Button to display Maker content in scroll pane */
	JButton jbtRadioMakers;
		
	/** Radio Button to display Actor content in scroll pane */
	JButton jbtRadioActors;
	
	/** Radio Button to display Director content in scroll pane */
	JButton jbtRadioDirectors;
	
	/** Radio Button to display Producer content in scroll pane */
	JButton jbtRadioProducers;
	
	// File Menu declarations
	JMenu jmFile; // File Menu
	JMenuItem jmiLoad; // File Menu item to choose to load a file
	JMenuItem jmiSave; // File Menu item to choose to save to a file
	JMenuItem jmiImport; // File Menu item to choose to import a text file
	JMenuItem jmiExport; // File Menu item to choose to export to a text file
	
	// Edit Menu declarations
	JMenu jmEdit; // Edit Menu
	JMenuItem jmiAdd; // Edit Menu item to add an entry
	JMenuItem jmiEdit; // Edit Menu item to edit an entry
	JMenuItem jmiDelete; // Edit Menu item to delete an entry
	JMenuItem jmiClear; // Edit Menu item to clear all of an entry type
	JMenuItem jmiClearAll; // Edit Menu item to clear all entries
	
	// Display Menu declarations
	JMenu jmDisplay; // Display Menu
	JMenuItem jmiPieChart; // Display Menu item to display selected entry's information as a pie chart
	JMenuItem jmiHistogram; // Display Menu item to display selected entry's information as a histogram

	// JLabels for SelectionViewWindow
	JLabel leftButtonSelection; // Label for the Radio Buttons on the LHS of SVW
	JLabel rightSelectionType; // Label for the content type in the scroll pane of SVW
	
	// Scroll Pane declarations
	JList<Media> jlMediaEntries; // List for the media entries to show in scroll pane
	JList<MediaMaker> jlMakerEntries; // List for the media maker entries to show in scroll pane
	
	// Left Panel declarations
	JPanel jplRadioButtons; // Panel to hold all of the radio buttons on LHS
	JPanel jplScrollPane; // Panel to hold the scroll pane of SVW
	
	/** 
	 * Constructor for a Selection View Window
	 */
	public void SelectionViewWindow() {
		// Intentionally Left Empty
	}
	
	/**
	 * Method to add listener to Media Radio Button
	 */
	public void addRadioMediaButtonListener (ActionListener radioMediaListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Movies Radio Button
	 */
	public void addRadioMovieButtonListener (ActionListener radioMovieListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Series Radio Button
	 */
	public void addRadioSeriesButtonListener (ActionListener radioSeriesListener) {
		// TODO write method
	}

	/**
	 * Method to add listener to Episodes Radio Button
	 */
	public void addRadioEpisodesButtonListener (ActionListener radioEpisodesListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Makers Radio Button
	 */
	public void addRadioMakersButtonListener (ActionListener radioMakersListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Actors Radio Button
	 */
	public void addRadioActorsButtonListener (ActionListener radioActorsListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Directors Radio Button
	 */
	public void addRadioDirectorsButtonListener (ActionListener radioDirectorsListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Producers Radio Button
	 */
	public void addRadioProducersButtonListener (ActionListener radioProducersListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to File/Load option
	 */
	public void addLoadListener (ActionListener loadListener) {
		// TODO write method
	}
	/**
	 * Method to add listener to File/Save option
	 */
	public void addSaveListener (ActionListener saveListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to File/Import option
	 */
	public void addImportListener (ActionListener importListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to File/Export option
	 */
	public void addExportListener (ActionListener exportListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Edit/Add option
	 */
	public void addAddListener (ActionListener editAddListener) {
		// TODO write method
	}

	/**
	 * Method to add listener to Edit/Edit option
	 */
	public void addEditListener (ActionListener editEditListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Edit/Delete option
	 */
	public void addDeleteListener (ActionListener editDeleteListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Edit/Clear option
	 */
	public void addClearListener (ActionListener editClearListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Edit/Clear All option
	 */
	public void addClearAllListener (ActionListener editClearAllListener) {
		// TODO write method
	}
	
	/**
	 * Method to add listener to Display/Pie Chart option
	 */
	public void addPieChartListener (ActionListener displayPieChartListener) {
		// TODO write method
	}

	/**
	 * Method to add listener to Display/Histogram option
	 */
	public void addHistogramListener (ActionListener displayHistogramListener) {
		// TODO write method
	}

} // ENDS SELECTION VIEW WINDOW CLASS
