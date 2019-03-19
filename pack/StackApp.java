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



class StackApp { // Create class
    public static void main(String[] args) { // Main function

        // Bring an instance of Stack
        Stack stack = new Stack();

        // Add elements using push function
        stack.push(88);
        stack.push(21);
        stack.push(1);
        stack.push(6);

        stack.pop();

        // Print stack
        System.out.println(stack.toString());
    }
}