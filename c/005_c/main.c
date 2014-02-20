#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>



#define MAX_DIVISOR 20



/*
 * 2520 is the smallest number that can be divided by each of the 
 * numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible 
 * by all of the numbers from 1 to 20?
 */
int main(void) {
    int  result  = 0;
    int  divisor = 0;
    bool run     = true;

    while (run) {
        result += MAX_DIVISOR; // increment by MAX_DIVISOR => we don't have to divide by MAX_DIVISOR

        for (divisor = MAX_DIVISOR-1; divisor > 0; divisor--) {
            if (result % divisor != 0) {
                break;         // already not divisible => end for loop
            }
        }

        if (divisor == 0) {    // if result is divisible by 1 to MAX_DIVISOR => quit
            run = false;
        }
    }

    printf("%d\n", result);
    exit(EXIT_SUCCESS);
}

