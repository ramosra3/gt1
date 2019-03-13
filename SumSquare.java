public class SumSquare
{
  public static void main(String [] args)
  {
    int num = 3;
    int square = 0;
    int sumSquare = 0;
    while (num <= 33)
    {
      square = (int)Math.pow(num, 2);
      sumSquare += square;
      System.out.printf("%-10s%-10d%-5s%3d%4s%5d\n", "Cumulation result: ", sumSquare, ":", 
                        num, "*", num);
      num += 3;
    }
   System.out.print("The sum of squares of multiples of 3 is " + sumSquare);
  }
}

