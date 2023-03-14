package Objects;

import java.io.Serializable;
import java.util.*;

public class Item implements Serializable {
    private String id, title, location;
    private final Map<String, Object> tags = new HashMap<>();

    public Item() {
    }

    public Item(String id, String title, String location) {
        this.id = id;
        this.title = title;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public Map<String, Object> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "\"" + title + "\"" +
                " : \"" + location + "\"";
    }
}
