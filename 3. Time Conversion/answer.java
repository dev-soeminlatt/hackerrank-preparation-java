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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String timeFormat = s.substring(8,10);
    String hour = s.substring(0,2);
    if(timeFormat.equalsIgnoreCase("PM")){
        if(!hour.equalsIgnoreCase("12")){
            int convert24Hour = Integer.parseInt(hour) + 12;
            s = s.replace(hour, String.valueOf(convert24Hour));
        }
         s = s.replace("PM", "");
    }
    else if(timeFormat.equalsIgnoreCase("AM")){
        if(hour.equalsIgnoreCase("12")){
            s = s.replaceFirst("12", "00");
        }
        s = s.replace("AM", "");
    }
    return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
