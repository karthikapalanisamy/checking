# checking
import java.util.Scanner;
public class Check {
public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	int value=input.nextInt();
	if(value>0){
		System.out.println("The value is positive");
	}
	else if(value<0){
		System.out.println("The value is negative");
	}
	else{
		System.out.println("The value is zero");
	}
}
}
