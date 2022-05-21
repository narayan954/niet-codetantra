#include<stdio.h>
int smallest(int[],int,int);
void main()
{
int a[100];
int i,j,k,pos,temp,n;
printf("Enter size of the array : ");
scanf("%d",&n);
printf("Enter the elements :");
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
for(i=0;i<n;i++)
{
pos=smallest(a,n,i);
temp=a[i];
a[i]=a[pos];
a[pos]=temp;
}
printf("The sorted elements are : ");
for(i=0;i<n;i++)
{
printf("%d\t",a[i]);
}
}
int smallest(int a[],int n,int i)
{
int small,pos,j;
small=a[i];
pos=i;
for(j=i+1;j<n;j++)
{
if(a[j]<small)
{
small=a[j];
pos=j;
}
}
 return pos;
}
