package model;

import java.util.List;

import exceptions.MissingBookException;
import exceptions.NotEnoughBookException;

/**
 * 
 * @author Chiara Ceccarini
 *
 */

public interface IBookManagement extends IBasicOp{
	
	/**
	 * 
	 * @param book
	 * @param nCopy
	 * @throws MissingBookException
	 * @throws NotEnoughBookException
	 */
	void sellBook(Libro book, int nCopy) throws MissingBookException, NotEnoughBookException;
	
	/**
	 * 
	 * @param title
	 * @return book searched by title
	 * @throws MissingBookException
	 */
	List <Libro> searchBookTitle(String title) throws MissingBookException;
	
	/**
	 * 
	 * @param author
	 * @return book searched by author
	 * @throws MissingBookException
	 */
	List<Libro> searchBookAuthor (String author) throws MissingBookException;

}
