import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

// Any package statements go here.

// Any import statements go here.

/**
 * Project #4
 * CS 2334, Section 010
 * 1 April 2016
 * <P>
 * A database that utilizes LinkedHashMaps to sort/store MediaMaker objects. 
 * </P>
 * @version 1.0
 */
public class MediaMakerDatabase implements Serializable
{

	/** */
	private static final long serialVersionUID = 289578335284299423L;
	
	/** A LinkedHashMap of MediaMaker objects; used to retrieve data on people. */
	protected static LinkedHashMap<String, MediaMaker> people = new LinkedHashMap<String,MediaMaker>();
    
    /**
     * Default constructor for a database of MediaMaker objects.
     * @param people
     */
    public MediaMakerDatabase()
    {
    	//intentionally empty
    }
    
    /**
     * Constructor for a database of MediaMaker objects using a LHM parameter.
     * @param people
     */
    public MediaMakerDatabase(LinkedHashMap<String, MediaMaker> people)
    {
    	this.people = people;
    }
    
	/**
	 * Opens a file containing a movie list and reads it in line by line.
	 * These lines are parsed into Movie or Series objects based on the
	 * int passed that dictates if file being read is the movie or 
	 * series file.
	 * <P>
	 * Algorithm:<br>
	 * 1. Opening and reading in a data file line by line.<br>
	 * 2. Determines if file being read is movie or series file.<br>
	 * 3. Constructs Movie or Series object with each line.<br>
	 * </P>
	 * 
	 * @param	fileName	A string containing the name of the movie list
	 *                      that will be opened.
	 * @param	fileType	An int indicating if the file being passed
	 *                      is of actors (1), directors (2), or producers (3)
	 * @exception FileNotFoundException	Thrown when the file name cannot be found.
	 *            IOException	Thrown when the file name cannot be found.
	 */
	public void readFile(String fileName, int fileType) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(fileName); // Opens file
		BufferedReader br = new BufferedReader(fr); // Reads in file
		String nextLine; // String that stores a line from the file	
		
