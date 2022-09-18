package edu.sjsu.assignment2;

import java.io.File;   //Class!
import java.io.FileNotFoundException;   //I need this???
import java.io.PrintWriter;   //alt + enter
import java.util.Scanner;

public class MyFile {

    // private String file1;      //has multiple strings!   //file is not a property!
    //private String file2;      //somethign is printed in it!

    public static void writePrimes(String file1, String file2) {   //file namesss!!  //doesent RETURN anything?
        //read in first
        //extract prime numbers!!! (seperated by commas, seperate items,can you have prmenumber in word??
        //write to second file
        //two strings as propertys member variables?? of MY File class
        //Scanner object in Main???
        //int prime = sc.nextLine();  //readsin file!
        //System.out.println(prime);              //printf   print formatted string without terminating the line
        try {
            File inputFile = new File(file1);  //öffnet file
                                                     //scanner sucht nur in der Root, (Homework3) project!
            Scanner in = new Scanner(inputFile);  //read_csv(delimter = ,), scanner ist file in lesbaren forma  //object hat methoden
            PrintWriter out = new PrintWriter(file2);

            while (in.hasNextLine()) {   //true while file has a next line!
                String line = in.nextLine();   //reads in from keyboard and puts in string variable TODO stripTrailing())
                Scanner lineReader = new Scanner(line);   //different scanner object, to print later why have to be different?
                lineReader.useDelimiter(",");

                while (lineReader.hasNext()) {
                    String word = lineReader.next();  //lineReader wrude durch useDelimiter verändert, wird in string abgespreicher
                    try {
                        int num = Integer.parseInt(word);
                        /*int prime = 0;
                        if sojfa
                        % Rest == 0 we
                        for i

                        if % != 0;


                         */

                        if (num == 5) {
                            out.println(word);
                        }


                    } catch (NumberFormatException e) {
                       continue;
                    }
                    //added System.out!  //should print it to file2...
                }
            }
            in.close();
            out.close();


        } catch (
                FileNotFoundException e) {   //hab da einfach  mal was importiert!, other exception, false input, can I throw 2 at same time?
            System.out.println("File not found!");
        }


    }
}
/**
 * Tool outputs webpage of API:  in HTML keyword search
 **/

//Todo  cathc statement correct?  ist eignlch nur if schleife für besonderheiten?
//Todo was ist dieses Scanner object?  Output?
//Todo   why prints File1, why doesent find File1!