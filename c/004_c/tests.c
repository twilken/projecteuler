#include <stdio.h>
#include "../minunit.h"
#include "helper.h"



int tests_run = 0;

static char * test_isPalindrome() {
    mu_assert("isPalindrome : 35236 == palindrome", isPalindrome(35236) == false);
    mu_assert("isPalindrome : 900099 == palindrome", isPalindrome(900099) == false);
    mu_assert("isPalindrome : 12 == palindrome", isPalindrome(12) == false);
    mu_assert("isPalindrome : 4 != palindrome", isPalindrome(4));
    mu_assert("isPalindrome : 99 != palindrome", isPalindrome(99));
    mu_assert("isPalindrome : 0 != palindrome", isPalindrome(0));
    mu_assert("isPalindrome : 1 != palindrome", isPalindrome(1));
    mu_assert("isPalindrome : 163484361 != palindrome", isPalindrome(163484361));
    mu_assert("isPalindrome : 6348436 != palindrome", isPalindrome(6348436));
    mu_assert("isPalindrome : 34843 != palindrome", isPalindrome(34843));
    mu_assert("isPalindrome : 937739 != palindrome", isPalindrome(937739));
    return 0;
}

static char * all_tests() {
    mu_run_test(test_isPalindrome);
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
