package develop.aventofcode.y2023.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ElfCalibration2Digits {

	public static void main(String[] args) {
 
		int totalSum = 0;
		for (int i = 0; i < args.length; i++) {
			 String calibrationInputStr = args[i];
			int calibrationValue  = calculatedCalibrationValue(calibrationInputStr);
			totalSum +=calibrationValue;
		}
	 
		System.out.println(" final value " + totalSum ) ;
	}

	private static int calculatedCalibrationValue(String calibrationInputStr) {
		 List<Integer> integerList = getFirstDigit(calibrationInputStr);
	  String  calibrationValue=   ""+integerList.get(0) + integerList.get(integerList.size()-1);
	  int calibrationValueNum = Integer.parseInt(calibrationValue) ;
		System.out.println(calibrationInputStr + " has calibration  value : " + calibrationValue);

		return calibrationValueNum;
	}
	private static List<Integer> getFirstDigit(String calibrationInputStr) {
		
		 Pattern integerPattern = Pattern.compile("-?\\d+");
		    Matcher matcher = integerPattern.matcher(calibrationInputStr);

		    List<Integer> integerList = new ArrayList<Integer>();
		    while (matcher.find()) {
		        integerList.add(Integer.parseInt(matcher.group()));
		    }

		    return integerList;
	}

}
