public class InterfaceTest03 {
    public static void main(String[] args) {
        F f = new F();
        f.methodF();
    }
}

interface Ib {
    public abstract void methodG();
}

class F {
    void methodF() {
        Ib ib = InstanceManager.getInstance();
        ib.methodG();
        System.out.println(ib.toString());
    }
}

class G implements Ib {
    public void methodG() {
        System.out.println("methodG in G class");
    }
    public String toString() {
        return "class G";
    }
}

class InstanceManager {
    public static Ib getInstance() {
        return new G();
    }
}