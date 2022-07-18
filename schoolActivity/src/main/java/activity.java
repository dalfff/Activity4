import java.util.Scanner;

public class activity {
    public static void main (String []args){
    
    Scanner sc = new Scanner(System.in);
    
        System.out.println("First name : ");
        String fname = sc.nextLine();
        
        System.out.println("Last name : ");
        String lname = sc.nextLine();
        
        System.out.println("Address : ");
        String add = sc.nextLine();

        System.out.println("");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Name : " + fname + lname);
        System.out.println("Address : " + add);
        
    
    }
    
}
