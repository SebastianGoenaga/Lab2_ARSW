package eci.edu.Lab2;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class URL_reader {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String pagina = sc.nextLine();
		FileWriter fichero = null;
        PrintWriter pw = null;
		URL url = new URL(pagina);

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
			String inputLine = null;
			fichero = new FileWriter("pagina.html");
            pw = new PrintWriter(fichero);
			while ((inputLine = reader.readLine()) != null) {
				pw.println(inputLine);
			}

		} catch (IOException x) {
			System.err.println(x);
		}
		finally {
			fichero.close();
		}
	}

}