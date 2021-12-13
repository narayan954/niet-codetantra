fin = open('InputData2.txt' , 'r')
charCount = wordCount = lineCount = 0			#Initialize Counters
for line in fin:								#Read each Line
	wordlist=line.split()						#List of words formed
	lineCount+=1								
	wordCount+=len(wordlist)					#words counted successfully for this line
	charCount+=len(line)						#characters counted successfully for this line
	
print("Line count = ", lineCount)  #Print the Counts
print("Word count = ", wordCount)
print("Char count = ", charCount)
