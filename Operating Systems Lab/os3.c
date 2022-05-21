#include<stdio.h>
#include<conio.h>
#include<string.h>
void main(){
		int bt[20],at[10],n,i,j,temp,st[10],ft[10],wt[10],ta[10],p[10];
		int totwt=0,totta=0;
		float awt,ata;
		char pn[10][10],t[10];
		printf("Enter the number of process:");
		scanf("%d",&n);
		for(int i=0;i<n;i++){		
			printf("Enter process name,arrivaltime,execution time & priority:");
			scanf("%s%d%d%d",pn[i],&at[i],&bt[i],&p[i]);		
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(p[i]<p[j]){
					temp=p[i];		
					p[i]=p[j];
					p[j]=temp;
					temp=at[i];
					at[i]=at[j];																													
					at[j]=temp;																												
					strcpy(t,pn[i]);
					strcpy(pn[i],pn[j]);
					strcpy(pn[j],t);		
				}
				}	
}
for(i=0;i<n;i++){
	if(i==0)
	st[i]=at[i];
	else
	  st[i]=ft[i-1];
	 wt[i]=st[i]-at[i];
	 ft[i]=st[i]+bt[i];
	 ta[i]=ft[i]-at[i];
	 totwt+=wt[i];
	 totta+=ta[i];
}
	awt=(float)totwt/n;
	ata=(float)totta/n;
	printf("Pname\tarrivaltime\texecutiontime\tpriority\twaitingtime\ttatime\n");
	    printf("%s\t    %d\t\t    %d\t\t    %d\t\t    %d\t\t    %d\n",pn[0],at[0],bt[0],p[0],wt[0],ta[0]);
	for(i=1;i<n;i++)
		printf("%s\t    %d\t\t    %d\t\t    %d\t\t    %d\t\t   %d\n",pn[i],at[i],bt[i],p[i],wt[i],ta[i]);
	printf("Average waiting time is:%f\n",awt);
	printf("Average turnaroundtime is:%f\n",ata);
								
}
