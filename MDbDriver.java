import java.awt.Dimension;
import java.io.*;
import javax.swing.*;
import java.util.*;

/**
 * Project #2
 * CS 2334, Section 010
 * 22 February 2016
 * <P>
 * This class is the driver for the Media Database and will contain the main method and those used during
 * its implementation for running and maintaining the program.
 * <P>
 * 
 * @version 1.0
 */

public class MDbDriver {

	/** An ArrayList containing all of the Movie objects created from the imported file.*/
	public ArrayList<Movie> MovieDb;
	
	/** An ArrayList containing all of the Series objects created from the imported file.*/
	public ArrayList<Series> SeriesDb;
	
	/** The String object of the name of the file to be imported in the main method. */
	public String fileName;
	
	/** The BufferedWriter that will write the search results file. */
	public BufferedWriter bw;
	
	/** The FileWriter that will, along with the BufferedWriter, write the search results file. */
	public FileWriter fw;
	
	/** The BufferedReader that will read each line of the user input as delineated by the Enter key. */
	public BufferedReader br;
	
	/** The InputStreamReader that will, along with the BufferedReader, import the user input into the program. */
	public InputStreamReader input;
	
	/**
	 * The main method that import the files with all of the movie and series information from IMDb and will implement 
	 * the MDb program by using methods, creating display windows, etc. depending upon user input. 
	 * <P>
	 * Algorithm: <br>
	 * 1. Runs the program <br>
	 * 2. Imports files containing movie and series information and scans each by line <br>
	 * 3. Implements Movie object constructor and populates an <code>ArrayList<Movie> <code> with the newly created Movie objects. <br>
	 * 4. Implements Series object constructor and populates an <code>ArrayList<Series> <code> with the newly created Series objects.
	 * 	  The Series constructor will utilize the Episode constructor. <br>
	 * 5. Creates the GUI that the user will use to input searches, receive search results, and quit the program <br>
	 * <P>
	 * 
	 * @param args	Program argument that contains the name of the file that will be imported 
	 */
	public static void main(String[] args) throws IOException {
		//TODO Write main method
		
		/** System.out.println(args.length + " program arguments:"); 
			for (int i=0; i< args.length; i++)
			{System.out.println("args[" + i + "] = " + args[i]);}
		*/
		
		//Hold name of the movie info file, creates reader to go through line by line
		String TVfileName = args[0];
		BufferedReader br = new BufferedReader(new FileReader(TVfileName));
		String nextLine = br.readLine();
		
		//Creates new AL<Series> to check parser
		ArrayList<Series> parserChecker = new ArrayList<Series>();
		
		//Loop to Fill parserChecker
		do {
			Series currentSeries = new Series(nextLine, br);
			parserChecker.add(currentSeries);
			nextLine = br.readLine();
		}
		while(nextLine != null);
		
		br.close();
		
		System.out.println("All Done!");
		
		
		
		
		
		
	} //Ends Main
		
	/**
	 * A method to create the display window that will house the user interface to use and search
	 * the media database
	 * <P>
	 * Algorithm:<br>
	 * 1. Creates display window to accept user search input <br>
	 * 2. Creates display window to show the search results from user input <br>
	 * <P>
	 * 
	 * @return 		 The display window that will house the program and be the user interface.
	 */
	private static void createProgramWindow(ArrayList<Movie> MovieDb, ArrayList<Series> SeriesDb) {
		//TODO Write GUI method
	} //Ends GUI method
	
	/**
	 * A method to search through the MovieDb ArrayList and return those elements that match the user's title search.
	 * <P>
	 * Algorithm: <br>
	 * 1. Compare user search input to the title fields of the Movie objects in the ArrayList.<br>
	 * 2. Populate a new ArrayList<Movie> with elements from MDb that match the search. <br>
	 * 3. Return the new ArrayList<Movie> that contains the search results from the database. <br>
	 * <P>
	 * 
	 * @param	 MDb		The ArrayList of Movie objects containing all of the individual movie information
	 * @param 	searchKey	The user input String object used to compare to the movie titles in the search 
	 * @return				Returns the Movie elements that match the user's search
	 */
	public ArrayList<Movie> searchMovieDbByPartialTitle(ArrayList<Movie> MovieDb, String searchKey) {
		//TODO Write Method
		ArrayList<Movie> lkj = new ArrayList<Movie>();
		return lkj;
	} //End searchMovieDbByPartialTitle
	
