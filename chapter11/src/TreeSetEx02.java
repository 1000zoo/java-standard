import java.util.*;

public class TreeSetEx02 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < score.length; i++) {
            set.add(new Integer(score[i]));
        }

        System.out.println("50 under : " + set.headSet(new Integer(50)));
        System.out.println("50 over : " + set.tailSet(new Integer(50)));
    }
}
