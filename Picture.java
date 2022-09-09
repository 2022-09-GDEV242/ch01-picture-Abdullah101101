/**
 * This image depicts a terrible ice cream incident on a beautiful sunny
 * day.
 * 
 * @author  Abdullah Abdulwahab
 * @version 2022.09.09
 */
public class Picture
{
    private Person iceCreamLover;
    private Square ground;
    private Square sky;
    private Circle iceCream1;
    private Circle iceCream2; 
    private Triangle iceCreamCone;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        ground = new Square();
        sky = new Square();
        iceCreamLover = new Person();
        iceCreamCone = new Triangle(); 
        iceCream1 = new Circle();
        iceCream2 = new Circle();
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            ground.changeColor("dark gray");
            ground.moveHorizontal(-320);
            ground.changeSize(550);
            ground.makeVisible();
            
            sky.changeColor("skyblue");
            sky.moveHorizontal(-340);
            sky.moveVertical(-410);
            sky.changeSize(550);
            sky.makeVisible();
            
            iceCreamLover.changeColor("black");
            iceCreamLover.changeSize(150,75);
            iceCreamLover.moveHorizontal(-105);
            iceCreamLover.moveVertical(-10);
            iceCreamLover.makeVisible();
            
            iceCream1.changeColor("magenta");
            iceCream1.moveHorizontal(-17);
            iceCream1.moveVertical(150);
            iceCream1.changeSize(40);
            iceCream1.makeVisible();
            
            iceCream2.changeColor("yellow");
            iceCream2.moveHorizontal(-18);
            iceCream2.moveVertical(170);
            iceCream2.changeSize(50);
            iceCream2.makeVisible();
             
            iceCreamCone.changeColor("beige");
            iceCreamCone.changeSize(50, 35);
            iceCreamCone.moveHorizontal(22);
            iceCreamCone.moveVertical(55);
            iceCreamCone.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(203);
            sun.moveVertical(-100);
            sun.changeSize(80);
            sun.makeVisible();
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        ground.changeColor("black");
        sky.changeColor("white");
        iceCreamCone.changeColor("black");
        iceCream1.changeColor("black");
        iceCream2.changeColor("white");
        iceCreamLover.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        ground.changeColor("dark gray");
        sky.changeColor("skyblue");
        iceCreamCone.changeColor("biege");
        iceCream1.changeColor("magenta");
        iceCream2.changeColor("yellow");
        iceCreamLover.changeColor("black");
        sun.changeColor("yellow");
    }
}
