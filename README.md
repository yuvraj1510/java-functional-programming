# java-functional-programming
Functional programming is a paradigm that allows programming using expressions i.e. declaring functions, passing functions as arguments and using functions as statements.

## Implementations using Structural Programming
* [Print each element from list in its own line](src/main/java/com/ysingh/structure/ST01PrintListElement.java)
* [Print courses, courses having name with Spring, courses having name greater than 3 characters](src/main/java/com/ysingh/structure/ST02CourseExcerise.java)
* [Print Square of each number in the list](src/main/java/com/ysingh/structure/ST03PrintSquareOfEachListElement.java)
* [Print sum of all elements in the list](src/main/java/com/ysingh/structure/ST04AddNumbersInList.java)
* [Print max and min number from all elements in the list](src/main/java/com/ysingh/structure/ST05MaximumAndMinimumNumberInList.java)
* [Square every number in the list and find the sum of squares](src/main/java/com/ysingh/structure/ST06Excersise.java)
* [Cube every number in the list and find the sum of cubes](src/main/java/com/ysingh/structure/ST06Excersise.java)
* [Find sum of odd numbers in the list](src/main/java/com/ysingh/structure/ST06Excersise.java)
* [Print distinct numbers in the list](src/main/java/com/ysingh/structure/ST07DistinctAndSorted.java)
* [Sort list of numbers and print it](src/main/java/com/ysingh/structure/ST07DistinctAndSorted.java)
* [Sort list of strings and print it](src/main/java/com/ysingh/structure/ST07DistinctAndSorted.java)
* [Square each element of list and collect it as new list](src/main/java/com/ysingh/structure/ST08Collect.java)
* [Find all even element of list and collect it as new list](src/main/java/com/ysingh/structure/ST08Collect.java)
* [Find length of each course element of list and collect it as new list](src/main/java/com/ysingh/structure/ST08Collect.java)


## Implementations using Functional Programming

### Using Streams, Filters and Lambdas:
* [Print each element from list in its own line](/src/main/java/com/ysingh/functional/FP01PrintListElement.java)
* [Print courses, courses having name with Spring, courses having name greater than 3 characters](src/main/java/com/ysingh/functional/FP02CourseExcerise.java)

### Using Map:
* [Print Square of each number in the list](src/main/java/com/ysingh/functional/FP03PrintSquareOfEachListElement.java)

### Using Reduce:
* [Print sum of all elements in the list](src/main/java/com/ysingh/functional/FP04AddNumbersInList.java)
* [Print max and min number from all elements in the list](src/main/java/com/ysingh/functional/FP05MaximumAndMinimumNumberInList.java)
* [Square every number in a list and find the sum of squares](src/main/java/com/ysingh/functional/FP06Excersise.java)
* [Cube every number in a list and find the sum of cubes](src/main/java/com/ysingh/functional/FP06Excersise.java)
* [Find sum of odd numbers in a list](src/main/java/com/ysingh/functional/FP06Excersise.java)

### Using Distinct and Sorted:
* [Print distinct numbers in the list](src/main/java/com/ysingh/functional/FP07DistinctAndSorted.java)
* [Sort list of numbers and print it](src/main/java/com/ysingh/functional/FP07DistinctAndSorted.java)
* [Sort list of strings and print it](src/main/java/com/ysingh/functional/FP07DistinctAndSorted.java)

### Using Collect:
* [Square each element of list and collect it as new list](src/main/java/com/ysingh/functional/FP08Collect.java)
* [Find all even element of list and collect it as new list](src/main/java/com/ysingh/functional/FP08Collect.java)
* [Find length of each course element of list and collect it as new list](src/main/java/com/ysingh/functional/FP08Collect.java)

### Using allMatch, noneMatch, anyMatch:
* [Example](src/main/java/com/ysingh/functional/FP12CustomClass.java)

### Using Comparator:
* [Example](src/main/java/com/ysingh/functional/FP12CustomClass.java)

### Using skip, limit:
* [Example](src/main/java/com/ysingh/functional/FP12CustomClass.java)

### Using max, min, findFirst, findAny:
* [Example](src/main/java/com/ysingh/functional/FP12CustomClass.java)

### Using sum, average, count:
* [Example](src/main/java/com/ysingh/functional/FP12CustomClass.java)

### Using groupingBy:
* [Example](src/main/java/com/ysingh/functional/FP12CustomClass.java)

### Terminal or Intermediate operations:
* Function or method which returns another stream of element called as Intermediate functions or methods or operations.
* Function or method which does not return another stream of element called as Terminal functions or methods or operations.

### Functional Interfaces:
A functional interface has exactly one abstract method.
* **Predicate\<T\>:** Represents a predicate (boolean-valued function) of one argument.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **Function\<T, R\>:** Represents a function that accepts one argument and produces a result.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **Consumer\<T\>:** Represents an operation that accepts a single input argument and returns no result.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **BinaryOperator\<T\>:** Represents an operation upon two operands of the same type, producing a result of the same type as the operands.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **Supplier\<T\>:** Represents a supplier of results. It does not take any arguments.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **UnaryOperatory\<T\>:** Represents an operation on a single operand that produces a result of the same type as its operand.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **BiPredicate\<T, R\>:** Represents a predicate (boolean-valued function) of two arguments.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **BiFunction\<T, U, R\>:** Represents a function that accepts two arguments and produces a result.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **BiConsumer\<T, U\>:** Represents an operation that accepts two input arguments and returns no result.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **IntBinaryOperator:** Represents an operation upon two int-valued operands and producing an int-valued result.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **IntConsumer:** Represents an operation that accepts a single int-valued argument and returns no result.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **IntFunction\<R\>:** Represents a function that accepts an int-valued argument and produces a result.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **IntPredicate:** Represents a predicate (boolean-valued function) of one int-valued argument.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **IntSupplier:** Represents a supplier of int-valued results.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **IntToDoubleFunction:** Represents a function that accepts an int-valued argument and produces a double-valued result.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **IntToLongFunction:** Represents a function that accepts an int-valued argument and produces a long-valued result.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
* **IntUnaryOperator:** Represents an operation on a single int-valued operand that produces an int-valued result.
    * [Example](src/main/java/com/ysingh/functional/FP09FunctionalInterface.java)
    
### Behavior Parameterization:
Passing the behaviour as parameter or argument to a method is called as Behavior Parameterization.
* [Example](src/main/java/com/ysingh/functional/FP10BehaviourParameterization.java)

### Method Reference:
Method reference is used to refer method of functional interface. The Method reference can only be used to replace a single method of lambda expression.
* [Example](src/main/java/com/ysingh/functional/FP11MethodReferences.java)