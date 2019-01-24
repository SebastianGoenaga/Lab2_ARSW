package eci.edu.Lab2;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.*;

public class URL_inform_Test {



	@Test
	public void informTest() throws MalformedURLException {

		String[] URLs = {"http://javi.com:80/gay/books/loca/index.html?name=networking#DOWNLOADING", "", "",
				"http://andresito.com:80/hola/vargas/web.html?name=networking#SEAECHING",
				"https://varguis.co:8080/hi/bye/javargas1098/index.html?name=networking#DOWNLOADING"};

		for (String s : URLs) {
			System.out.println(s);
			URL_inform inform = new URL_inform(s);
			URL prueba = new URL(s);
			assertEquals(inform.getProtocol(), prueba.getProtocol());
			assertEquals(inform.getAuthority(), prueba.getAuthority());
			assertEquals(inform.getHost(), prueba.getHost());
			assertTrue(inform.getPort() == prueba.getPort());
			assertEquals(inform.getPath(), prueba.getPath());
			assertEquals(inform.getQuery(), prueba.getQuery());
			assertEquals(inform.getFilename(), prueba.getFile());
			assertEquals(inform.getRef(), prueba.getRef());
			
		}
		 
		
	}

}
