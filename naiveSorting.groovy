print "This program sorts 3 numbers and prints them in order from high to low"
print "\nPlease enter the first number - an Integer please \t"
String str = System.console().readLine()
int firstNumber = Integer.parseInt(str)
print "Please enter the second number - an Integer please\t"
String str_2 = System.console().readLine()
int secondNumber = Integer.parseInt(str_2)
print "Please enter the third number - an Integer please\t"
String str_3 = System.console().readLine()
int thirdNumber = Integer.parseInt(str_3)

int high=0;
int mid=0;
int low=0;

if ( firstNumber > secondNumber ) {
	if (firstNumber > thirdNumber) {
		high=firstNumber;
		if ( secondNumber > thirdNumber) {
			mid=secondNumber;
			low=thirdNumber;
		}
		else {
			mid=thirdNumber;
			low=secondNumber;
		}
	}
	else {
		high=thirdNumber;
		mid=firstNumber;
		low=secondNumber;
	}
}
else {
	if (secondNumber > thirdNumber) {
		high=secondNumber;
		if ( firstNumber > thirdNumber) {
			mid=firstNumber;
			low=thirdNumber;
		}
		else {
			mid=thirdNumber;
			low=firstNumber;
		}
	}
	else {
		high=thirdNumber;
		mid=secondNumber;
		low=firstNumber;
	}
}

println "\nThe numbers in descending order are " + high + " then " + mid + " then " + low;