[Excerpt from Wikipedia]

Chain Of Responsibility
--
In object-oriented design, the chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects.[1] Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain. A mechanism also exists for adding new processing objects to the end of this chain. Thus, the chain of responsibility is an object oriented version of the if ... else if ... else if ....... else ... endif idiom, with the benefit that the condition–action blocks can be dynamically rearranged and reconfigured at runtime.

In a variation of the standard chain-of-responsibility model, some handlers may act as dispatchers, capable of sending commands out in a variety of directions, forming a tree of responsibility. In some cases, this can occur recursively, with processing objects calling higher-up processing objects with commands that attempt to solve some smaller part of the problem; in this case recursion continues until the command is processed, or the entire tree has been explored.

Command
--
Work in Progress

Iterator
--
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

Template Method
--

The template method is a method in a superclass, usually an abstract superclass, and defines the skeleton of an operation in terms of a number of high-level steps. These steps are themselves implemented by additional helper methods in the same class as the template method.