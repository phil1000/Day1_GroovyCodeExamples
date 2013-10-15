print "This program prints out the prime number closest to the number entered by the user\r"

// We know 1, 2 and 3 and prime numbers and so they don't need to be calculated. The loop then starts from 4
// This is a bit lazy and doesn't work if the user enters 1 or 2 but hey ho

int potentialPrime=4
int i
int j

int primeNumberOut=3

print "Please enter a number - an Integer please \t"
String str = System.console().readLine()
int upperBound = Integer.parseInt(str)

while (potentialPrime <=upperBound) {

	i=2
	j=0
	while ( i < potentialPrime ) {
		if ( ( potentialPrime % i ) == 0 ) {
			// not a prime so break from loop
			j++;
			break; 
		}
		i++;
	}

	if (j==0) {
		// this is a prime so replace the current nearest/largest prime
		primeNumberOut = potentialPrime
	}

	potentialPrime++;
}

// we now have the prime number closest and smaller than the input number
println "The value of the closest primenumber smaller than input number is " + primeNumberOut

// now see what the value of the next prime number is and print out but only
// if it is closer in value to the input number

potentialPrime = upperBound+(upperBound-primeNumberOut);

i=2
j=0
while ( i < potentialPrime ) {
	if ( ( potentialPrime % i ) == 0 ) {
		// not a prime so break from loop
		j++;
		break; 
	}
	i++;
}

if (j==0) {
	// this is a prime so this must be the nearest prime
	primeNumberOut = potentialPrime
	println "The closest prime > than input number is " + primeNumberOut
} else {
	println "the next prime would be further away from input number so don't calculate"
}