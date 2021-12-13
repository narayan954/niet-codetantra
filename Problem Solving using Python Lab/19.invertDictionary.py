keys=input('Enter elements separated by ,(comma) for keys: ').split(',')
values=input('Enter elements separated by ,(comma) for values: ').split(',')
mydict={keys[i]:values[i] for i in range(len(keys))}
newdict={values[i]:keys[i] for i in range(len(values))}
print('Dict : ',mydict)
print('Inverted Dict :',newdict)
