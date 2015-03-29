package gitio.test;

import gitio.GitIO;
import gitio.exceptions.GitIOException;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Tester class for the {@link GitIO#shorten(URL)} method.
 * 
 * @author Andrea Burattin
 */
public class GitIOTest {

	public static void main(String[] args) throws MalformedURLException {
		URL[] urls = new URL[] {
			new URL("https://github.com/github/hubot"),
			new URL("https://github.com/github/hubot/blob/master/src/brain.coffee"),
			new URL("https://help.github.com/articles/github-privacy-policy/"),
			new URL("https://twitter.com/"),
			new URL("ftp://facebook.com")
		};
		
		for (URL url : urls) {
			try {
				URL shorten = GitIO.shorten(url);
				System.out.println("OK: \"" + url + "\" becomes \"" + shorten + "\"");
			} catch (GitIOException e) {
				System.err.println("KO with " + url + ": \"" + e.getMessage() + "\"");
			}
		}
	}
}
