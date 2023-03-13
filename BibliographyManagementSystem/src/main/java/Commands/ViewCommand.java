package Commands;

import Objects.Catalog;
import Objects.Item;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ViewCommand extends Command{
    public ViewCommand(Catalog catalog, Item item) {
        super(catalog, item);
    }
    public void view(Catalog catalog, Item item) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        File newFile = new File(item.getLocation());
        desktop.open(newFile);
    }
}
