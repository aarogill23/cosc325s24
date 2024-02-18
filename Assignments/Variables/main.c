#include <stdio.h>
#include <stdlib.h>
#include <string.h>

enum roletype {ADMIN, USER, GUEST};

struct course{
  char name[20];
  int section;
  int credits;
};

void optionals(int variable){
  printf("\nThis is optionals:\n");
  if(variable == NULL){
    printf("x is null");
  }
  else{
    printf("The variable is equal to %d\n", variable);
  }
}

void structs(){
  printf("This is records:\n");
  struct course cosc107;
  struct course cosc470;
  struct course cosc325;
  strcpy(cosc107.name,"COSC107");
  cosc107.section = 2;
  cosc107.credits = 4;
  strcpy(cosc470.name,"COSC470");
    cosc470.section = 1;
    cosc470.credits = 4;
  strcpy(cosc325.name,"COSC325");
    cosc325.section = 1;
    cosc325.credits = 4;
  struct course courses[3] = {cosc107, cosc470, cosc325};
  for(int i =0; i < 3; i++){
    printf("%s, %d, %d\n", courses[i].name, courses[i].section, courses[i].credits);
  }
}

void associativearrays(){
  printf("this is associative arrays:\n");
  enum EmployeeIndex{
  NAME, AGE, ADDRESS, SALARY
  };
  char* employee[4];
  employee[NAME] = "John Doe";
  employee[AGE] = "25";
  employee[ADDRESS] = "123 Main St";
  employee[SALARY] = "5000";
}

void arrays(){
  printf("This is arrays:\n");
  int arr[5] = {1, 2, 3, 4, 5};
  int* heaparr = malloc(sizeof(int) * 5);
  for(int i = 0 ; i < 5; i++){
    printf("%d %d", arr[i], heaparr[i]);
  }
  free(heaparr);
}

void enums(){
  printf("This is enums:\n");
  int role_i = 1; // 0 - admin, 1 - user, 2 - guest
  enum roletype role = ADMIN;
 printf("%d %s", role, role);
}

void primitive_type(){
  printf("This is primitive types:\n");
  char b = 0b01000001;
  long l = 0x4102030405060742;
  printf("%c %d %x \n", b, b, b);
  printf("%c %ld %lx\n\n", l, l, l);
}

void string(){
  printf("This is Strings:\n");
  char name[20] = "Aaron Gill";
  printf("%p %s %c\n", name, name, name[strlen(name) - 1]);
}

void space(){
  printf("\n\n");
}

int main(void) {
  int example;
  int exampleTwo = 4;
  primitive_type();
  enums();
  space();
  arrays();
  space();
  structs();
  optionals(example);
  optionals(exampleTwo);
  return 0;
}