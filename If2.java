import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    System.out.println("Enter the student's grade (percentage): ");
    double mark = input.nextDouble();

    if (mark <= 100 && mark >= 80){
      System.out.println("Letter: A");
    }
    else if (mark < 80 && mark >= 70){
      System.out.println("Letter: B");
    }
    else if (mark < 70 && mark >= 60){
      System.out.println("Letter: C");
    }
    else if (mark < 60 && mark >= 50){
      System.out.println("Letter: D");
    }
    else if (mark < 50){
      System.out.println("Letter: F, you fail");
    }
    else {
      System.out.println("Invalid input");
    }


  }
}
