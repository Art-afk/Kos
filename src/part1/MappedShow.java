import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class MappedShow {
    public static void main(String[] args) {
        HashMap<Integer, String > passportsAndNames = new HashMap<>();
        HashMap<Integer, String > passportsAndNames2 = new HashMap<>();


        passportsAndNames.put(12345,"КАА");
        passportsAndNames.put(54321,"ШВА1");
        passportsAndNames.put(54322,"ШВА2");
        passportsAndNames.put(54323,"ШВА3");
        passportsAndNames.put(54324,"ШВА4");
        passportsAndNames.put(54325,"ШВА5");
passportsAndNames.remove(54321);
//passportsAndNames2.putAll(passportsAndNames);

        System.out.println(passportsAndNames.containsKey(54322));
        System.out.println(passportsAndNames.containsValue("ШВА6"));

        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println(keys);

        ArrayList<String > val = new ArrayList<>(passportsAndNames.values());
        System.out.println("val: " + val);

        System.out.println(passportsAndNames.size());
      passportsAndNames2.putAll(passportsAndNames);

        passportsAndNames.clear();
        System.out.println(passportsAndNames);

        if (!passportsAndNames.isEmpty()){
            System.out.println("1 не пустой");
            System.out.println(passportsAndNames);

        }else System.out.println("1 пустой");

        if (!passportsAndNames2.isEmpty()){
            System.out.println("2 не пустой");
            System.out.println(passportsAndNames2);

        }else System.out.println("2 пустой");

        System.out.println("----------------------------------");



        for (Map.Entry entry: passportsAndNames2.entrySet()
             ) {
            System.out.println(entry);
        }


    }
}
