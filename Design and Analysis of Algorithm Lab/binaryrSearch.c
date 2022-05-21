#include<stdio.h>
void main()
{
int key ,size,i;
int list[30];
printf("Enter number of elements: ");
scanf("%d",&size);
printf("Enter the sorted array: ");
for(i=0;i<size;i++)
{
scanf("%d",&list[i]);
}
printf("enter the item to be search: ");
scanf("%d",&key);
binary_search(list, 0 ,size,key);
}
void binary_search(int list[], int lo, int hi,int key )
{
int mid;
if(lo>hi)
{
printf("item not present");
return;
}
mid=(lo+hi)/2;
if(list[mid]==key)
{
printf("item present\n");
}
else if(list[mid]>key)
{
binary_search(list,lo,mid-1,key);
}
else 
{
binary_search(list,mid+1,hi,key);
}
}
