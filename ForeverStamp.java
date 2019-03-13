import java.util.Scanner;

public class ForeverStamp
{
  public static void main(String [] args)
  {
    Scanner input = new Scanner(System.in);
    double weight = 0;
    
    while (weight != -1)
    {
      System.out.println("Enter a weight in ounces for a letter to mail out. " 
                         + "\nWhen you are done entering weights, please enter -1 to finish: ");
      weight = input.nextDouble();
      
      if (weight > 0 && weight <= 1.0)
        System.out.println("You can use forever stamp. \n");
      else if (weight > 1.0)
        System.out.println("You need additional postage. \n");
      else if (weight < 0 && weight != -1)
      {
        System.out.println("Please enter a valid weight. \n");
        System.exit(1);
      }
    }
    
    System.out.println("Good bye!");
  }
}
