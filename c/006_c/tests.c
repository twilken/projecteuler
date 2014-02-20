#include <stdio.h>
#include "../minunit.h"
#include "helper.h"



int tests_run = 0;

static char * test_power() {
    mu_assert("power : 1^2 != 1", power(1, 2) == 1);
    mu_assert("power : 2^2 != 4", power(2, 2) == 4);
    mu_assert("power : 10^3 != 1000", power(10, 3) == 1000);
    mu_assert("power : 2^1 != 2", power(2, 1) == 2);
    mu_assert("power : 2^0 != 1", power(2, 0) == 1);
    return 0;
}

static char * test_sumOfSquares() {
    mu_assert("sumOfSquares : 1 to 2 != 5", sumOfSquares(2) == 5);
    mu_assert("sumOfSquares : 1 to 3 != 14", sumOfSquares(3) == 14);
    return 0;
}

static char * test_squareOfSum() {
    mu_assert("squareOfSum : 1 to 2 != 9", squareOfSum(2) == 9);
    mu_assert("squareOfSum : 1 to 3 != 36", squareOfSum(3) == 36);
    return 0;
}

static char * all_tests() {
    mu_run_test(test_power);
    mu_run_test(test_sumOfSquares);
    mu_run_test(test_squareOfSum);
    return 0;
}

int main(int argc, char **argv) {
    char *result = all_tests();

    if (result != 0) {
        printf("%s\n", result);
    }
    else {
        printf("ALL TESTS PASSED\n");
    }

    printf("Tests run: %d\n", tests_run);
    return result != 0;
}
