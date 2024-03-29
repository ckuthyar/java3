package pkg1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class K10 {

	public static void main(String[] args) throws IOException {
		File f1=new File("elections1.txt");
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		String[] arr1=new String[2];
		Scanner sc1=new Scanner(f1);
		String s1;
		while (sc1.hasNext()) {
			s1=sc1.nextLine();
			arr1=s1.split(":");
			list1.add(arr1[0]);
			list2.add(arr1[1]);
			//System.out.println(s1);
		}
		System.out.println(list1);
		System.out.println(list2);

	}

}
