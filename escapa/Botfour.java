import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Botfour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Botfour extends Actor
{
    int deltaX=-5;
     int deltaY=-5;
    /**
     * Act - do whatever the Botone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
        // Add your action code here.
        
        setLocation(getX() + deltaX,getY() + deltaY);
        
        if(getX()<40)
        
       {
           deltaX=+5;
    
       }
       if(getX()>560)
        
       {
           deltaX=-5;
    
       }
      
       
        if(getY()>360)
        
       {
           deltaY=-5;
    
       }
       
       
       if(getY()<50)
        
       {
           deltaY=+5;
    
 
        } 
        
        
    }
}
