package com.guywmoore.walrus;

/**
 * Created by GuyMoore on 10/3/2014.
 */
public class FactManger
{
    //Variables
    String factsArray[];

    //Constructors
    public FactManger(String[] factsParam)
    {
        factsArray = factsParam;
    }

    //Methods

    //Gets a random fact from the fact array
    public String getFact()
    {
        int randomNum = (int) (Math.random() * factsArray.length);
        return factsArray[randomNum];

    }

    //Gets a random fact from a specified string array
    public String getFact(String[] factsParam)
    {
        int randomNum = (int) (Math.random() * factsParam.length);
        return factsParam[randomNum];
    }

    //Getters and Setters
    public String[] getFactsArray()
    {
        return factsArray;
    }
    public void setFactsArray(String[] factsParam)
    {
        factsArray = factsParam;
    }
}
