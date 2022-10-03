package com.example.projects_auk;

import java.util.Scanner;
import java.util.Random;

public class ArraysPart1_2 {
    public static void main(String[] args)
    {
        while(inGame())
        {
            System.out.println("Hi! Please, enter number of elements you want:");
            int elementsNum = userIn();
            System.out.println("Do you want to fill an array by yourself? (1 = Yes, 2 = No)");
            int generateHimself = userIn();
            if (generateHimself == 1){
                bubbleSort(inputArray(elementsNum)); //User fills an array by him/herself
            } else {
                bubbleSort(randArray(elementsNum)); //Array fills by random values
            }
        }
    }

    //1.1 Array Output
    public static void arrayOutput(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++)
            System.out.print(inputArray[i] + " ");
        System.out.println();
    }

    //1.2 Array of given length with random values
    public static int[] randArray(int arrSize)
    {
        int[] array = {};
        array = new int[arrSize]; //size of array from users input
        Random ran = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = ran.nextInt(100); //fill array with numbers below 100
        }
        System.out.println("You array looks like this:\n");
        arrayOutput(array);
        return array;
    }

    //1.3 Array of given length with given values
    public static int[] inputArray(int arrSize)
    {
        int[] array = new int[arrSize];
        int arrlength = array.length;
        for (int i = 0; i < arrlength; i++)
        {
            System.out.println("Enter value that you want to add to your array" +
                    "\n you've got " + (arrlength - i) + " elements left:");
            array[i] = userIn();
        }
        System.out.println("Your array looks like this:\n");
        arrayOutput(array);
        return array;
    }

    //1.4 Bubble sort
    public static void bubbleSort(int[] inputArray)
    {
        int tempVal = 0;
        boolean changed = false;
        for (int i = 0; i < inputArray.length - 1; i++)
        {
            changed = false;
            for (int x = 0; x < inputArray.length - 1; x++)
            {
                if (inputArray[x] > inputArray[x + 1])
                {
                    tempVal = inputArray[x];
                    inputArray[x] = inputArray[x + 1];
                    inputArray[x + 1] = tempVal;
                    changed = true;
                }
            }
            if (changed == false) break;
        }
        System.out.println("After sorting your array looks like this:\n");
        arrayOutput(inputArray);
    }

    public static int userIn()
    {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static boolean inGame ()
    {
        System.out.println("Do you want to continue? (1 = Yes, 2 = No) :");
        int wannaplay = userIn();
        if (wannaplay == 1) {
            System.out.println("Okay, lets do it one more time");
            return true;
        }
        else if (wannaplay == 2){
            System.out.println("Okay, thank you for your time, bye!");
            return false;
        }
        System.out.println("That is something different from 1 or 2");
        return false;
    }
}