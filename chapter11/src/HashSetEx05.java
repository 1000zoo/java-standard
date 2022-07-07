import java.util.*;

public class HashSetEx05 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("4");
        System.out.println("A = " + setA);
        setB.add("5");
        setB.add("7");
        System.out.println("B = " + setB);

        Iterator it = setB.iterator();
        while (it.hasNext()) {
            Object tmp = it.next();
            if (setA.contains(tmp)) {
                setKyo.add(tmp);
            }
        }

        it = setA.iterator();
        while (it.hasNext()) {
            Object tmp = it.next();
            if (!setB.contains(tmp)) {
                setCha.add(tmp);
            }
        }

        it = setB.iterator();
        while (it.hasNext()) {
            setHab.add(it.next());
        }

        System.out.println(setKyo);
        System.out.println(setHab);
        System.out.println(setCha);

    }
}
