#include <stdlib.h>
#include <stdio.h>
#include <stdint.h>
#include <inttypes.h>



/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
int main(void) {
    uint64_t number                        =  600851475143;
    uint64_t remainingPart                 =  number;
    uint64_t newestPrimeFactor             =  2;
    uint64_t productOfPreviousPrimeFactors =  1;
  
    do {
        if (remainingPart % newestPrimeFactor == 0) { // it is a prime factor
            remainingPart                 /= newestPrimeFactor;
            productOfPreviousPrimeFactors *= newestPrimeFactor;
        }  
        else {                                        // it is not a prime factor => next prime
            newestPrimeFactor++;                      // this is lazy, here should be something like nextPrime()
        }
    } while (productOfPreviousPrimeFactors * newestPrimeFactor != number);

    printf("\%"PRId64"\n", newestPrimeFactor);
    exit(EXIT_SUCCESS);
}
