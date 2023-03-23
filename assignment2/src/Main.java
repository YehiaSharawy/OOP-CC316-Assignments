public class Main {
    public static void main(String[] args) {
        MyInteger i = new MyInteger(4);
        System.out.println(i.isEven());
        System.out.println(i.isOdd());
        System.out.println(i.isPrime());
        System.out.println(MyInteger.isEven(5));
        System.out.println(MyInteger.isOdd(5));
        System.out.println(MyInteger.isPrime(5));
        System.out.println(MyInteger.isEven(new MyInteger(7)));
        System.out.println(MyInteger.isOdd(new MyInteger(7)));
        System.out.println(MyInteger.isOdd(new MyInteger(7)));
        System.out.println(i.equals(4));
        System.out.println(i.equals(9));
        System.out.println(i.equals(new MyInteger(4)));
        System.out.println(i.equals(new MyInteger(2)));
    }
}

//(The MyInteger class) Design a class named MyInteger. The class contains:
//        • An int data field named value that stores the int value represented by this
//        object.
//        • A constructor that creates a MyInteger object for the specified int value. A
//        getter method that returns the int value.
//        • The methods isEven(), isOdd(), and isPrime() that return true if the value in
//        this object is even, odd, or prime, respectively.
//        • The static methods isEven(int), isOdd(int), and isPrime(int) that return true if
//        the specified value is even, odd, or prime, respectively.
//        • The static methods isEven(MyInteger), isOdd(MyInteger), and
//        isPrime(MyInteger) that return true if the specified value is even, odd, or
//        prime, respectively.
//        • The methods equals(int) and equals(MyInteger) that return true if the value
//        in this object is equal to the specified value.
//        • Draw the UML diagram for the class and then implement the class. Write
//        a client program that tests all methods in the class.