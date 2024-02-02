#include <stdio.h>
#include <stdlib.h>

// Part 1
int main(void) {
  int a;
  int b;
  printf("Please enter a number: ");
  scanf("%d", &a);
  printf("Please enter another number: ");
  scanf("%d", &b);
  int result = a + b;
  printf("The sum of the two numbers is %d\n", result);
  printf(" %p/n", &a);
  printf(" %p/n", &b);
  printf(" %p/n", &result);
  return 0;
}