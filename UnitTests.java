//import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;

//import org.junit.Test;

public class UnitTests {
	
	/**public static void main(String[] args) throws FileNotFoundException, IOException{
		String inputLine = "CS 2334 (The Java Files): Spring 2016 (2016)		2016-????";
		FileReader fr = new FileReader("testTVFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String runningYears = "";
		String releaseYear = "";
		String title = "";
		
		//Create string array to hold the split-by-whitespace inputLine
		String[] parsedLine = inputLine.split("\t\t\t|\t\t|\t| ");
		for (int i = 0; i < parsedLine.length; ++i) {
			System.out.println(parsedLine[i]);
		}
		
		//Trim the whitespace from each of the index components, deals with the tab characters
				for (int i = parsedLine.length -1; i >= 0; i--) {
					parsedLine[i].trim();
					System.out.println(parsedLine[i]);
				}
				
				//Converts String[] to AL<String> to remove the empty strings from trimming
				ArrayList<String> cleanParsedLine = new ArrayList<String>();
				for(int j = 0; j <= parsedLine.length-1; j++){
					if(parsedLine[j].isEmpty() != true) {
						cleanParsedLine.add(parsedLine[j]);
					}
					
				}
				System.out.println(cleanParsedLine);
				
				//Check to see if the input line is a Series line, Sets fields if so
				String lastComp = cleanParsedLine.get(cleanParsedLine.size() - 1);
				System.out.println(lastComp);
				if (lastComp.length() > 4) 
				{
					runningYears = lastComp;

					runningYears = runningYears.replaceAll("\\?\\?\\?\\?", "UNSPECIFIED");
					System.out.println(runningYears);
					releaseYear = cleanParsedLine.get(cleanParsedLine.size() - 2);
					System.out.println(releaseYear);
					
					//Concatenates the rest of the cleanParsedLine to the Series title
					int end = (cleanParsedLine.size() - 3);
					String titleBuilder = "";
					int start;
					for (start = 0; start <= end; start ++) {
						titleBuilder = titleBuilder.concat(cleanParsedLine.get(start)).concat(" ");
					}
					
					title = titleBuilder;
					System.out.println(titleBuilder.toString());

					//Loop to Construct the Episode list for the Series object

					//AL<Episode> to hold all of the Series's episodes
					ArrayList<Episode> episodeList = new ArrayList<Episode>();

					//Sets the reset mark for rereading outside of constructor
					br.mark(0);
					
				}
				
	
				
	}

	@Test
	public void testMovieParser() {
		// Tests Movie parser with no venue
		String line = "Beyond the Five Year Mission: The Evolution of Star Trek "
				+ "- The Next Generation  (2014)  2014";
		
		Movie movie = new Movie(line); // Constructs Movie object with line

		String expected1 = "Beyond the Five Year Mission: The Evolution of Star Trek "
				+ "- The Next Generation"; // Expected title
		String expected2 = "2014"; // Expected release year
		String expected3 = "(2014)"; // Expected year (with potential Roman Numeral)
		String expected4 = "N/A"; // Expected venue (none)
		
		String actual1 = movie.getTitle();
		String actual2 = movie.getReleaseYear();
		String actual3 = movie.getYearWithNumeral();
		String actual4 = movie.getVenue();
		
		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		assertEquals(expected3, actual3);
		assertEquals(expected4, actual4);
		
		// Tests Movie parser with unknown release year
		String line2 = "Star Trek Equinox: The Night of Time (????) (TV)    ????";
		
		Movie movie2 = new Movie(line2); // Constructs Movie object with line
		String expected5 = "Star Trek Equinox: The Night of Time"; // Expected title
		String expected6 = "UNSPECIFIED"; // Expected release year
		String expected7 = "(UNSPECIFIED)"; // Expected year (with potential Roman Numeral)
		String expected8 = "TV"; // Expected venue (none)
		
		String actual5 = movie2.getTitle();
		String actual6 = movie2.getReleaseYear();
		String actual7 = movie2.getYearWithNumeral();
		String actual8 = movie2.getVenue();
		
		assertEquals(expected5, actual5);
		assertEquals(expected6, actual6);
		assertEquals(expected7, actual7);
		assertEquals(expected8, actual8);
	}

	@Test
	 public void testSeriesParser() throws IOException, FileNotFoundException{
		//Test constructors given concrete series and episode information
		String line = "Star Trek: The Next Generation (1987)			1987-1994";
		
		Series series = new Series(line); // Constructs Series object with line

		String expected1 = "Star Trek: The Next Generation"; //Expected series object series title
		String expected2 = "(1987)"; //Expected series start year
		String expected3 = "1987-1994"; //Expected series run years
		int expected4 = 0; // Expected size of the series episode list
		
		String actual1 = series.getTitle(); //Actual series object series title
		String actual2 = series.getReleaseYear(); // Actual series start year
		String actual3 = series.getRunningYears(); // Actual series run years
		int actual4 = series.getEpisodes().size(); //Actual length of the series episode list
		
		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		assertEquals(expected3, actual3);
		assertEquals(expected4, actual4);

	}
	
	@Test
	public void testSeriesParser2() throws IOException{
		//Test constructors given unspecified series information
		String line = "Star Trek: Constellation (2016)			2016-????";
		
		Series series = new Series(line); // Constructs Series object with line

		String expected1 = "Star Trek: Constellation"; //Expected series object series title
		String expected2 = "(2016)"; //Expected series start year
		String expected3 = "2016-UNSPECIFIED"; //Expected series run years
		int expected4 = 0; //Expected size of the series episode list
		
		String actual1 = series.getTitle(); //Actual series object series title
		String actual2 = series.getReleaseYear(); //Actual series start year
		String actual3 = series.getRunningYears(); //Actual series run years
		int actual4 = series.getEpisodes().size(); //Actual length of the series episode list
		
		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		assertEquals(expected3, actual3);
		assertEquals(expected4, actual4);
	}
	
	@Test
	public void EpisodeParser() throws IOException{
		
		//Test constructors given a series with multiple episodes
		String line = "Star Trek: Renegades (2015) {Pilot (#1.1)}		2015";
		
		Episode episode = new Episode(line); // Constructs Series object with line

		String expected5 = "Star Trek: Renegades"; //Expected episode object 1 series title
		String expected6 = "Pilot"; // Expected episode 1 title
		String expected7 = "(#1.1)"; // Expected episode 1 season and number 
		String expected8 = "2015"; //Expected episode 1 air year
	
		String actual5 = episode.getSeriesTitle(); //Actual episode 1 object episode title
		String actual6 = episode.getTitle(); //Actual episode 1 title
		String actual7 = episode.getSeasonAndEpisodeNum(); //Actual episode 1 season and number
		String actual8 = episode.getReleaseYear(); //Actual episode 1 air year
		
		assertEquals(expected5, actual5);
		assertEquals(expected6, actual6);
		assertEquals(expected7, actual7);
		assertEquals(expected8, actual8);
	}

	@Test
	public void testMovieToString() {
		// Tests printing a Movie as a String for the database
		Movie movie = new Movie("Ultimate Trek: Star Trek's Greatest Moments (1999) (TV) 1999");
		String actual = movie.toString();
		String expected = "MOVIE (TV): Ultimate Trek: Star Trek's Greatest Moments (1999)";
		assertEquals(expected, actual);
	}

	@Test
	public void testMdbSearchExactTitle()  throws FileNotFoundException, IOException {
		// Tests data for searching by exact title
		Movie movie1 = new Movie("Star Trek Beyond (2016)                 2016");
		Movie movie2 = new Movie("William Shatner's Memories (1995) (V)     1995");
		Movie movie3 = new Movie("Star Trek: Phoenix - Cloak & Dagger Part I (2010) (V)   2010");
		
		ArrayList<Media> test = new ArrayList<Media>();
		test.add(movie1);
		test.add(movie2);
		test.add(movie3);
		
		ArrayList<Media> actual = MdbDriver.searchExactTitle("Star Trek Beyond", test);
		ArrayList<Media> expected = new ArrayList<Media>();
		expected.add(movie1);
		
		assertEquals(expected, actual);
		
		// Test to make sure database only grabs exact title - no partials
		ArrayList<Media> expected2 = new ArrayList<Media>();
		
		ArrayList<Media> actual2 = MdbDriver.searchExactTitle("Star Trek", test);
		
		assertEquals(expected2, actual2);		
	}
	
		@Test
		public void testMdbPartialTitle() {
			// Test data of movies for searching by partial title
			Movie movie1 = new Movie("Star Trek Beyond (2016)                 2016");
			Movie movie2 = new Movie("Ultimate Trek (3012)                3012");
			Movie movie3 = new Movie("Star Trek: Of Gods and Men (2007) (V)           2007");
			ArrayList<Media> test = new ArrayList<Media>();
			
			test.add(movie1);
			test.add(movie2);
			test.add(movie3);
			
			ArrayList<Media> actual = MdbDriver.searchPartialTitle("Star Trek", test);
			ArrayList<Media> expected = new ArrayList<Media>();
			expected.add(movie1);
			expected.add(movie3);
			assertEquals(expected, actual);
		}
	
		@Test
		public void testMdbSearchByYear() {
			// Test data of movies for searching by year
			Movie movie1 = new Movie("Star Trek (2009)                    2009");
			Movie movie2 = new Movie("Star Trek: Captain Pike (2016)              2016");
			Movie movie3 = new Movie("Star Trek: Gene Rodenberry's Vision (2009) (V)      2009");
			Movie movie4 = new Movie("Star Trek Alpha Strike (2010)               2010");
			Movie movie5 = new Movie("Star Trek Beyond (2016)                 2016");
			Movie movie6 = new Movie("Star Trek III: The Search for Spock (1984)      1984");
			
			// Test Media ArrayList
			ArrayList<Media> test1 = new ArrayList<Media>();
			test1.add(movie1);
			test1.add(movie2);
			test1.add(movie3);
			
			ArrayList<Media> actual1 = MdbDriver.searchByYear(test1, "2009");
			ArrayList<Media> expected1 = new ArrayList<Media>();
			expected1.add(movie1);
			expected1.add(movie3);

			assertEquals(expected1, actual1);
			
			// If user searches a list of years
			ArrayList<Media> test2 = new ArrayList<Media>();
			test2.add(movie1);
			test2.add(movie2);
			test2.add(movie3);
			test2.add(movie4);
			test2.add(movie5);
			test2.add(movie6);
			
			ArrayList<Media> actual2 = MdbDriver.searchByYear(test2, "2009, 2010, 2000");
			ArrayList<Media> expected2 = new ArrayList<Media>();
			expected2.add(movie1);
			expected2.add(movie3);
			expected2.add(movie4);

			assertEquals(expected2, actual2);
			
			//If user searches multiple years
			ArrayList<Media> test3 = new ArrayList<Media>();
			test3.add(movie1);
			test3.add(movie2);
			test3.add(movie3);
			test3.add(movie4);
			test3.add(movie5);
			test3.add(movie6);
	
			ArrayList<Media> actual3 = MdbDriver.searchByYear(test3, "2000-2016");
			ArrayList<Media> expected3 = new ArrayList<Media>();
			expected3.add(movie1);
			expected3.add(movie3);
			expected3.add(movie4);
			expected3.add(movie2);
			expected3.add(movie5);

			assertEquals(expected3, actual3);
		}
		*/

