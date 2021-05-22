package paulgahat;

import java.awt.*;

public class FilledRectangle implements GraphicsShape {
    private final GraphicPrimitive graphicPrimitive;

    public FilledRectangle(GraphicPrimitive graphicPrimitive) {
        this.graphicPrimitive = graphicPrimitive;
    }

    @Override
    public void drawIt(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(graphicPrimitive.getColor());
        g2d.fillRect(graphicPrimitive.getStartx(), graphicPrimitive.getStarty(), graphicPrimitive.getWidth(), graphicPrimitive.getHeight());
    }
}
