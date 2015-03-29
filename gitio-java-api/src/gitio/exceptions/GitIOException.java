package gitio.exceptions;

import gitio.GitIO;

/**
 * This class represents an exception that can be thrown by the 
 * {@link GitIO#shorten(java.net.URL)} method. You can use the
 * {@link #getMessage()} method to get insights into the actual exception cause.
 * 
 * @author Andrea Burattin
 */
public class GitIOException extends Exception {

	private static final long serialVersionUID = -6019047119320746295L;

	/**
	 * Exception constructor
	 * 
	 * @param message
	 */
	public GitIOException(String message) {
		super(message);
	}
}
