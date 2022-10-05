import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyFrame(){
    this.setTitle("JFrame title goes here"); //sets title of this
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
    this.setResizable(false); //prevent this from being resize
    this.setSize(420, 420); // sets the x and y dimension of this
    this.setVisible(true); //make this visible

    ImageIcon image = new ImageIcon("C:/Users/tamir/OneDrive/Desktop/Java projects/MyFirstProgram/src/metal-sign-logo-mockup_1389-1345.jpg"); //create an ImageIcon
    this.setIconImage(image.getImage()); //change icon of this
    this.getContentPane().setBackground(new Color(255, 255, 200)); //change color of background
    }

}
