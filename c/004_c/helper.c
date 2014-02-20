#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

#include "helper.h"



/*
 * Is the candidate a palindrome. Works for integers.
 */
bool isPalindrome(int candidate) {
    char s[12];
    sprintf(s, "%d", candidate);
    return isPalindromeHelper(s); 
}



/*
 * Is the candidate a palindrome?
 * Helper method for isPalindrome(int candidate).
 */
bool isPalindromeHelper(char * p) {
    if (strlen(p) <= 1) {
        return true;
    }
    else if (strlen(p) == 2) {
        return p[0] == p[strlen(p)-1]; 
    }
    else {
        char buf[12];
        strncpy(buf, p+1, strlen(p+1)+1); // remove first digit
        buf[strlen(buf)-1] = '\0';        // remove last digit
        return (p[0] == p[strlen(p)-1]) && isPalindromeHelper(buf);     
    }
}

