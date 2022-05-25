import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super (600, 400, 1); 
        
       addObject(new Playerone(),300,200);
       addObject(new Botone(),190,90);
       addObject(new Bottwo(),410,335);
       addObject(new Botthree(),180,325);
       addObject(new Botfour(),415,90);
       
       
       
       
    }
}
