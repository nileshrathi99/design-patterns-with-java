package com.designPatterns.singleton.chocoholic;

public class ChocolateBoiler {

    private static ChocolateBoiler chocolateBoilerInstance;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(chocolateBoilerInstance == null){
            chocolateBoilerInstance = new ChocolateBoiler();
        }
        return chocolateBoilerInstance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            // fill the boiler with milk/chocolate mixture
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            // bring the contents to boil
            boiled = true;
        }
    }

    public boolean isBoiled() {
        return boiled;
    }

    public boolean isEmpty() {
        return empty;
    }

}
