package View;

import Controller.User;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EscolhaUsuario {
    
    //LABEL
    JLabel fotoAdmin=new JLabel();
    JLabel fotoUser=new JLabel();
    JLabel nomeUs=new JLabel("Usuario");
    JLabel nomeAd=new JLabel("Administrador");
    JLabel existe=new JLabel("nao ha funcionarios");
            
    
    //TELA
    JFrame tela =new JFrame();
    JPanel painel=new JPanel();
    JPanel usuario=new JPanel();
    JPanel administrador=new JPanel();
    
    //BOTOA
    JButton botao3=new JButton();
    JButton botao2=new JButton();
    JButton voltar=new JButton();
   
    
    public void EscolhaUsuario(){
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
        painel.add(fotoAdmin);
        painel.add(fotoUser);
        painel.add(nomeUs);
        painel.add(nomeAd);
        painel.add(existe);
        painel.add(botao2);
        painel.add(botao3);
        painel.add(voltar);
        
        //BOTOES
        botao3.setBounds(470,5,20,20);
        botao2.setBounds(440,5,20,20);
        voltar.setBounds(5,275, 20, 20);
        botao3.setContentAreaFilled(false);
        botao3.setBorder(null);
        botao2.setContentAreaFilled(false);
        botao2.setBorder(null);
        voltar.setContentAreaFilled(false);
        voltar.setBorder(null);
        
        
        
        //FOTOS
        fotoAdmin.setBounds(100,70,100,100);
        fotoAdmin.setIcon(new ImageIcon(getClass().getResource("ad.png")));
        fotoUser.setBounds(300,70,100,100);
        fotoUser.setIcon(new ImageIcon(getClass().getResource("us.png")));
        botao3.setIcon(new ImageIcon(getClass().getResource("clo.png")));
        botao2.setIcon(new ImageIcon(getClass().getResource("min.png")));
        voltar.setIcon(new ImageIcon(getClass().getResource("voltar.png")));
        
        //LABEL
        nomeAd.setBounds(110,170,100,20);
        nomeUs.setBounds(330,170,100,20);
        existe.setBounds(330,210,150,20);
        existe.setForeground(Color.red);
        existe.setVisible(false);
        
        //EVENTOS
        fotoAdmin.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                tela.setVisible(false);
                new LoginAdmin().loginAdmin();
            }
        });
        
        fotoUser.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                if(User.leitorUS.isEmpty()){
                   existe.setVisible(true);
                }else{
                tela.setVisible(false);
                new LoginUser().loginUser();
            }}
        });
       
       
        
          botao3.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });
        
         botao2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               tela.setExtendedState(JFrame.ICONIFIED);
            }
            
        });
         
             voltar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               tela.setVisible(false);
                  new TelaPrincipal().tela.setVisible(true);
            }
            
        });
        
        
        
    }
   
}
