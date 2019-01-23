package com.kate;
/*Kate Keil, 1/23/19, exercise 2, using arrays and loops*/
public class Main {

    public static void main(String[] args) {
	int highTemp[]={45,29,10,22,41,28,33};
	double precipitation[]={.95,.60,.25,.5,0,.75,.90};
	String[] day = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};

	for(int i=0; i<=6; i++){
		if (highTemp[i] <= 32 && precipitation[i] > .5)
		System.out.println("On " + day[i] + " the high is " + highTemp[i] + " and the chance of rain is " + precipitation[i] + " meaning it is likely to snow!");
	}


	



    }
}
