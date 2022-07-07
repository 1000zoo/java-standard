import java.util.*;

public class HashMapEx01 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id, password");
            System.out.println("id : ");
            String id = s.nextLine().trim();

            System.out.println("password");
            String password = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("invalid id");
                continue;
            }
            if (!(map.get(id)).equals(password)) {
                System.out.println("wrong password");
                continue;
            } else {
                System.out.println("login");
                break;
            }
        }
    }
}
