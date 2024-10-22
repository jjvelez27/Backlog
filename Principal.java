import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Principal extends JPanel implements ActionListener {
    private JComboBox texto3;
    private JButton ver;
    private JTextArea ingresarcom;
    private JLabel titulo1;
    private JLabel titulo2;
    private JTextArea campo1;
    private JButton publicar;

    public Principal() {
        //construct preComponents
        String[] jcomp1Items = {"Tu zona", "Zona sur ", "Zona norte"};

        //construct components
        texto3 = new JComboBox (jcomp1Items);
        ver= new JButton ("ver comentarios");
        ingresarcom = new JTextArea (5, 5);
        titulo1= new JLabel ("Comentarios");
        titulo2 = new JLabel ("Agrega un comentario:");
        campo1 = new JTextArea (5, 5);
        publicar = new JButton ("Publicar");


        //set components properties
        texto3.setEnabled (false);

        //adjust size and set layout
        setPreferredSize (new Dimension (669, 368));
        setLayout (null);

        //add components
        add (texto3);
        add (ver);
        add (ingresarcom);
        add (titulo1);
        add (titulo2);
        add (campo1);
        add (publicar);

        //set component bounds (only needed by Absolute Positioning)
        texto3.setBounds (450, 60, 140, 45);
        ver.setBounds (125, 245, 135, 30);
        ingresarcom.setBounds (35, 50, 350, 175);
        titulo1.setBounds (35, 20, 100, 25);
        titulo2.setBounds (455, 185, 140, 30);
        campo1.setBounds (390, 215, 255, 50);
        publicar.setBounds(390, 290, 135, 30);

        ver.addActionListener(this); 
        publicar.addActionListener(this); 
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ver){
            //ingresarcom.setText(" Hay un bache en la oriental y ocasiono que una moto la cual hiba a alta velocidad perdiera el control y cayera, la via esta colapsada, por favor tomar rutas alternativas");
            
            ingresarcom.setText("hoy a las 8:30 a.m. Un tren de la linea A del metro de \n Medellín se detuvo bruscamente en la Estación Poblado \n durante la hora pico. Causando pánico y lesiones menores \n entre los pasajeros. Las autoridades \n y equipos de emergencia llegaron rápidamente al luar para \n evaluar a las personas y atender a los heridos.");
        }
        String comentario = campo1.getText();
        if(e.getSource()== publicar){
            ingresarcom.setText(comentario);
        }
        String textoActual = ingresarcom.getText();
        if (!textoActual.isEmpty()) {
            textoActual += "\n"; 
        }
     
        
}

    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Principal());
        frame.pack();
        frame.setVisible (true);
    }
}