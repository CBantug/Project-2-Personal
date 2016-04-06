import java.awt.Color;
import java.io.Serializable;

/**
 * Project #4
 * CS 2334, Section 010
 * 1 April 2016
 * <P>
 * A class that stores data for a media maker's credits to be represented
 * as a slice within a pie chart.
 * </P>
 * 
 * @version 1.0
 */
class Slice implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6068596726071208291L;

	/** A double storing the number of credits to be represented in the slice.*/
	private double numOfCred;
	
	/** The color of the pie slice.*/
	private Color color;
	
	/** String storing the type of credit for the corresponding slice to be
	 *  displayed as text on the chart.
	 */
	private String typeOfCred;

	/** A constructor for a pie slice setting the slice's number of credits and color.*/
	public Slice(double numOfCred, Color color, String typeOfCred) {
		this.numOfCred = numOfCred;
		this.color = color;
		this.typeOfCred = typeOfCred;
	}
	
	/**
	 * An accessor for the variable numOfCred.
	 * 
	 * @return	A double storing the number of a particular credit.
	 */
	public double getNumOfCred() {
		return numOfCred;
	}
	
	/**
	 * 
	 * @return
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getTypeOfCred() {
		return typeOfCred;
	}
} // ENDS SLICE CLASS