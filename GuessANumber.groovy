print "This program generates a random number between 0 and 1000 and asks you to guess it. It then tells you how many guesses you have had"

int numberToGuess = Math.abs(1000 * Math.random())
int guessCount = 0
int guessCorrect = 0
int guess
String str

while ( guessCorrect == 0 ) {

	print "\nTell me a number - an Integer please \t"
	str = System.console().readLine()
	guess = Integer.parseInt(str)
	guessCount++
	
	if ( guess == numberToGuess ) {
		println "Congratulations, you've guessed correctly in " + guessCount + " guesses"
		guessCorrect=1;
		break
	}
	else {
		if ( guess < numberToGuess ) {
			println "Too low, guess again"
		}
		else {
			println "Too high, guess again"
		}
	}

}

println "the number was " + numberToGuess