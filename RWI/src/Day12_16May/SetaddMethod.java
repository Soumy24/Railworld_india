package Day12_16May;
import java.io.*;
import java.util.*;
public class SetaddMethod {
    public static void main(String args[])
    {
        Set<Integer> data = new LinkedHashSet<Integer>();
        data.add(31);
        data.add(21);
        data.add(41);
        data.add(11);
        data.add(61);
        data.add(51);
        System.out.println("data: " + data);
    }
}