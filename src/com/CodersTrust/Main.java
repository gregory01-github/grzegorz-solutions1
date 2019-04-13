package com.CodersTrust;

public class Main {

    public static void main(String[] args) {

    // int has a width of 32
	int myMinValue =  -2_147_483_648;
	int myMaxValue =  2_147_483_647;
	int myTotalValue = (myMinValue/2);

    //byte has a width of 8
	byte myByteValue = -128;
	byte myNewByteValue = (byte) (myByteValue/2);
	System.out.println("MyNewByteValue = " + myNewByteValue);

	//short has a width of 16
	short myShortValue = -32768;
	short myNewShortValue = (short) (myShortValue/2);
	System.out.println("MyNewShortValue = " + myNewShortValue);

	//long has a width of 64
	long myLongValue = 50000 + 10 * (myByteValue + myShortValue + myMaxValue);
	System.out.println("myLongValue = " + myLongValue);
	System.out.println();

	//Task - new version
	byte myByteValue1 = 10;
	short myShortValue1 = 20;
	int myIntValue1 = 50;

	long longTotal1 = 50000 + 10 * (myByteValue1 + myShortValue1 + myIntValue1);
	long longTotal2 = 50000L + 10L * (myByteValue1 + myShortValue1 + myIntValue1);
	short shortTotal = (short) (1000 + 10 * (myByteValue1 + myShortValue1 + myIntValue1));
	System.out.println("longTotal = " + longTotal1);
	System.out.println("longTotal2 = " + longTotal2);
	System.out.println("shortTotal = " + shortTotal);
    }
}