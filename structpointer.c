// Online C compiler to run C program online
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
struct Student
{
    char StudentName[25];
    int RegNo;
    int m1,m2,m3;
};
typedef struct Student Student;
int main()
{
    int n,i;
    char temp[25];
    printf("Enter the no of Students:");
    scanf("%d",&n);
    Student *s = (Student*)malloc(sizeof(Student)*n);
    for(i=0;i<n;i++)
    {
        
        printf("\nStudent Name:");
        scanf("%s",((s+i)->StudentName));
        printf("\nRegno:");
        scanf("%d",&((s+i)->RegNo));
    }
    for(i=0;i<n;i++)
    {
    printf("%s\n",((s+i)->StudentName));
    printf("%d\n",((s+i)->RegNo));
    }
}