	/**
	 * A method to search through the SeriesDb ArrayList and return those elements that match the user's title search.
	 * <P>
	 * Algorithm: <br>
	 * 1. Compare user search input to the title fields of the Series objects in the ArrayList.<br>
	 * 2. Populate a new ArrayList<Series> with elements from MDb that match the search. <br>
	 * 3. Return the new ArrayList<Series> that contains the search results from the database. <br>
	 * <P>
	 * 
	 * @param	 MDb		The ArrayList of Series objects containing all of the individual series information
	 * @param 	searchKey	The user input String object used to compare to the series titles in the search 
	 * @return				Returns the Series elements that match the user's search
	 */
	public ArrayList<Series> searchSeriesDbByPartialTitle(ArrayList<Series> SeriesDb, String searchKey) {
		//TODO Write Method
		ArrayList<Series> lkj = new ArrayList<Series>();
		return lkj;
	} //End searchSeriesDbByPartialTitle
	
	
	/**
	 * A method to search through the SeriesDb ArrayList and return those elements that match the user's year search.
	 * <P>
	 * Algorithm: <br>
	 * 1. Compare user search input to the year field of the Series objects in the ArrayList.<br>
	 * 2. Populate a new ArrayList<Series> with elements from SeriesDb that match the search. <br>
	 * 3. Return the new ArrayList<Series> that contains the search results from the database. <br>
	 * <P>
	 * 
	 * @param	 MDb		The ArrayList of Series objects containing all of the individual Series information
	 * @param 	searchKey	The user input String object used to compare to the movie year in the search 
	 * @return				Returns the Series elements that match the user's search
	 */
	public ArrayList<Series> searchSeriesDbByYear(ArrayList<Series> SeriesDb, String searchKey) {
		//TODO Write Method
		ArrayList<Series> lkj = new ArrayList<Series>();
		return lkj;
	} //End searchSeriesDbByYear
	
	/**
	 * A method to search through the MovieDb ArrayList and return those elements that match the user's year search.
	 * <P>
	 * Algorithm: <br>
	 * 1. Compare user search input to the year field of the Movie objects in the ArrayList.<br>
	 * 2. Populate a new ArrayList<Movie> with elements from MovieDb that match the search. <br>
	 * 3. Return the new ArrayList<Movie> that contains the search results from the database. <br>
	 * <P>
	 * 
	 * @param	 MovieDb		The ArrayList of Movie objects containing all of the individual movie information
	 * @param 	searchKey	The user input String object used to compare to the movie year in the search 
	 * @return				Returns the Movie elements that match the user's search
	 */
	public ArrayList<Movie> searchMovieDbByYear(ArrayList<Movie> MovieDb, String searchKey) {
		//TODO Write Method
		//AL<Movie> that will contain the components of MDb that match the key
		ArrayList<Movie> searchResults = new ArrayList<Movie>();
		return searchResults;
	} //End searchMovieDbByYear
	
	/**
	 * A method to search through the MovieDb ArrayList and return those elements that exactly match the user's title search.
	 * <P>
	 * Algorithm: <br>
	 * 1. Compare user search input to the title fields of the Movie objects in the ArrayList.<br>
	 * 2. Use binary searching to find the component, if any, that matches the user's search
	 * 3. Return the index that contains the search result from the database, otherwise returns -1. <br>
	 * <P>
	 * 
	 * @param	 MovieDb	The ArrayList of Movie objects containing all of the individual movie information
	 * @param 	searchKey	The user input String object used to compare to the movie titles in the search 
	 * @return				Returns the Movie element index that match the user's search, or -1 for no match
	 */
	public int movieBinarySearchTitle(ArrayList<Movie> MovieDb, String searchKey) {
		//TODO Write Method
		return 0;
	} //End movieBinarySearchTitle
	
	/**
	 * A method to search through the SeriesDb ArrayList and return those elements that exactly match the user's title search.
	 * <P>
	 * Algorithm: <br>
	 * 1. Compare user search input to the title fields of the Series objects in the ArrayList.<br>
	 * 2. Use binary searching to find the component, if any, that matches the user's search
	 * 3. Return the index that contains the search result from the database, otherwise returns -1. <br>
	 * <P>
	 * 
	 * @param	 SeriesDb	The ArrayList of Series objects containing all of the individual movie information
	 * @param 	searchKey	The user input String object used to compare to the series titles in the search 
	 * @return				Returns the Series element index that match the user's search, or -1 for no match
	 */
	public int seriesBinarySearchTitle(ArrayList<Movie> MovieDb, String searchKey) {
		//TODO Write Method
		return 0;
	} //End movieBinarySearchTitle
	
	} //End Driver
	
	
	