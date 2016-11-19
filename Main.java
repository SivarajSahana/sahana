import java.util.Scanner;

public class Main {
	
	public static HotelQueue hotelqueue;
	public static String[] hotelBooking;
      public static HotelQueue1 hotelqueue1;
	
 public static void main(String[] args){
	 
	 System.out.println("+-------------------------------------+");
		System.out.println("|||||||||||||||||||||||||||||||||||||||");
		System.out.println("Welcome dsk hotel".toUpperCase());
		System.out.println("|||||||||||||||||||||||||||||||||||||||");
		System.out.println("+-------------------------------------+");
		System.out.println("press e or E to continue:");
		Scanner sc= new Scanner(System.in);
		char opt=sc.next().charAt(0);
                Validation.inputValidation(opt);
		do{
		    MainMenu.mainMenu();
		}while(opt=='e'||opt=='E');
	 for(String str:hotelBooking){
		 str="empty";
	 }
 }
}
