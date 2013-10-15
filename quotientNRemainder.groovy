print "This program takes two numbers and calculates the quotient and remainder but not using the / or % operators"
print "\nPlease enter the first number - an Integer please \t"
String str = System.console().readLine()
int firstNumber = Integer.parseInt(str)
print "Please enter the second number - an Integer please\t"
String str_2 = System.console().readLine()
int secondNumber = Integer.parseInt(str_2)

quotient=0;

runningTotal=firstNumber;

while (runningTotal>=secondNumber) {
	runningTotal = runningTotal - secondNumber;
	quotient++;
}

println "The quotient for " + firstNumber + " divided by " + secondNumber + " is " + quotient

if ( runningTotal == 0 ) {
	println "\nThese numbers divide exactly"
}
else {
	println "\nThe remainder is " + runningTotal;
}