package LeetCode.IslandsProblem;

public class MultiDimensionalArrays {

    Object[][] multiArray;

    public MultiDimensionalArrays(int rows,int columns)
    {
        multiArray = new Object[rows][columns];
    }
    public Object[][] getMultiArray()
    {
        return multiArray;
    }
}
