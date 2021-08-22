package WeatherObserver.Swing_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngleListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
    }

    class AngleListener implements ActionListener{
        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener{
        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it!");
        }
    }
}
