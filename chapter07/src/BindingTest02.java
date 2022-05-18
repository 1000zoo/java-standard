public class BindingTest02 {
    public static void main(String[] args) {
        Super sup = new Sub_();
        Sub_ sub = new Sub_();

        System.out.println("sup.x = " + sup.x);
        sup.method();

        System.out.println("sub.x = " + sub.x);
        sub.method();
    }
}

class Sub_ extends Super {}