package edu.handong.csee.java.hw2.math;
/**
 * MathCalculator class contains all the methods that have the formulas and essential code for the calculator's functions (e.g getMax, getSum, getFactorial) 
 */
public class MathCalculator{

    private String name;

    /**
    * setName method stores the name of the Driver as a String.
    */
    public void setName(String name){
        this.name = name;
    }
    /**
    * getName returns the name that was stored in setName as a String.
    */
    public String getName(){
        return name;
    }
    /**
    * getMax receives two ints and returns the larger of both values as an int.
    */
    public int getMax(int a, int b){
        if(a > b)
        return a;
        else 
        return b;
    }
    /**
    * getMin receives two ints and returns the lesser of both values as an int.
    */
    public int getMin(int a, int b){
        if(a > b)
        return b;
        else
        return a;
    }
    /**
    * getMax receives one int and returns it's absolute value as an int. (e.g -5 = 5)
    */
    public int getAbs(int a){
        a = (a < 0) ? - a : a;
        return a;
    }
    /**
    * getSum receives two ints and returns the sum of both values as an int.
    */
    public int getSum(int a, int b){
        int c = a + b;
        return c;
    }
    /**
    * getDiff receives two ints and returns the difference between both values as an int.
    */
    public int getDiff(int a, int b){
        int c = a - b;
        return c;
    }
    /**
    * getProduct receives two ints and returns the product of both values as an int.
    */
    public int getProduct(int a, int b){
        int c = a * b;
        return c;
    }
    /**
    * getQuotient receives two ints and returns the quotient of both values as an int.
    */
    public int getQuotient(int a, int b){
        int c = a / b;
        return c;
    }
    /**
    * getRemainder receives two ints and returns the remainder of the first int, subtracted by the second int.
    */
    public int getRemainder(int a, int b){
        int c = a % b;
        return c;
    }
    /**
    * getPower receives two ints and returns the value of the first int to the power of the second int.
    */
    public int getPower(int a, int b){
        int c = 1;
        for(; b != 0; --b){
            c *= a;
        }
        return c;
    }
    /**
    * getFactorial receives one int and returns its factorial as an int.
    */
    public int getFactorial(int a){
        int c = 1;
        if(a == 0)
            return 1;
        else{
            for(int i = 2; i <= a; i++){
                c = c * i;
            }
            return c;
        }
    }
    /**
    * getGcd receives two ints and returns the GCD of both numbers as an int.
    */
    public int getGcd(int a, int b){
        int c = 1;
        for(int i = 1; i <= a && i <= b; i++){
            if(a % i == 0 && b % i == 0)
            c = i;
        }
        return c;
    }
    /**
    * getLcm receives two ints and returns the LCM of both numbers as an int.
    */
    public int getLcm(int a, int b){
        int c; 
        c = (a > b) ? a : b; //Set C as the max number between a and b;
        while(true){
            if(c % a == 0 && c % b == 0){
                break;
            }
        c++;
        }
        return c;
    }
    /**
    * getSquare receives two ints and returns the square as an int.
    */
    public int getSquare(int a){
        a = a * a;
        return a;
    }
}