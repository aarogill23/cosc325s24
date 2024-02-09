
#Capitalizes the string by value
def capitalize(str):
    str = str.upper()
    return str #Requires a return statement becausee the caller's variable is not changed

name = "Aaron Gill"
print(id(name))
name = capitalize(name) #grab the return value and assign it to the variable
print(name)
print(id(name))

class Fruit:
    def __init__(self, name, color, price):
        self.name = name
        self.color = color
        self.price = price
    
    def __str__(self):
        return f"{self.name} is {self.color} and costs ${self.price}"
    
    def updatePrice(self, newPrice):
        self.price = newPrice
    
def fruitStand(fruit):
    fruit.updatePrice(1.25)
    fruit = Fruit("Orange", "Orange", 1.25) #This will not change the caller's variable

apple = Fruit("Apple", "Red", 0.75)
print(apple)
fruitStand(apple)
print(apple) #The price has been updated
