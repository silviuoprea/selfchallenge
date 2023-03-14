package Commands;

import Objects.Catalog;
import Objects.Item;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ViewCommand extends Command{
    public ViewCommand(Catalog catalog, Item item) {
        super(catalog, item);
    }
    public void view(Catalog catalog, Item item) {
        Desktop desktop = Desktop.getDesktop();
        File newFile;
        try {
            newFile = new File(item.getLocation());
            desktop.open(newFile);
        } catch (FileNotFoundException e) {
            System.err.println("The file " + item.getLocation() + " is missing!");
        } catch (IOException e) {
            System.out.println("Unexpected error reading the file!");
            e.printStackTrace();
        }
    }
}
