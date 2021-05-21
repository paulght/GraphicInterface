package paulgahat;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class App extends Frame {
    private final String[] shapes = new String[] {
            "outlined rectangle", "filled rectangle", "outlined oval" };
    private final MyDrawingPanel drawingPanel;

    public App () {
        setTitle("Drawing Interface Paul Gahat");
        setLayout(new BorderLayout());

        drawingPanel = new MyDrawingPanel();
        drawingPanel.setPreferredSize(new Dimension(500, 500));
        drawingPanel.setLayout(new BorderLayout());

        Panel comboBox = new Panel();
        comboBox.setLayout(new FlowLayout());
        Choice cb = new Choice();
        for (int i = 0; i < shapes.length; i++) {
            cb.add(shapes[i]);
        }
        comboBox.add(cb);
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                drawingPanel.setSelectedGraphicPrimitive(cb.getSelectedItem());
            }
        }; // ItemListener is an interface, which is why we need to implement its method
        cb.addItemListener(itemListener);

        add("North", drawingPanel);
        add("South", comboBox);

        pack();
        setVisible(true);

        // Makes the app on the screen close when clicking on close
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Allowed Graphic Primitives : " + Arrays.toString(app.shapes));
    }
}
