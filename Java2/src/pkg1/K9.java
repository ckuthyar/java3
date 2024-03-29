package pkg1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class K9 {

	public static void main(String[] args) throws IOException {
		String[] arr1=new String[4];
		String s1="";
		String msg1="Dear ";
		String msg2=", You have been alloted ";
		String msg3=". Please board the bus at ";
		String msg4=" near ";
		File f1=new File("users.txt");
		Scanner sc1=new Scanner(f1);
		
		s1=sc1.nextLine();
		arr1=s1.split(",");
		System.out.println(msg1+arr1[0]+msg2+arr1[1]+msg3+arr1[2]+msg4+arr1[3]);
		
		s1=sc1.nextLine();
		arr1=s1.split(",");
		System.out.println(msg1+arr1[0]+msg2+arr1[1]+msg3+arr1[2]+msg4+arr1[3]);


	}

}
