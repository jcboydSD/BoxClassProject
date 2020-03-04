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
        return ((this.length == this.width) && (this.height == 0));
    } //end isSquare
    
    public void display()
    {
        if (this.isCube()) //test for cube
        {
            System.out.printf("This box is a cube: %d on all three sides\nVolume: %d\n",
                    this.length, this.calcVolume(this.length, this.width, this.height));
        }
        else if (this.isBox()) //test for container
        {
            System.out.printf("This box is: %d x %d x %d\nVolume: %d\n",
                    this.length, this.width, this.height,
                    this.calcVolume(this.length, this.width, this.height));
        }
        else if (this.isSquare()) //test for square
        {
            System.out.printf("This is a flat square: %d x %d\nPerimeter: %d\nArea: %d\n",
                    this.length, this.width, this.calcPerimeter(this.length, this.width),
                    this.calcArea(this.length, this.width));
        }
        else //all others - must be rectangle
        {
            System.out.printf("This is a rectangle: %d x %d\nPerimeter: %d\nArea: %d\n",
                    this.length, this.width, this.calcPerimeter(this.length, this.width),
                    this.calcArea(this.length, this.width));
        } //end if
            
    } //end display
     
} //end class Box
