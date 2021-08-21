'''for i in range(1,101):
    print("Fizz"*(i%3<1)+(i%5<1)*"Buzz" or i)'''
    
    
print(list("Fizz"*(i%3<1)+"Buzz"*(i%5<1) or i for i in range(1,100)))