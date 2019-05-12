package pl.sda.ex3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class FileLatinMorseReader {

    private static final String CHARACTER_SEMICOLON = ":";
    private final String DICTIONARY_FILE_NAME = "dictionary.txt";

    Map<String, String> getDictionary() {

        Map<String, String> result = new HashMap<>();

        String path = this.getClass().getClassLoader().getResource(DICTIONARY_FILE_NAME).getPath();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(CHARACTER_SEMICOLON);
                result.put(tokens[0], tokens[1]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }

}
