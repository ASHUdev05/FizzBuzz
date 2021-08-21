var start = 0 , end =100 ;
  for(let i=start; i<=end; i++)
    console.log(i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i);