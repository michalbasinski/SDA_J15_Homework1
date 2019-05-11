package pl.sda.ex3;

import java.util.Map;

public class LatinToMorseTranslator implements Translator {

    private Map<String, String> dictionary;

    LatinToMorseTranslator(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String translate(String word) {
        return null;
    }
}
