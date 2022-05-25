import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playerone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playerone extends Actor
{
    
      SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the Playerone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Playerone ()
    
    { 
        timer.mark();
    
    
    }
  
    
    
    public void act() 
    
    {
        int time= timer.millisElapsed()/1000;
        
        // Add your action code here.
        //Playerone movement
        if (Greenfoot . isKeyDown("left")) 
        {
            setRotation(180);
            move(6);
        }
        
        if (Greenfoot . isKeyDown("right")) 
        {
            setRotation(0);
            move(6);
        }
        
        if (Greenfoot . isKeyDown("up")) 
        {
            setRotation(270);
            move(6);
        }
        
        if (Greenfoot . isKeyDown("down")) 
        {
            setRotation(90);
            move(6);
        }
        
        if (Greenfoot . isKeyDown("right")  &&Greenfoot.isKeyDown("up"))
        {
            setRotation(325);
            move(0);
        }
        
        if (Greenfoot . isKeyDown("right") &&Greenfoot.isKeyDown("down"))
        {
            setRotation(425);
            move(0);
        }
        
        if (Greenfoot . isKeyDown("up") &&Greenfoot.isKeyDown("left"))
        {
            setRotation(225);
            move(0);
        }
        
        if (Greenfoot.isKeyDown("down") &&Greenfoot.isKeyDown("left"))
        {
            setRotation(135);
            move(0);
        }
        
        // i honoestly have no clue what these does but it doesnt make an error so
        
        if (getX() <10) 
      
        {
       
          setLocation(getWorld().getWidth() / 2, getWorld() .getHeight() / 2);
        
        }
      
        if (getX() >565) 
      
        {
       
          setLocation(getWorld().getWidth() / 2, getWorld() 
          .getHeight() / 2);
          getWorld().showText(""+time , 300,200);
          timer.mark();
        }
        if (getX() <35) 
      
        {
       
          setLocation(getWorld().getWidth() / 2, getWorld() .getHeight() / 2);
          getWorld().showText(""+time , 300,200);
            timer.mark();
        }
      
        if (getY() <30) 
      
        {
       
          setLocation(getWorld().getWidth() / 2, getWorld() .getHeight() / 2);
          getWorld().showText(""+time , 300,200);
          timer.mark();
        }
        if (getY() >365) 
      
        {
       
          setLocation(getWorld().getWidth() / 2, getWorld() .getHeight() / 2);
          getWorld().showText(""+time , 300,200);
          timer.mark();
        }
      
        if (isTouching(Botone.class))
        {
        
            setLocation(getWorld().getWidth() / 2, getWorld() .getHeight() / 2);
            getWorld().showText(""+time , 300,200);
            timer.mark();
        }
        
        if (isTouching(Bottwo.class))
        {
        
            setLocation(getWorld().getWidth() / 2, getWorld() .getHeight() / 2);
            getWorld().showText(""+time , 300,200);
            timer.mark();
        }
        
        if (isTouching(Botthree.class))
        {
        
            setLocation(getWorld().getWidth() / 2, getWorld() .getHeight() / 2);
            getWorld().showText(""+time , 300,200);
          timer.mark();
        }
        
        if (isTouching(Botfour.class))
        {
        
            setLocation(getWorld().getWidth() / 2, getWorld() .getHeight() / 2);
            getWorld().showText(""+time , 300,200);
            timer.mark();
        }
        
        
      
    }    
}
