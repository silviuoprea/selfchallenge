package org.wordgame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bag {
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    private final Collection<Tile> tiles = new ArrayList<>();
    public Bag() {
        for (char c = 'a'; c < 'z'; c++) {
            this.tiles.add(new Tile(c, getRandomNumber(1, 10)));
        }
    }
    public synchronized List<Tile> extractTiles(int howMany) {
        List<Tile> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (tiles.isEmpty()) {
                break;
            }
            extracted.add(null);
        }
        return extracted;
    }

}
