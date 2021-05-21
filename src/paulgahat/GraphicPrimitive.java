package paulgahat;

import java.awt.*;

public class GraphicPrimitive {
    private String graphicType;
    private Color drawColor;
    private Color fillColor;

    public GraphicPrimitive(String graphicType, Color drawColor, Color fillColor) {
        this.graphicType = graphicType;
        this.drawColor = drawColor;
        this.fillColor = fillColor;
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
}
