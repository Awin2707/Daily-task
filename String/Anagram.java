package String;
import java.util.ArrayList;
import java.util.List;

public class Anagram {
 
    //time complexity O(N^2) space complexity O(N)
    public static void main(String[] args) {
        String first_name = "listen";
        String second_name = "silent";
        if (first_name.length() != second_name.length()) {
            System.out.println("its not a valid anagram ");
        }
        char[] first_name_char = first_name.toLowerCase().toCharArray();
        char[] second_name_char = second_name.toLowerCase().toCharArray();
        System.out.println(first_name_char.toString() + "," + second_name_char.toString() + "," + first_name_char.length + "," + second_name_char.length);
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < first_name_char.length; i++) {
            list.add(first_name_char[i]);
        }
        System.out.println(list);
        for (Character character : second_name_char) {
            if (list.contains(Character.valueOf(character))) {
                list.remove(Character.valueOf(character));
            }
        }
        if (list.size() == 0) {
            System.out.println("it's anagram");
        }else{
            System.out.println("it's not a anagram");
        }
    }
}
