package eci.edu.Generator;

import static org.quicktheories.generators.SourceDSL.*;

import java.nio.channels.ScatteringByteChannel;
import java.sql.Ref;
import java.util.Random;

import org.quicktheories.core.Gen;

public class URL_Generator {

	public static String direccion() {
		String[] protocol = { "http://", "https://" };
		Random random = new Random();
		Gen<String> dominio = strings().basicLatinAlphabet().ofLengthBetween(1, 10);
		Gen<Integer> puerto = integers().between(0, 65536);
		String path = "";
		for (int i = 0; i < random.nextInt(7); i++) {
			path += "/" + strings().allPossible().ofLengthBetween(1, 10);
		}
		String query = "?" + strings().basicLatinAlphabet().ofLengthBetween(1, 6) + "="
				+ strings().basicLatinAlphabet().ofLengthBetween(1, 6);
		String ref = "#" + strings().basicLatinAlphabet().ofLengthBetween(1, 10);
		return protocol[random.nextInt(2)] + dominio + puerto + path + query + ref;
	}

}
