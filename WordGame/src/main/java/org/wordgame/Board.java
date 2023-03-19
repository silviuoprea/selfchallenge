package org.wordgame;

import java.util.ArrayList;
import java.util.Collection;

public class Board {
    private final Collection<String> words = new ArrayList<>();
    public void addWord(Player player, String word) {
        words.add(word);
        System.out.println(player.getName() + ": " + word);
    }
    @Override
    public String toString() {
        return words.toString();
    }

}
