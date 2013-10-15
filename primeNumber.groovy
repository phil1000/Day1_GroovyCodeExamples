print "This program takes a number you input and responds with whether it is a prime number\r"
print "Please enter a number - an Integer please"
String str = System.console().readLine()
int potentialPrime = Integer.parseInt(str)

int i=2
int j=1
while ( i < potentialPrime ) {
	if ( ( potentialPrime % i ) == 0 ) {
		println "\rYour number is NOT a prime number as it is divisible by "
		println i;
		j++;
		break; 
	}
	i++;
}

if (j==1) {
	println "\rYour number was a prime number"
}