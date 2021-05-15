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

        Panel p1 = new Panel();
        p1.setPreferredSize(new Dimension(500, 500));
        p1.setLayout(new BorderLayout());

        Panel p2 = new Panel();
        p2.setLayout(new FlowLayout());
        Choice cb = new Choice();
        for (int i = 0; i < shapes.length; i++) {
            cb.add(shapes[i]);
        }
        p2.add(cb);

        add("North", p1);
        add("South", p2);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Allowed Graphic Primitives : " + Arrays.toString(app.shapes));
    }
}
