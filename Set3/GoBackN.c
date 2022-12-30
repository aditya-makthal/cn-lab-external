#include<stdio.h>
int main(){
	int window=0;
	printf("enter Window size : ");
	scanf("%d",&window);
	int sent=0,ack,i=0;
	while(1){
		while(1){
			printf("frame Transmitted %d \n",sent);
			sent++;
			if(sent==window){
				break;
			}
		}
		printf("enter last received acknowledgment : ");
		scanf("%d",&ack);
		if(ack==window){
			break;
		}
		else{
			sent = ack;
		}
	}
}
