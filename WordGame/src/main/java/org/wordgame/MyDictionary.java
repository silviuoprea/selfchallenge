package org.wordgame;

import java.util.ArrayList;
import java.util.List;

public class MyDictionary {
    List<String> dictionary = new ArrayList<>();

    public MyDictionary() {
    }

    public List<String> getDictionary() {
        return dictionary;
    }

    public void addWord(String word) {
        this.dictionary.add(word);
    }

    public boolean isWord(String str) {
        return dictionary.contains(str);
    }
}
