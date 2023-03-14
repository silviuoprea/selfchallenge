package Commands;

import com.fasterxml.jackson.databind.ObjectMapper;
import Objects.Catalog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoadCommand extends Command{
    public LoadCommand(String path) {
        super(path);
    }
    public static Catalog load(String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        Catalog catalog = null;
        File f;
        try {
            f = new File(path);
            catalog = objectMapper.readValue(f, Catalog.class);
        } catch (FileNotFoundException e) {
            System.err.println("The file " + path + " is missing!");
        } catch (IOException e) {
            System.out.println("Unexpected error reading the file!");
            e.printStackTrace();
        }
        return catalog;
    }
}
