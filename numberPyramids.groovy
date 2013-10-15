print "This program outputs a number pyramid with a number of rows, and the number of digits in each row, equal to the number input by end user"
print "\nPlease enter the number of rows required - an Integer please \t"

String str = System.console().readLine()
int numRows = Integer.parseInt(str)
int i=1
int j=0

while (i<=numRows) {
	
	str = i;
	j=2;
	while (j<=i) {
		str = str + i;
		j++;
	}
	println str;
	i++;
}