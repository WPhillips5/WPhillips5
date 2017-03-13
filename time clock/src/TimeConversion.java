import java.util.Scanner;

public class TimeConversion {
public static void main (String [] args){
	Scanner kb = new Scanner (System.in);
	System.out.println("Enter time in 24 hour format");
	int oldtime = kb.nextInt();
	if (oldtime < 13)
		System.out.println(oldtime + "am");
	else {
		int newtime = oldtime - 12;
		System.out.println(newtime + "pm");
	}
}
}
