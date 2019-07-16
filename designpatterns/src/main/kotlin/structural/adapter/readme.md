[Excerpts from Wikipedia https://en.wikipedia.org/wiki/Adapter_pattern]

Adapter Design Pattern
--
An adapter allows two incompatible interfaces to work together. This is the real-world definition for an adapter. Interfaces may be incompatible, but the inner functionality should suit the need. The adapter design pattern allows otherwise incompatible classes to work together by converting the interface of one class into an interface expected by the clients.


Can talk about
--
1. **Polymorphic behavior**

    (An adapter can be used when the wrapper must respect a particular interface and must support polymorphic behavior.)

2. **Composition vs Aggregation**

3. **Inheritance vs Composition**

4. **Dependency Inversion Principle**
    
   (Adapter pattern follows Dependency Inversion Principle and enables reuse of an existing class even so it does not implement an expected interface.)
   
   The DI principle states:
   
   High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g. interfaces).
   Abstractions should not depend on details. Details (concrete implementations) should depend on abstractions.
   
5. **SOLID** 
 
    Single responsibility
    
    Open/closed principle
    
    Liskov substitution principle
    
    Interface segregation principle
    
    Dependency inversion principle
    
    **Any guesses which all are followed in this implementation of adapter code? :)**
   
Examples
--
java.util.Arrays#asList()

java.util.Collections#list()