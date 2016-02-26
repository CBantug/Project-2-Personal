import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Project #2
 * CS 2334, Section 010
 * 22 February 2016
 * <P>
 * This class creates Series objects that will hold data for individual Series
 * to be used in the MDb. Each Series has a title and list of episodes.
 * <P>
 * @version 1.0
 */
public class Series implements Comparable<Series> {

/** The series title of the Series entry. */
private String seriesTitle;

/** The list of episodes that make up the series*/
private ArrayList<Episode> episodeList;

/** The year the series started*/ 
private String startYear;

/** The range of years the series has been running / ran */
private String runYears;



/**
 * A default constructor to create a Series object with null field values.
 */
public Series() {
	//TODO Write Constructor
}

/**
 * A constructor to create a Series object, filling its fields from a parsed String line
 * read from a file. 
 * <P>
 * Algorithm: <br>
 * 1. Read in line from Series information file. Parse into string array <br>
 * 2. Step through the string array of the inputLine right to left <br>
 * 3. Assign  data from the file line to the corresponding Series object field <br>
 * <P>
 * 
 * @param	inputLine	The String generated from a file line containing Series information
 * @param	br			The BufferedReader from the main program used to read the file
 * @throws IOException 
 */
public Series ( String inputLine, BufferedReader br) throws IOException {
	
	//Create string array to hold the split-by-whitespace inputLine
	String[] parsedLine = inputLine.split("\t\t\t|\t\t|\t| ");
	
	//Trim the whitespace from each of the index components, deals with the tab characters
	for (int i = parsedLine.length -1; i >= 0; i--) {
		parsedLine[i].trim();
	}
		
	//Converts String[] to AL<String> to remove the empty strings from trimming
	ArrayList<String> cleanParsedLine = new ArrayList<String>();
	for(int j = 0; j <= parsedLine.length-1; j++){
	if(parsedLine[j].isEmpty() != true) {
	cleanParsedLine.add(parsedLine[j]);
		}
	}
	
	//Check to see if the input line is a Series line, Sets fields if so
	String lastComp = cleanParsedLine.get(cleanParsedLine.size() - 1);
	if (lastComp.length() > 4) 
	{
		this.runYears = lastComp;
		this.startYear = cleanParsedLine.get(cleanParsedLine.size() - 2);
		
		//Concatenates the rest of the cleanParsedLine to the Series title
		int end = (cleanParsedLine.size() - 3);
		String titleBuilder = "";
		int start;
		for (start = 0; start <= end; start ++) {
			titleBuilder = titleBuilder.concat(cleanParsedLine.get(start)).concat(" ");
		}
		
		this.seriesTitle = titleBuilder;
		
		//Loop to Construct the Episode list for the Series object
		
			//AL<Episode> to hold all of the Series's episodes
			ArrayList<Episode> episodeList = new ArrayList<Episode>();
			
			//Sentinel for the Loop
			//Moves reader to next line, puts in array, and splits it
			String nextLine = br.readLine();
			String[] episodeLine = nextLine.split("\t\t| |\t");
			
			//Trim the whitespace from each of the index components, deals with the tab characters
			for (int k = episodeLine.length -1; k >= 0; k--) {
				episodeLine[k].trim();
			}
				
			//Converts String[] to AL<String> to remove the empty strings from trimming
			ArrayList<String> episodeLineParsed = new ArrayList<String>();
			for(int j = 0; j <= episodeLine.length-1; j++){
			if(episodeLine[j].isEmpty() != true) {
			episodeLineParsed.add(episodeLine[j]);
				}
			}
			
			//Actual Construction of Episode AL<E>
			int seriesTitleLength = start;
			do {
				episodeList.add(new Episode(episodeLineParsed, seriesTitleLength));
				nextLine = br.readLine();
				
				//Split, Trim, Convert
				episodeLine = nextLine.split("\t\t\t|\t\t|\t| ");
				for (int g = episodeLine.length -1; g >= 0; g--) {
					episodeLine[g].trim();
				}
				
				episodeLineParsed.clear();
				
				for(int j = 0; j <= episodeLine.length-1; j++){
					if(episodeLine[j].isEmpty() != true) {
					episodeLineParsed.add(episodeLine[j]);
						}
					}
				
			}
			while (episodeLineParsed.get(episodeLineParsed.size() - 1).length() == 4);

		this.episodeList = episodeList;
	
	
	} // End if for series	

	
} //end Series constructor

/**
 * Method to return the contents of a Series object as a single string.
 * <P>
 * @return		String representing the contents of a Series object
 */
public String toString(Series a) {
	return null;
	//TODO Write method
} //end of toString

/**
 * Method to compare an instance of this Series with another instance of Series. 
 * <P>
 * Algorithm: <br>
 * 1. Compare Series titles, return if not the same
 * 2. Compare Series startYear, return if not the same
 * 3. Compare the number of episodes held in each instance's episodeList, return if not the same
 * 4. Returns 0 and the Series objects are equal
 * <P>
 * 
 * @param	other	The Series object to which the method is comparing this 
 * 					instance of Series.
 * @return			(0, -1, or 1) depending on the outcome of the comparison
 */
@Override
public int compareTo(Series other) {
	// TODO Write comparison method
	return 0;
}

/**
 * Accessor method that returns the Series startYear as a String
 * 
 * @return		startYear field of this Series object
 */
public String getStartYear() {
	return startYear;
	//TODO Edit Method
} //End of getStartYear

/**
 * Accessor method that returns the Series title as a String
 * 
 * @return		title field of this Series object
 */
public String getSeriesTitle() {
	return seriesTitle;
	//TODO Edit Method
} //End of getSeriesTitle

/**
 * Accessor method that returns the Series episode list as a String
 * 
 * @return		episodeList field of this Series object
 */
public ArrayList<Episode> getEpisodeList() {
	return episodeList;
	//TODO Edit Method
} //End of getEpisodeList





}