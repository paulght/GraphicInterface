package paulgahat;

import java.awt.*;

public class GraphicPrimitive {
    private final int startx;
    private final int starty;
    private final int width;
    private final int height;
    private final String graphicType;
    private final Color drawColor;
    private final Color fillColor;

    public GraphicPrimitive(String graphicType, Point start, Point end, Color drawColor, Color fillColor) {
        this.graphicType = graphicType;
        this.drawColor = drawColor;
        this.fillColor = fillColor;
        this.startx = (int) start.getX();
        this.starty = (int) start.getY();
        this.width = (int) (end.getX() - start.getX());
        this.height = (int) (end.getY() - start.getY());
    }

    public String getGraphicType() {
        return graphicType;
    }

    public Color getDrawColor() {
        return drawColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public int getStartx() {
        return startx;
    }

    public int getStarty() {
        return starty;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
