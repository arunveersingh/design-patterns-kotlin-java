[Excerpt from Wikipedia]

Usage
--

The template method is used in frameworks, where each implements the invariant parts of a domain's architecture, while providing hook methods for customization. 
This is an example of inversion of control. 

The template method is used for few of the following reasons
--

-   It lets subclasses implement varying behavior (through overriding of the hook methods).

-   It avoids duplication in the code: the general workflow of the algorithm is implemented once in the abstract class's template method, and necessary variations are implemented in the subclasses.

-   It control the point(s) at which specialization is permitted. If the subclasses were to simply override the template method, they could make radical and arbitrary changes to the workflow. In contrast, by overriding only the hook methods, only certain specific details of the workflow can be changed, and the overall workflow is left intact. 

-   Code Generators

