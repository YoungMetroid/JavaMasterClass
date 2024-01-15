package Head_First_Design_Patterns_2st_Edition.Chapter2.SwingObserverExample;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserver {

    JFrame frame;

    public static void main(String[] args)
    {
        SwingObserver example = new SwingObserver();
        example.go();
    }

    public void go()
    {
        frame = new JFrame();
        JButton jButton = new JButton("Shoul I do it?");
        jButton.addActionListener( new AngelListener());
        jButton.addActionListener(new DevilListener());


        frame.getContentPane().add(BorderLayout.CENTER, jButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER,jButton);
        frame.setSize(300,300);
        frame.setVisible(true);



    }

    class AngelListener implements ActionListener{
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Don't do it, you might regret it!");
        }
    }
    class DevilListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Come on, do it!");
        }
    }

}



