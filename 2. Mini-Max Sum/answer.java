import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    long minSum = 0;
    long maxSum = 0;
    // Write your code here
    /*order by asc*/
    Collections.sort(arr);
    /*min sum = sum of num that exclude last index*/
    for(int i = 0 ; i < arr.size() ; i++){
        if(i < arr.size()-1){
            minSum += (long) arr.get(i);
        }
    }
    /*max sum = sum of num that exclude first index*/
    for(int i = 0 ; i < arr.size() ; i++){
        if(i!=0){
            maxSum += (long) arr.get(i);
        }    
    }
    System.out.println(minSum+" "+maxSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
