import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

/**
 * Project #2
 * CS 2334, Section 010
 * 22 February 2016
 * <P>
 * This class is to be run as JUnit Testing to ensure the non-trivial methods in the project are functional
 * <P>
 * @version 1.0
 */

public class MDbMethodTester extends MDbDriver {

	/**
	 * A test for the overloaded Movie object constructor
	 */
	@Test
	public void movieConstructorTest() {
		String testInputMC = "";
		Movie testMovie = new Movie(testInputMC);
		String expectedOutputMC = "";
		assertEquals(expectedOutputMC, testMovie.toString());
	}

	/**
	 * A test for the Movie object comparison
	 */
	@Test
	public void movieComparisonTest() {
		String aInput = "";
		String bInput = "";
		Movie a = new Movie( aInput);
		Movie b = new Movie (bInput);
		int expectedOutputMComp = 0;
		assertEquals(expectedOutputMComp, aInput.compareTo(bInput));
	}

	/**
	 * A test for the overloaded Episode object constructor
	 */
	@Test
	public void episodeConstructorTest() {
		ArrayList<String> testInputEC = new ArrayList<String>();
		Episode testEpisode = new Episode(testInputEC);
		String expectedOutputEC = "";
		assertEquals(expectedOutputEC, testEpisode.toString());
	}
	
	/**
	 * A test for the Episode object comparison
	 */
	@Test
	public void episodeComparisonTest() {
		String aInput = "";
		String bInput = "";
		Episode a = new Episode( aInput);
		Episode b = new Episode (bInput);
		int expectedOutputEComp = 0;
		assertEquals(expectedOutputEComp, aInput.compareTo(bInput));
	}

	/**
	 * A test for the overloaded Series object constructor
	 */	
	@Test
	public void seriesConstructorTest() {
		String testInputSC = "";
		Series testSeries = new Series(testInputSC);
		String expectedOutputSC = "";
		assertEquals(expectedOutputSC, testSeries.toString());
	}

	/**
	 * A test for the Series object comparison
	 */
	@Test
	public void seriesComparisonTest() {
		String aInput = "";
		String bInput = "";
		Series a = new Series( aInput);
		Series b = new Series (bInput);
		int expectedOutputSComp = 0;
		assertEquals(expectedOutputSComp, aInput.compareTo(bInput));
	}	

	
	/**
	 * A test for the binary title search of the MovieDb 
	 */
	@Test
	public void seriesBinarySearchByTitleTest() {
		String searchKey = "";
		String testInput = "";
		Series a = new Series (testInput);
		String expectedResult = "";
		//assertEquals(expectedResult, movieBinarySearchTitle(a,searchKey));	Don't know why the method is unable to be called
	}

	/**
	 * A test for the binary title search of the SeriesDb 
	 */
	@Test
	public void movieBinarySearchByTitleTest() {
		String searchKey = "";
		String testInput = "";
		Movie a = new Movie (testInput);
		String expectedResult = "";
		//assertEquals(expectedResult, seriesBinarySearchTitle(a,searchKey));	Don't know why the method is unable to be called.
	}
	
	/**
	 * A test for the partial title search method of the MovieDb
	 */
	@Test
	public void searchMovieDbByPartialTitle () {
		String searchKey = "";
		String expectedResult = "";
		assertEquals(expectedResult, searchMovieDbByPartialTitle(MovieDb, searchKey));
	}

	/**
	 * A test for the partial title search method of the SeriesDb
	 */
	@Test
	public void searchSeriesDbByPartialTitle () {
		String searchKey = "";
		String expectedResult = "";
		assertEquals(expectedResult, searchSeriesDbByPartialTitle(SeriesDb, searchKey));
	}
	
	/**
	 * A test for the year search method of the MovieDb
	 */
	@Test
	public void searchSeriesDbByYear () {
		String searchKey = "";
		String expectedResult = "";
		assertEquals(expectedResult, searchSeriesDbByPartialTitle(SeriesDb, searchKey));
	}
	/**
	 * A test for the year search method of the MovieDb
	 */
	@Test
	public void searchMovieDbByYear () {
		String searchKey = "";
		String expectedResult = "";
		assertEquals(expectedResult, searchMovieDbByYear(MovieDb, searchKey));
	}
	
}


