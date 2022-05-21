#include<stdio.h>
#define MAX 30
#define foi(i, lb, ub) for(int i=lb; i < ub ; i++)
int len(int n){
	int c = 0;
	while(n){
		n = n/10;
		c ++;
	}
	return c;
}
void main(){
	int l=1,ms,n,p,alm[MAX],m,frag[MAX],f=0,temp,t;
	printf("Enter the memory size:");
	scanf("%d",&ms);
	printf("Enter the no of partitions:");
	scanf("%d",&n);
	printf("Each partn size is:%dEnter the no of processes:", ms/n);
	scanf("%d",&p);
	m=ms/n;
	foi(i, 0 , p){
		printf("Enter the memory req for process%d:",i + 1);
		scanf("%d",&alm[i]);
		frag[i]=m-alm[i];
		if(frag[i] >= 0){
			printf("Process is allocated in partition%d\n", i+1);
			printf("Internal fragmentation for process is:%d\n", frag[i]);
		}
		else{
			printf("Process not allocated in partition%d\n",i+1);
			printf("External fragmentation for partition is:%d", m);
			t=m;
			while(t<alm[i]){
				t=m*l;
				l++;
			}
			frag[i] = t - m;
			
		}
		f += frag[i];
	}
	printf("Process\tmemory\tallocatedmemory\n");
	foi(i,0,p){
		printf("    ");
		printf("%d\t",i+1);
		temp=5-len(m);
		while(temp--)
			printf(" ");
		printf("%d\t",m);
		temp=5-len(alm[i]);
		while(temp--)
			printf(" ");
		printf("%d\n",alm[i]);
	}
	printf("The tot no of fragmentation is:%d", f);
}
