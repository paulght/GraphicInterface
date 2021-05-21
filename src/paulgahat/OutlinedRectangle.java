package paulgahat;

import java.awt.*;

public class OutlinedRectangle implements GraphicsShape {
    private GraphicPrimitive graphicPrimitive;

    public OutlinedRectangle(GraphicPrimitive graphicPrimitive) {
        this.graphicPrimitive = graphicPrimitive;
    }

    @Override
    public void drawIt(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(graphicPrimitive.getDrawColor());
        g2d.drawRect(100, 15, 90, 60);
    }
}
