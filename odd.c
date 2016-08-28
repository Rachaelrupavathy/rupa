#include <stdio.h>

int main()
{
    int num;

    
    printf("Enter any number to check even or odd: ");
    scanf("%d", &num);
    
    
    if(num%2 == 0)
    {
        printf("Number is Even.\n");
    }
    else
    {
        printf("Number is Odd.\n");
    }

    return 0;
} 
