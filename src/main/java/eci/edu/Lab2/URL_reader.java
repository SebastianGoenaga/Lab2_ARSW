package eci.edu.Lab2;

import java.io.*;
import java.net.*;

public class URL_reader {
	public static void main(String[] args) throws Exception {
		URL google = new URL("http://www.google.com/");

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {
			String inputLine = null;
			while ((inputLine = reader.readLine()) != null) {
				System.out.println(inputLine);
			}

		} catch (IOException x) {
			System.err.println(x);

		}
	}

}