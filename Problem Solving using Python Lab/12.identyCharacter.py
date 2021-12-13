ch=input(('Enter any alphabet or digit '))
if ch in 'aeiouAEIOU':
	print(ch,'is a vowel.')
elif ch in '0123456789':
	print(ch,'is a digit.')
else:
	print(ch,'is a consonant.')
