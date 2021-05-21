package paulgahat;

import java.awt.*;

public class OutlinedOval implements GraphicsShape {
    private GraphicPrimitive graphicPrimitive;

    public OutlinedOval(GraphicPrimitive graphicPrimitive) {
        this.graphicPrimitive = graphicPrimitive;
    }

    @Override
    public void drawIt(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(graphicPrimitive.getDrawColor());
        g2d.drawOval(100, 75, 90, 60);
    }
}
