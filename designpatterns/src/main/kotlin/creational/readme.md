Creational Design Patterns
--
Used Excerpt from: _https://en.wikipedia.org/wiki/Creational_pattern_

Creational design patterns deal with object creation mechanisms. 
The basic form of object creation could result in design problems or in added complexity to the design.
Creational design patterns solve this problem by controlling this object process.


Creational design patterns are composed of two dominant ideas 
--
1. One is encapsulating knowledge about which concrete classes the system uses.
2. Hiding how instances of these concrete classes are created and combined.

Creational design patterns are further categorized into 
--

1. Object-creational patterns 
2. Class-creational patterns

Object-creational patterns deal with Object creation and Class-creational patterns deal with Class-instantiation. In greater details, Object-creational patterns defer part of its object creation to another object, while Class-creational patterns defer its object creation to subclasses.


Few Creational Design Pattern
--

1. Builder Pattern:

The intent of the Builder design pattern is to separate the construction of a complex object from its representation. By doing so the same construction process can create different representations.

2. Abstract Factory Pattern


3. Factory Method Pattern:

Define an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation it uses to subclasses." (Gang Of Four)

Creating an object often requires complex processes not appropriate to include within a composing object. The object's creation may lead to a significant duplication of code, may require information not accessible to the composing object, may not provide a sufficient level of abstraction, or may otherwise not be part of the composing object's concerns. The factory method design pattern handles these problems by defining a separate method for creating the objects, which subclasses can then override to specify the derived type of product that will be created.

The factory method pattern relies on inheritance, as object creation is delegated to subclasses that implement the factory method to create objects.


4. Prototype Pattern


5. Singleton Pattern