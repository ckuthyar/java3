package pkg1;
import java.math.BigDecimal;
public class K7 {

	public static void main(String[] args) {
		BigDecimal num1=new BigDecimal("10000100000000000000");
		BigDecimal num2=new BigDecimal("10000000000000000000");
		BigDecimal num3=num1.divide(num2);
		System.out.println(num3);
	}
}
