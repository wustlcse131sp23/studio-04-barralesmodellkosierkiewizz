package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		

		StdDraw.setPenColor(120, 186, 45);
		StdDraw.filledRectangle(0.5, 0.5,1,.2);
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(0.5, 0.5,.2,.2);
		
		StdDraw.setPenColor(173, 0, 228);
		StdDraw.filledCircle(0.5, 0.5,.2);

		StdDraw.setPenColor(0,0,0);

		StdDraw.rectangle(.5, 0.5, 1, 0.2);				
	}
}