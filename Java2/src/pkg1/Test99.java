package pkg1;

public class Test99 {

	public static void main(String[] args) {
		String s1="PaiAvani";
		String s2="";
		String s3="";
		int len1=s1.length();
		for(int i=0;i<8;i++) {
			s2=s1.substring(len1-(i+1),len1-i);
			s3=s3+s2;
		}
			System.out.println(s3);

	}

}










