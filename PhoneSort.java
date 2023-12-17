import java.util.*;

public class PhoneSort {

    public Map<String, TreeSet<String>> sortPhones(Map<String, TreeSet<String>> phoneBook) {

        List<String> keys = new ArrayList<>();

        for (Map.Entry item : phoneBook.entrySet()) {
            keys.add((String) item.getKey());
        }

        boolean b = false;
        while (!b) {
            b = true;
            for (int i = 1; i < phoneBook.size(); i++) {
                if(phoneBook.get(keys.get(i - 1)).size() > phoneBook.get(keys.get(i)).size()){
                    b = false;
                    String temp = keys.get(i - 1);
                    keys.set(i - 1, keys.get(i));
                    keys.set(i, temp);
                }
            }
        }

        Map<String, TreeSet<String>> sortedMap = new HashMap<>();

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            sortedMap.put(key, phoneBook.get(key));
        }

        return sortedMap;
    }
}
