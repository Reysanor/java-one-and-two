import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StorageFacility {
    HashMap<String,ArrayList<String>> map = new HashMap<>();

    public void add(String unit, String item){
        map.putIfAbsent(unit,new ArrayList<>());
        map.get(unit).add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        if (map.containsKey(storageUnit)) {
            return map.get(storageUnit);
        }
        return new ArrayList<>();
    }
    public void remove(String storageUnit, String item){
        if(map.containsKey(storageUnit)){
            map.get(storageUnit).remove(item);
        }
        if(map.get(storageUnit).size()==0){
            map.remove(storageUnit);
        }
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String,ArrayList<String>> s: map.entrySet()){
            if(s.getValue().size()!=0) list.add(s.getKey());
        }
        return list;
    }
}
