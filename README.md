## Farrell Sevillen Arya - 2702323540
This example demonstrates the implementation of an 'Animal' class and a 'Lion' class that extends 'Animal'. The 'Animal' class satisfies three out of the four OOP principles (Inheritance, Encapsulation, and Abstraction) while the Lion class demonstrates Polymorphism.

## Usage
To use the code, compile the three Java files:

```java
javac Animal.java
javac Lion.java
javac Main.java
```
Then run the Main class:
```java
java Main
```

## Output

The output of the Main class will be:

```java
Number of teeth: 30
Has spots: false
Weight: 150
Has a mane: true
Roar
```

## Code Structure
The code consists of three classes:

- Animal: The parent class that demonstrates encapsulation and abstraction.
- Lion: The child class that extends Animal and demonstrates inheritance and polymorphism.
- Main: The driver class that demonstrates the usage of the Lion class.

## Animal Class
The Animal class is the parent class that has three private attributes: numTeeth, spots, and weight. The class has a constructor that takes three arguments and sets the values of the attributes. The class also has getter methods for each attribute.

The makeSound method is declared as abstract, meaning that it has no implementation in the parent class. This allows child classes to provide their own implementation of the method.

## Lion Class
The Lion class is the child class that extends Animal. It has an additional private attribute mane and a constructor that takes four arguments. The constructor calls the superclass constructor and sets the value of the mane attribute.

The Lion class also has a setter method for the mane attribute and a getter method for the mane attribute. The makeSound method is overridden in the Lion class to print the sound that a lion makes.

## Main Class
The Main class is the driver class that demonstrates the usage of the Lion class. It creates a Lion object and prints out its attributes using the getter methods. It then calls the makeSound method on the Lion object to print the sound that a lion makes.

## Conclusion
This example demonstrates the implementation of an Animal class and a Lion class that extends Animal. The Animal class satisfies three out of the four OOP principles (Inheritance, Encapsulation, and Abstraction) while the Lion class demonstrates Polymorphism. The Main class demonstrates the usage of the Lion class.

## Screenshot
<img width="960" alt="exc ss" src="https://github.com/RelKereta/Exercise_1-DSA_TA_2024/assets/144778128/2afd9b7d-a768-41b6-803a-6f4ae79ba025">
