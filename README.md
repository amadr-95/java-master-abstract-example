# NumberExtractorReport
This class allow us to extract only the data from the file 
that matches a given pattern, which in this case
is for phone numbers.

However, we can enhance this class by making it **abstract**. 
This class will implement an abstract method that will be filled in 
by subclasses depending on the type of data required to be reported 
(phone numbers, emails, names, etc.). 
This approach is a much better implementation because it:
- Avoid code duplication
- Increases resusability
- Encapsulate a common functionality in one place
- Let subclasses implement specific body methods for their purposes

![img.png](src/resources/img.png)

To see that implementation change to branch _abstract_