package com.bloomtech.welcomeletter.fileIO;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FileManager {
//    private static final int BUFFER_SIZE = 256;
//    File inFile;
//    File outFile;
//    FileInputStream inStream;
//    FileOutputStream outStream;
//    byte[] buffer = new byte[BUFFER_SIZE];
//    int bytesRead;
    public FileManager() {
    }

    public String getTextFromFile(String filename) throws FileNotFoundException {
        String returnString = "";
        try {
            FileReader fileReader = new FileReader("src/resources/" + filename + ".txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                returnString += line + "\n";
                line = bufferedReader.readLine();
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");

        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(returnString);
        return returnString;
    }

    public void writeTextToFile(String outFileName, String text) throws FileNotFoundException {
        try {
            FileWriter fileWriter = new FileWriter("src/resources/out/" + outFileName + ".txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(text);

            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //    public String getTextFromFile(String filename) {
//        inFile = new File("src/resources/" +filename +".txt");
//        String returnString = "";
//
//        try {
//            inStream = new FileInputStream(inFile);
//            bytesRead = inStream.read(buffer);
//
//            while (bytesRead > 0) {
//                returnString += Arrays.toString(buffer);
//                bytesRead = inStream.read(buffer);
//            }
//            inStream.close();
//        } catch (IOException e) {
//            System.err.println(e);
//            System.exit(1);
//        }
//        return returnString;
//    }

//    public void writeTextToFile(String outFileName, String text) {
//        outFile = new File("/src/resources/out/" + outFileName +".txt");
//        try {
//            inStream = new FileInputStream(text);
//            outStream = new FileOutputStream(outFile);
//            bytesRead = inStream.read(buffer);
//            while (bytesRead > 0) {
//                outStream.write(buffer, 0, bytesRead);
//                bytesRead = inStream.read(buffer);
//            }
//            inStream.close();
//            outStream.close();
//        } catch (IOException e) {
//            System.err.println(e);
//        }
//    }
}