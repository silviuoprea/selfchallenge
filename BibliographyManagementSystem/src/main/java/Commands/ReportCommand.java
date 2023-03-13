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
    public void generateReport(Catalog catalog) throws IOException {
        VelocityEngine velocityEngine = new VelocityEngine();
        VelocityContext context = new VelocityContext();
        ArrayList<Object> list = new ArrayList<>();
        StringWriter writer = new StringWriter();
        ObjectMapper objectMapper = new ObjectMapper();
        Desktop desktop = Desktop.getDesktop();
        String resPath = "BibliographyManagementSystem\\src\\main\\resources\\";
        velocityEngine.init();

        Template t = velocityEngine.getTemplate(resPath + "index.vm");
        for(Item item:catalog.getItems())
        {
            list.add(new HashMap<String, String>(){{put("title", item.getTitle());put("location", item.getLocation());}});
        }
        for(Object item : list)
            System.out.println(item);
        context.put("totalBooks", list);
        t.merge( context, writer );
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(resPath + "report.html"), writer.toString());
        File newFile = new File(resPath + "report.html");
        desktop.open(newFile);
    }
}
