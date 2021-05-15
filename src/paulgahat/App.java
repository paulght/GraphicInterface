package paulgahat;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

// An AWT program inherits from the top-level container java.awt.Frame
public class App extends Frame {
   private Label lblCount;    // Declare a Label component
   private TextField tfCount; // Declare a TextField component
   private Button btnCount;   // Declare a Button component
   private int count = 0;     // Counter's value

   // Constructor to setup GUI components and event handlers
   public App () {
      Panel p1 = new Panel();
      p1.add(new Label("Bonjour"));

      p1.setLayout(new GridLayout(10,1));
      p1.setSize(900,1000);
      add(p1);
      
      Panel p2 = new Panel();
      Choice cb = new Choice();
	  	cb.add("outlined rectangle");
		cb.add("filled rectangle");
		cb.add("outlined oval");
	  p2.add(cb);
	  
	  p2.setLayout(new BorderLayout());
	  p2.setSize(100,1000);
	  add(p2);                                  

//      BtnCountListener listener = new BtnCountListener();
//      btnCount.addActionListener(listener);

	  setLayout(new GridLayout(2,1));
      setTitle("Drawing Interface Paul Gahat");  
      setSize(1000, 1000);        
      setVisible(true);
   }

   public static void main(String[] args) {
      App app = new App();
   }

   // Define an inner class to handle the "Count" button-click
   private class BtnCountListener implements ActionListener {
      // ActionEvent handler - Called back upon button-click.
      @Override
      public void actionPerformed(ActionEvent evt) {
         ++count;
         tfCount.setText(count + "");
      }
   }
}