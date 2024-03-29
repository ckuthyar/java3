package pkg1;
import java.math.BigDecimal;
public class K6 {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("10000100000000000000");
		BigDecimal b = new BigDecimal("10000000000000000000");
		BigDecimal c = a.divide(b);
		System.out.println(c);
	}
}
