package paulgahat;

import java.awt.*;

public class FilledRectangle implements GraphicsShape {
    @Override
    public void drawIt(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(31, 21, 1));
        g2d.fillRect(100, 150, 90, 60);
    }
}
