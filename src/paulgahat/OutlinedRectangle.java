package paulgahat;

import java.awt.*;

public class OutlinedRectangle implements GraphicsShape {
    private final GraphicPrimitive graphicPrimitive;

    public OutlinedRectangle(GraphicPrimitive graphicPrimitive) {
        this.graphicPrimitive = graphicPrimitive;
    }

    @Override
    public void drawIt(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(graphicPrimitive.getColor());
        g2d.drawRect(graphicPrimitive.getStartx(), graphicPrimitive.getStarty(), graphicPrimitive.getWidth(), graphicPrimitive.getHeight());
    }
}
