import java.awt.Color;
import java.util.LinkedHashMap;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JComponent;

/**
 * Project #4
 * CS 2334, Section 010
 * 1 April 2016
 * <P>
 * A class that stores data for a media maker's credits and constructs a
 * representative histogram of their credits over years to display to user.
 * </P>
 * 
 * @version 1.0
 */
public class Histogram extends JComponent implements Serializable{
	
	/** The Series class's version number used during deserialization. */
	private static final long serialVersionUID = 8311005649993295636L;

	/** The media maker whose credits are displayed over time on the histogram.*/
	private MediaMaker mediaMaker;
	
	/** The number of a media maker's acting movie credits. */
	private int actingMovieCred;

	/** The number of a media maker's acting series credits. */
	private int actingSeriesCred;

	/** The number of a media maker's producing movie credits. */
	private int producingMovieCred;

	/** The number of a media maker's producing series credits. */
	private int producingSeriesCred;

	/** The number of a media maker's directing movie credits. */
	private int directingMovieCred;

	/** The number of a media maker's directing series credits. */
	private int directingSeriesCred;

	/** A list storing the years in which the media maker had credits in. */
	private ArrayList<String> creditYears;
	
	/**
	 * Histogram constructor that set the variable mediaMaker and will
	 * automatically call paintComponent to display the histogram.
	 * 
	 * @param	mediaMaker	Media maker whose credits will be graphically displayed.
	 */
	public Histogram (MediaMaker mediaMaker) {
		this.mediaMaker = mediaMaker;
	}

