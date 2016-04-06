/**
 * Project #4
 * CS 2334, Section 010
 * 1 April 2016
 * <P>
 * An abstract class that is the parent class for movies, series
 * and episodes.
 * </P>
 * @version 1.0
 */
public abstract class Media implements Comparable<Media>{
	/** Stores the title of a Media object as a string. */
	protected String title;

	/** Stores release year of a Media object as a string. */
	protected String releaseYear;

	public abstract String getTitle();
	public abstract String getReleaseYear();
}
