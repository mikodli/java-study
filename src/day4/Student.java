package day4;

class Student {

	static int studentCount;

    String name;
    int korean;
    int english;
    int math;
    
    int getTotal() {
    	int total = korean + english + math;
    	
    	return total;
    }

    double getAverage() {
    	double avr = (double)(korean + english + math) / 3;
       
    	return avr;
    }    
}
