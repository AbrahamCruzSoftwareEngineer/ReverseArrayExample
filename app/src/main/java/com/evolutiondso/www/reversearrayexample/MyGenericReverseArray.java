package com.evolutiondso.www.reversearrayexample;

/**
 * Created by Albrtx on 14/12/2016.
 */

public class MyGenericReverseArray {


    // generic method printArray

    /**
     *
     * @param <E>
     * @param sourceArray
     * @param destinyArray
     */
    public static <E> void revArray( E[] sourceArray, E[] destinyArray) {

        // Display array elements
        for (int i=0; i<sourceArray.length; i++){
            destinyArray[i] = sourceArray[sourceArray.length-1-i];
            System.out.println("Source pos: " + sourceArray[i] + " Destination pos: "+destinyArray[i]);
        }

        System.out.println("---------------------------------------------------");
    }

    public static void main(String args[]) {
        // Create arrays of Integer, Double and Character
        Integer[] intSource = { 1, 2, 3, 4, 5 };
        Integer[] intDestiny = new Integer[intSource.length];
        Double[] doubleSource = { 1.1, 2.2, 3.3, 4.4 };
        Double[] doubleDestiny = new Double[doubleSource.length];
        Character[] charSource = { 'H', 'E', 'L', 'L', 'O' };
        Character[] charDestiny = new Character[charSource.length];


        revArray(intSource,intDestiny);   // pass an Integer array
        revArray(doubleSource,doubleDestiny);   // pass an Integer array
        revArray(charSource,charDestiny);   // pass an Integer array






    }

}