import java.util.*;

public class HashMapEx02 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("kim", new Integer(100));
        map.put("lee", new Integer(100));
        map.put("cho", new Integer(80));
        map.put("ka", new Integer(90));

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("name: " + e.getKey() + ", grade : " + e.getValue());
        }
        set = map.keySet();
        System.out.println(set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            Integer i = (Integer) it.next();
            total += i.intValue();
        }

        System.out.println("total " + total);
        System.out.println("average " + (float) total / set.size());
        System.out.println("high " + Collections.max(values));
        System.out.println("low " + Collections.min(values));

    }
}
