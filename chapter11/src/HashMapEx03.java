import java.util.*;

public class HashMapEx03 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("friend", "lee", "010-2222-3333");
        addPhoneNo("friend", "cho", "010-2345-8543");
        addPhoneNo("friend", "ka", "010-8675-3452");
        addPhoneNo("dong", "na", "010-2322-7564");
        addPhoneNo("dong", "da", "010-1467-1234");
        addPhoneNo("dong", "la", "010-7345-5233");
        addPhoneNo("dong", "lma", "010-2962-3123");
        addPhoneNo("dong", "wer", "010-8882-3777");
        addPhoneNo("dong", "bve", "010-3662-3113");

        printList();
    }

    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name);
    }

    static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName)) {
            phoneBook.put(groupName, new HashMap());
        }
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("etc", name, tel);
    }

    static void printList() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();

            Set subSet = ((HashMap) e.getValue()).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

            while (subIt.hasNext()) {
                Map.Entry subE = (Map.Entry) subIt.next();
                String telNo = (String) subE.getKey();
                String name = (String) subE.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    }
}
