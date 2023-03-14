package Commands;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import Objects.Catalog;
import Objects.Item;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class ReportCommand extends Command{
    public ReportCommand(Catalog catalog) {
        super(catalog);
    }
    public void generateReport(Catalog catalog, String path) {
        VelocityEngine velocityEngine = new VelocityEngine();
        VelocityContext context = new VelocityContext();
        ArrayList<Object> list = new ArrayList<>();
        StringWriter writer = new StringWriter();
        ObjectMapper objectMapper = new ObjectMapper();
        Desktop desktop = Desktop.getDesktop();
        String resPath = "BibliographyManagementSystem\\src\\main\\resources\\";
        velocityEngine.init();

        Template t = velocityEngine.getTemplate("index.vm");
        for(Item item:catalog.getItems())
        {
            list.add(new HashMap<String, String>(){{put("title", item.getTitle());put("location", item.getLocation());}});
        }
        for(Object item : list)
            System.out.println(item);
        context.put("totalBooks", list);
        t.merge( context, writer );
        File f;
        try {
            f = new File(path);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(f, writer.toString());
            desktop.open(f);
        } catch (IOException e) {
            System.out.println("Unexpected error reading the file!");
            e.printStackTrace();
        }
    }
}
