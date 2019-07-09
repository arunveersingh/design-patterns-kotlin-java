Factory Method Design Pattern
--
The Factory Method design pattern solves problems like:

How can an object be created so that subclasses can redefine which class to instantiate?
How can a class defer instantiation to subclasses?
Creating an object directly within the class that requires (uses) the object is inflexible because it commits the class to a particular object and makes it impossible to change the instantiation independently from (without having to change) the class.

The Factory Method design pattern describes how to solve such problems:

Define a separate operation (factory method) for creating an object.
Create an object by calling a factory method.
This enables writing of subclasses to change the way an object is created (to redefine which class to instantiate).

Example: 

There are 3 ways to connect to External Server - 
1. Protocol A
2. Protocol B
3. Protocol C

methodConnect(protocol) {

      if protocol A {
            
            protocolObject = new ProtocolA()
            ..
            ..
            .. do somethign something to make protocolObject ready to use
            ..
            ..
            ..
            
            protocolObject.connect()
      
      } 
      
      else if protocol B {
                  
                  protocolObject = new ProtocolB()
                  
                  if(exception in protocolObject.connect()){
                  
                        protocolObject = new ProtocolA()
                                    ..
                                    ..
                                    .. do somethign something to make protocolObject ready to use
                                    ..
                                    ..
                                    ..
                                    
                                    protocolObject.connect()
                  }
            
       } 
       
      else if protocol C {
                         
                  protocolObject = new ProtocolB()
                  protocolObject.connect()
                   
      } 

}


If there is any change in any of the protocol this need to changed. Change in protocol may be a change in library used
or custom logic around library, some caching mechanism per protocol, time out configurations per logic, etc.

If the logic of protocol object creation and custom logic around it is moved from this class to 3 different classes
and this class uses an interface or abstract class to connect to the remote server it is easy to manage the code for diff
protocols. 

After this refactoring, methodConnect is independent of the changes happening in the underlying system.




[Excerpt from https://en.wikipedia.org/wiki/Factory_method_pattern]