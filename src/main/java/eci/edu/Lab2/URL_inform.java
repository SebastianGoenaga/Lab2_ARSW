package eci.edu.Lab2;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class URL_inform {

	/**
	 * Imprime los parametros dados por una URL
	 * 
	 * @param google
	 */
	public void inform(String URL_String) {

		try {
			URL google = new URL(URL_String);
			
			System.out.println("protocol = " + google.getProtocol());
			System.out.println("authority = " + google.getAuthority());
			System.out.println("host = " + google.getHost());
			System.out.println("port = " + google.getPort());
			System.out.println("path = " + google.getPath());
			System.out.println("query = " + google.getQuery());
			System.out.println("filename = " + google.getFile());
			System.out.println("ref = " + google.getRef());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
