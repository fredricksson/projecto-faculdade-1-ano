
package View;

import Controller.Admin;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginAdmin {
    
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
    JLabel clique=new JLabel("<= clique aqui para adicionar um admin");
    JLabel campos=new JLabel("os campos devem ser preenchidos");
    
    //JBUTTON
    JButton adicionar=new JButton();
    JButton ok=new JButton();
    JButton voltar=new JButton();
     JButton botao3=new JButton();
    JButton botao2=new JButton();
    
    public void loginAdmin(){
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
        painel.add(adicionar);
        painel.add(ok);
        painel.add(voltar);
        painel.add(clique);
        adicionar.setVisible(false);
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
        adicionar.setBounds(0,0,32,32);
        ok.setBounds(330,220,20,20);
        voltar.setBounds(150,220,20,20);
        adicionar.setBorder(null);
        adicionar.setContentAreaFilled(false);
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
        clique.setBounds(40,6,240, 20);
        clique.setVisible(false);
        campos.setBounds(150,180,200, 20);
        campos.setVisible(false);
        senhae.setBounds(150,180,200, 20);
        senhae.setVisible(false);
 
        
        //FOTO
        fotoci.setBounds(234,40,32,32);
        fotoci.setIcon(new ImageIcon(getClass().getResource("adc.png")));
        usu.setIcon(new ImageIcon(getClass().getResource("usu.png")));
        cha.setIcon(new ImageIcon(getClass().getResource("cha.png")));
        adicionar.setIcon(new ImageIcon(getClass().getResource("add.png")));
        ok.setIcon(new ImageIcon(getClass().getResource("enter.png")));
        voltar.setIcon(new ImageIcon(getClass().getResource("voltar.png")));
        botao3.setIcon(new ImageIcon(getClass().getResource("clo.png")));
        botao2.setIcon(new ImageIcon(getClass().getResource("min.png")));
        
        
        //EVENTOS
        
        botao3.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });
        
         botao2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               tela.setExtendedState(JFrame.ICONIFIED);
            }
            
        });
        
        if(Admin.leitor.isEmpty()){
            adicionar.setVisible(true);
           username.setEditable(false);
           password.setEditable(false);
           
           username.addMouseListener(new MouseAdapter(){
               @Override
               public void mouseClicked(MouseEvent me) {
                      clique.setVisible(true);
                      senhae.setVisible(false);
                      campos.setVisible(false);
               }}); 
             
           password.addMouseListener(new MouseAdapter(){
               @Override
               public void mouseClicked(MouseEvent me) {
                      clique.setVisible(true);
                      senhae.setVisible(false);
                      campos.setVisible(false);
               }}); 
           
        }
        
        voltar.addActionListener((ActionEvent ae) -> {
            tela.setVisible(false);
            new EscolhaUsuario().EscolhaUsuario();
        });
        
         adicionar.addActionListener((ActionEvent ae) -> {
            tela.setVisible(false);
            new NovoAdmin().novoAdmin();
        });
         
         ok.addActionListener((ActionEvent ae) -> {
             if(username.getText().equals("")||(password.getText().equals(""))){
                 campos.setVisible(true);
                  senhae.setVisible(false);
                 campos.setForeground(Color.red);
             }else
               
             {
                 for(int i=0;i<Admin.leitor.size();i++){
                     if(username.getText().equals(Admin.leitor.get(i).getNome())&&(password.getText().equals(Admin.leitor.get(i).getSenha()))){
                         tela.setVisible(false);
                        new OpcoesAdmin().admin();
                     break;}
                     
                     else
                         if(!username.getText().equals(Admin.leitor.get(i).getNome())&&(!password.getText().equals(Admin.leitor.get(i).getSenha()))){
                             senhae.setVisible(true);
                             campos.setVisible(false);
                             senhae.setForeground(Color.red);
                          
                         break;}
                 }
                 
             }
        });
         
       
        
    }
    
    
}
