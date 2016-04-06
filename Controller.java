import java.awt.event.*;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Project 4
 * CS 2334 Section 10
 * 31 March 2016
 * <P>
 * The MVC controller for the program
 * </P>
 */

public class Controller {
	
	// Private variables for the model and view part of the MVC
	private MediaModel mediaModel;
	private MakerModel makerModel;
	private SelectionViewWindow selectionView;
	
	private MovieEntryWindow movieEntryView;
	private SeriesEntryWindow seriesEntryView;
	private EpisodeEntryWindow episodeEntryView;
	private MakerEntryWindow makerEntryView;
	
	
	
	/**
	 * Creates new Controller
	 */
	 Controller() {
		// Intentionally left empty
	}
	
	/**
	 * @param model
	 * 			to set as the model
	 */
	public void setMediaModel (MediaModel model) {
		this.mediaModel = model;
	}
	
	/**
	 * @param model
	 * 			to set as the model
	 */
	public void setMakerModel (MakerModel model) {
		this.makerModel = model;
	}
	
	/**
	 * @return MediaModel	the media model
	 */
	public MediaModel getMediaModel() {
		return mediaModel;
	}
	
	/**
	 * @return MakerModel the maker model
	 */
	public MakerModel getMakerModel() {
		return makerModel;
	}
	
	/**
	 * @param theView
	 * 				on which the listeners should be set
	 */
	public void setSelectionContentWindow(SelectionViewWindow theView) {
		this.selectionView = theView;
	}
	
	/**
	 * @param theView
	 * 				on which the listeners should be set
	 */
	public SelectionViewWindow getSelectionContentWindow(SelectionViewWindow theView) {
		return selectionView;
	}
	
	
	/**
	 * @return the movieEntryView
	 */
	public MovieEntryWindow getMovieEntryView() {
		return movieEntryView;
	}

	/**
	 * @param movieEntryView the movieEntryView to set
	 */
	public void setMovieEntryView(MovieEntryWindow movieEntryView) {
		this.movieEntryView = movieEntryView;
	}

	/**
	 * @return the seriesEntryView
	 */
	public SeriesEntryWindow getSeriesEntryView() {
		return seriesEntryView;
	}

	/**
	 * @param seriesEntryView the seriesEntryView to set
	 */
	public void setSeriesEntryView(SeriesEntryWindow seriesEntryView) {
		this.seriesEntryView = seriesEntryView;
	}

	/**
	 * @return the episodeEntryView
	 */
	public EpisodeEntryWindow getEpisodeEntryView() {
		return episodeEntryView;
	}

	/**
	 * @param episodeEntryView the episodeEntryView to set
	 */
	public void setEpisodeEntryView(EpisodeEntryWindow episodeEntryView) {
		this.episodeEntryView = episodeEntryView;
	}

	/**
	 * @return the makerEntryView
	 */
	public MakerEntryWindow getMakerEntryView() {
		return makerEntryView;
	}

	/**
	 * @param makerEntryView the makerEntryView to set
	 */
	public void setMakerEntryView(MakerEntryWindow makerEntryView) {
		this.makerEntryView = makerEntryView;
	}

	/**
	 * RadioMediaListener provides a method for the user to choose 
	 * the types of data they would like to be displayed within the 
	 * content pane of the main program window. If the model is null
	 * when the method is called, it returns without taking any action.
	 */
	private class RadioMediaListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends RadioMediaListener
	
	/**
	 * RadioMovieListener provides a method for the user to choose
	 * the types of data they would like to b displayed within the 
	 * content pane of the main program window. If the model is null
	 * when the method is called, it returns without taking any action.
	 */
	private class RadioMovieListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends RadioMovieListener
	
	/**
	 * RadioSeriesListener provides a method for the user to choose
	 * the types of data they would like to b displayed within the 
	 * content pane of the main program window. If the model is null
	 * when the method is called, it returns without taking any action.
	 */
	private class RadioSeriesListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends RadioSeriesListener
	
	/**
	 * RadioEpisodesListener provides a method for the user to choose
	 * the types of data they would like to b displayed within the 
	 * content pane of the main program window. If the model is null
	 * when the method is called, it returns without taking any action.
	 */
	private class RadioEpisodesListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends RadioEpisodesListener
	
