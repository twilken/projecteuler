#include <stdlib.h>
#include <stdio.h>



#define MAX 4000000



/*
 * Each new term in the Fibonacci sequence is generated by adding the previous 
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not 
 * exceed four million, find the sum of the even-valued terms.
 */
int main(void) {
    int f1  = 1;
    int f2  = 2;
    int tmp = 0;
    int sum = 0;

    do {
        // add to sum if even
        if (f2 % 2 == 0) {
            sum += f2;
        }

        // compute next fibonacci
        tmp = f2;
        f2  = f2 + f1;
        f1  = tmp;
    } while(f2 <= MAX);

    printf("%d\n", sum);
    exit(EXIT_SUCCESS);
}
