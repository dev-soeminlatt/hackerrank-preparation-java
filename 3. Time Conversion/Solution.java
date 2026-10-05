import java.io.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String formattedTime = s.replace("AM", "").replace("PM", "");
    String[] time = formattedTime.split(":");
    int hours = Integer.parseInt(time[0]);
    int minutes = Integer.parseInt(time[1]);
    int seconds = Integer.parseInt(time[2]);
    if(s.contains("AM") && hours == 12) hours = 0;
    if(s.contains("PM") && hours != 12) hours += 12;
    return String.format("%02d:%02d:%02d",hours, minutes, seconds);
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
