package model;

import java.util.List;

import utilities.Pair;
/**
 * 
 * @author Chiara Ceccarini
 *
 */

public interface IStatistics {
	
	/**
	 * 
	 * @param list of book in the library
	 * @return a list of the most popular books
	 */
	public List<Libro> mostPopularBook (List <Libro> list);
	
	/**
	 * 
	 * @param list of book in the library
	 * @return a list of the less popular books
	 */
	public List<Libro> lessPopularBook (List <Libro> list);
	
	/**
	 * 
	 * @param list of book in the library
	 * @return a list of the most active author
	 */
	public List <Pair <String,Integer>> mostActiveAuthor (List <Libro> list);
	
	/**
	 * 
	 * @param list of book in the library
	 * @return a list of the less active author
	 */
	public List <Pair <String,Integer>> lessActiveAuthor (List <Libro> list);
}
