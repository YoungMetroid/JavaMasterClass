package Java8;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LearningStreamsB extends LearningStreams{
    @Override
    public void AnalyzeCarList() {
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
                car.setYear(car.getYear()+10);
                carList.add(car);
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
