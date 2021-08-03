package View;
import Controller.User;
import Model.Funcionario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Demitir{
    
    Funcionario fu=new Funcionario();
    
      //TELA
    JFrame tela =new JFrame();
    JPanel painel=new JPanel();
    JPanel usuario=new JPanel();
    JPanel administrador=new JPanel();
    
     //JTEXTFIELD
    JTextField username=new JTextField();
    JTextField apelido=new JTextField();
   
    //JBUTTON
    JButton ok=new JButton("Demitir");
    JButton voltar=new JButton();
    JButton botao3=new JButton();
    JButton botao2=new JButton();
    
    JLabel nome=new JLabel("nome ");
    JLabel apeli=new JLabel("apelido");
    
    public void demitir(){
        tela.setUndecorated(true);
        tela.setResizable(false);
        tela.setSize(500,300);
        tela.setDefaultCloseOperation(3);
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        tela.add(painel);
        
        
        
        //CONFIGURACOES DO PAINEL
        painel.setLayout(null);
        painel.setBackground(Color.LIGHT_GRAY);
        
        //ADICOES NO PAINEL
        
        painel.add(ok);
        painel.add(voltar);
        painel.add(botao2);
        painel.add(botao3);
        painel.add(username);
        painel.add(apelido);
        painel.add(nome);
        painel.add(apeli);
        
        
        
        nome.setBounds(80,100,70,20);
        apeli.setBounds(80,150,70,20);
        //textos
        username.setBounds(150,100,200,20);
        apelido.setBounds(150,150,200,20);
        
        //BOTAO
        botao3.setContentAreaFilled(false);
        botao3.setBorder(null);
        botao2.setContentAreaFilled(false);
        botao2.setBorder(null);
        botao3.setBounds(470,5,20,20);
        botao2.setBounds(440,5,20,20);
        ok.setBounds(290,220,70,20);
        voltar.setBounds(150,220,20,20);
        ok.setContentAreaFilled(false);
        ok.setBorder(null);
        voltar.setContentAreaFilled(false);
        voltar.setBorder(null);
        
        
        
      
        //FOTO
        botao3.setIcon(new ImageIcon(getClass().getResource("clo.png")));
        botao2.setIcon(new ImageIcon(getClass().getResource("min.png")));
        voltar.setIcon(new ImageIcon(getClass().getResource("voltar.png")));
        
        
        //EVENTOS
         botao3.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });
        
         botao2.addActionListener((ActionEvent ae) -> {
             tela.setExtendedState(JFrame.ICONIFIED);
        });
        
        voltar.addActionListener((ActionEvent ae) -> {
            tela.setVisible(false);
            new OpcoesAdmin().admin();
        });
        
        
        ok.addActionListener((ActionEvent ae) -> {
            for(int i=0;i<User.leitorUS.size();i++){
                if(username.getText().equals(User.leitorUS.get(i).getNome())||(apelido.getText().equals(User.leitorUS.get(i).getApelido()))){
                    User.leitorUS.remove(i);
                    JOptionPane.showMessageDialog(null,"demitido");
                    try {
                        User.gravaUser(User.leitorUS);
                    } catch (IOException ex) {
                        Logger.getLogger(Demitir.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    try {
                        User.le();
                    } catch (IOException | ClassNotFoundException ex) {
                        Logger.getLogger(Demitir.class.getName()).log(Level.SEVERE, null, ex);
                    }tela.setVisible(false);
                    new OpcoesAdmin().admin();
                break;}else{
                    JOptionPane.showMessageDialog(null,"dados incorrectos ou campos vazios");
                    
                break;}
            }
        });
        
        
        
}
    
    
}