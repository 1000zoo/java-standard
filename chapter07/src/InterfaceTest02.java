interface Ia {
    public abstract void play();
}

class C {
    void autoPlay (Ia ia) {
        ia.play();
    }
}

class D implements Ia {
    public void play() {
        System.out.println("play in D class");
    }
}

class E implements Ia {
    public void play() {
        System.out.println("play in E class");
    }
}

public class InterfaceTest02 {
    public static void main(String[] args) {
        C c = new C();
        c.autoPlay(new D());
        c.autoPlay(new E());
    }
}
