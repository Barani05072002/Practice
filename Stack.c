#include <stdio.h>
int rec(int i)
{
    if(i<=1)
    return 1;
    else
    return i*rec(i-1);
}
int main() {
    // Write C code here
    
    printf("%lu\n",rec(20));    //Error stack 
    // or give answer in 0

    return 0;
}