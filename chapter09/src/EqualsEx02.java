class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return id == ((Person)obj).id;
        } else {
            return false;
        }
    }
    Person (long id) {
        this.id = id;
    }
}

public class EqualsEx02 {
    public static void main(String[] args) {
        Person p1 = new Person(99101010101L);
        Person p2 = new Person(99101010101L);

        if (p1 == p2) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }

        if (p1.equals(p2)) {
            System.out.println("p1 == p2");
        } else {
            System.out.println("p1 != p2");
        }
    }
}
