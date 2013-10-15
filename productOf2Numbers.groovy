print "This program takes two numbers and multiplies them together - but not using the * operator"
print "\nPlease enter the first number - an Integer please \t"
String str = System.console().readLine()
int firstNumber = Integer.parseInt(str)
print "Please enter the second number - an Integer please\t"
String str_2 = System.console().readLine()
int secondNumber = Integer.parseInt(str_2)

product = 0;
i=0;

while (i<secondNumber) {
	product=product + firstNumber;
	i++;
}

println firstNumber + " multiplied by " + secondNumber + " is " + product