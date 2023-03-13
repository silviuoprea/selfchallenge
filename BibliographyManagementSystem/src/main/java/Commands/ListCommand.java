package Commands;

import Objects.Catalog;
import Objects.Item;

public class ListCommand extends Command{
    public ListCommand(Catalog catalog) {
        super(catalog);
    }
    public void list(Catalog catalog)
    {
        for(Item item: catalog.getItems())
            System.out.println(item.toString());
    }
}
