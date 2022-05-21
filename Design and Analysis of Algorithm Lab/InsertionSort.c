#include<stdio.h>
#include<conio.h>
void main()
{
int n,i,j,key;
int arr[10];
printf("Enter size of the array: ");
scanf("%d",&n);
printf("Enter %d elements in to the array: ",n);
for(i=0;i<n;i++)
{
scanf("%d",&arr[i]);
}
for(i=1;i<n;i++)
{
key=arr[i];
j=i-1;
while(j>=0 && arr[j]>key)
{
arr[j+1]=arr[j];
j=j-1;
}
arr[j+1]=key;
}
printf("After sorting the elements are:");
for(i=0;i<n;i++)
{
printf(" %d",arr[i]);
}
}
