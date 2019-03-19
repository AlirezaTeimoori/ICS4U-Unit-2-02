//---------------------------------------
//-- Created by:     Alireza Teimoori  --
//-- Created on:     Feb 12 2019       --
//-- Created for:    Unit 2-02         --
//-- Course Code:    ICS4U             --
//-- Teacher Name:   Chris Atkinson    --
//---------------------------------------
//-- This program is created to demo   --
//-- the coders ability in creating and--
//-- utilizing different functions for --
//-- for a class in Java               --
//---------------------------------------


import java.util.ArrayList;

class Stack { // Create class

    // Create a List for all the items 
    private final ArrayList<Integer> myStack = new ArrayList<Integer>();
    
    // The function used to add items to the stack
    public void push(int number) {

        // Add user input to the end of the arrayList
        myStack.add(number);
        System.out.println(number + " is now added to the stack.");
    }

    // The function used to call and remove an element from the stack
    public int pop() {

        int last = myStack.get(myStack.size()-1);
        myStack.remove(myStack.size()-1);
        System.out.println(last + " is now removed from the stack.");

        
        return last;
    }

    public String toString() {
    	
        String output = "";

        for (Integer count : myStack) {
            output += count + "\n";
        }
        return output.toString();
    }

}