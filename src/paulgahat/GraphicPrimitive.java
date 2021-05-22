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
        this.startx = (int) Math.min(start.getX(), end.getX());
        this.starty = (int) Math.min(start.getY(), end.getY());
        this.width = (int) Math.abs(end.getX() - start.getX());
        this.height = (int) Math.abs(end.getY() - start.getY());
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
