package paulgahat;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class App extends Frame {
    private String shapes[] = new String[] {
            "outlined rectangle", "filled rectangle", "outlined oval" };

    public App () {
        setTitle("Drawing Interface Paul Gahat");
        setLayout(new BorderLayout());

        Panel drawingPanel = new MyDrawingPanel();
        drawingPanel.setPreferredSize(new Dimension(500, 500));
        drawingPanel.setLayout(new BorderLayout());
        Label userChoice = new Label(shapes[0] + " selected");
//        drawingPanel.add(userChoice);

        Panel comboBox = new Panel();
        comboBox.setLayout(new FlowLayout());
        Choice cb = new Choice();
        for (int i = 0; i < shapes.length; i++) {
            cb.add(shapes[i]);
        }
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                userChoice.setText(cb.getSelectedItem() + " selected");
            }
        }; // ItemListener is an interface, which is why we need to implement its method
        cb.addItemListener(itemListener);
        comboBox.add(cb);

        add("North", drawingPanel);
        add("South", comboBox);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Allowed Graphic Primitives : " + Arrays.toString(app.shapes));
    }
}
