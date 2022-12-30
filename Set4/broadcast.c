#include <stdio.h>
struct ed
{
    int v1, v2, w;
} edj[20], temp;
main(){
    int i, j, n = 0, s, d, par[20], s1, d1;
    printf("\n enter no of edges");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        printf("\n enter the node1,node2,seight");
        scanf("%d%d%d", &edj[i].v1, &edj[i].v2, &edj[i].w);
        par[i] = 0;
    }
    for (i = 0; i < n; i++){
        for (j = 0; j <= i; j++)
            if (edj[j].w > edj[i].w){
                temp = edj[i];
                edj[i] = edj[j];
                edj[j] = temp;
            }
    }
    for (i = 0; i < n; i++)
        printf("\n values %d\t%d\t%d\n", edj[i].v1, edj[i].v2, edj[i].w);
    printf("\n BROADCAST TREE FOR THE GIVEN GRAPH\n");
    for (i = 0; i < n; i++)
    {
        s = edj[i].v1;
        d = edj[i].v2;
        s1 = s;
        d1 = d;
        while (par[s1] > 0)
            s1 = par[s1];
        while (par[d1] > 0)
            d1 = par[d1];
        if (s1 != d1)
        {
            par[d] = s;
            printf("\n%d\t%d\t%d\n", s, d, edj[i].w);
        }
    }
}