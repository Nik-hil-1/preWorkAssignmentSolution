import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Service obj = new Service();
    Scanner sc = new Scanner(System.in);
    int choice = 0;
    do{
      System.out.println();
      System.out.println("Enter your choice!\n"+"1. Find palindrome number.\n"+"2. Print pattern for a given number.\n"+"3. Check whether number is prime or not.\n"+"4. Print fibonacci series.\n"+"-->Enter 0 to exit.\n");
      choice = sc.nextInt();
      System.out.println();
      switch(choice){
        case 0:
          choice = 0;
          break;
        
        case 1:
          obj.checkPalindrome();
          break;

        case 2:
          obj.starPattern();
          break;

        case 3:
          obj.checkPrime();
          break; 

        case 4:
          obj.printFibonacci();
          break;
     
        default:
          System.out.println("Invalid choice. Enter a valid number.\n");
      
      }
      
      
    }while(choice!=0);
    System.out.println("Exited Successfully!");
    sc.close();
    
   

  }
}