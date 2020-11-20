import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String,ArrayList<String>> map = new HashMap<>();

    public void add(String word, String translation){

            map.putIfAbsent(word,new ArrayList<>());
            map.get(word).add(translation);

    }
    public ArrayList<String> translate(String word){
        if(map.containsKey(word)){
            return map.get(word);
        }
        return new ArrayList<String>();
    }
    public void remove(String word){
        map.remove(word);
    }
}
