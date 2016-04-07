package main.java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		int result = 0;

		// Get file from resources folder
		Problem22 p22 = new Problem22();
		ClassLoader classLoader = p22.getClass().getClassLoader();
		File file = new File(classLoader.getResource("main/resources/p022_names.txt").getFile());

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				names = Arrays.asList(line.replaceAll("\"", "").split(","));
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		Collections.sort(names);

		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			result += (i + 1) * alphabeticalValue(name);
		}

		System.out.println(result);
	}

	public static int alphabeticalValue(String word) {
		int value = 0;

		for (int i = 0; i < word.length(); i++) {
			value += word.charAt(i) - 64;
		}

		return value;
	}

}
