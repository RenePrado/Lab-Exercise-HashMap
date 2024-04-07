import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.Scanner;

public class BookDA {
    public BookDA() {
        try {
            Scanner inputFile = new Scanner(new FileReader("src/HashMap/Book.csv"));
            inputFile.nextLine();

            while (inputFile.hasNext()) {
                String lineData = new String();
                lineData = inputFile.nextLine();
                String[] splitData = new String[3];
                splitData = lineData.split(",");

                Book book = new Book();

                book.setIsbn(splitData[0].trim());
                book.setTitle(splitData[1].trim());
                String authorName = splitData[2].trim();

                AuthorDA authorDA = new AuthorDA(authorName);

                book.setAuthorHashMap(authorDA.getAuthorHashMap());

                System.out.print(book.getIsbn() + " " + book.getTitle());
                for(Map.Entry<String, Author> bookHashMap: book.getAuthorHashMap().entrySet()) {
                    System.out.print("\n\t\t" + bookHashMap.getValue().getName() + " - ");
                    System.out.print(bookHashMap.getValue().getBio() + "\n");
                }
                System.out.println();
            }
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
