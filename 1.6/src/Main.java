/* Time spent: 8.0 hours */


import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
public class Main {


    public static void main(String args[]) {
    	test x = new test();

    	int[][] twoDAry= new int[][]{{2,3,4,5,6},{7,8,9,10,11},{12,13,14,15,16},{17,18,19,20,21},{22,23,24,25,26}};
    	int[][] afRotate= x.rotate(twoDAry, 5);
    	for (int i =0; i < afRotate.length; i++) {
    		for (int j = 0; j <afRotate.length ; j++) {
    			System.out.print(" " + afRotate[i][j]);
  	  		}
    		System.out.println("");
  	  	}
    }

}