	/**
	 * RadioMakersListener provides a method for the user to choose
	 * the types of data they would like to b displayed within the 
	 * content pane of the main program window. If the model is null
	 * when the method is called, it returns without taking any action.
	 */
	private class RadioMakersListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends RadioMakersListener
	
	/**
	 * RadioActorsListener provides a method for the user to choose
	 * the types of data they would like to b displayed within the 
	 * content pane of the main program window. If the model is null
	 * when the method is called, it returns without taking any action.
	 */
	private class RadioActorsListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends RadioActorsListener
	
	/**
	 * RadioDirectorsListener provides a method for the user to choose
	 * the types of data they would like to b displayed within the 
	 * content pane of the main program window. If the model is null
	 * when the method is called, it returns without taking any action.
	 */
	private class RadioDirectorsListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends RadioDirectorsListener
	
	/**
	 * RadioProducersListener provides a method for the user to choose
	 * the types of data they would like to b displayed within the 
	 * content pane of the main program window. If the model is null
	 * when the method is called, it returns without taking any action.
	 */
	private class RadioProducersListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends RadioProducersListener
	
	/**
	 * LoadListener provides a method for the user to load Object
	 * information from console I/O.
	 */
	private class LoadListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends LoadListener
	
	/**
	 * SaveListener provides a method for the user to save the 
	 * existing data list to a file.
	 */
	private class SaveListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends SaveListener
	
	/**
	 * ImportListener provides a method for the user to import
	 * existing database information from an existing file. 
	 */
	private class ImportListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends ImportListener
	
	/**
	 * ExportListener provides a method for the user to export 
	 * a particular data type to a file.
	 */
	private class ExportListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends ExportListener
	
	/**
	 * editAddListener provides a method for the user to add a new
	 * data entry of the type previously determined by the radio
	 * buttons in the SelectionViewWindow.
	 */
	private class editAddListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends editAddListener
	
	/**
	 * editAddListener provides a method for the user to edit an 
	 * existing data entry. An edit pane will display the current
	 * information belonging to that particular entry, which the user
	 * will be able to change.
	 */
	private class editEditListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends editAddListener
	
	/**
	 * editDeleteListener provides a method for the user to delete the
	 * selected data entry from the database. 
	 */
	private class editDeleteListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends editDeleteListener
	
	/**
	 * editClearListener provides a method for the user to delete all 
	 * data entries of the type selected by the radio buttons in the
	 * SelectionViewWindow.
	 */
	private class editClearListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends editClearListener
	
	/**
	 * editClearAllListener provides a method for the user to delete all
	 * of the data entries within the database.
	 */
	private class editClearAllListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends editClearAllListener
	
	/**
	 * displayPieChartListener provides a method for the user to display the
	 * information of the selected Maker/Actor/Director/Producer entry as a 
	 * pie chart, which will be displayed in its own window.
	 */
	private class displayPieChartListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends displayPieChartListener
	
	/**
	 * displayHistogramListener provides a method for the user to display the
	 * information of the selected Maker/Actor/Director/Producer entry as a 
	 * histogram, which will be displayed in its own window.
	 */
	private class displayHistogramListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends displayHistogramListener
	
	/**
	 * MakeNewEntryListener provides a method for the user to concurrently create
	 * new media entries during the production of a new Maker entry, which will 
	 * then be added to the appropriate credits list within that new Maker entry.
	 */
	private class MakeNewEntryListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends MakeNewEntryListener
	
	/**
	 * UpdateEntryListener provides a method for the user to update the data contents
	 * of the selected entry.
	 */
	private class UpdateEntryListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends UpdateEntryListener
	
	/**
	 * CreateEntryListener provides a method for the user to create a new entry
	 * of the selected type and add it to the appropriate model and database.
	 */
	private class CreateEntryListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends CreateEntryListener

	/**
	 * ClearInputFieldsListener provides a method for the user to clear all input fields
	 * during the creation of a new entry of the selected type
	 */
	private class ClearInputFieldsListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends ClearInputFieldsListener
	
	/**
	 * CancelListener provides a method for the user to create a new entry
	 * of the selected type and add it to the appropriate model and database.
	 */
	private class CancelListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO write method
		}
	} // Ends CancelListener
	
	



} // ENDS MEDIACONTROLLER CLASS
