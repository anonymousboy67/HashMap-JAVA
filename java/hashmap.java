import java.util.HashMap;
import java.util.Set;

public class hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Nepal",40);
        hm.put("india",100);
        hm.put("China",150);
        System.out.println(hm);
        int hello=hm.get("india");
        System.out.println(hello);
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for (String k:keys){
            System.out.println("key"+k+"value="+hm.get(k));
        }

    }
    
}
