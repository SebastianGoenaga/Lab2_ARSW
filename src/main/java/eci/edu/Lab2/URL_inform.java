package eci.edu.Lab2;

import java.net.MalformedURLException;
import java.net.URL;



/**
 * Hello world!
 *
 */
public class URL_inform {

	private URL url;
	private String protocol;
	private String authority;
	private String host;
	private int port;
	private String path;
	private String query;
	private String filename;
	private String ref;
	
	public String getProtocol() {
		protocol = url.getProtocol(); 
		return protocol;
	}
	
	
	public String getAuthority() {
		authority = url.getAuthority();
		return authority;
	}

	public String getHost() {
		host = url.getHost();
		return host;
	}

	public int getPort() {
		port = url.getPort();
		return port;
	}

	public String getPath() {
		path = url.getPath();
		return path;
	}

	public String getQuery() {
		query = url.getQuery();
		return query;
	}

	public String getFilename() {
		filename = url.getFile();
		return filename;
	}

	public String getRef() {
		ref = url.getRef();
		return ref;
	}

	public URL_inform(String s) {
		try {
			url = new URL(s);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Imprime los parametros dados por una url
	 * 
	 * @param google
	 */
	public void print() {

		System.out.println(protocol);
		System.out.println(authority);
		System.out.println(host);
		System.out.println(port);
		System.out.println(path);
		System.out.println(query);
		System.out.println(filename);
		System.out.println(ref);
	}
}