		/**
		 * A test for the overloaded MediaMaker object constructor
		 */
		/**@Test
		public void testMediaMakerConstructor () {
			String testInputMMC = "";
			MediaMaker testMaker = new MediaMaker(testInputMMC);
			String expectedOutputMMC = "";
			assertEquals(expectedOutputMMC, testMaker.toString());
		}
		
		/**
		 * A test for the MediaMaker object comparison
		 */
		/**@Test
		public void makerComparisonTest() {
			String aInput = "";
			String bInput = "";
			MediaMaker a = new MediaMaker( aInput);
			MediaMaker b = new MediaMaker (bInput);
			int expectedOutputMMComp = 0;
			assertEquals(expectedOutputMMComp, aInput.compareTo(bInput));
		}

		/**
		 * A test for the searchPartialName method.
		 */
		/**@Test
		public void testPdbPartialTitle() {
			// Test data of movies for searching by partial name
			MediaMaker MediaMaker1 = new MediaMaker("");
			MediaMaker MediaMaker2 = new MediaMaker("");
			MediaMaker MediaMaker3 = new MediaMaker("");
			ArrayList<MediaMaker> test = new ArrayList<MediaMaker>();
			
			test.add(MediaMaker1);
			test.add(MediaMaker2);
			test.add(MediaMaker3);
			
			ArrayList<MediaMaker> actual = PdbDriver.searchPartialName("", test);
			ArrayList<MediaMaker> expected = new ArrayList<MediaMaker>();
			expected.add(MediaMaker1);
			expected.add(MediaMaker3);
			assertEquals(expected, actual);
		}
		
		/**
		 * A test for the searchExactName method.
		 */
		/**@Test
		public void testPdbSearchExactName()  throws FileNotFoundException, IOException {
			// Tests data for searching by exact name
			MediaMaker MediaMaker1 = new MediaMaker("");
			MediaMaker MediaMaker2 = new MediaMaker("");
			MediaMaker MediaMaker3 = new MediaMaker("");
			
			ArrayList<MediaMaker> test = new ArrayList<MediaMaker>();
			test.add(MediaMaker1);
			test.add(MediaMaker2);
			test.add(MediaMaker3);
			
			ArrayList<MediaMaker> actual = PdbDriver.searchExactName("", test);
			ArrayList<MediaMaker> expected = new ArrayList<MediaMaker>();
			expected.add(MediaMaker1);
			
			assertEquals(expected, actual);
			
			// Test to make sure database only grabs exact title - no partials
			ArrayList<MediaMaker> expected2 = new ArrayList<MediaMaker>();
			
			ArrayList<MediaMaker> actual2 = PdbDriver.searchExactName("", test);
			
			assertEquals(expected2, actual2);		
		}*/
} // ENDS UNITTESTS CLASS