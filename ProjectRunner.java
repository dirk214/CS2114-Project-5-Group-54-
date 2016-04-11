package prj5;

public class ProjectRunner
{

    public static void main(String[] args)
    {
        @SuppressWarnings("unused")
        DataSorter start;
        if (args.length != 0)
        {
            start = new DataSorter(args[0]);
        }
        else 
        {
            start = new DataSorter("input.txt");
        }
    }

}
