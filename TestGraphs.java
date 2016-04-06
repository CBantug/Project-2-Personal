import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

/* Class solely for testing pie charts and histograms for viewing. */
public class TestGraphs {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileReader fr = new FileReader("SomeActors.txt");
		BufferedReader br = new BufferedReader(fr);
		MediaMaker mediaMaker = new MediaMaker("Abdullaeva, Angelina	This Is Andromeda (2015)  [Andromeda]  <3>", 3, br);
		System.out.println(getCreditYears(mediaMaker));
		LinkedHashMap<Integer, ArrayList<Media>> map = getCredYearsMap(mediaMaker);
		
		System.out.println(map);
		System.out.println(Integer.toString(getStartYear(mediaMaker)));
		System.out.println(Integer.toString(getEndYear(mediaMaker)));
		
		ArrayList<Media> credits = map.get(getStartYear(mediaMaker)); // List of credits within a single year
		System.out.println(credits);
		System.out.println(Integer.toString(getActingMovieCred(credits, mediaMaker)));
		
		//testPieChart();
		//testHistogram();
	}
	
	public static LinkedHashMap<Integer, ArrayList<Media>> getCredYearsMap(MediaMaker mediaMaker) {
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
	
	public static ArrayList<String> getCreditYears(MediaMaker mediaMaker) {
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
	public static int getActingMovieCred(ArrayList<Media> list, MediaMaker mediaMaker) {
		int actingMovieCred = 0; // Sets initial amount of credits before looping
		
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
		int actingSeriesCred = 0; // Sets initial amount of credits before looping

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
		int producingMovieCred = 0; // Sets initial amount of credits before looping

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
		int producingSeriesCred = 0; // Sets initial amount of credits before looping

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
		int directingMovieCred = 0; // Sets initial amount of credits before looping

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
		int directingSeriesCred = 0; // Sets initial amount of credits before looping

		// Loops through credits from a single year and adds up only the credits for series directing
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getClass().getName().equals("Series") && 
					(mediaMaker.getDirectingCredits().contains(list.get(i)))) {
					++directingSeriesCred;
				}
			}
		return directingSeriesCred;
	}
	
	public static int getStartYear(MediaMaker mediaMaker) {
		StringBuilder temp = new StringBuilder(getCreditYears(mediaMaker).get(0));

		temp.deleteCharAt(0);
		temp.deleteCharAt(temp.length() - 1);

		int startYear = Integer.parseInt(temp.toString());
		return startYear;
	}
	
	public static int getEndYear(MediaMaker mediaMaker) {
		StringBuilder temp = new StringBuilder(getCreditYears(mediaMaker).get(getCreditYears(mediaMaker).size()- 1).toString());

		temp.deleteCharAt(0);
		temp.deleteCharAt(temp.length() - 1);

		int endYear = Integer.parseInt(temp.toString());
		return endYear;
	}
	/**
	public static void testPieChart() throws FileNotFoundException, IOException {
		// Tests if a media maker has multiple types of credit (in this case, 1 movie and 1 series acting)
		FileReader fr = new FileReader("SomeActors.txt");
		BufferedReader br = new BufferedReader(fr);
		MediaMaker mediaMaker1 = new MediaMaker("Jolie, Angelina		10 Years of Tomb Raider: A GameTap Retrospective (2008) (TV)  (archive footage)  [Herself]" //, 1, br);
				+ "\n\"1002 Momentos de la tele\" (2012) {(#1.6)}  (archive footage)  [Herself]", 3, br);
		ArrayList<MediaMaker> test = new ArrayList<MediaMaker>();

		test.add(mediaMaker1);
		MdbDriver.displayPieChart(test);
	}
	

	public static void testHistogram() throws FileNotFoundException, IOException {
		// Tests if a media maker has multiple types of credit (in this case, 1 movie and 1 series acting)
		FileReader fr = new FileReader("SomeActors.txt");
		BufferedReader br = new BufferedReader(fr);
		MediaMaker mediaMaker1 = new MediaMaker("Jolie, Angelina		10 Years of Tomb Raider: A GameTap Retrospective (2008) (TV) (archive footage)  [Herself]", 3, br);
		ArrayList<MediaMaker> test = new ArrayList<MediaMaker>();

		test.add(mediaMaker1);
		MdbDriver.displayHistogram(test);
		*/
	} // ENDS TESTGRAPH CLASS