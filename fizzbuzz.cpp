#include <stdio.h>
 
int main(void)
{
    for (int i=1; i<=100; i++)
        printf(i%15==0?"FizzBuzz\t": i%3==0? "Fizz\t" : i%5==0? "Buzz\t" : "%d\t", i);
        
    return 0;
}