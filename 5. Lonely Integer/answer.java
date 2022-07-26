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
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    List<Integer> tempNum = new ArrayList<Integer>();
    Collections.sort(a);
    System.out.println(a);
        
        for(int i = 0 ; i < a.size() ; i ++){
            
            boolean isFirstIndex = i == 0 ? true : false;
            boolean isLastIndex = i == a.size()-1 ? true : false;
            int currentValue = a.get(i);
            int previousValue = i > 0 ? a.get(i-1) : -1;
            int nextValue = i < a.size()-1 ? a.get(i+1) : -1;
            
            // for first index
            if(isFirstIndex && currentValue != nextValue){
                tempNum.add(a.get(i));    
            }
            
            // for middle index
            else if(!isFirstIndex && !isLastIndex && currentValue != previousValue && currentValue != nextValue){
                tempNum.add(a.get(i));
            }
            
            // for last index
            else if(isLastIndex && currentValue != previousValue){
                tempNum.add(a.get(i));
            }

        }
        return tempNum.get(0);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
