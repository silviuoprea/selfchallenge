package Commands;

import Objects.Catalog;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InfoCommand extends Command {
    public InfoCommand(Catalog catalog) {
        super(catalog);
    }

    public void getMetaData(Catalog catalog) throws TikaException, IOException, SAXException {
        File file = new File("BibliographyManagementSystem\\src\\main\\resources\\catalog.json");
        AutoDetectParser parser = new AutoDetectParser();
        BodyContentHandler handler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        FileInputStream inputStream = new FileInputStream(file);
        ParseContext context = new ParseContext();
        parser.parse(inputStream, handler, metadata, context);
        System.out.println(handler);

        String[] metadataNames = metadata.names();

        for(String name: metadataNames)
            System.out.println(name + ":" + metadata.get(name));
    }
}
