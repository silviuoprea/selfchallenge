package Commands;

import Objects.Catalog;
import Objects.Item;

public abstract class Command{
    protected Item item;
    protected Catalog catalog;
    protected String path;

    protected Command(Catalog catalog, Item item){
        this.catalog = catalog;
        this.item = item;
    }

    protected Command(Catalog catalog){
        this.catalog = catalog;
    }

    protected Command(Catalog catalog, String path){
        this.catalog = catalog;
        this.path = path;
    }

    protected Command(String path){
        this.path = path;
    }
}