			if (fileType == 3) { //A file of actors is read in
				while ((nextLine = br.readLine()) != null) {  //File is read line by line until the end of the file
					if (Pattern.compile("([A-Za-z]+),\\s+([A-Za-z]+)").matcher(nextLine).find()){ //if the next line has a name, use the constructor for MediaMaker
						MediaMaker person = new MediaMaker(nextLine, 3, br);
						String name = person.getName();											
						people.put(name, person);
					}
				}
			}
			else if (fileType == 4){ //A file of directors is read in
				while ((nextLine = br.readLine()) != null) { //File is read line by line until the end of the file
					if (Pattern.compile("([A-Za-z]+),\\s+([A-Za-z]+)").matcher(nextLine).find()){

						//Separate the components of the read-in line into elements of a String array.
						String[] componentsArray = nextLine.split("\\t| ");
						
						//Cut white space left over from the previous split method.
						for (int i = 0; i <= componentsArray.length - 1; i++){ 			
							componentsArray[i].trim();
						}
				
						//Delete empty strings by resorting the string array into a string ArrayList.
						ArrayList<String> components = new ArrayList<String>();
					
						for (int i = 0; i <= componentsArray.length - 1; i++){
							if (!(componentsArray[i].isEmpty()))
								components.add(componentsArray[i]);
						}
						
						//Store name data
						String name = components.get(1) + " " + components.get(0).replaceAll(",", "");
						//Determine if there is a disambiguation number       	
						String disambigNumber = "";
						for (int i = 0; i < 3; i++)
						{
							if(components.get(i).matches("\\(\\D{1,4}\\)"))
							{
								disambigNumber = components.get(i); 
								name += " " + disambigNumber;
							}
						}
						
						if (people.containsKey(name)){//person with this name in the LHM was found
							
							people.get(name).getDirectingCredits().add(MediaMaker.parseLine(nextLine, components));
							while ((nextLine = br.readLine()) != null){
								//Separate the components of the read-in line into elements of a String array.
								String [] componentsArray2 = nextLine.split("\\t| ");
								
								//Cut white space left over from the previous split method.
								for (int i = 0; i <= componentsArray2.length - 1; i++){ 			
									componentsArray2[i].trim();
								}
						
								//Delete empty strings by resorting the string array into a string ArrayList.
								ArrayList<String >components2 = new ArrayList<String>();							
								for (int i = 0; i <= componentsArray2.length - 1; i++){
									if (!(componentsArray2[i].isEmpty()))
										components2.add(componentsArray2[i]);
								}							
								if (!nextLine.isEmpty())
									people.get(name).getDirectingCredits().add(MediaMaker.parseLine(nextLine, components2));						
								else {
									break;
								}
							}
						}										
						else{//no person in the LHM with this name
							MediaMaker person = new MediaMaker(nextLine, 4, br);
							name = person.getName();														
							people.put(name, person);
						}
					}
					
				}				
			}
			else if (fileType == 5) { //A file of producers is read in
				while ((nextLine = br.readLine()) != null) { //File is read line by line until the end of the file
					if (Pattern.compile("([A-Za-z]+),\\s+([A-Za-z]+)").matcher(nextLine).find()){

						//Separate the components of the read-in line into elements of a String array.
						String[] componentsArray = nextLine.split("\\t| ");
						
						//Cut white space left over from the previous split method.
						for (int i = 0; i <= componentsArray.length - 1; i++){ 			
							componentsArray[i].trim();
						}
				
						//Delete empty strings by resorting the string array into a string ArrayList.
						ArrayList<String> components = new ArrayList<String>();
					
						for (int i = 0; i <= componentsArray.length - 1; i++){
							if (!(componentsArray[i].isEmpty()))
								components.add(componentsArray[i]);
						}
						
						//Store name data
						String name = components.get(1) + " " + components.get(0).replaceAll(",", "");
						//Determine if there is a disambiguation number       	
						String disambigNumber = "";
						for (int i = 0; i < 3; i++)
						{
							if(components.get(i).matches("\\(\\D{1,4}\\)"))
							{
								disambigNumber = components.get(i); 
								name += " " + disambigNumber;
							}
						}
						
						if (people.containsKey(name)){//person with this name in the LHM was found							
							
							//Add the first Media object to the already existing person
							people.get(name).getProducingCredits().add(MediaMaker.parseLine(nextLine, components));
							
							//Continue adding code
							while ((nextLine = br.readLine()) != null){
								//Separate the components of the read-in line into elements of a String array.
								String [] componentsArray2 = nextLine.split("\\t| ");
								
								//Cut white space left over from the previous split method.
								for (int i = 0; i <= componentsArray2.length - 1; i++){ 			
									componentsArray2[i].trim();
								}
						
								//Delete empty strings by resorting the string array into a string ArrayList.
								ArrayList<String >components2 = new ArrayList<String>();							
								for (int i = 0; i <= componentsArray2.length - 1; i++){
									if (!(componentsArray2[i].isEmpty()))
										components2.add(componentsArray2[i]);
								}							
								if (!nextLine.isEmpty())
									people.get(name).getProducingCredits().add(MediaMaker.parseLine(nextLine, components2));						
								else {
									break;
								}
							}
						}										
						else{//no person in the LHM with this name
							MediaMaker person = new MediaMaker(nextLine, 5, br);
							name = person.getName();														
							people.put(name, person);
						}
					}
					
				}				
			}		
		br.close();
	} // end readFile
	
    	/**
	 * Returns a MediaMaker object at a certain key from the database.
	 * 
	 * @param name	A string of the person's name that will locate the person in the database.
	 * @return A Media object from the movie database at the index from the
	 *         parameter.
	 */
	public MediaMaker getPerson(String name) {
		return people.get(name);
	} // end getperson
    	
    	/**
	 * Returns a LinkedHashMap of all of the people within the database.
	 * 
	 * @return	LinkedHashMap containing all of the people in the database.
	 */
	public LinkedHashMap<String, MediaMaker> getPeople () {
		return this.people;
	}
    
    
	 /**
	 * Saves results of user's media search into a text or binary file when
	 * requested by user.
	 * 
	 * @param fileName	A string storing user's saved results file.
	 * @param results	An ArrayList of user's search results
	 * @exception	IOException	Thrown when the file name cannot be found.
	 */
	public void saveText(String fileName, ArrayList<MediaMaker> results) throws IOException {
		// TODO
		FileWriter outfile = new FileWriter(fileName); // Creates a FileWriter Object
		// Creates BufferedWriter to write content to file
		BufferedWriter bw = new BufferedWriter(outfile);
		
		// Writes results by one Media object to a line
		for (int i = 0; i < results.size(); ++i) {
			String result = results.get(i).toString();
			bw.write(result);
			bw.newLine();
		}
		bw.close(); // Closes file to save it
	}
	
	/**
	 * Saves results of user's media search into a text or binary file when
	 * requested by user.
	 * 
	 * @param fileName	 A string storing user's saved results file.
	 * @param results	An ArrayList of user's search results
	 * @exception IOException	Thrown when the file name cannot be found.
	 */
	public void saveBinary(String fileName, ArrayList<MediaMaker> results) throws IOException {
		// TODO
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		StringBuilder appendedResults = new StringBuilder(); // Results from MediaMaker AL appended together

		// Appends results to a single StringBuilder to be written to file
		for (int i = 0; i < results.size(); ++i) {
			appendedResults.append(results.get(i).toString()).append("\n");
		}

		oos.writeObject(appendedResults); // Writes results to file
		oos.close(); // Saves the binary file
	}
}