public class Rectangle
{
    private double width;
    private double height;

    public Rectangle(double rectWidth, double rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public int getArea()
    {
        return width * height;
    }

    public String toString()
    {
        String rectInfo = "Rectangle with width " + width + " and height " + height +
                " and area " + getArea();

        return rectInfo;
    }
}