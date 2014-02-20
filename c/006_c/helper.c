#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>

#include "helper.h"



/*
 * Compute base to the power of exponent.
 */
int power(int base, int exponent) {
    int i      = 0; 
    int result = 1;

    for (i = exponent; i > 0; i--) {
        result *= base;
    }

    return result;
}



/*
 * Compute the sum of the squares from 1 to max.
 */
int sumOfSquares(int max) {
    int result = 0;
    int i      = 0;

    for (i = max; i > 0; i--) {
        result += power(i, 2);
    }

    return result;
}



/*
 * Compute the square of the sum from 1 to max.
 */
int squareOfSum(int max) {
    int sum = (max * (max + 1)) / 2; // Gauss sum
    return power(sum, 2);
}
