package paulgahat;

import java.awt.*;

public class OutlinedOval implements GraphicsShape {
    @Override
    public void drawIt(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(31, 21, 1));
        g2d.drawOval(100, 75, 90, 60);
    }
}
