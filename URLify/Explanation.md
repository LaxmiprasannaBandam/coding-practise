Convert the string into a character array. In Java, strings are immutable, so we need an array to modify it in place.
Count the number of spaces in the true part of the string. Each space ' ' will eventually take up 3 characters (%20), so for every space, we need 2 extra slots.
Calculate the final index where the last character of the transformed string will go:
index = trueLength + (spaceCount * 2) - 1
Traverse the array from the end of the true length to the start.
If you see a space, replace the current index and the two previous indices with '%', '2', '0'.
If you see a normal character, just move it to the current index.
Move the index backwards as you fill characters.
Convert the first trueLength + spaceCount * 2 characters back into a string. That’s your final URLified string.
