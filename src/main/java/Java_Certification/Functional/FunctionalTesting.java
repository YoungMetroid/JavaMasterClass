package Java_Certification.Functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalTesting {
    static int sumTotal = 0;
    static List<String> courses = Arrays.asList(
            "Spring",
            "Spring Boot",
            "API",
            "Microservices",
            "AWS",
            "PCF",
            "Azure",
            "Docker",
            "Kubernetes");

    public static void main(String ... args) {


        List<Object> listOfObjects = new ArrayList<>();
        listOfObjects.add(1);
        listOfObjects.add("Isra");
        listOfObjects.add("Felipe");
        listOfObjects.add("Ruben");
        listOfObjects.add(2L);
        listOfObjects.add(true);
        listOfObjects.add(3f);

        List<Integer> listofNumber = listOfObjects.stream()
                .filter(x -> x instanceof Number)
                .map(x -> ((Number)x).intValue()).collect(Collectors.toList());

        listofNumber.stream().map(x -> x*x).forEach(System.out::println);





        printAllNumbersInListStructured(Arrays.asList(12,9,13,4,6,2,4,12,15));
        printAllNumbersInListFunctional(Arrays.asList(12,9,13,4,6,2,4,12,15));
        printOddNumbers(Arrays.asList(12,9,13,4,6,2,4,12,15));
        squaresOfEvenNumber(Arrays.asList(12,9,13,4,6,2,4,12,15));

        System.out.println("Printing square of even numbers using generics with Predicates and mapping");
        printListWithMappingAndFilter(Arrays.asList(12,9,13,4,6,2,4,12,15), x-> x*x,x-> x %2 ==0);

        System.out.println("Printing power or 4 of all numbers using generics with Predicates and mapping");
        printListWithMappingAndFilter(Arrays.asList(12,9,13,4,6,2,4,12,15), FunctionalTesting::elevateToThePowerOf4,x->true);
        System.out.println("Empty List");
        printListWithMappingAndFilter(new ArrayList<Integer>(), x-> x*x, x->true);

        cubeOfOddNumbers(Arrays.asList(12,9,13,4,6,2,4,12,15));
        //
        System.out.println("Printing cube of odd numbers using generics with Predicates and mapping");
        printListWithMappingAndFilter(Arrays.asList(12,9,13,4,6,2,4,12,15), x-> x*x*x, x -> x % 2 ==1);
        cubeOfOddNumbers(Arrays.asList(12,9,13,4,6,2,4,12,15));

       printList(courses);

        System.out.println("Printing courses that contain spring");
        printListWithFilter(courses, x-> x.toLowerCase().contains("spring"));

        System.out.println("Printing courses that has at least 4 letters");
        printListWithFilter(courses, x->x.length() >=4);

        System.out.println("Print the number of characters in each course name");
        printListWithMapping(courses, String::length);


    }
    public static int elevateToThePowerOf4(int number){
        return number* number *number* number;
    }

    public static void printList(List<String> courses){
        System.out.println("Printing the courses:");
        courses.stream().forEach(System.out::println);
    }
    public static <T> void printListWithFilter(List<T> courses, Predicate<T> filter){
        courses.stream()
                .filter(filter)
                .forEach(System.out::println);
    }
    public static <T,R> void printListWithMapping(List<T> courses, Function<T,R> mapping){
        courses.stream()
                .map(mapping)
                .forEach(System.out::println);
    }
    public static <T,R> void printListWithMappingAndFilter(List<T> courses, Function<T,R> mapping,Predicate<T> filter){
        courses.stream()
                .filter(filter)
                .map(mapping)
                .forEach(System.out::println);
    }
    public static void printAllNumbersInListStructured(List<Integer> numbers){
        System.out.println("Structured way of iterating through a list:");
        for(Integer num : numbers){
            System.out.println(num);
        }
    }
    private static void print(int number){
        sumTotal += number;
        System.out.println( number);
    }
    private static void print2(){
        System.out.println("Testing");
    }
    public static void printAllNumbersInListFunctional(List<Integer> numbers){
        System.out.println("Functional way of iterating through a list:");
        // Method 1
        // Creating a method to print in the forreach
        System.out.println("Total sum: " + sumTotal);

        // Method 2
        // So you can send a function in the foreach as long as the method sends a parameter
        numbers.forEach(System.out::println);
    }
    public static void printEvenNumbers(List<Integer> numbers){

        //Method 1
        System.out.println("Printing even numbers with a lambda expression defined inside the filter");
        numbers.stream().filter(x-> x%2 ==0).forEach(System.out::println);

        //Method 2
        //Passing a boolean method that checks if the number is even
        System.out.println("Printing even numbers using the isEven method in the filter");
        numbers.stream().filter(FunctionalTesting::isEven).forEach(System.out::println);

        //Method 3
        //Creating a predicate that checks if the number is even
        System.out.println("Printing even numbers only a Predicate in the filter");
        Predicate<Integer> isEvenP = i -> i % 2 == 0;
        numbers.stream().filter(isEvenP).forEach(System.out::println);
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static void printOddNumbers(List<Integer> numbers){
        System.out.println("Printing odd numbers:");
        numbers.stream().filter(x -> x % 2 == 1).forEach(System.out::println);
    }
    public static void squaresOfEvenNumber(List<Integer> numbers){
        System.out.println("Printing Squares of even numbers:");
        numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x*x)
                .forEach(System.out::println);
    }
    public static void cubeOfOddNumbers(List<Integer> numbers){
        System.out.println("Printing Cube of odd numbers using a method with a hard coded filter and mapping:");
        numbers.stream()
                .filter(x -> x % 2 == 1)
                .map(x -> x*x*x)
                .forEach(System.out::println);
    }

}
