
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Validation {
    String input;
    
    public static void inputValidation(char opt){
        Scanner sc=new Scanner(System.in);
        if(!(opt=='e'|| opt=='E')){
            System.err.println("Please enter valid option");
            sc.next();
        }
        
    }
    public static void roomNumberValidation(int number){
        Scanner sc=new Scanner(System.in);
        if(!(number>0||number<10)){
            System.err.println("Please enter valid option");
            sc.next();
        }
    }
    public static void inputValidation2(String opt){
        Scanner sc=new Scanner(System.in);
        if(!(opt.equalsIgnoreCase("v")|| opt.equalsIgnoreCase("V")||opt.equalsIgnoreCase("a")
                || opt.equalsIgnoreCase("A")|| opt.equalsIgnoreCase("d")|| opt.equalsIgnoreCase("D")
                ||opt.equalsIgnoreCase("f")|| opt.equalsIgnoreCase("F")||opt.equalsIgnoreCase("e"))
                ||opt.equalsIgnoreCase("E")||opt.equalsIgnoreCase("q")||opt.equalsIgnoreCase("Q")){
            System.err.println("Please enter valid option");
            sc.next();
        }
        
    }
    
    
    
    
    
    
}
