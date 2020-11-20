import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> map = new HashMap<>();


    public boolean add(LicensePlate licensePlate, String owner) {
        if (!map.containsKey(licensePlate)) {
            map.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        if(map.containsKey(licensePlate)){
            return map.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (map.containsKey(licensePlate)) {
            map.remove(licensePlate);
            return true;
        }
        return  false;
    }

    public void printLicensePlates(){
        for(LicensePlate lp :map.keySet()){
            System.out.println(lp.toString());
        }
    }
    public void printOwners(){
        ArrayList<String> unique = new ArrayList<>();
        for(String name: map.values()){
            if (!unique.contains(name)){
                System.out.println(name);
                unique.add(name);
            }
        }
    }
}
