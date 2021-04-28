/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestone1;

import java.util.ArrayList;

/**
 *
 * @author Tashe
 */
public class Milestone1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // In original ingredient code change data types
       
        
        String nameOfIngredient = "";
        String unitMeasurement = "";
        ArrayList<String> ingredientList = new ArrayList();
        int ingredientAmount = 0;
        int numberOfCaloriesPerUnit = 0;
        int totalCalories = 0;
        boolean addMoreIngredients = true;
           
         
        // USer will enter the name of ingredient at the prompt
            
        System.out.println ("Please Enter Ingredient Name:");
        
            if (scnr.hasNext()) {
                nameOfIngredient = scnr.nextLine();
            }
            else {
            System.out.println("Please enter a valid name. Please use only charcters:");
            }
        // User will be prompted to enter in a unit of measurement to use
        System.out.println( "Enter Unit of Measurement for this Ingredient:");
        unitMeasurement = scnr.next();
        
        //Prompt user for unit of measurement
        System.out.println("Enter the Unit of Measurement for this Ingredient. You have the following options:");
	System.out.println("Cup(s)");
	System.out.println("Tbsp(s)");
	System.out.println("Tsp(s)");
	System.out.println("Gram(s)");
        System.out.println("Type a unit of measurement exactly as it appears in this list above.");
		
	if (scnr.hasNext()) {
            unitMeasurement = scnr.next();
            
            if (!"Gram(s)".equals(unitMeasurement) && !"Cup(s)".equals(unitMeasurement) && !"Tbsp(s)".equals(unitMeasurement) && !"Tsp(s)".equals(unitMeasurement)) {
                System.out.println("Please enter one of the preceding options.");
                }
			
            else {
                System.out.println("You have selected " + unitMeasurement);
                }
            }
        
	else {
            System.out.println("Please enter one of the preceding options.");
		
		
            if (scnr.hasNext()) {
                unitMeasurement = scnr.next();
                 
                if (!"Gram(s)".equals(unitMeasurement) && !"Cup(s)".equals(unitMeasurement) && !"Tbsp(s)".equals(unitMeasurement) && !"Tsp(s)".equals(unitMeasurement)) {
                    System.out.println("Unit not recognized. You are out of attempts.");
                }
			
            else {
                System.out.println("You have selected " + unitMeasurement);
                }
            }
        }
                
//This will prompt the user to enter in a unit of measurement to be used 
        System.out.println("Please enter the number of " + unitMeasurement + " of " + nameOfIngredient + " required (between 1 and 1000: )");
			
	if (scnr.hasNextInt()) {
            ingredientAmount = scnr.nextInt();
				
            if ((ingredientAmount >= 1) && (ingredientAmount <= 1000)) {
		System.out.println(ingredientAmount + " is a valid amount. Any recipes using this "
                        + "ingredient will require " + ingredientAmount + " " + unitMeasurement + " of " + nameOfIngredient); 	
            }			
            else {
		System.out.println(ingredientAmount + " is not a valid amount.");
		System.out.println("Please enter a valid number of units between 1 and 1000: ");
                    if (scnr.hasNextInt()) {
                        ingredientAmount = scnr.nextInt();
				
                        if ((ingredientAmount >= 1) && (ingredientAmount <= 1000)) {
                            System.out.println(ingredientAmount + " is a valid amount!"); 	
                        }
                        else if (ingredientAmount < 1) {
                            System.out.println(ingredientAmount + " is less than 1 unit. Sorry, you are out of attempts.");
                        }
                        else {
                            System.out.println(ingredientAmount + " is greater than 1000 units. Sorry, you are out of attempts.");
                        }
            }
        }
    }
        
    else {
        System.out.println("Error: This is not a number. Sorry, you have used all attempts .");
	}
	
//This will prompt the user to enter the number of calories per unit of the ingredient 
        System.out.println("Please enter the number of calories per " + unitMeasurement + " of " + nameOfIngredient + " (between 1 and 2000): ");
        
    if (scnr.hasNextInt()) {
        numberOfCaloriesPerUnit = scnr.nextInt();
			
        if ((numberOfCaloriesPerUnit >= 1) && (numberOfCaloriesPerUnit <= 1000)) {
            System.out.println(numberOfCaloriesPerUnit + " is a valid number of calories."); 	
        }
        else {
            System.out.println(numberOfCaloriesPerUnit + " is not a valid number of calories.");
            System.out.println("Please enter a valid number of calories per unit between 1 and 1000: ");
            
            if (scnr.hasNextInt()) {
                numberOfCaloriesPerUnit = scnr.nextInt();
        
                if ((numberOfCaloriesPerUnit >= 1) && (numberOfCaloriesPerUnit <= 1000)) {
                    System.out.println(numberOfCaloriesPerUnit + " is a valid number of calories!"); 	
                }
                
                else if (numberOfCaloriesPerUnit < 1) {
                    System.out.println(numberOfCaloriesPerUnit + " is less than 1. Sorry, you are out of attempts.");
                }
                
                else {
                    System.out.println(numberOfCaloriesPerUnit + " is greater than 1000. Sorry, you are out of attempts.");
                }
            }
        }
    }
    
    else {
        System.out.println("Error: That is not a number. Sorry, you are out of attempts.");
        }
    

//The amount of Calries will then be calculated.
        totalCalories = ingredientAmount * numberOfCaloriesPerUnit;
        
        System.out.println("Congratulations!");
        System.out.println("Any recipe that uses " + nameOfIngredient + " will use " + ingredientAmount + " number of " + 
                unitMeasurement + " of " + ingredientAmount + " which contains " + totalCalories + " total calories.");
	
        System.out.println("Ingredient has been successfully added.");
        
           }
        }		

    
    

