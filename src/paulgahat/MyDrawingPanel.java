package paulgahat;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class MyDrawingPanel extends Panel {
    private String selectedGraphicPrimitive = "outlined rectangle";
    private Color selectedColor = Color.BLACK;
    // We declare the array containing the drawn primitives
    private GraphicPrimitive[] graphicPrimitives = new GraphicPrimitive[0];

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

    public void dumpGraphicPrimitives() {
        System.out.println(graphicPrimitives.length + " graphic primitives were drawn :");
        for (GraphicPrimitive graphicPrimitive : graphicPrimitives) {
            System.out.println(graphicPrimitive.toString());
        }
    }

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
            addGraphicPrimitiveToArray(currentGraphicPrimitive);
            repaint();
        }
    }

    private void addGraphicPrimitiveToArray(GraphicPrimitive graphicPrimitiveToAdd) {
        GraphicPrimitive[] newGraphicPrimitivesArray = Arrays.copyOf(graphicPrimitives, graphicPrimitives.length + 1);
        newGraphicPrimitivesArray[newGraphicPrimitivesArray.length - 1] = graphicPrimitiveToAdd;
        graphicPrimitives = newGraphicPrimitivesArray;
    }
}
