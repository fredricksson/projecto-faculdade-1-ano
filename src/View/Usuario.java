/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.User;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Usuario {
    
   
     public static String verifica;
    
    JFrame tela = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel fu = new JPanel();
    JPanel fu1 = new JPanel();
    JPanel fu2 = new JPanel();
    JPanel fu3 = new JPanel();
    ImageIcon ima=new ImageIcon(getClass().getResource("demissao.jpeg"));
    ImageIcon ima1=new ImageIcon(getClass().getResource("aumento-salarial.jpg"));
    ImageIcon ima2=new ImageIcon(getClass().getResource("dadosfun.jpg"));
    ImageIcon ima3=new ImageIcon(getClass().getResource("relatoriosfun.jpg"));
    JLabel image=new JLabel();
    JLabel image1=new JLabel();
    JLabel image2=new JLabel();
    JLabel image3=new JLabel();
    JButton botao2=new JButton();
    JButton botao3=new JButton();
    JButton botao4=new JButton();
   // JPanel painel=new JPanel();

    
    JLabel cont=new JLabel("Pedir Demissao");
    JLabel demi=new JLabel("Pedir Aumento");
    JLabel fun=new JLabel("Meus Dados");
    JLabel paga=new JLabel("Enviar relatorio");
    JLabel current=new JLabel();
    
    
    public void usuarioMenu(){
        
        JPanel cima = new JPanel();
        cima.setBounds(0, 0, 700, 150);
        cima.setLayout(null);
        cima.setBackground(new Color(255,255,255));
        panel1.add(cima);
        
              
      //VOLTAR
      ImageIcon i = new ImageIcon(getClass().getResource("voltar.png"));
      JButton voltar = new JButton(i);
      voltar.setBorder(null);
      voltar.setContentAreaFilled(false);
      voltar.setBounds(0, 0, 50, 50);
      
      
      voltar.addActionListener((ActionEvent ae) -> {
          tela.setVisible(false);
          new LoginUser().loginUser();
        });
      
      
      cima.add(voltar);
        
        JLabel cff = new JLabel("CFF Tintas");
        cff.setFont(new Font("28 Days Later",Font.BOLD, 70));
        cff.setForeground(new Color(248,146,6));
        cff.setBounds(200, 10, 500, 150);
        cima.add(cff);
        cima.add(current);
        current.setBounds(50, 10, 100, 20);
        
        
        tela.setSize(700, 350);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setUndecorated(true);
        tela.setVisible(true);
        panel.setLayout(null);
        panel1.setLayout(null);
        fu.setLayout(null);
        fu1.setLayout(null);
        fu2.setLayout(null);
        fu3.setLayout(null);
        panel.setBackground(new Color(71,60,139));
        tela.add(panel);
        tela.add(panel1);
        panel1.setBounds(0, 0,700,250);
        panel1.setBackground(Color.WHITE);
        panel.setBounds(0,120,700,350);
        panel.add(fu);
        panel.add(fu1);
        panel.add(fu2);
        panel.add(fu3);
        fu.setBounds(20, 50,150,150);
        fu1.setBounds(190, 50,150,150);
        fu2.setBounds(360, 50,150,150);
        fu3.setBounds(530, 50,150,150);
        fu.add(image);
        fu1.add(image1);
        fu2.add(image2);
        fu3.add(image3);
        image.setBounds(0, 0,150,150);
        image.setIcon(new ImageIcon(ima.getImage().getScaledInstance(150,150,Image.SCALE_AREA_AVERAGING)));
        image1.setBounds(0, 0,150,150);
        image1.setIcon(new ImageIcon(ima1.getImage().getScaledInstance(150,150,Image.SCALE_AREA_AVERAGING)));
        image2.setBounds(0, 0,150,150);
        image2.setIcon(new ImageIcon(ima2.getImage().getScaledInstance(150,150,Image.SCALE_AREA_AVERAGING)));
        image3.setBounds(0, 0,150,150);
        image3.setIcon(new ImageIcon(ima3.getImage().getScaledInstance(150,150,Image.SCALE_AREA_AVERAGING)));
        cima.setBackground(Color.LIGHT_GRAY);
        cima.add(botao2);
        cima.add(botao3);
        cima.add(botao4);
        botao2.setBounds(630,5,20,20);
        botao3.setBounds(660,5,20,20);
        botao3.setIcon(new ImageIcon(getClass().getResource("clo.png")));
        botao2.setIcon(new ImageIcon(getClass().getResource("min.png")));
        botao3.setContentAreaFilled(false);
        botao3.setBorder(null);
        botao2.setContentAreaFilled(false);
        botao2.setBorder(null);
        botao4.setBorder(null);
        botao4.setContentAreaFilled(false);
        botao4.setIcon(new ImageIcon(getClass().getResource("gm.png")));
        botao4.setBounds(400,5,20,20);
        
       
        
        panel.add(cont);
        panel.add(demi);
        panel.add(fun);
        panel.add(paga);
        cont.setBounds(20,204,100,20);
        demi.setBounds(190,204,100,20);
        fun.setBounds(360,204,140,20);
        paga.setBounds(530,204,100,20);
        cont.setForeground(Color.WHITE);
        demi.setForeground(Color.WHITE);
        fun.setForeground(Color.WHITE);
        paga.setForeground(Color.WHITE);

       
  for(int is=0;is<User.leitorUS.size();is++){
      if(User.leitorUS.get(is).getNome().equals(verifica)){
            current.setText(User.leitorUS.get(is).getNome());
      }
      
  }
  
      
   image.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                tela.setVisible(false);
                new OpcoesAdmin().admin();
            }
        });
   
      image1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                tela.setVisible(false);
                new OpcoesAdmin().admin();
            }
        });
      
   
        
        image2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                tela.setVisible(false);
                new MeusDados().meusDados();
            }
        });
        
          
        image3.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
           JOptionPane.showMessageDialog(null,"Relatorio enviado");
            }
        });
       
        
        
        
        botao3.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });
        
         botao2.addActionListener((ActionEvent ae) -> {
             tela.setExtendedState(JFrame.ICONIFIED);
        });
        

    }
    public static void main(String[] args) {
        new Usuario().usuarioMenu();
    }
    
}
