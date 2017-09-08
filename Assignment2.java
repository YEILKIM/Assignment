import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		String str, del, delch, rslt=null;
		
		System.out.print("Give me a sentence:");
		Scanner x =new Scanner(System.in);
		str = x.nextLine();
		
		System.out.print("Give me characters to delete:");
		Scanner y = new Scanner(System.in);
		del = y.nextLine();
		
		rslt=str;
		
		for(int i=0; i<del.length(); i++){
		 delch = ""+del.charAt(i);
		rslt = rslt.replace(delch,"");
		}
		
		System.out.println("Origin sentence:" + str);
		System.out.println("Modified sentence: "+rslt);
	}

}
