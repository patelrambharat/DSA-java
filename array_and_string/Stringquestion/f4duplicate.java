import java.util.ArrayList;
import java.util.HashMap;

public class f4duplicate {
    public static void main(String[] args) {
        String str= "programming";

        HashMap<Character , Integer>mp = new HashMap<>();
        ArrayList<Character>al = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char ch  = str.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch) +1);
            }
            else{
                mp.put(ch,1);
            }
        }
        mp.forEach((k, v) -> 
            {
                if(v > 1){
                   al.add(k);
                   
                }
            }
        
        );
        System.out.println(al);  
    }
}
