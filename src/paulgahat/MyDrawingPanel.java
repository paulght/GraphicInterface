package paulgahat;

import java.awt.*;

public class MyDrawingPanel extends Panel {
    private String selectedGraphicPrimitive = "outlined rectangle";

    public MyDrawingPanel() {
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(31, 21, 1));
        g2d.drawRect(200, 300, 90, 60);
        switch (selectedGraphicPrimitive) {
            case "outlined rectangle":
                OutlinedRectangle outlinedRectangle = new OutlinedRectangle();
                outlinedRectangle.drawIt(g);
                break;
            case "filled rectangle":
                FilledRectangle filledRectangle = new FilledRectangle();
                filledRectangle.drawIt(g);
                break;
            case "outlined oval":
                OutlinedOval outlinedOval = new OutlinedOval();
                outlinedOval.drawIt(g);
                break;
            default:
                break;
        }
    }
    void setSelectedGraphicPrimitive(String graphicPrimitive) { selectedGraphicPrimitive = graphicPrimitive; }
}
