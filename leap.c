#include <stdio.h>

int main()
{
    int year;

    /* Read year from user */
    printf("Enter year : ");
    scanf("%d", &year);


    
    if(((year%4 == 0) && (year%100 !=0)) || (year%400==0))
    {
        printf("LEAP YEAR");
    }
    else
    {
        printf("COMMON YEAR");
    }

    return 0;
} 


