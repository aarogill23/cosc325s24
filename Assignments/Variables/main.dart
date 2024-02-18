enum EmployeeIndex {NAME, AGE, ADDRESS, SALARY}

void optionals(int? x){
  print("\nThis is optionals")
  int? x;
  if (x==null){
    print("x is null");
  } else{
    print("${3*x}");
  }
  
}

void records(){
  print("\nThis is records");
  ({String name, int section, int credits}) 
  cosc107 = (name: "cosc107", section: 2, credits: 4);
  print(cosc107);
}

void associativearrays(){
  print("This is associative arrays");  
  var imap = {
    1: ["COSC325","COSC470"],
    2: "COSC107",
    7: "COSC107"
  };

  var imapbetter = <int, List>{
    1 : ["COSC325", "COSC470"],
    2 : ["COSC107"],
    7 : ["COSC 107"]
  };

  var imapbest = <String, List<int>>{
    "COSC107" : [2,7],
    "COSC325" : [1],
    "COSC470" : [1]
  };

  print(imapbest["COSC107"]);
}


void arrays(){
  print("this is arrays");
  var fruits = ["bannana", "apples", "oranges"];
  print(fruits);
  fruits.sort();
  print(fruits);
  fruits.sort((a,b) => b.compareTo(a));
  print(fruits);
}

void string(){
  print("This is strings");
  var msg = "hi there"; //Implicit declaration
  String name = "Aaron Gill"; // Explicit declaration
  print(msg + name);
}

enum roletype {ADMIN, USER, GUEST}

void enums(){
  print("This is enums");
  roletype role = roletype.ADMIN;
  print(role);
  if (role == roletype.GUEST){
    print("welcome");
  }
    else if (role == 1){
      print("Access Denied");
    }
  }

void primitive_type(){
  print("This is primitive types");
  var b = 65;
  var l = 0x4102030405060742;
  var f = 3.14159;
  print("b: {$b}, l: {$l}, f: {$f}");
}

void space(){
  print("\n");
}

void main() {
  primitive_type();
  space();
  string();
  space();
  enums();
  space();
  arrays();
  records();
  optionals();
  optionals(3);
}
