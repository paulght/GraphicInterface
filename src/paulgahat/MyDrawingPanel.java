package paulgahat;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MyDrawingPanel extends Panel {
    private String selectedGraphicPrimitive = "outlined rectangle";
    private Color selectedColor = Color.BLACK;
    private final ArrayList<GraphicPrimitive> graphicPrimitives = new ArrayList<>();

    public MyDrawingPanel() {
        MyMouseListener myMouseListener = new MyMouseListener();
        addMouseListener(myMouseListener);
        addMouseMotionListener(myMouseListener);
    }
    public void paint(Graphics g) {
        super.paint(g);

        for (GraphicPrimitive graphicPrimitive : graphicPrimitives) {
            switch (graphicPrimitive.getGraphicType()) {
                case "outlined rectangle":
                    OutlinedRectangle outlinedRectangle = new OutlinedRectangle(graphicPrimitive);
                    outlinedRectangle.drawIt(g);
                    break;
                case "filled rectangle":
                    FilledRectangle filledRectangle = new FilledRectangle(graphicPrimitive);
                    filledRectangle.drawIt(g);
                    break;
                case "outlined oval":
                    OutlinedOval outlinedOval = new OutlinedOval(graphicPrimitive);
                    outlinedOval.drawIt(g);
                    break;
                default:
                    break;
            }
        }
    }
    void setSelectedGraphicPrimitive(String graphicPrimitive) { selectedGraphicPrimitive = graphicPrimitive; }

    void setSelectedColor(Color color) { selectedColor = color; }

    private class MyMouseListener extends MouseAdapter {
        private Point start;
        private Point end;

        @Override
        public void mousePressed(MouseEvent e) {
            start = e.getPoint();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            end = e.getPoint();
            GraphicPrimitive currentGraphicPrimitive = new GraphicPrimitive(selectedGraphicPrimitive, start, end, selectedColor);
            graphicPrimitives.add(currentGraphicPrimitive);
            repaint();
        }
    }
}
