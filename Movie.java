import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project #2
 * CS 2334, Section 010
 * 22 February 2016
 * <P>
 * This class creates Movie objects that will hold data for individual movies
 * to be used in the MDb. Each Movie has a title, release year duplicate info,
 * the type of medium on which it was initially released, and release year.
 * <P>
 * @version 1.0
 */


public class Movie implements Comparable <Movie> {
	
	/** The title of the movie entry. */
	private String title;
	
	/** The year of release and an indicator of whether there was more than one movie 
	 * released that year with the same name.
	 */
	private String nameYearDuplicate;
	
	/** The type of medium for which the movie was released (i.e. TV or video). */
	private String releaseType;
	
	/** The year the movie was released. */
	private String releaseYear;
	
	
	/**
	 * A default constructor to create a Movie object with null field values.
	 */
	public Movie() {
		//TODO Edit Constructor
	}
	
	/**
	 * A constructor to create a Movie object, filling its fields from a parsed String line
	 * read from a file. 
	 * <P>
	 * Algorithm: <br>
	 * 1. Read in line from movie information file. Parse into string array <br>
	 * 2. Step through the string array of the inputLine right to left <br>
	 * 3. Assign  data from the file line to the corresponding Movie object field <br>
	 * <P>
	 * 
	 * @param	inputLine	The String generated from a file line containing movie information
	 */
	public Movie ( String inputLine) {
		//TODO Write Constructor
		
		
	} //end Movie constructor
	
	/**
	 * Method to return the contents of a Movie object as a single string.
	 * <P>
	 * @return		String representing the contents of a Movie object
	 */
	public String toString() {
		return null;
		//TODO Write method
	} //end of toString
	
	/**
	 * Method to compare an instance of this Movie with another instance of Movie. 
	 * <P>
	 * Algorithm: <br>
	 * 1. Compare Movie titles, return if not the same
	 * 2. Compare Movie nameYearDuplicate, return if not the same
	 * 3. Compare Movie releaseType, return if not the same
	 * 4. Compare Movie releaseYear, return if not the same
	 * <P>
	 * 
	 * @param	other	The Movie object to which the method is comparing this 
	 * 					instance of Movie.
	 * @return			(0, -1, or 1) depending on the outcome of the comparison
	 */
	public int compareTo(Movie other) {
		return 0;
		//TODO Write Method
	} //End of compareTo
	
	/**
	 * Accessor method that returns the Movie title as a String
	 * 
	 * @return		title field of this Movie object
	 */
	public String getTitle() {
		return title;
		//TODO Edit Method
	} //End of getTitle()
	
	/**
	 * Accessor method that returns the Movie nameYearDuplicate as a String
	 * 
	 * @return		nameYearDuplicate field of this Movie object
	 */
	public String getNameYearDuplicate() {
		return nameYearDuplicate;
		//TODO Edit Method
	} //End of getNameYearDuplicate
	
	/**
	 * Accessor method that returns the Movie release year as a String
	 * 
	 * @return		releaseYear field of this Movie object
	 */
	public String getReleaseYear() {
		return releaseYear;
		//TODO Edit Method
	} //End of getReleaseYear()
	
	/**
	 * Accessor method that returns the Movie release type as a String
	 * 
	 * @return		releaseType field of this Movie object
	 */
	public String getReleaseType() {
		return releaseType;
		//TODO Edit Method
	} //End of getReleaseType()
	
}

	
	

