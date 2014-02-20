#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

#include "helper.h"



#define MAX 999



/*
 * A palindromic number reads the same both ways. The largest palindrome 
 * made from the product of two 2-digit numbers is 9009 = 91 * 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
int main(void) {
    int palindrome = -1;
    int num1       = MAX;
    int num2       = MAX;
    int product    = -1;

    for (num1 = MAX; num1 >= 0; num1--) {
        for (num2 = MAX; num2 >= 0; num2--) {
            product = num1 * num2;
            
            if (product > palindrome && isPalindrome(product)) {
                palindrome = product;
            }
        }
    }

    printf("%d\n", palindrome);
    exit(EXIT_SUCCESS);
}

