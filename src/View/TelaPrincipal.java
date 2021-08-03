package View;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class TelaPrincipal{
  
    
   
    ImageIcon i1=new ImageIcon(getClass().getResource("cor.jpg"));
    ImageIcon i2=new ImageIcon(getClass().getResource("ima.jpg"));
    ImageIcon i3=new ImageIcon(getClass().getResource("sem.jpg"));
    ImageIcon i4=new ImageIcon(getClass().getResource("empre.jpg"));
    ImageIcon is=new ImageIcon(getClass().getResource("user.png"));
   
    public static JFrame tela=new JFrame();
    JPanel painel=new JPanel();
    JPanel painel1=new JPanel();
    JPanel painel2=new JPanel();
    JPanel painel3=new JPanel();
    JPanel painel4=new JPanel();
    JPanel painel5=new JPanel();
    JPanel painel6=new JPanel();
    JPanel painel7=new JPanel();
    JLabel label=new JLabel(); 
    JMenu menu=new JMenu("Categoria");
    JMenu menu1=new JMenu("Tudo");
    JMenu menu2=new JMenu("Novo");
    JMenuBar barra=new JMenuBar();
    JMenuBar barra1=new JMenuBar();
    JTextField texto=new JTextField();
    JSeparator separa=new JSeparator();
    JButton botao=new JButton();
    JButton botao1=new JButton();
    JButton botao2=new JButton();
    JButton botao3=new JButton();
    
    JButton botao5=new JButton();
    JButton botao7=new JButton();
    JLabel ua=new JLabel("user/ admin");
    JButton S1=new JButton();
    JButton S2=new JButton();
    JButton S3=new JButton();
    JButton S4=new JButton();
    JButton S5=new JButton();
    JButton S31=new JButton();
    JButton S42=new JButton();
    JButton S53=new JButton();
    
    
    public void TelaPrincipal(){
    
        tela.setSize(700,500);
        menu.setForeground(Color.WHITE);
        menu1.setForeground(Color.WHITE);
        menu2.setForeground(Color.WHITE);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setUndecorated(true);
        texto.setBackground(Color.LIGHT_GRAY);
        texto.setForeground(Color.WHITE);
        tela.add(painel);
        painel.setLayout(null);
        painel1.setLayout(null);
        painel2.setLayout(null);
        painel3.setLayout(null);
        painel4.setLayout(null);
         painel5.setLayout(null);
        painel6.setLayout(null);
        painel7.setLayout(null);
        painel.add(painel1);
        painel.add(painel2);
        painel.add(painel3);
        painel1.setBounds(0, 0,40,500);
        painel2.setBounds(40,0,700,250);
        painel3.setBounds(40,230,700,500);
        painel3.setBackground(Color.LIGHT_GRAY);
        painel2.setBackground(Color.LIGHT_GRAY);
        painel1.setBackground(new Color(25,25,112));
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
        painel2.add(label);
        label.setBounds(0,15,700,250);
        painel3.add(painel4);
        painel3.add(painel5);
        painel3.add(painel6);
        painel3.add(painel7);
        painel4.setBounds(10,30,638,45);
        painel5.setBounds(10,85,205,180);
        painel6.setBounds(226,85,205,180);
        painel7.setBounds(443,85,205,180);
        painel4.setBackground(Color.white);
        barra.setBounds(0, 0, 330,48);
        barra1.setBounds(330, 0,550,48);
        barra.add(menu);
        barra1.add(menu1);
        barra1.add(menu2);
        painel4.add(barra);
        painel4.add(barra1);
        painel2.add(texto);
        texto.setBounds(50,5,250,20);
        texto.setBorder(null);
        painel2.add(separa);
        separa.setBounds(50,25,250,1);
        painel2.add(botao);
        botao.setBounds(25,5,20,20);
        separa.setForeground(Color.BLACK);
        botao.setIcon(new ImageIcon(getClass().getResource("p.png")));
        botao.setContentAreaFilled(false);
        botao.setBorderPainted(false);
        botao1.setContentAreaFilled(false);
        botao1.setBorderPainted(false);
        painel2.add(botao1);
        botao1.setBounds(470,5,20,20);
        botao1.setIcon(is);
        painel2.add(ua);
        ua.setBounds(500,4,70,20);
        ua.setForeground(Color.WHITE);
        painel5.setBackground(new Color(25,25,112));
        painel6.setBackground(new Color(25,25,112));
        painel7.setBackground(new Color(25,25,112));
        barra.setBackground(new Color(25,25,112));
        barra1.setBackground(new Color(25,25,112));
        painel2.add(botao2);
        painel2.add(botao3);
        painel1.add(botao5);
        painel1.add(botao7);
        botao5.setBounds(5,20,32,32);
        botao7.setBounds(5,450,32,32);
        botao2.setBounds(600,5,20,20);
        botao3.setBounds(630,5,20,20);
        botao3.setIcon(new ImageIcon(getClass().getResource("clo.png")));
        botao2.setIcon(new ImageIcon(getClass().getResource("min.png")));
        botao3.setContentAreaFilled(false);
        botao3.setBorder(null);
        S1.setContentAreaFilled(false);
        S1.setBorder(null);
         S2.setContentAreaFilled(false);
        S2.setBorder(null);
         S3.setContentAreaFilled(false);
        S3.setBorder(null);
         S4.setContentAreaFilled(false);
        S4.setBorder(null);
         S5.setContentAreaFilled(false);
        S5.setBorder(null);
        botao2.setContentAreaFilled(false);
        botao3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
            
        });
         botao2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                tela.setExtendedState(JFrame.ICONIFIED);
            }
            
        });
         botao5.setIcon(new ImageIcon(getClass().getResource("ca.png")));
         botao7.setIcon(new ImageIcon(getClass().getResource("so.png")));
         
         botao5.setBorder(null);
         botao5.setContentAreaFilled(false);
         botao7.setBorder(null);
         botao7.setContentAreaFilled(false);

         painel5.add(S2);
         painel5.add(S3);
         painel5.add(S4);
         painel5.add(S5);
         painel6.add(S1);
         S1.setIcon(new ImageIcon(getClass().getResource("star.png")));
         S2.setIcon(new ImageIcon(getClass().getResource("star.png")));
         S3.setIcon(new ImageIcon(getClass().getResource("star.png")));
         S4.setIcon(new ImageIcon(getClass().getResource("star.png")));
         S5.setIcon(new ImageIcon(getClass().getResource("star.png")));
         S1.setBounds(15,155,16,16);
         S2.setBounds(25,155,16,16);
         S3.setBounds(45,155,16,16);
         S4.setBounds(65,155,16,16);
         S5.setBounds(85,155,16,16);
         painel5.add(S31);
         painel6.add(S42);
         painel7.add(S53);
         S53.setBounds(50,50,100,100);
         S42.setBounds(50,50,100,100);
         S31.setBounds(50,50,100,100);
         S31.setContentAreaFilled(false);
         S31.setBorder(null);
          S42.setContentAreaFilled(false);
         S42.setBorder(null);
          S53.setContentAreaFilled(false);
         S53.setBorder(null);
         S31.setIcon(new ImageIcon(getClass().getResource("pc.png")));
         S42.setIcon(new ImageIcon(getClass().getResource("hd.png")));
         S53.setIcon(new ImageIcon(getClass().getResource("sf.png")));
        
            
            botao1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                new EscolhaUsuario().EscolhaUsuario();
                tela.setVisible(false);
             
                
            }
           
       });
         
         int r=1;
        while(r==1){
            try{
                
             label.setIcon(new ImageIcon(i1.getImage().getScaledInstance(730,220,Image.SCALE_SMOOTH)));
             Thread.sleep(7000);
             label.setIcon(new ImageIcon(i2.getImage().getScaledInstance(730,220,Image.SCALE_AREA_AVERAGING)));
             Thread.sleep(7000);
             label.setIcon(new ImageIcon(i3.getImage().getScaledInstance(730,220,Image.SCALE_AREA_AVERAGING)));
             Thread.sleep(7000);
             label.setIcon(new ImageIcon(i4.getImage().getScaledInstance(730,220,Image.SCALE_AREA_AVERAGING)));
             Thread.sleep(7000);
            }catch( InterruptedException ee){
                
            }
        }
        
    
        
        
    
       
     
        
        
        
        
        
        
        
    }
}
    
