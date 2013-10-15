print "This program prints out the first 1000 prime numbers\r"

// We know 1, 2 and 3 and prime numbers and so they don't need to be calculated. The loop then starts from 4
// as we are printing a 1000 numbers, we might need to split output across 1000 lines - check on Monday

int potentialPrime=4
int primeNumberCount=3
int i
int j

String primeNumberOut = "1, 2, 3, "

while (primeNumberCount <=1000) {

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
		// this is a prime so concatenate it to the output string
		primeNumberOut = primeNumberOut + potentialPrime + ", "
		primeNumberCount++
	}

	potentialPrime++;
}

// now print all the prime numbers in a single string 
// - could have done them on seperate lines and will do for next exercise which is to print 1000 prime numbers

println primeNumberOut
// need to subtract one from prime number count as the count is incremented by 1 AFTER the 1000th prime number
// has been derived
primeNumberCount=primeNumberCount-1

println "The number of prime numbers was " + primeNumberCount