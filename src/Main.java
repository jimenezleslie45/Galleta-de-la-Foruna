import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Galleta de la Fortuna ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);


        String[] messages = {
                "¡Tendrás un buen día hoy!",
                "El éxito no es la clave de la felicidad.",
                "¡Nunca dejes que tus miedos sean más grandes que tus sueños.",
                "¡Cree en ti mismo y en lo que eres!",
                "¡Aprenderás algo nuevo y emocionante hoy!",
                "¡Nada es imposible todo depende de ti!",
                "¡Si no te gusta cómo son las cosas, cámbialas!"

        };


        JButton button = new JButton("Obtén una fortuna!");
        JLabel label = new JLabel("", SwingConstants.CENTER);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Random random = new Random();
                int index = random.nextInt(messages.length);


                label.setText(messages[index]);
            }
        });


        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        frame.getContentPane().add(label, BorderLayout.CENTER);


        frame.setVisible(true);
    }
}