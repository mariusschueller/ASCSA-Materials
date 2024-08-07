public class RectangleOverload
{
    private int width;
    private int height;
    public RectangleOverload(int rectWidth, int rectHeight)
    {
        width = rectWidth;
        height = rectHeight;
    }
    public RectangleOverload(int sidelength)
    {
        width = sidelength;
        height = sidelength;
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