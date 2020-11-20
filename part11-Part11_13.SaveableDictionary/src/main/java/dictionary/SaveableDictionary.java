package dictionary;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;

public class SaveableDictionary {
    private Map<String, String> map = new HashMap<>();
    private String path;

    public SaveableDictionary() {
    }

    public SaveableDictionary(String file) {
        this.path = file;
    }

    public void add(String words, String translation) {
        map.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        String translated = map.getOrDefault(word, null);
        if (translated == null) {
            translated = map.entrySet().stream()
                    .filter(s -> s.getValue()
                            .equals(word)).findAny()
                    .map(s -> s.getKey())
                    .orElse(null);
        }
        return translated;
    }

    public void delete(String word) {
        if (map.remove(word) == null) {
            map.values().removeIf(s -> s.contains(word));
        }
    }

    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(path))) {

            // we read all the lines of the file
            while (scanner.hasNextLine()) {
                String[] temp = scanner.nextLine().split(":");
                add(temp[0], temp[1]);

            }
            scanner.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public boolean save() {
        PrintWriter writer = null;
        List<String> used = new ArrayList<>();
        try {
            writer = new PrintWriter(path);
            PrintWriter finalWriter = writer;
            map.keySet().stream().forEach(s -> {
                if (!used.contains(s)) {
                    used.add(s);
                    used.add(map.get(s));
                    finalWriter.println(s + ":" + map.get(s));
                }


            });
            writer.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }

    }
}
