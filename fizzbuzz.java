class fizzBuzz
{
public static void main(String args[]) {
  int start = 0 , end =100 ;
  for(int i=start; i<=end; i++)
    System.out.println(i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i);
}
}