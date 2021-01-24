package edu.escuelaing.arep.app;

import java.lang.Math;
import java.util.LinkedList;


class Statics {
	public static Double mean(LinkedList<Double> numbers){
		Double  sum=0.0;
		for(Double num: numbers){
			sum+=num;
		}
		return sum/ numbers.size();
	}

	public static Double standardDesviation(LinkedList<Double> numbers){
		Double mean = mean(numbers);
		Double temp = 0.0;
		for(Double num: numbers){
			temp+= Math.pow(num-mean, 2);
		}
		Double inSide = temp/numbers.size();
		return Math.sqrt(inSide);
	}
}
