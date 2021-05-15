package paulgahat;

import java.awt.*;

public class MyDrawingPanel extends Panel implements GraphicsShape {
    public MyDrawingPanel() {

    }
    public void paint(Graphics g) {
        super.paint(g);
        drawIt(g);
    }

    @Override
    public void drawIt(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(31, 21, 1));
        g2d.drawRect(100, 15, 90, 60);
    }
}
