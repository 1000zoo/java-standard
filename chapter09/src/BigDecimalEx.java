import java.math.*;
import static java.math.BigDecimal.*;
import static java.math.RoundingMode.*;

public class BigDecimalEx {
    public static void main(String[] args) throws Exception {
        BigDecimal bd1 = new BigDecimal("123.456");
        BigDecimal bd2 = new BigDecimal("1.0");

        System.out.println(bd1);
        System.out.println(bd1.unscaledValue());
        System.out.println(bd1.scale());
        System.out.println(bd1.precision());
        System.out.println();
        System.out.println(bd2);
        System.out.println(bd2.unscaledValue());
        System.out.println(bd2.scale());
        System.out.println(bd2.precision());
        System.out.println();

        BigDecimal bd3 = bd1.multiply(bd2);
        System.out.println(bd3);
        System.out.println(bd3.unscaledValue());
        System.out.println(bd3.scale());
        System.out.println(bd3.precision());
        System.out.println();
    }
}
