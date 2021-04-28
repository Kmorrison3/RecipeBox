/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestone2;

import java.util.ArrayList;

/**
 *
 * @author Tashe
 */
public class Milestone2 { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables 
 
    public class Recipe { 
    
    private String recipeName;
    
    private int servings;
    
    ArrayList<String> recipeIngredients = new ArrayList();
    
    private int totalRecipeCalories;
 
//Accessors and Mutators for the declared Variables
 
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    
    public String getRecipeName() {
        return recipeName;
    }
    
    public void setServings(int servings) {
        this.servings = servings;
    }
    
    public int getServings() {
        return servings;
    }
    
    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
    this.recipeIngredients = recipeIngredients;
    }
    
    public ArrayList<String> getRecipeIngredients() {
        return recipeIngredients;
    }
    
    public void setTotalRecipeCalories(int totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    public int getTotalRecipeCalories() {
        return totalRecipeCalories;
    }
    
//constructors   
        
    public Recipe() {
        this.recipeName = "";
        this.servings = 0; 
        this.recipeIngredients = new ArrayList<String>(); //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0;  
    }
    
//Overloaded Constructor

    public Recipe(String recipeName, int servings, 
    	ArrayList<String> recipeIngredients, int totalRecipeCalories) 
    {
        this.recipeName = recipeName;
        this.servings = servings;
        this.recipeIngredients = recipeIngredients;
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    
//Print Recipe Method
    
    public void printRecipe() {
        
        int singleServingCalories = (totalRecipeCalories / servings);
        
        System.out.println("Recipe: " + recipeName);
        
        System.out.println("Serves: " + servings);
        
        System.out.println("Ingredients: ");
        
        for (int i = 0; i < recipeIngredients.size(); i++) {  
            String ingredient = recipeIngredients.get(i);
            System.out.println(ingredient);
        }
        
        System.out.println("Each Serving Has " + singleServingCalories + " Calories.");
    }
 
 //Create New Recipe Method to Build Recipes Based on Input of User

    public Recipe addNewRecipe() {
        int totalRecipeCalories = 0;
        ArrayList <String> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
                
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        System.out.println("Please enter the number of servings: ");
        int servings = scnr.nextInt();

//Do-While loop to add more ingredients         
                
        do {
            System.out.println("Please enter the ingredient name or type 'end' if you are finished entering ingredients: ");
                String ingredientName = scnr.nextLine();
                
                if (ingredientName.toLowerCase().equals("end")) {
                    addMoreIngredients = false;
                    break;
                } 
            
                else {
                    recipeIngredients.add(ingredientName);
                    addMoreIngredients = true;
                
                    System.out.println("Please enter the number of units of the ingredient to be used: ");
                        int ingredientAmount = scnr.nextInt();
            
                    System.out.println("Please enter the ingredient Calories per unit: ");
                        int ingredientCalories = scnr.nextInt();
            
            totalRecipeCalories = (ingredientCalories * ingredientAmount);     
                 
            }
        }
            while (addMoreIngredients == true);
        
    Recipe recipe1 = new Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories);
    recipe1.printRecipe();
    return recipe1;
    }
    }
}
 

