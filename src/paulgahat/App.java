package paulgahat;

import javax.swing.*;
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

        Panel choices = new Panel();
        choices.setLayout(new FlowLayout());
        Choice comboBox = new Choice();
        for (int i = 0; i < shapes.length; i++) {
            comboBox.add(shapes[i]);
        }
        choices.add(comboBox);
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                drawingPanel.setSelectedGraphicPrimitive(comboBox.getSelectedItem());
            }
        }; // ItemListener is an interface, which is why we need to implement its method
        comboBox.addItemListener(itemListener);

        String chooseColor = "Choose color";
        Button colorButton = new Button(chooseColor);
        choices.add(colorButton);
        colorButton.addActionListener((ActionEvent) -> drawingPanel.setSelectedColor(JColorChooser.showDialog(null, chooseColor, Color.BLACK)));

        add("North", drawingPanel);
        add("South", choices);

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
