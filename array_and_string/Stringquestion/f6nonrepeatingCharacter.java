import java.io.IOException; import java.util.ArrayList; import java.util.HashMap; import java.util.HashSet; import java.util.LinkedHashMap; import java.util.List; import java.util.Map; import java.util.Map.Entry; import java.util.Set;

// Read more: https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz7qaLti64w
public class f6nonrepeatingCharacter {
    public static void main(String[] args) {
        String str = "character";

        Map<Character, Integer> mp  = new LinkedHashMap<>();
        for(int i=0;i<str.length() -1;i++){
            char ch =str.charAt(i);
           if(mp.containsKey(ch)){
            mp.put(ch, mp.get(ch) +1);
           }
           else{
            mp.put(ch, 1);
           }
        }
        for (Entry<Character,Integer> entry : mp.entrySet()) { 
            if (entry.getValue() == 1) { 
                System.out.println(entry.getKey())
            break; } }

        // Read more: https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html#ixzz7qaLln8m1

    }
}
