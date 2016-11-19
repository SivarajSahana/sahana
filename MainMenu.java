import java.util.Scanner;


public class MainMenu {
   public static String[] hotel=new String[10];
   
   
   public static void mainMenu()
   {
 	
       System.out.println("+-------------------------------------------+");
       System.out.println("dsk hotel (pvt) limited".toUpperCase());
       System.out.println("a".toUpperCase()+":"+"add a customer".toLowerCase());
       System.out.println("v".toUpperCase()+":"+"view all rooms".toLowerCase());
       System.out.println("e".toUpperCase()+":"+"display empty room".toLowerCase());
       System.out.println("d".toUpperCase()+":"+"delete a customer".toLowerCase());
       System.out.println("f".toUpperCase()+":"+"find room from customer name".toLowerCase());
       System.out.println("o".toUpperCase()+":"+"View rooms ordered alphabetically by name".toLowerCase());
       System.out.println("q".toUpperCase()+":"+"view first three customer name".toLowerCase());
       System.out.println("+-------------------------------------------+"+"\n\n\n");
       System.out.println("Enter your option :");
        Scanner sc=new Scanner(System.in);
      String  option=sc.nextLine();
     Validation.inputValidation2(option);
      Option(option);
   }
   public static void Option(String opt){
	  Main.hotelBooking=new String[10];
          Main.hotelqueue1=new HotelQueue1();
 	  switch(opt){
       case "A":
       case "a":
     	  
          Hotel.addCustomer(Main.hotelBooking);
           break;
       case "V":
       case "v":
           Hotel.viewRooms();
           break;
       case "F":
       case "f":
           
    	   Hotel.findCustomer();
           break;
       case "D":
       case "d":
           
    	   Hotel.deleteCustomer();
           break;
       case "O":
       case "o":
     	  
    	   Hotel.sortingAlphabeticalOrder();
       case "E":
       case "e":
           System.exit(0);
           break;
       case "q":
       case "Q":
    	   Main.hotelqueue1.printNames();
     	    break;
       default:
           System.out.println("System exit");
        }
   }
   
   
   
   
}
