package LeetCode.IslandsProblem;

import java.text.DecimalFormat;

public class islandsSearchAlgorithm {
    Object worldArray;
    int islandsFound;
    int lastRow;
    int lastColumn;


    public islandsSearchAlgorithm(int rows, int columns)
    {

        MultiDimensionalArrays multiDimensionalArrays = new MultiDimensionalArrays(rows,columns);
        worldArray = multiDimensionalArrays.getMultiArray();
        islandsFound = 0;
        lastRow = ((Object[][])worldArray).length;
        lastColumn = ((Object[][])worldArray)[0].length;
        generateIslands();
        printMap(" 0");
        findIslands();
        System.out.println("Islands Found: " + islandsFound);
        printMap(" 00");
    }
    public void generateIslands()
    {
        for(int rows = 0; rows < ((Object[][])worldArray).length; rows++)
        {
            for(int columns = 0; columns < ((Object[][]) worldArray)[rows].length; columns++)
            {
                int random = (int)(Math.random()*2)-1;
                ((Object[][]) worldArray)[rows][columns] = random;
            }
        }
    }
    public void printMap(String format)
    {
        DecimalFormat ft = new DecimalFormat(format);
        for(int rows = 0; rows < ((Object[][])worldArray).length; rows++)
        {
            for(int columns = 0; columns < ((Object[][])worldArray).length; columns++)
                System.out.printf(ft.format(Math.abs((int)((Object[][])worldArray)[rows][columns])));
            System.out.println();
        }
    }
    public void findIslands()
    {
        for(int rows = 0; rows < ((Object[][])worldArray).length; rows++)
        {
            for(int columns = 0; columns < ((Object[][]) worldArray)[rows].length; columns++)
            {
                if((int)((Object[][]) worldArray)[rows][columns] == -1)
                {
                    islandsFound++;
                    islandsTraversal(rows,columns);
                }
            }
        }
    }

    public void islandsTraversal(int currentRow, int currentColumn)
    {
        if(currentRow >=0 && currentRow < lastRow && currentColumn >= 0 && currentColumn < lastColumn)
        {
            if((int)((Object[][]) worldArray)[currentRow][currentColumn] == -1)
            {
                ((Object[][]) worldArray)[currentRow][currentColumn] = islandsFound;
                islandsTraversal(currentRow, currentColumn-1);
                islandsTraversal(currentRow, currentColumn+1);
                islandsTraversal(currentRow-1, currentColumn);
                islandsTraversal(currentRow+1, currentColumn);
            }
        }
    }
}
