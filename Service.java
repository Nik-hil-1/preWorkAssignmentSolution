import java.util.Scanner;

public class Service{
  Scanner sc = new Scanner(System.in);  

  public void checkPalindrome(){
    System.out.println("Enter the number!");
    int number = sc.nextInt();
    int a = number;
    int reverse = 0;
    while(a!=0){
      int remainder = a%10;
      reverse = reverse*10 + remainder;
      a = a/10;
    }
    if(reverse == number){
      System.out.println("It is a palindrome");
    }
    else{
      System.out.println("It is not a palindrome");
    }
  }

  public void starPattern(){
    System.out.println("Enter the length of star");
    int n = sc.nextInt();
    for(int i=n; i>0; i--){
      for(int j=0; j<i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void checkPrime(){
    System.out.println("Enter the number!");
    int a = sc.nextInt();
    boolean check = false;
    for(int i=2; i<=a/2; i++){
      if(a%i == 0){
        check = true;
        break;
      }
    }
    if(!check)
      System.out.println("Prime Number");
    else
      System.out.println("Non-Prime Number");
  }

  public void printFibonacci(){
    System.out.println("Enter the number for fibonacci series!");
    int fib = sc.nextInt();
    int a = 0, b = 1;
    int sum = 0;
    for(int i=0; i<fib; i++){
      System.out.print(a+" ");
      sum = a + b;
      a = b;
      b = sum;
    }
  }


}