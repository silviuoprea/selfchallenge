package Commands;

import com.fasterxml.jackson.databind.ObjectMapper;
import Objects.Catalog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SaveCommand extends Command{
    public SaveCommand(Catalog catalog, String path) {
        super(catalog, path);
    }
    public static void save(Catalog catalog, String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        File f;
        try {
            f = new File(path);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(f, catalog);
        } catch (IOException e) {
            System.out.println("Unexpected error reading the file!");
            e.printStackTrace();
        }

    }
}
