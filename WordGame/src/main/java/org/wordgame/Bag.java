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
        for (char c = 'a'; c <= 'z'; c++) {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'l' || c == 'n' || c == 's' || c == 't' || c == 'r')
                this.tiles.add(new Tile(c, 1));
            if(c == 'd' || c == 'g')
                this.tiles.add(new Tile(c, 2));
            if(c == 'b' || c == 'c' || c == 'm' || c == 'p')
                this.tiles.add(new Tile(c, 3));
            if(c == 'f' || c == 'h' || c == 'v' || c == 'w' || c == 'y')
                this.tiles.add(new Tile(c, 4));
            if(c == 'k')
                this.tiles.add(new Tile(c, 5));
            if(c == 'j' || c == 'x')
                this.tiles.add(new Tile(c, 8));
            if(c == 'q' || c == 'z')
                this.tiles.add(new Tile(c, 10));
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
