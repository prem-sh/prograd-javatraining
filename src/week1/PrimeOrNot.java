package week1;
import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
	   Scanner input = new Scanner (System.in);
       System.out.print ("Enter an Integer : ");
       int number = input.nextInt ();
       boolean flag = false;
       if(number == 1) flag = true;
       for(int i=2; i <= number/2; i++){
           if(number % i == 0){
               flag = true;
               break;
           }
       }
       if(flag){
            System.out.println(number +" is Not a Prime number");   
       }else {
           System.out.println(number +" is Prime number"); 
       }
	}
}
