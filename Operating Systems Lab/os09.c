#include<stdio.h>
#include<limits.h>
#define MAX 30
#define foi(i, lb, ub) for(int i = lb; i< ub; i++)
int arr[MAX] = {0};
void main(){
	int n, m, b[MAX], f[MAX], temp, bn[MAX] = {0}, frag[MAX] = {0}, t=INT_MIN;
	printf("Enter the number of blocks: ");
	scanf("%d",&n);
	printf("Enter the number of files: ");
	scanf("%d", &m);
	printf("Enter the size of the blocks\n");
	foi(i, 0 , n){
		printf("Block %d: ", i+1);
		scanf("%d",&b[i]);
	}
	printf("Enter the size of the files\n");
	foi(i, 0, m){
		printf("File %d: ",i+1);
		scanf("%d",&f[i]);
	}
	
	foi(i, 0 , m){
		temp = -1;
		foi(j, 0 ,n){
			if(arr[j] == 0){
				temp = b[j] - f[i];
				if(temp < 0)
					continue;
				if(temp > t){
					t = temp;
					bn[i] = j+1;
				}
			}
		}
		
		if(temp >= 0){
			frag[i] = t;
			arr[bn[i]- 1]=1;
		}
		t = INT_MIN;
	}
	
	printf("File_no\tFile_size\tBlock_no\tBlock_size\tFragement\n");
	foi(i, 0, m){
		if(bn[i] != 0)
			printf("%d\t%d\t%d\t%d\t%d\n", i+1, f[i], bn[i], b[bn[i]-1], frag[i]);
		else
			printf("%d\t%d\t%d\t%d\t%d\n", i+1, f[i], bn[i], 0, frag[i]);
	}
}
