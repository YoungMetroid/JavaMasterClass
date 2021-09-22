package Personal;

import java.awt.image.CropImageFilter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static String SecondDisk = "E:" + File.separator;
    public static void  main(String[] args) {

        if(Integer.parseInt(args[0]) == 1)
        {
            Circle();
        }
        else if(args[0] == "2")
        {
            Elipse();
        }
        File folder = new File(SecondDisk);
        File[] files = folder.listFiles();


        for (File file : files)
        {
            try
            {
                Path path = Paths.get(file.getAbsolutePath());
                double bytes = Files.size(path);
                System.out.println(String.format("%.10f : " + file.getName(), bytes / 1073741824));
                System.out.println(bytes);
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
                System.out.println(ex.toString());
            }
        }
    }

    public static void Circle()
    {
        System.out.println("Circle");
    }
    public static void Elipse()
    {
        System.out.println("Elipse");
    }
}

