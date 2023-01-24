#include <stdio.h>
void change(int x,int y)    //formal perameters
{
    x=22; //conflict example change
    y=30; //changes
}
void inter(int *x,int *y)   //here passing the addresses
{
    *y=10;
    *x=20;
}
int main()
{
    int i=50;
    int *p;
    p = &i; //pointer p holds the address of i
    printf("value of i %d\n",i);
    printf("address of i %d\n",&i);
    printf("p pointer point value is %d\n",*p);
    printf("p pointer holds the address %d\n",p);
    printf("address of p %d\n",&p);
    printf("%p\n",&i);
    printf("%p\n",&p);
    
    //call by value
    int x=10,y=20;          //actual perameters
    printf("call by valye \nbefore change x=%d  y=%d\n",x,y);
    change(x,y);
    printf("after change  x=%d  y=%d\n",x,y);
    
    //call by reference
    printf("call by reference \nbefore change x=%d y=%d\n",x,y);
    inter(&x,&y);
    printf("after change x=%d y=%d\n",x,y);
    return 0;
}
