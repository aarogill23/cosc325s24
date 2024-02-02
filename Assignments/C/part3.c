#include <stdlib.h>
#include <stdio.h>

//part 3

/*
  returns the memory address of the array of numbers entered by the user
  */
int* getnums(){
  int n;
  printf("How many numbers? ");
  scanf("%d", &n);
  int* nums = malloc(n * sizeof(int));
  for (int i =0; i < n; i++){
    printf("Enter number %d: ", i + 1);
    scanf("%d", nums + i);
  }
  return nums;
}

int add(int* nums){
  // loop through all the numbers.
  // add them together.
  // return the result.

  //TODO: Returns 0 doesn't add numbers.
  int sum = 0;
  for (int i = 0; i < sizeof(nums); i++){
    sum = sum + *(nums + i);
}
  return sum;
}

void display(int* nums, int* result){
  printf("The sum of your numbers is %d\n", *result);
  printf("%p/n", nums);
  printf(" %p/n", result);
}

int main(void){
  int* nums = getnums();
  int* result = malloc(sizeof(int));
  *result = add(nums);
  display(nums, result);
  free(nums);
  free(result);
  return 0;
}