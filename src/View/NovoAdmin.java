package View;

import Controller.Admin;
import Model.Administrador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class NovoAdmin {
    
    static ArrayList<Administrador> ad=new ArrayList<>();
    
     //TELA
    JFrame tela =new JFrame();
    JPanel painel=new JPanel();
    
    
    //JTEXTFIELD
    JTextField username=new JTextField();
    JPasswordField password=new JPasswordField();
    JPasswordField repassword=new JPasswordField();
    static JTextField caminho=new JTextField();
    JTextField saldoE=new JTextField();
    
    //LABEL
    JLabel fotoci=new JLabel();
    JLabel nome=new JLabel("nome ");
    JLabel senha=new JLabel("senha ");
    JLabel resenha=new JLabel("confirme a senha");
    JLabel file=new JLabel("<=crie antes um ficheiro");
    JLabel campos=new JLabel("os campos devem ser preenchidos");
    JLabel senhae=new JLabel("password nao foi confirmada");
    
    
    //JBUTTON
 
    JButton ok=new JButton();
    JButton voltar=new JButton();
    JButton path=new JButton();
    JButton botao3=new JButton();
    JButton botao2=new JButton();
  double saldo;
    
    public void novoAdmin(){
        //CONFIGURACOES DA TELA
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
        painel.add(ok);
        painel.add(voltar);painel.add(repassword);
        painel.add(resenha);
        painel.add(caminho);
        painel.add(path);
        painel.add(file);
        painel.add(botao2);
        painel.add(botao3);
        painel.add(senhae);
        painel.add(campos);
        
        
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
        path.setBounds(5,5,20,20);
        path.setContentAreaFilled(false);
        path.setBorder(null);
        path.setVisible(false);
        
        
        
        
        //JTEXTFIEL
        
        username.setBorder(null);
        username.setBounds(150,70,200,20);
        
        
        //PASSWORDFIELD
        
        password.setBounds(150,120,200,20);
        password.setBorder(null);
        repassword.setBorder(null);
        repassword.setBounds(150, 170,200,20);
      
       //LABEL
       
       nome.setBounds(100, 70,40,20);
       senha.setBounds(100,120,40,20);
       resenha.setBounds(40, 170,100, 20);
       file.setBounds(30,5,160, 20);
       file.setVisible(false);
        campos.setBounds(150,200,200, 20);
        campos.setVisible(false);
        senhae.setBounds(150,200,200, 20);
        senhae.setVisible(false);
        
       
       
       if(Admin.leitor.isEmpty()){
           path.setVisible(true);
           file.setVisible(true);
       }
        //FOTO
   
        ok.setIcon(new ImageIcon(getClass().getResource("done.png")));
        voltar.setIcon(new ImageIcon(getClass().getResource("voltar.png")));
        path.setIcon(new ImageIcon(getClass().getResource("file.png")));
        botao3.setIcon(new ImageIcon(getClass().getResource("clo.png")));
        botao2.setIcon(new ImageIcon(getClass().getResource("min.png")));
       
        
        
        
        //EVENTOS
        voltar.addActionListener((ActionEvent ae) -> {
            tela.setVisible(false);
            new LoginAdmin().loginAdmin();
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
        
        
           path.addActionListener((ActionEvent ae)-> {
            try {
                file.setVisible(false);
                Admin.gravadAdmin(ad);
               
            } catch (IOException ex) {
                Logger.getLogger(NovoAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
      
        });
           
        
        
        ok.addActionListener((ActionEvent ae) -> {
            
            if(username.getText().equals("")||password.getText().equals("")||repassword.getText().equals("")){
                campos.setVisible(true);
                 senhae.setVisible(false);
                 campos.setForeground(Color.red);
                
            }else
                if(!password.getText().equals(repassword.getText())){
                  campos.setVisible(false);
                  senhae.setVisible(true);
                 senhae.setForeground(Color.red);
                }else{
                    
                    try{
                        saldo=Double.valueOf(saldoE.getText().trim());
                    }catch(NumberFormatException e){
                        
                    }
                    
                    Administrador administrador=new Administrador(username.getText(),password.getText(),saldo);
                    ad.add(administrador);
                   
                
                    try {
                        Admin.lerAdmin(administrador);
                        
                         try {
            new Admin().le();
            new LoginAdmin().loginAdmin();
            tela.setVisible(false);
                            
        } catch (IOException | ClassNotFoundException ex) {
            
        }
                         
                    } catch (IOException | ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(null,"cire o ficheiro");
                       
                    }
                }
        });
        
        
        
    }
    
    
    
}
