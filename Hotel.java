
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hotel {

    Customer customer;
    Room room;
    private static Scanner sc;
    private static Scanner sc2;

    public static void addCustomer(String[] booking) throws NullPointerException {
        String option;
        booking = new String[10];
        do {
            
            Hotel hotel = new Hotel();
            Main.hotelqueue1=new HotelQueue1(7);
            hotel.customer = new Customer();
            Scanner sc = new Scanner(System.in);
            System.out.println("Customer name:");
            String name = sc.nextLine();
            hotel.customer.setCusName(name);
            Main.hotelqueue1.enqueue(name);
            Main.hotelqueue1.printNames();
            System.out.println("Room to be reserved(1-10):");
            int room = sc.nextInt();
            Validation.roomNumberValidation(room);
            hotel.room = new Room();
            hotel.room.setRoomNumber(room);
            booking[hotel.room.getRoomNumber() - 1] = hotel.customer.getCusName();
//  	System.out.println(Arrays.toString(booking));
            System.out.println("do you want to add another customer if needed press y or Y else n or N:");
            option = sc.next();
            writeTofile(booking);

        } while (option.equals("y") || option.equals("Y"));
        //Hotel.findCustomer(booking);
    }

    public static void findCustomer() throws NullPointerException {
        //System.out.println(Arrays.toString(booking));
        String[] arr = recordDetailstoArray();
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        System.out.println("Customer name:");
        Hotel hotel = new Hotel();
            hotel.customer = new Customer();
            hotel.room = new Room();
            
        String name1;
        try {
            name1 = br.readLine();
            hotel.customer.setCusName(name1);
            
            for (int i = 0; i < 10; i++) {
                hotel.room.setRoomNumber(i);
                if (arr[hotel.room.getRoomNumber()].equals(hotel.customer.getCusName())) {
                    System.out.println(name1 + " founded in" + i + "room");
                }

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//  	Hotel hotel=new Hotel();
//  	hotel.customer=new Customer();
//  	hotel.customer.setCusName(name1);e

    }

    public static void deleteCustomer() {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String[] arr = recordDetailstoArray();
        System.out.println("Enter customer room number to delete:");
        Hotel hotel = new Hotel();
            hotel.customer = new Customer();
            hotel.room = new Room();
            
            
        String name1;
        
        try {
            name1 = br.readLine();
            hotel.customer.setCusName(name1);
            
            for (int i = 0; i < 10; i++) {
                hotel.room.setRoomNumber(i);
                if (arr[hotel.room.getRoomNumber()].equalsIgnoreCase(hotel.customer.getCusName())) {
                    arr[hotel.room.getRoomNumber()] = "N/A";
                    System.out.println("customer record delete");
                } else {
                    System.out.println("customer record not available");
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//  	Hotel hotel=new Hotel();
//  	hotel.customer=new Customer();
//  	hotel.customer.setCusName(name1);
    }

    public static void viewRooms() {
        String[] arr = recordDetailstoArray();
        for (String str : arr) {
            System.out.println(str);
        }

    }

    public static void sortingAlphabeticalOrder() {
        String[] x = recordDetailstoArray();
        boolean isSorted = true;
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i].compareToIgnoreCase(x[i + 1]) > 0) {
                    String temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                    isSorted = true;
                }
            }
        }
        System.out.println("alphatical order customers name:");
        for (String str : x) {
            System.out.println(str);
        }
    }

    public static void writeTofile(String[] booking) {
        try {
            File file = new File("room.txt");
            FileWriter fil = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fil);
            Hotel hotel = new Hotel();
            hotel.customer = new Customer();
            hotel.room = new Room();
            try {
                for (int i = 0; i < booking.length; i++) {
                    hotel.customer.setCusName(booking[i]);
                    hotel.room.setRoomNumber(i);
                    bw.write(hotel.room.getRoomNumber() + "\t" + hotel.customer.getCusName());
                    bw.newLine();
                    bw.flush();
                }
            } catch (Exception ex) {

            }
        } catch (Exception ex) {

        }

    }

    public static String[] recordDetailstoArray() {

        String[] data1 = new String[10];
        String currentline = null;
        File file = new File("room.txt");
        FileReader re;
        BufferedReader br;
        try {
            re = new FileReader(file);
            br = new BufferedReader(re);
            String[] data = new String[4];

            int i = 0;
            while ((currentline = br.readLine()) != null) {
                data1[i++] = currentline;

            }

        } catch (Exception ex) {

        }
//    ArrayList<String> customer= (ArrayList<String>) Arrays.asList(data1);
        String[] arr = spilit(data1);
        return arr;
    }

    public static String[] spilit(String[] arr) {
        String arr1[] = new String[4];
        String arr2[] = new String[arr.length];
        String arr3[] = new String[arr.length];
//        String arr4[]=new String[arr.length];
//        String arr5[]=new String[arr.length];
        String currentLine;
        for (int i = 0; i < arr.length; i++) {
            currentLine = arr[i];
            arr1 = currentLine.split("\t");
            arr2[i] = arr1[0];
            arr3[i] = arr1[1];
//           arr4[i]=arr1[2];
//           arr5[i]=arr1[3];
        }
        return arr3;
    }
}
