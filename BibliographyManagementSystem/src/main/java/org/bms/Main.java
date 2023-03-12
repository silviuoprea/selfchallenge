package org.bms;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Main app = new Main();
        app.testCreateSave();
        System.out.println("Hello world!");
    }
    private void testCreateSave() throws IOException {
        Catalog catalog = new Catalog("MyRefs");
        Item book = new Item("book1", "The Book", "BibliographyManagementSystem/src/main/resources/book.nobook");
        Item article = new Item("java17", "The Java Language Specification", "https://docs.oracle.com/javase/specs/jls/se17/html/index.html");
        catalog.add(book);
        catalog.add(article);
        Command loadCommand = new LoadCommand("BibliographyManagementSystem\\src\\main\\resources\\catalog.json");
        Command saveCommand = new SaveCommand(catalog, "BibliographyManagementSystem\\src\\main\\resources\\catalog.json");

        ((SaveCommand) saveCommand).save(catalog,"BibliographyManagementSystem\\src\\main\\resources\\catalog.json");
        catalog = ((LoadCommand) loadCommand).load("BibliographyManagementSystem\\src\\main\\resources\\catalog.json");
    }
}