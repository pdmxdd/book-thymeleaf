package org.launchcode.bookthymeleaf;

import org.launchcode.bookthymeleaf.controllers.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class BookThymeleafApplication {

	public static void main(String[] args) {
//		HashMap<String, String> testBook = new HashMap<>();
//		testBook.put("title", "It");
//		testBook.put("author", "King");
//		testBook.put("ISBN", "3q809-phrff");
//		BookController.addBook(testBook);
		SpringApplication.run(BookThymeleafApplication.class, args);
	}

}
