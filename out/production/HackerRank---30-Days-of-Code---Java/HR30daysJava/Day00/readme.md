# Stream
* Think of this as the flow of data from one place to another.

* Most of our challenges require you to read input from `System.in` (also known as `stdin`, 
  the standard input stream), and write output to `System.out` (also known as `stdout`, 
  the standard output stream).
    
* In Java, the Scanner class is widely used to read input, but each language has its own 
  mechanism for handling IO (input and output).
  
The syntax for reading from `stdin` using the `Scanner` class is as follows:

`Scanner scan = new Scanner(System.in);`
    * This creates a `new Scanner` object that reads from the `System.in` stream and can be 
accessed using the variable name. 
    * To read in information from `stdin`, you just need to apply Scanner's methods to your 
scanner object. Here are two basic examples:
```java
scan.next(); // returns the next token of input
scan.hasNext(); // returns true if there is another token of input (false otherwise)
scan.nextLine() // returns the next LINE of input
scan.hasNextLine(); // returns true if there is another line of input
```

> Check out the comprehensive list of Scanner methods to learn more.

* When you are finished reading from an input stream, you should close it to avoid a 
  resource leak. The following line of code closes the Scanner object referenced by our  variable:
```java
scan.close();
```

## Example
* Let's say we want to assign a value received from `stdin` to some String that we'll name,
  and then print it. We can accomplish this with the following code:
```java
Scanner scan = new Scanner(System.in); // open scanner
String s = scan.next(); // read the next token and save it to 's'
scan.close(); // close scanner
System.out.println(s); // print 's' to System.out, followed by a new line
```

> You can also print text in quotes using `System.out.println`, or combine quoted text with 
> a variable (e.g.: `System.out.println("Input received: " + s);`).