	/**
	 * An accessor for the variable actingMovieCred.
	 * <P>
	 * Algorithm:<br>
	 * 1. Finds number of acting movie credits within a list of credits from the same year.<br>
	 * 2. Do NOT include a step by step description of the algorithm here.<br>
	 * 3. Be sure to put an html <br> tag after each line.<br>
	 * </P>
	 * @param	list	A Media list containing all credits from a single year.
	 * @param	mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return	The number of media maker's acting movie credits within a single year.
	 */
	public int getActingMovieCred(ArrayList<Media> list, MediaMaker mediaMaker) {
		actingMovieCred = 0; // Sets initial amount of credits before looping
		
		// Loops through credits from a single year and adds up only the credits for movie acting
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getClass().getName().equals("Movie") && 
					(mediaMaker.getActingCredits().contains(list.get(i)))) {
				++actingMovieCred;
				}
			}
		return actingMovieCred;
	}

	/**
	 * An accessor for the variable actingSeriesCred.
	 * Algorithm:<br>
	 * 1. Finds number of acting series credits within a list of credits from the same year.<br>
	 * 2. Do NOT include a step by step description of the algorithm here.<br>
	 * 3. Be sure to put an html <br> tag after each line.<br>
	 * </P>
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return	The number of media maker's acting series credits.
	 */
	public int getActingSeriesCred(ArrayList<Media> list, MediaMaker mediaMaker) {
		actingSeriesCred = 0; // Sets initial amount of credits before looping

		// Loops through credits from a single year and adds up only the credits for series acting
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getClass().getName().equals("Series") && 
					(mediaMaker.getActingCredits().contains(list.get(i)))) {
				++actingSeriesCred;
			}
		}
		return actingSeriesCred;
	}

	/**
	 * An accessor for the variable producingMovieCred.
	 * Algorithm:<br>
	 * 1. Finds number of producing movie credits within a list of credits from the same year.<br>
	 * 2. Do NOT include a step by step description of the algorithm here.<br>
	 * 3. Be sure to put an html <br> tag after each line.<br>
	 * </P> 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return	The number of media maker's producing movie credits.
	 */
	public int getProducingMovieCred(ArrayList<Media> list, MediaMaker mediaMaker) {
		producingMovieCred = 0; // Sets initial amount of credits before looping

		// Loops through credits from a single year and adds up only the credits for movie producing
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getClass().getName().equals("Movie") && 
					(mediaMaker.getProducingCredits().contains(list.get(i)))) {
				++producingMovieCred;
			}
		}
		return producingMovieCred;
	}

	/**
	 * An accessor for the variable producingSeriesCred.
	 * Algorithm:<br>
	 * 1. Finds number of producing series credits within a list of credits from the same year.<br>
	 * 2. Do NOT include a step by step description of the algorithm here.<br>
	 * 3. Be sure to put an html <br> tag after each line.<br>
	 * </P> 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return	The number of media maker's producing series credits.
	 */
	public int getProducingSeriesCred(ArrayList<Media> list, MediaMaker mediaMaker) {
		producingSeriesCred = 0; // Sets initial amount of credits before looping

		// Loops through credits from a single year and adds up only the credits for series producing
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getClass().getName().equals("Series") && 
					(mediaMaker.getProducingCredits().contains(list.get(i)))) {
				++producingSeriesCred;
			}
		}
		return producingSeriesCred;
	}

	/**
	 * An accessor for the variable directingMovieCred.
	 * Algorithm:<br>
	 * 1. Finds number of directing movie credits within a list of credits from the same year.<br>
	 * 2. Do NOT include a step by step description of the algorithm here.<br>
	 * 3. Be sure to put an html <br> tag after each line.<br>
	 * </P> 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return	The number of media maker's directing movie credits.
	 */
	public int getDirectingMovieCred(ArrayList<Media> list, MediaMaker mediaMaker) {
		directingMovieCred = 0; // Sets initial amount of credits before looping

		// Loops through credits from a single year and adds up only the credits for movie directing
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getClass().getName().equals("Movie") && 
					(mediaMaker.getDirectingCredits().contains(list.get(i)))) {
				++directingMovieCred;
			}
		}
		return directingMovieCred;
	}

	/**
	 * An accessor for the variable directingSeriesCred.
	 * Algorithm:<br>
	 * 1. Finds number of directing series credits within a list of credits from the same year.<br>
	 * 2. Do NOT include a step by step description of the algorithm here.<br>
	 * 3. Be sure to put an html <br> tag after each line.<br>
	 * </P> 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return	The number of media maker's directing series credits.
	 */
	public int getDirectingSeriesCred(ArrayList<Media> list, MediaMaker mediaMaker) {
		directingSeriesCred = 0; // Sets initial amount of credits before looping

		// Loops through credits from a single year and adds up only the credits for series directing
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getClass().getName().equals("Series") && 
					(mediaMaker.getDirectingCredits().contains(list.get(i)))) {
					++directingSeriesCred;
				}
			}
		return directingSeriesCred;
	}
	
	public int getStartYear(MediaMaker mediaMaker) {
		StringBuilder temp = new StringBuilder(getCreditYears(mediaMaker).get(0));

		temp.deleteCharAt(0);
		temp.deleteCharAt(temp.length() - 1);

		int startYear = Integer.parseInt(temp.toString());
		return startYear;
	}
	
	public int getEndYear(MediaMaker mediaMaker) {
		StringBuilder temp = new StringBuilder(getCreditYears(mediaMaker).get(getCreditYears(mediaMaker).size()- 1).toString());

		temp.deleteCharAt(0);
		temp.deleteCharAt(temp.length() - 1);

		int endYear = Integer.parseInt(temp.toString());
		return endYear;
	}
	
	/**
	 * An accessor for the variable creditYears.
	 * 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return	A String ArrayList storing years from all of media maker's credits.
	 */
	public ArrayList<String> getCreditYears(MediaMaker mediaMaker) {
			// Adds years from media maker's acting credits to String ArrayList years
			ArrayList<String>creditYears = new ArrayList<String>();
			
			for (int i = 0; i < mediaMaker.getActingCredits().size(); ++i) {
				String year = mediaMaker.getActingCredits().get(i).getReleaseYear();
				if (creditYears.contains(year) == false) {
					creditYears.add(year);
				}
			}

			// Adds years from media maker's producing credits to String ArrayList years
			for (int i = 0; i < mediaMaker.getProducingCredits().size(); ++i) {
				String year = mediaMaker.getProducingCredits().get(i).getReleaseYear();
				if (creditYears.contains(year) == false) {
					creditYears.add(year);
				}
			}

			// Adds years from media maker's directing credits to String ArrayList years
			for (int i = 0; i < mediaMaker.getDirectingCredits().size(); ++i) {
				String year = mediaMaker.getDirectingCredits().get(i).getReleaseYear();
				if (creditYears.contains(year) == false) {
					creditYears.add(year);
				}
			}

			Collections.sort(creditYears); // Sorts years numerically
			return creditYears;
		} // end getCreditYears
	
	/**
	 * Creates a Linked Hash Map where the years media maker had credits in are keys
	 * and Media ArrayLists containing all credits from a certain year are values to
	 * use when painting the Histogram.
	 * 
	 * @param mediaMaker	The media maker whose credits are being displayed.
	 * @return	A LinkedHashMap Linked Hash Map where the years media maker had credits in are keys
	 *                          and Media ArrayLists containing all credits from a certain year are values
	 */
	public LinkedHashMap<Integer, ArrayList<Media>> getCredYearsMap(MediaMaker mediaMaker) {
		LinkedHashMap<Integer, ArrayList<Media>> credits = new LinkedHashMap<Integer, ArrayList<Media>>();
		
		// Get first and last year to create the range of years for the histogram
		if (getCreditYears(mediaMaker).size() != 0 && !getCreditYears(mediaMaker).get(0).equals("")) {
			int startYear = getStartYear(mediaMaker);
			int lastYear = getEndYear(mediaMaker);

			for (int i = startYear; i <= lastYear; ++i) {

				// Constructs a Media AL for all credits within a single year
				ArrayList<Media> sameYearCred = new ArrayList<Media>();

				// Finds all acting credits from the same year and adds to a Media ArrayList
				for (int j = 0; j < mediaMaker.getActingCredits().size(); ++j) {
					StringBuilder year = new StringBuilder(mediaMaker.getActingCredits().get(j).getReleaseYear());
					year.deleteCharAt(0);
					year.deleteCharAt(year.length() - 1);
					
					if (Integer.toString(i).equalsIgnoreCase(year.toString()) == true) {
						sameYearCred.add(mediaMaker.getActingCredits().get(j));
					}
				}

				// Finds all producing credits from the same year and adds to a Media ArrayList
				for (int k = 0; k < mediaMaker.getProducingCredits().size(); ++k) {
					StringBuilder year = new StringBuilder(mediaMaker.getProducingCredits().get(i).getReleaseYear());
					year.deleteCharAt(0);
					year.deleteCharAt(year.length() - 1);
					if (Integer.toString(i).equalsIgnoreCase(year.toString()) == true) {
						sameYearCred.add(mediaMaker.getActingCredits().get(k));
					}
				}

				// Finds all directing credits from the same year and adds to a Media ArrayList
				for (int l = 0; l < mediaMaker.getDirectingCredits().size(); ++l) {
					StringBuilder year = new StringBuilder(mediaMaker.getDirectingCredits().get(i).getReleaseYear());
					year.deleteCharAt(0);
					year.deleteCharAt(year.length() - 1);
					if (Integer.toString(i).equalsIgnoreCase(year.toString()) == true) {
						sameYearCred.add(mediaMaker.getActingCredits().get(l));
					}
				}	
				credits.put(i, sameYearCred);
			}		
		}
		return credits;
	}

	/**
	 * Paints a histogram of a media maker's credits over the years where
	 * every bar is subdivided among the 6 different types of credits.
	 * 
	 * @param	g	Graphics object used to draw shapes within the graph.
	 */
	public void paintComponent(Graphics g) {
		// Map storing years as keys and lists of credits grouped by the same year as values
		LinkedHashMap<Integer, ArrayList<Media>> map = getCredYearsMap(mediaMaker);
		// Assigns first and last year of media maker's credits for histogram graph
		if (getCreditYears(mediaMaker).size() != 0 && (!getCreditYears(mediaMaker).get(0).equals(""))) {
				int startYear = getStartYear(mediaMaker);
				int lastYear = getEndYear(mediaMaker);
				int startingCoordX = 30; // Starting X coordinate for a rectangle within a bar
				int startingCoordY = 10; // Starting Y coordinate for a rectangle within a bar
				int width = 0; // Initial width of a rectangle within a bar
		
				//AffineTransform at = new AffineTransform(); // Utilized for linearly rotating the year string
				Graphics2D graphicsObj = (Graphics2D) g; // Cast to Graphics2D
		
		// Loops to construct bars for every year of media maker's credits
		for (int i = startYear; i <= lastYear; ++i) {
			ArrayList<Media> credits = map.get(i); // List of credits within a single year
			
			// Create separate bars within the year bar representing the different types of credit
			if (credits != null) {
				for (int j = 0; j < 6; ++j) {
					// Creates rectangle for movie acting credits
					if (j == 0) {
						width = getActingMovieCred(credits, mediaMaker) * 10;
						graphicsObj.setColor(Color.black);
					}
					// Creates rectangle for series acting credits
					else if (j == 1) {
						width = getActingSeriesCred(credits, mediaMaker) * 10;
						graphicsObj.setColor(Color.green);
					}
					// Creates rectangle for movie producing credits
					else if (j == 2) {
						width = getProducingMovieCred(credits, mediaMaker) * 10;
						graphicsObj.setColor(Color.yellow);
					}
					// Creates rectangle for series producing credits
					else if (j == 3) {
						width = getProducingSeriesCred(credits, mediaMaker) * 10;
						graphicsObj.setColor(Color.red);
					}
					// Creates rectangle for movie directing credits
					else if (j == 4) {
						width = getDirectingMovieCred(credits, mediaMaker) * 10;
						graphicsObj.setColor(Color.blue);
					}
					// Creates rectangle for series directing credits
					else if (j == 5) {
						width = getDirectingSeriesCred(credits, mediaMaker) * 10;
						graphicsObj.setColor(Color.orange);
					}
					
					// Draws rectangle starting at (startingCoordX, startingCoordY) with calculated width and height = 50
					Rectangle rectangle = new Rectangle(startingCoordX, startingCoordY, width, 50);
					graphicsObj.fill(rectangle);
					startingCoordX = width + startingCoordX; // Sets the X coordinate for next rectangle in bar
				}

				//at.rotate(Math.PI / 2);
				//graphicsObj.setTransform(at); // Rotates the year string vertically to place by the bar
				//graphicsObj.drawString(Integer.toString(i), startingCoordY, 0); // Draws year string by bar
			}

			startingCoordX = 10; // Resets the starting X coordinate back to 10
			startingCoordY = startingCoordY + 60; // Resets the starting Y coordinate by moving it 60 downwards
		}
		}
	}
} // END HISTOGRAM CLASS