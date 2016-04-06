import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Serializable;

import javax.swing.JComponent;

/**
 * Project #4
 * CS 2334, Section 010
 * 1 April 2016
 * <P>
 * A class that stores data for a media maker's credits and constructs
 * a representative pie chart to display to the user.
 * </P>
 * 
 * @version 1.0
 */
class PieChart extends JComponent implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4196748155338179120L;

	/** The media maker whose credits are displayed over time on the histogram. */
	private MediaMaker mediaMaker;

	/** The number of acting movie credits a media maker has.*/
	private int actingMovieCred;

	/** The number of acting series credits a media maker has.*/
	private int actingSeriesCred;

	/** The number of producing movie credits a media maker has.*/
	private int producingMovieCred;

	/** The number of producing series credits a media maker has.*/
	private int producingSeriesCred;

	/** The number of directing movie credits a media maker has.*/
	private int directingMovieCred;

	/** The number of directing series credits a media maker has.*/
	private int directingSeriesCred;
	
	/**
	 * Constructor for a 6 slice pie chart that displays a media maker's credits.
	 * A call to the constructor immediately accesses the paint method to draw
	 * and display the chart.
	 * 
	 * @param mediaMaker
	 */
	PieChart(MediaMaker mediaMaker) {
		this.mediaMaker = mediaMaker;
	}

	/**
	 * Returns number of media maker's acting movie credits.
	 * 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return	An int value of acting movie credits a media maker has.
	 */
	public int getActingMovieCred(MediaMaker mediaMaker) {
		actingMovieCred = 0; // Sets initial amount of credits before looping

		for (int i = 0; i < mediaMaker.getActingCredits().size(); ++i) {
			if (mediaMaker.getActingCredits().get(i).getClass().getName().equals("Movie")) {
				++actingMovieCred;
			}
		}
		return actingMovieCred;
	} // end getActingMovieCred

	/**
	 * Returns number of media maker's acting series credits.
	 * 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return	An int value of acting series credits a media maker has.
	 */
	public int getActingSeriesCred(MediaMaker mediaMaker) {
		actingSeriesCred = 0; // Sets initial amount of credits before looping

		for (int i = 0; i < mediaMaker.getActingCredits().size(); ++i) {
			if (mediaMaker.getActingCredits().get(i).getClass().getName().equals("Series")
					|| mediaMaker.getActingCredits().get(i).getClass().getName().equals("Episode")) {
				++actingSeriesCred;
			}
		}
		return actingSeriesCred;
	} // end getActingSeriesCred

	/**
	 * Returns number of media maker's producing movie credits.
	 * 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return An int value of producing movie credits a media maker has.
	 */
	public int getProducingMovieCred(MediaMaker mediaMaker) {
		producingMovieCred = 0; // Sets initial amount of credits before looping

		for (int i = 0; i < mediaMaker.getProducingCredits().size(); ++i) {
			if (mediaMaker.getProducingCredits().get(i).getClass().getName().equals("Movie")) {
				++producingMovieCred;
			}
		}
		return producingMovieCred;
	} // end getProducingMovieCred

	/**
	 * Returns number of media maker's producing series credits.
	 * 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return An int value of producing series credits a media maker has.
	 */
	public int getProducingSeriesCred(MediaMaker mediaMaker) {
		producingSeriesCred = 0; // Sets initial amount of credits before looping

		for (int i = 0; i < mediaMaker.getProducingCredits().size(); ++i) {
			if (mediaMaker.getProducingCredits().get(i).getClass().getName().equals("Series")
					|| mediaMaker.getProducingCredits().get(i).getClass().getName().equals("Episode")) {
				++producingSeriesCred;
			}
		}
		return producingSeriesCred;
	} // end getProducingSeriesCred

	/**
	 * Returns number of media maker's directing movie credits.
	 * 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return An int value of directing movie credits a media maker has.
	 */
	public int getDirectingMovieCred(MediaMaker mediaMaker) {
		directingMovieCred = 0; // Sets initial amount of credits before looping

		for (int i = 0; i < mediaMaker.getDirectingCredits().size(); ++i) {
			if (mediaMaker.getProducingCredits().get(i).getClass().getName().equals("Movie")) {
				++directingMovieCred;
			}
		}
		return directingMovieCred;
	} // end getDirectingMovieCred

	/**
	 * Returns number of media maker's directing series credits.
	 * 
	 * @param mediaMaker	The media maker whose credits are being graphically displayed.
	 * @return An int value of directing series credits a media maker has.
	 */
	public int getDirectingSeriesCred(MediaMaker mediaMaker) {
		directingSeriesCred = 0; // Sets initial amount of credits before looping

		for (int i = 0; i < mediaMaker.getDirectingCredits().size(); ++i) {
			if (mediaMaker.getDirectingCredits().get(i).getClass().getName().equals("Series")
					|| mediaMaker.getDirectingCredits().get(i).getClass().getName().equals("Episode")) {
				++directingSeriesCred;
			}
		}
		return directingSeriesCred;
	} // end getDirectingSeriesCred

	/**
	 * Creates an array of 6 slices that represent the 6 different types of credits to
	 * be represented in the pie chart. Then calls the drawPie method to paint the chart.
	 * 
	 * @param g	Graphics objects used to draw chart.
	 * @param mediaMaker	The media maker whose credits are being displayed.
	 */
	public void paint(Graphics g) {
		// Constructs 6 slices for the pie chart corresponding to media maker's credits
		Slice[] slices = { new Slice(getActingMovieCred(mediaMaker), Color.red, "Movie Acting"),
				new Slice(getActingSeriesCred(mediaMaker), Color.blue, "Series Acting"),
				new Slice(getProducingMovieCred(mediaMaker), Color.yellow, "Movie Producing"),
				new Slice(getProducingSeriesCred(mediaMaker), Color.black, "Series Producing"),
				new Slice(getDirectingMovieCred(mediaMaker), Color.green, "Movie Directing"),
				new Slice(getDirectingSeriesCred(mediaMaker), Color.orange, "Series Directing") };

		drawPie((Graphics2D) g, slices, mediaMaker); // Calls draw method to display chart
	}

	/**
	 * Draws the pie chart by constructing slices using the proportions of each
	 * different type of credit over the total credit.
	 * <P>
	 * Algorithm:<br>
	 * 1. Create pie chart representing percentages of media maker's credits.<br>
	 * 2. Sum up the total credits to use as a divider for each ratio relative to 360 degrees.
	 * 3. Loop through each slice to fill, draw, and label the slices.
	 * </P>
	 * @param g	Graphics objects used to draw chart.
	 * @param slices	An ArrayList of 6 slices where each slice is a count a type of credit.
	 * @param mediaMaker	The media maker whose credits are being displayed.
	 */
	public void drawPie(Graphics2D g, Slice[] slices, MediaMaker mediaMaker) {
		int textXPosition = 480; // X position for string that corresponds with pie slice
		int textYPosition = 80; // Y position for string that corresponds with pie slice
		int startPoint = 0; // Starting point along the arc of the pie chart for the slice
		int endPoint = 0;  // Ending point along the arc of the pie chart for the slice
		double totalCred = 0.0; // Total number of a media maker's credits

		// First sums up all the credits for a total credit count
		for (int i = 0; i < slices.length; i++) {
			totalCred += slices[i].getNumOfCred();
		}
		
		double curValue = 0.0; // Curvature representing number of credits

		// Creates pie slices for the pie chart by drawing from start point to end point by its proportion
		for (int i = 0; i < slices.length; ++i) {
			Slice slice = slices[i];
			// Checks if there are no credits for a slice -- if so, omits slice
			if (slice.getNumOfCred() != 0) {
				startPoint = (int) (curValue * 360 / totalCred); // Starts point at curve of number of credits
				endPoint = ((int) (slice.getNumOfCred() * 360 / (double) totalCred)); // Ends point at proportion of circle
				g.setColor(slice.getColor());
				g.fillArc(150, 35, 300, 300, startPoint, endPoint);
				g.drawString(slice.getTypeOfCred(), textXPosition, textYPosition);
				textYPosition = textYPosition + 20; // Moves y position down for next pie slice's string
			}

			curValue += slice.getNumOfCred(); // Resets starting point to end point for next slice
		}
	}
} // ENDS PIECHART CLASS