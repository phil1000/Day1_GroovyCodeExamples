print "This program takes a sequence of numbers and then outputs the highest number entered. The sequence is ended by the user entering -1"
print "\nPlease enter the first number - an Integer please \t"
String str = System.console().readLine()
int j = Integer.parseInt(str)

int max=j
int count=0

while (j!= -1) {

	count++;
	print "\nPlease enter another Integer please \t"
	str = System.console().readLine()
	j = Integer.parseInt(str)
	if (j>max) {
		max = j;
	}
}

println "\nThe max number is " + max + " and the number of items was " + count