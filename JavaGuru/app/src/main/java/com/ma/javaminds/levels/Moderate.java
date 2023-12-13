package com.ma.javaminds.levels;

public class Moderate {

    public static String questions[] = {
            "What is the difference between '==', '.equals()', and 'hashCode()' in Java?",
            "Explain the concept of method overloading in Java.",
            "What is the purpose of the 'super' keyword in the context of constructors?",
            "What is a static method in Java?",
            "Explain the 'final' keyword in Java and its usage.",
            "What is the difference between 'ArrayList' and 'LinkedList' in Java?",
            "What is the 'NullPointerException' in Java and how can it be prevented?",
            "What is the purpose of the 'synchronized' keyword in Java?",
            "Explain the 'transient' keyword in Java.",
            "What is the purpose of the 'finally' block in exception handling?",
            "What is the 'instanceof' operator used for in Java?",
            "Explain the 'this' keyword in Java and its use cases.",
            "What is the 'autoboxing' and 'unboxing' in Java?",
            "What is a lambda expression in Java?",
            "How does Java support multiple inheritance?",
            "What is the 'compareTo()' method used for in Java?",
            "Explain the concept of multithreading in Java.",
            "What is the 'try-with-resources' statement in Java?",
            "What is the 'StringBuilder' class, and how is it different from 'String'?",
            "What is the purpose of the 'assert' keyword in Java?"
    };
    public static String[][] choices = {
            {"Used for comparing primitive types", "Used for comparing objects", "Used for creating new instances", "Used for calculating hash codes"},
            {"Creating multiple methods with the same name in a class", "Overriding a method in a subclass", "Having more than one parameter in a method", "Creating multiple constructors in a class"},
            {"Refers to the superclass in the context of method calls", "Refers to the current instance of the class in the context of method calls", "Specifies a superclass constructor to be called", "Indicates the end of a constructor"},
            {"A method that belongs to the class rather than an instance", "A method that is part of an instance of a class", "A method that is used to perform mathematical operations", "A method that cannot be called"},
            {"It indicates that a variable cannot be modified", "It indicates that a class cannot be extended", "It indicates that a method cannot be overridden", "It indicates that an object cannot be created"},
            {"ArrayList is faster than LinkedList", "LinkedList is faster than ArrayList", "ArrayList uses less memory", "LinkedList uses less memory"},
            {"It occurs when an object is accessed before it is initialized", "It occurs when an object is explicitly set to 'null'", "It occurs when a method is called on a 'null' object", "It occurs when an object is out of scope"},
            {"It is used to achieve mutual exclusion in multithreaded programs", "It is used to define a constant variable", "It is used to synchronize static methods", "It is used to define the priority of a thread"},
            {"It indicates that a variable should not be serialized", "It indicates that a variable should be serialized", "It indicates that a variable should be initialized", "It indicates that a variable should be static"},
            {"To specify code that must be executed regardless of whether an exception is thrown or not", "To specify code that is executed only when an exception is thrown", "To specify code that is executed only when no exception is thrown", "To specify code that is executed before the 'try' block"},
            {"Used for type casting", "Used for checking the type of an object", "Used for creating new instances", "Used for comparing two objects"},
            {"It refers to the current instance of the class", "It refers to the superclass in the context of method calls", "It refers to the current instance of the superclass", "It refers to the superclass in the context of instance variables"},
            {"It is used for converting primitive types to wrapper classes", "It is used for converting wrapper classes to primitive types", "It is used for converting primitive types to their corresponding object types", "It is used for converting object types to primitive types"},
            {"It is a method that takes a variable number of arguments", "It is a method that returns a lambda expression", "It is a method that takes two arguments", "It is a method that is defined in the 'Object' class"},
            {"By using interfaces", "By using multiple classes", "By using abstract classes", "By using method overloading"},
            {"It is used for comparing objects", "It is used for comparing primitive types", "It is used for sorting objects", "It is used for converting objects to strings"},
            {"It is the process of executing multiple threads concurrently", "It is the process of executing multiple threads sequentially", "It is the process of executing a single thread concurrently", "It is the process of executing a single thread sequentially"},
            {"It is used to catch exceptions in a try-catch block", "It is used to specify resources that should be closed after the try block", "It is used to handle checked exceptions", "It is used to handle unchecked exceptions"},
            {"It is a mutable sequence of characters", "It is an immutable sequence of characters", "It is a subclass of 'String'", "It is used for string comparison"},
            {"It is used to check the correctness of the program during runtime", "It is used to define a constant variable", "It is used to indicate that a block of code should always be executed", "It is used to enable or disable assertions in the Java Virtual Machine"}
    };
    public static String[] answers = {
            "Used for comparing primitive types",
            "Creating multiple methods with the same name in a class",
            "Specifies a superclass constructor to be called",
            "A method that belongs to the class rather than an instance",
            "It indicates that a variable cannot be modified",
            "LinkedList is faster than ArrayList",
            "It occurs when an object is accessed before it is initialized",
            "It is used to achieve mutual exclusion in multithreaded programs",
            "It indicates that a variable should not be serialized",
            "To specify code that must be executed regardless of whether an exception is thrown or not",
            "Used for checking the type of an object",
            "It refers to the current instance of the class",
            "It is used for converting primitive types to their corresponding object types",
            "It is a method that takes a variable number of arguments",
            "By using interfaces",
            "It is used for comparing objects",
            "It is the process of executing multiple threads concurrently",
            "It is used to specify resources that should be closed after the try block",
            "It is a mutable sequence of characters",
            "It is used to check the correctness of the program during runtime"
    };
}
