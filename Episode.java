import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


	
	/**
	 * Project #2
	 * CS 2334, Section 010
	 * 22 February 2016
	 * <P>
	 * This class creates Episode objects that will hold data for individual episodes
	 * to be used in the MDb. Each Episode has a series title, start year, episode title, episode season and number
	 * and the year it first aired.
	 * <P>
	 * @version 1.0
	 */
	
	public class Episode implements Comparable <Episode> {
		
		/** The episode title of the Episode object */
		private String episodeTitle;
		
		/** The episode's season and number */
		private String episodeSeasonNum;
		
		/** The year the episode was first aired */
		private String airYear;
		
		
	/**
	 * A default constructor to create a Episode object with null field values.
	 */
	public Episode() {
		//TODO Write Constructor
	}
	
	/**
	 * A constructor to create a Episode object, filling its fields from a parsed String line
	 * read from a file. 
	 * <P>
	 * Algorithm: <br>
	 * 1. Read in ArrayList<String> given by the Series constructor. 
	 * 2. Step through the ArrayList<String> right to left <br>
	 * 3. Assign  data from the ArrayList<String> to the corresponding Episode object field <br>
	 * <P>
	 * 
	 * @param	episodeLineParsed	The ArrayList<String> given this constructor within the Series constructor
	 */
	public Episode ( ArrayList<String> episodeLineParsed, int seriesTitleLength) {
		//TODO Write Constructor
		
		//Set last component to the airYear, Remove last comp
		this.airYear = episodeLineParsed.get((episodeLineParsed.size() - 1));
		episodeLineParsed.remove(episodeLineParsed.size()-1);
		
		//Comp currently being checked
		String currentComp = episodeLineParsed.get(episodeLineParsed.size() -1);
		
		
		//Regex to find Season & Num
		Pattern seaNumParB = Pattern.compile("(\\#[0-9]+[.][0-9]+\\)\\})");
		//String for Title
		String titleBuilder = "";
		//See if next comp is Season & Num
		Matcher sNPB = seaNumParB.matcher(currentComp);
		boolean foundSeaNum = sNPB.find();
		
			if(foundSeaNum == true) {
				this.episodeSeasonNum = currentComp;
			}
			else if (currentComp == "{{SUSPENDED}}") {
				this.episodeSeasonNum = currentComp;
			}
			else {
				this.episodeSeasonNum = "No Season or Episode Number Information Available";
				//Sets Title here because it wouldn't work later
				for (int start = seriesTitleLength+1; start <= episodeLineParsed.size()-1; start++)
				{	
					titleBuilder = titleBuilder.concat(episodeLineParsed.get(start)).concat(" ");
				}
				episodeTitle = titleBuilder;
			}
			
		
		//Checks if there is an episode title by checking first index of {, Sets title field when ready
		
		if (episodeLineParsed.get(seriesTitleLength +1) == episodeSeasonNum)
		{
			this.episodeTitle = "No Episode Title Available";
		}
	
		else if(this.episodeTitle == null){
			
			for (int start = seriesTitleLength+1; start <= episodeLineParsed.size()-2; start++)
			{	
				titleBuilder = titleBuilder.concat(episodeLineParsed.get(start)).concat(" ");
			}
		}
		this.episodeTitle = titleBuilder;
	} //end Episode constructor
	
	/**
	 * Method to return the contents of a Episode object as a single string.
	 * <P>
	 * @return		String representing the contents of a Episode object
	 */
	public String toString() {
		return null;
		//TODO Write method
	} //end of toString
	
	/**
	 * Method to compare an instance of this Episode with another instance of Episode. 
	 * <P>
	 * Algorithm: <br>
	 * 1. Compare Episode titles, return if not the same
	 * 2. Compare Episode nameYearDuplicate, return if not the same
	 * 3. Compare Episode episodeTitle, return if not the same
	 * 4. Compare Episode releaseYear, return if not the same
	 * <P>
	 * 
	 * @param	other	The Episode object to which the method is comparing this 
	 * 					instance of Episode.
	 * @return			(0, -1, or 1) depending on the outcome of the comparison
	 */
	public int compareTo(Episode other) {
		return 0;
		//TODO Write Method
	} //End of compareTo
	

	/**
	 * Accessor method that returns the Episode title as a String
	 * 
	 * @return		episodeTitle field of this Episode object
	 */
	public String getEpisodeTitle() {
		return episodeTitle;
		//TODO Edit Method
	} //End of getEpisodeTitle()
	
	/**
	 * Accessor method that returns the  episodeSeasonNum as a String
	 * 
	 * @return		episodeSeasonNum field of this Episode object
	 */
	public String getEpisodeSeasonNum() {
		return episodeSeasonNum;
		//TODO Edit Method
	} //End of episodeSeasonNum
	
	
	/**
	 * Accessor method that returns the Episode air year as a String
	 * 
	 * @return		airYear field of this Episode object
	 */
	public String getAirYear() {
		return airYear;
		//TODO Edit Method
	} //End of airYear()
	
	
	
	}

	