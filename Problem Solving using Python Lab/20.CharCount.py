string=input('Please enter sentence: ')
freq=list(string)
freq.sort()
empty_list=[]
for i in range(0,len(freq)):
	count=string.count(freq[i])
	if freq[i] not in empty_list:
		empty_list.append(freq[i])
		print(f"'{freq[i]}'\t{count}")
print(empty_list)

