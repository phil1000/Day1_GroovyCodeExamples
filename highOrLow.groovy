print "This program takes a sequence of numbers and will output 'Yes' if consecutive increasing or decreasing, otherwise 'No'. The sequence is ended by the user entering -1"
print "\nPlease enter the first number - an Integer please \t"
String str = System.console().readLine()
int j = Integer.parseInt(str)

int current=j
String yesNo="Yes"

while (j!= -1) {

	print "\nPlease enter another Integer please \t"
	str = System.console().readLine()
	j = Integer.parseInt(str)

	if ((j==current+1) || (j==current-1) || (j==-1)) {
		current = j;
	}
	else { 
		yesNo="No";
		break;
	}
}

println "\nThe answer is " + yesNo