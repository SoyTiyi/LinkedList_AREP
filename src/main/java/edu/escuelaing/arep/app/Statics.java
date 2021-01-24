package edu.escuelaing.arep.app;

import java.lang.Math;


class Statics {
	public static Double mean(LinkedList numbers){
		Double  sum=0.0;
		for(int i=0; i<numbers.size(); i++){
			sum += numbers.get(i);
		}
		return sum/ numbers.size();
	}

	public static Double standardDesviation(LinkedList numbers){
		Double mean = mean(numbers);
		Double temp = 0.0;
		for(int i=0; i<numbers.size(); i++){
			temp+= Math.pow(numbers.get(i)-mean, 2);
		}
		Double inSide = temp/numbers.size();
		return Math.sqrt(inSide);
	}
}
