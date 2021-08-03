package View;

import Controller.User;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginUser {
    
      //TELA
    JFrame tela =new JFrame();
    JPanel painel=new JPanel();
    JPanel usuario=new JPanel();
    JPanel administrador=new JPanel();
    
    //JTEXTFIELD
    JTextField username=new JTextField();
    JPasswordField password=new JPasswordField();
    
    //LABEL
    JLabel fotoci=new JLabel();
    JLabel nome=new JLabel("nome ");
    JLabel senha=new JLabel("senha ");
    JLabel usu=new JLabel();
    JLabel cha=new JLabel();
    JLabel senhae=new JLabel("dados incorrectos");
     JLabel campos=new JLabel("os campos devem ser preenchidos");
    
    //JBUTTON
    JButton ok=new JButton();
    JButton voltar=new JButton();
    JButton botao3=new JButton();
    JButton botao2=new JButton();
    
    public void loginUser(){
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
        painel.add(fotoci);
        painel.add(username);
        painel.add(password);
        painel.add(nome);
        painel.add(senha);
        painel.add(usu);
        painel.add(cha);
        painel.add(ok);
        painel.add(voltar);
        painel.add(senhae);
        painel.add(campos);
        painel.add(botao2);
        painel.add(botao3);
        
        //BOTAO
        botao3.setContentAreaFilled(false);
        botao3.setBorder(null);
        botao2.setContentAreaFilled(false);
        botao2.setBorder(null);
        botao3.setBounds(470,5,20,20);
        botao2.setBounds(440,5,20,20);
        ok.setBounds(330,220,20,20);
        voltar.setBounds(150,220,20,20);
        ok.setContentAreaFilled(false);
        ok.setBorder(null);
        voltar.setContentAreaFilled(false);
        voltar.setBorder(null);
        
        
        
        //JTEXTFIEL
        nome.setBounds(100, 100,40,20);
        senha.setBounds(100,150,40,20);
        username.setBounds(150,100,200,20);
        password.setBounds(150,150,200,20);
        username.setBorder(null);
        password.setBorder(null);
      
       //LABEL
        usu.setBounds(80,100,20,20);
        cha.setBounds(80,150,20,20);
        campos.setBounds(150,180,200, 20);
        campos.setVisible(false);
        senhae.setBounds(150,180,200, 20);
        senhae.setVisible(false);
 
        
        //FOTO
        botao3.setIcon(new ImageIcon(getClass().getResource("clo.png")));
        botao2.setIcon(new ImageIcon(getClass().getResource("min.png")));
        fotoci.setBounds(234,40,32,32);
        fotoci.setIcon(new ImageIcon(getClass().getResource("adc.png")));
        usu.setIcon(new ImageIcon(getClass().getResource("usu.png")));
        cha.setIcon(new ImageIcon(getClass().getResource("cha.png")));
        ok.setIcon(new ImageIcon(getClass().getResource("enter.png")));
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
            new EscolhaUsuario().EscolhaUsuario();
        });
        
        
        ok.addActionListener((ActionEvent ae) -> {
            if(username.getText().equals("")||(password.getText().equals(""))){
               campos.setVisible(true);
               senhae.setVisible(false);
               campos.setForeground(Color.red);
                }else
            {
                for(int i=0;i<User.leitorUS.size();i++){
                    if(username.getText().equals(User.leitorUS.get(i).getNome())&&(password.getText().equals(User.leitorUS.get(i).getSenha()))){
                         tela.setVisible(false);
                         Usuario.verifica=User.leitorUS.get(i).getNome();
                         MeusDados.veri=User.leitorUS.get(i).getNome();
                         new Usuario().usuarioMenu();
                    }else
                    {
                    campos.setVisible(false);
                    senhae.setVisible(true);
                    senhae.setForeground(Color.red);
                    }
              
           
                }}
        
        
        });
    
}
    
}
