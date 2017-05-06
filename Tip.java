/*
Natashia Copple Lab #2 - P5.10 
 */
package tip;
import java.util.*;

public class Tip {

    public static void main(String[] args) {
        // create obejct to get user in put
        Scanner in = new Scanner(System.in);
        //create variables
        int satisfaction = 0;
        double total, tip;
        //prompt user for check total
        System.out.print("Please enter your check total: ");
        //store input in variable
        total = in.nextDouble();
        //prompt user for staisfaction level
        System.out.print("On a scale from 1 - 3, with 1 being total satisfied.\nHow satisfied are you?: ");
        //save to variable
        satisfaction = in.nextInt();
        //if statements to generate correct tip
        if(satisfaction == 1){
        tip = (total * 1.2) - total;
        System.out.format("Satisfaction level: %d \nTip: %.2f\n", satisfaction, tip);
    }
        if(satisfaction == 2){
        tip = (total * 1.15) - total;
        System.out.format("Satisfact: %d \nTip: %.2f\n", satisfaction, tip);
    }
        if(satisfaction == 3){
        tip = (total * 1.1) - total;
        System.out.format("Satisfact: %d \nTip: %.2f\n", satisfaction, tip);
    }
   
}
