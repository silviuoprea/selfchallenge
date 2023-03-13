package org.bms;
import Commands.*;
import Objects.Catalog;
import Objects.Item;
import org.apache.tika.exception.TikaException;
import org.xml.sax.SAXException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, TikaException, SAXException {
        Main app = new Main();
        app.testCreateSave();
    }
    private void testCreateSave() throws IOException, TikaException, SAXException {
        Catalog catalog = new Catalog("MyRefs");
        Item book = new Item("book1", "The Book", "BibliographyManagementSystem/src/main/resources/book.nobook");
        Item article = new Item("java17", "The Java Language Specification", "https://docs.oracle.com/javase/specs/jls/se17/html/index.html");
        catalog.add(book);
        catalog.add(article);
        Command loadCommand = new LoadCommand("BibliographyManagementSystem\\src\\main\\resources\\catalog.json");
        Command saveCommand = new SaveCommand(catalog, "BibliographyManagementSystem\\src\\main\\resources\\catalog.json");
        Command listCommand = new ListCommand(catalog);
        Command infoCommand = new InfoCommand(catalog);
        Command viewCommand = new ViewCommand(catalog, catalog.getItems().get(0));
        Command reportCommand = new ReportCommand(catalog);
        ((ReportCommand) reportCommand).generateReport(catalog);
        ((ViewCommand) viewCommand).view(catalog, catalog.getItems().get(0));
        ((ListCommand) listCommand).list(catalog);
        ((InfoCommand) infoCommand).getMetaData(catalog);
        ((SaveCommand) saveCommand).save(catalog,"BibliographyManagementSystem\\src\\main\\resources\\catalog.json");
        catalog = ((LoadCommand) loadCommand).load("BibliographyManagementSystem\\src\\main\\resources\\catalog.json");
    }
}