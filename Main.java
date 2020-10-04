import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   // create a scanner for user input
Scanner input = new Scanner(System.in);    
  // ask the user for 3 integers
 System.out.println("Please enter 3 numbers");
  int int1 = input.nextInt();
  int int2 = input.nextInt();
 int int3 = input.nextInt();
  
  if(int1 > int2 && int1 > int3){
   System.out.println("Your maximum is " + int1);
 }else if(int2 > int1 && int2 > int3){
   System.out.println("Your maximum is " + int2);
 }else if(int3 > int1 && int3 > int2){
   System.out.println("Your maximum is " + int3);
 }
  }
}

