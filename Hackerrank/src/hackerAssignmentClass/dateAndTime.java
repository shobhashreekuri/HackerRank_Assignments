/*
 * You are given a date. You just need to write the method, , which returns the day on that date.
 * For example, if you are given the date August 14 2015 , the method should return Monday
 *  as the day on that date.
 */

package hackerAssignmentClass;

import java.io.*;
import java.time.LocalDate;

	class Result{
		
		public static String findDay(int month ,int day, int year) {
			int d = Integer.valueOf(day);
			int m = Integer.valueOf(month);
			int y = Integer.valueOf(year);
			LocalDate date = LocalDate.of(y, m, d);
			return date.getDayOfWeek().toString();
		}
	}
public class dateAndTime {

		    public static void main(String[] args) throws IOException {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		    	
		    	
		        int month = Integer.parseInt(firstMultipleInput[0]);

		        int day = Integer.parseInt(firstMultipleInput[1]);

		        int year = Integer.parseInt(firstMultipleInput[2]);

		        String res = Result.findDay(month, day, year);

		        bufferedWriter.write(res);
		        bufferedWriter.newLine();

		        bufferedReader.close();
		        bufferedWriter.close();
		    }
		

	}


