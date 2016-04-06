import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.io.IOException;
import java.util.regex.*;

/**
 * Project #4
 * CS 2334, Section 010 
 * 1 April 2016
 * <P>
 * A class that acts as a abstract data type that stores data for movies and
 * series (with episodes included within series). A file from user keyboard will
 * be opened and read in by line. Each line represents a movie or series, where
 * the line is parsed into strings that make up fields used to construct Movie
 * and Series objects to be stored in the database. User search will be looked
 * through this array for matches and the results will be returned to the main
 * method. The movie database will store results to a data file when requested
 * by the user.
 * </P>
 * 
 * @version 1.0
 */
public class Mdb implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8482005604860859370L;
	
	/**
	 * A Media ArrayList that stores all movies and series (along with episodes)
	 * data into the database.
	 */
	private static ArrayList<Media> media;

	/**
	 * A default constructor for a media database that constructs an empty list
	 * of media within the media database.
	 */
	public Mdb() {
		media = new ArrayList<Media>();
	} // end Mdb

	/**
	 * An constructor for a media database that stores an list of media to the
	 * variable media.
	 * 
	 * @param media	List of Movies and/or series desired to be stored.
	 */
	public Mdb(ArrayList<Media> media) {
		this.media = media;
	} // end Mdb

	/**
	 * Opens a file containing a movie list and reads it in line by line.
	 * These lines are parsed into Movie or Series objects based on the
	 * int passed that dictates if file being read is the movie or 
	 * series file.
	 * <P>
	 * Algorithm:<br>
	 * 1. Opening and reading in a data file line by line.<br>
	 * 2. Determines if file being read is movie or series file.<br>
	 * 3. Constructs Movie, Series, or Episode object with each line.<br>
	 * </P>
	 * 
	 * @param	fileName	A string containing the name of the movie list
	 *                      that will be opened.
	 * @param	precedence	An int indicating if the file being passed
	 *                      in is the movie or series file.
	 * @exception FileNotFoundException	Thrown when the file name cannot be found.
	 *            IOException	Thrown when the file name cannot be found.
	 */
	public void readFile(String fileName, int precedence) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(fileName); // Opens file
		BufferedReader br = new BufferedReader(fr); // Reads in file
		String nextLine; // String that stores a line from the file

		// File is read line by line until the end of the file
		while ((nextLine = br.readLine()) != null) {
			if (precedence == 1) {
				// Constructs and parses method line to an Movie
				Movie movie = new Movie(nextLine);
				media.add(movie); // Adds movie to media database
			} else {
				//Regex to determine if the series file line is a Series line or an Episode line
				Pattern typeCh1 = Pattern.compile("\\-\\?\\?\\?\\?");
				Pattern typeCh2 = Pattern.compile("\\-[0-9]{4}");
				
				while(nextLine != null)
				{
					//boolean lastOfLine = nextLine.endsWith("-????");
					Matcher mTC1 = typeCh1.matcher(nextLine);
					Matcher mTC2 = typeCh2.matcher(nextLine);
					boolean TC1 = mTC1.find();
					boolean TC2 = mTC2.find();
					
					//If Series line, constructs Series object
					if(TC1 == true | TC2 == true)
					{
						Series temp = new Series(nextLine);
						media.add(temp);
					}
					
					//If Episode line, constructs Episode object
					if(TC1 == false && TC2 == false)
					{
						Episode temp = new Episode(nextLine);
						media.add(temp);
					}
					
					nextLine = br.readLine();
				}
			}	
		}
		br.close();
	} // end readFile

	/**
	 * Returns a Media object at a certain index from the database.
	 * 
	 * @param index	An int value that will determines the index value in the
	 *              database.
	 * @return A Media object from the movie database at the index from the
	 *         parameter.
	 */
	public Media getMedia(int index) {
		return media.get(index);
	} // end getMedia

	/**
	 * Called when user is asked what type of media to search for.
	 * Based on their desired type, inserts all media objects into
	 * a new list of that type and returns it.
	 *  <P>
	 * Algorithm:<br>
	 * 1. Take out media of any type user doesn't want included in the search.<br>
	 * 2. Checks if user's desired search type is movie, series, or both.<br>
	 * 3. Takes out media of any undesired type - returns entire database if none removed.<br>
	 * </P>
	 * @param	searchTypeOfMedia	A string indicating type wanted to search for.
	 * @return A list of all the media of the type user wants to search for.
	 */
	public ArrayList<Media> getMediaSearchList(String searchTypeOfMedia) {
		// Stores list of type user searches for
		ArrayList<Media> list = new ArrayList<Media>();

		// If user only wants to search for movies, finds all movies
		if (searchTypeOfMedia.equalsIgnoreCase("m")) {
			for (int i = 0; i < media.size(); ++i) {
				if (media.get(i).getClass().getName().equals("Movie")) {
					list.add(media.get(i)); // Inserts Movie into new list
				}
			}
		}
		// If user only wants to search for series, finds all series
		else if (searchTypeOfMedia.equalsIgnoreCase("s")) {
			for (int i = 0; i < media.size(); ++i) {
				if (media.get(i).getClass().getName().equals("Series") | media.get(i).getClass().getName().equals("Episode")) {
					list.add(media.get(i)); // Inserts Series and Episodes into new list
				}
			}
		}
		// If user wants to search for both series and movies
		else {
			list = media; ; // Inserts the whole database
		}
		return list; // Returns list of all media that matched user's desired type
	}
	
	/**
	 * Removes episodes from list of matches as requested by user.
	 * 
	 * @param	list	A current list of media that match user's search.
	 * @return	A modified list after taking out episodes in user's search.
	 */
	public ArrayList<Media> removeEpisodes(ArrayList<Media> list) {
		// Searches through list of type user searched for and takes out episodes
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getClass().getName().equals("Episode")) {
				list.remove(i);
			}
		}
		return list;
	}

	/**
	 * A method to add media from read=in actor, director, and producer files.
	 * @param people	the LHM of priorly constructed MediaMaker objects
	 * @param media		the AL that contains the media objects
	 */
	public static void addMedia(LinkedHashMap<String, MediaMaker> people) {	   	    
	  
		for (MediaMaker person : people.values()) {
	        for (Media m: person.getActingCredits()){
	        	for (int i = 0; i < media.size(); i++) {
	        		if (!m.getTitle().contains(media.get(i).getTitle()))
	        		{	media.add(m); break;}
	        		else{
	        			break;
	        		}
	        	}
	        }
	        for (Media m: person.getDirectingCredits()){
	        	for (int i = 0; i < media.size(); i++) {
	        		if (!m.getTitle().contains(media.get(i).getTitle()))
	        		{	media.add(m); break;}
	        		else{
	        			break;
	        		}
	        	}
	        }
	        for (Media m: person.getProducingCredits()){
	        	for (int i = 0; i < media.size(); i++) {
	        		if (!m.getTitle().contains(media.get(i).getTitle()))
	        		{	media.add(m); break;}
	        		else{
	        			break;
	        		}
	        	}
	        }
	    }
	}
	
	/**
	 * Saves results of user's search into a text file when requested by user.
	 * 
	 * @param	userFileName	A string storing user's saved results file.
	 * @param	results	An ArrayList of user's search results
	 * @exception	IOException	Thrown when the file name cannot be found.
	 */
	public void saveText(String userFileName, ArrayList<Media> results) throws IOException {
		// creates a FileWriter Object
		FileWriter outfile = new FileWriter(userFileName);
		
		// creates BufferedWriter to write content to the file
		BufferedWriter bw = new BufferedWriter(outfile);
		// Writes results by one Media object to a line
		for (int i = 0; i < results.size(); ++i) {
			String result = results.get(i).toString();
			bw.write(result);
			bw.newLine();
		}
		bw.close(); // Close file to save it
	}
	
	/**
	 * Saves results of user's media search into a text or binary file when
	 * requested by user.
	 * 
	 * @param fileName	 A string storing user's saved results file.
	 * @param results	An ArrayList of user's search results
	 * @exception IOException	Thrown when the file name cannot be found.
	 */
	public void saveBinary(String fileName, ArrayList<Media> results) throws IOException {
		// TODO
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		StringBuilder appendedResults = new StringBuilder(); // Results from Media AL appended together

		// Appends results to a single StringBuilder to be written to file
		for (int i = 0; i < results.size(); ++i) {
			appendedResults.append(results.get(i).toString()).append("\n");
		}

		oos.writeObject(appendedResults); // Writes results to file
		oos.close(); // Saves the binary file
	}
} // END MDB CLASS
