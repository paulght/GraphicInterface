package paulgahat;

import java.awt.*;

public class FilledRectangle implements GraphicsShape {
    private GraphicPrimitive graphicPrimitive;

    public FilledRectangle(GraphicPrimitive graphicPrimitive) {
        this.graphicPrimitive = graphicPrimitive;
    }

    @Override
    public void drawIt(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(graphicPrimitive.getFillColor());
        g2d.fillRect(100, 150, 90, 60);
    }
}
