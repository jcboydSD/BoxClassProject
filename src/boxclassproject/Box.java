/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxclassproject;

/******************************************************************************
 * Box.java 
 * Programmer: @author jcboyd
 * 
 * Class associated with BoxClassProject.java
 *****************************************************************************/

public class Box 
{
    private int length;
    private int width;
    private int height;
    
    public Box(int length, int width, int height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    } //end Box - 3 parameters      
    
    public Box(int length, int width)
    {
        this(length, width, 0);
    } //end Box - 2 parameters
  
    
    public Box()
    {
        this(1, 1, 1);
    } //end Box - no parameters

    public int calcArea(int length, int width)
    {
        return length * width;
    } //end calcArea

    public int calcPerimeter(int length, int width)
    {
        return (length * 2) + (width * 2);
    } //end calcPerimeter
    
    public int calcVolume(int length, int width, int height)
    {
        return length * width * height;
    } //end calcVolume
    
    public boolean isCube()
    {
        return ((this.length == this.width) && (this.length == this.height));
    } //end isCube
    
    public boolean isBox()
    {
        return ((this.length > 0) && (this.width > 0) && (this.height > 0));
    } //end isBox
    
    public boolean isSquare()
    {
        return (this.length == this.width);
    } //end isSquare
    
    public void display()
    {
        
    } //end display
    
    
    
    
    
} //end class Box
