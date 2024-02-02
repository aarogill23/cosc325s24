#include <stdio.h>
#include <stdlib.h>

// Part 2
void getnums(int *a, int *b) {
  printf("Please enter a number: ");
  scanf("%d", a);
  printf("Please enter another number: ");
  scanf("%d", b);
}

void display(int *a, int *b, int *result) {
  printf("The sum of your numbers is %d\n", *result);
  printf(" %p/n", a);
  printf(" %p/n", b);
  printf(" %p/n", result);
}

int add(int *a, int *b) { return *a + *b; }

int main(void) {
  int *a = malloc(sizeof(int));
  int *b = malloc(sizeof(int));
  getnums(a, b);
  int *result = malloc(sizeof(int));
  *result = add(a, b);
  display(a, b, result);
  free(a);
  free(b);
  free(result);
  return 0;
}