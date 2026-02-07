package String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String name = "Swiss";
        NoRepeatingString(name);
    }

    public static void NoRepeatingString(String name){
        char[] setName = name.toLowerCase().toCharArray();
        HashMap<Character, Integer> map =  new HashMap<>();
        for (int i = 0; i < setName.length; i++) {
            map.put(setName[i], map.getOrDefault(setName[i], 0) + 1);
        }
        for(Map.Entry<Character, Integer> maps: map.entrySet()){
            if (maps.getValue() == 1) {
                System.out.println(maps.getKey());
                break;
            }
        }
    }
}
