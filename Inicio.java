import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Inicio extends JPanel implements ActionListener {
    private JLabel usuario;
    private JLabel contraseña;
    private JButton iniciar;
    private JLabel movi;
    private JTextField texto1;
    private JTextField texto2;

    public Inicio() {
        //construct components
        usuario = new JLabel ("Usuario");
        contraseña = new JLabel ("Constraseña");
        iniciar = new JButton ("Iniciar");
        movi = new JLabel ("Movi");
        texto1 = new JTextField (5);
        texto2 = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension (669, 368));
        setLayout (null);

        //add components
        add (usuario);
        add (contraseña);
        add (iniciar);
        add (movi);
        add (texto1);
        add (texto2);

        //set component bounds (only needed by Absolute Positioning)
        usuario.setBounds (225, 105, 100, 25);
        contraseña.setBounds (220, 185, 100, 25);
        iniciar.setBounds (265, 285, 125, 40);
        movi.setBounds (305, 40, 45, 48);
        texto1.setBounds (220, 130, 210, 40);
        texto2.setBounds (220, 210, 205, 40);

        iniciar.addActionListener(this); 
    }

    public void actionPerformed(ActionEvent e){

    if(e.getSource()==iniciar){
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Principal());
        frame.pack();
        frame.setVisible (true);
     }
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Inicio());
        frame.pack();
        frame.setVisible (true);
    }
}
