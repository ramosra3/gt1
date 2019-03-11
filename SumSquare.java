public class SumSquare
{
  public static void main(String [] args)
  {
    int count = 3;
    int square = 0;
    int newSquare = 0;
    while (count <= 33)
    {
      square = (int)Math.pow(count, 2);
      newSquare += square;
      System.out.println("Cumulation result: " + newSquare + ":" + count + "*" + count);
      count += 3;
    }
   System.out.print("The SUM of squares of multiples of 3 is " + newSquare);
  }
}

