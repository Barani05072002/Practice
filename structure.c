#include <stdio.h>

int main() {
   struct student
   {
       int a;
       char b;
       double c;
   }s;
   union sample
   {
       int a;
       char b;
       double c;
   }u;
   
   printf("%lu\n",sizeof(s));
   printf("%lu\n",sizeof(u));
   
  printf("%d\n",&s.a);
  printf("%d\n",&s.b);
  printf("%d\n",&s.c);
   //union
  printf("%d\n",&u.a);
  printf("%d\n",&u.b);
  printf("%d\n",&u.c);
  
  s.a = 16;
  s.b = 'a';
  s.c = 8.8;
 
  u.a = 16;
  u.b = 'a';
  u.c = 8.8;
  
  printf("%d\n",s.a);
  printf("%c\n",s.b);
  printf("%f\n",s.c);
  printf("Union\n");
  printf("%d\n",u.a);   //sometimes allocates and sometimes 
  printf("%c\n",u.b);   //Error :Overflow
  printf("%f\n",u.c);
   
    return 0;
}