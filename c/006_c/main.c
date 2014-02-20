#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

#include "helper.h"



#define MAX 100



/*
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * 
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first 
 * ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first 
 * one hundred natural numbers and the square of the sum.
 */
int main(void) {
    int result = 0;

    result = squareOfSum(MAX) - sumOfSquares(MAX);

    printf("%d\n", result);
    exit(EXIT_SUCCESS);
}

