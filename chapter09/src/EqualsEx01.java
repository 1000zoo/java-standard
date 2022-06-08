public class EqualsEx01 {
    public static void main(String[] args) {
        Value01 v1 = new Value01(10);
        Value01 v2 = new Value01(10);

        if (v1.equals(v2)) {
            System.out.println("v1 == v2");
        } else {
            System.out.println("v1 != v2");
        }

        v2 = v1;

        if (v1.equals(v2)) {
            System.out.println("v1 == v2");
        } else {
            System.out.println("v1 != v2");
        }
    }
}

class Value01 {
    int value;

    Value01(int value) {
        this.value = value;
    }
}
