package Java8;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LearningStreams {
    static Integer y;
    public List<Car> carList = new ArrayList<>();
    public static void main(String []args){

/*
Pregunta 1

        if(10< 11);
        else System.out.println("Hi");
        System.out.println("Hello");


       Que imprimi ?

       Error de Compilacion
       Error de RunTime
       Hello
       Hi

Pregunta 2
        int x = 10;
        if(x++ == 10)
            if(x-- == 10)
                if(x==10);
                else x*=3;
            else x *=2;

        System.out.println(x);
 */
        if(11< 10);
        else System.out.println("Hi");
        System.out.println("Hello");
        List<String> nums  = Arrays.asList("0", "3", "6", "9");

        List<Integer> result = IntStream.rangeClosed(1, 3).boxed().collect(Collectors.toList());
        List<Integer> combinedResult = nums.stream()
                .flatMap(num -> Stream.of(0,2,4,6).map(res -> Integer.parseInt(num) + res))
                .collect(Collectors.toList());

        System.out.println(combinedResult);

        LearningStreams learningStreams = new LearningStreamsB();
        System.out.println(y);
          learningStreams.AnalyzeCarList();

        Stream<Car> streamCar = learningStreams.carList.stream();
        HashMap<Integer,Long> yearCount = new HashMap<>();
        streamCar.forEach(car -> {
            int year = car.getYear();
            yearCount.put(year, yearCount.getOrDefault(year, 0L) + 1);
        });
       yearCount.forEach((x,y)->System.out.printf("Year: %d:  Count: %d\n",x,y));

        Map<Integer,Long> carCountByYear = learningStreams.carList.stream()
                .collect(
                        Collectors.groupingBy(
                                Car::getYear
                                ,()-> new TreeMap<>(Comparator.reverseOrder())
                                ,Collectors.counting()));

        carCountByYear.forEach((x,y)-> System.out.printf("Year:%d has %d cars %n",x,y));

    }
    public void AnalyzeCarList(){
        //Reading a data set and using streams to manipulate the data
        String csvFilePath = "car_prices.csv";
        URL urlPath = getClass().getClassLoader().getResource(csvFilePath);

        try{
            Reader reader = Files.newBufferedReader(Paths.get(urlPath.toURI()));
            CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
            .setHeader()
            .setSkipHeaderRecord(true)
            .build();
            Iterable<CSVRecord> records = csvFormat.parse(reader);
            for(CSVRecord record : records){
                Car car = getCar(record);
                car.print();
                carList.add(car);
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    protected Car getCar(CSVRecord csvRecord) {
        int year = Integer.parseInt(csvRecord.get(0));
        String make = csvRecord.get(1);
        String model = csvRecord.get(2);
        String trim = csvRecord.get(3);
        String body = csvRecord.get(4);
        String transmission = csvRecord.get(5);
        String vin = csvRecord.get(6);
        String state = csvRecord.get(7);
        String condition = csvRecord.get(8);
        String odometer = csvRecord.get(9);
        String color = csvRecord.get(10);
        String interior = csvRecord.get(11);
        String seller = csvRecord.get(12);
        String mmr = csvRecord.get(13);
        String sellingPricePoint = csvRecord.get(14);
        String sellingDate = csvRecord.get(15);
        return new Car(year,make,model,trim,body,transmission,vin,state,condition,odometer,
        color,interior,seller,mmr,sellingPricePoint,sellingDate);
    }

    public LearningStreams(){}
}
