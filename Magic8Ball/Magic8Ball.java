
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    
    public static void main(String[] args) {

        String test = ("Hi, welcome to my Magic8Ball program.  You may enter your question below \n"  );
        System.out.println();

        for (int i = 0; i < test.length(); i++) {
            System.out.print(test.charAt(i));
            try {
                Thread.sleep(100L);    
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        
         System.out.println(" Question: ");
        Scanner scan = new Scanner(System.in);
        scan.next();
        scan.close(); 
        

        Random rand = new Random();

        int r = rand.nextInt(5);

        if (r == 1) {
            System.out.println("Yes, it is");
        }

        else if(r == 2){
            System.out.println("Maybe, not very sure");
        }

        else if(r == 3) {
            System.out.println("nope");
        }

        else if( r == 4) {
            System.out.println("hell na bra");
        }
    }
    
}
