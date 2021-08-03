package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OpcoesAdmin {
    
    
     //INSTANCIAS
    
    JFormattedTextField s=new JFormattedTextField();
  
    
    JTextField financa=new JTextField("FINANCA");
    JFrame tela = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel fu = new JPanel();
    JPanel fu1 = new JPanel();
    JPanel fu2 = new JPanel();
    JPanel fu3 = new JPanel();
    ImageIcon im=new ImageIcon(getClass().getResource("contr.jpg"));
    ImageIcon ima=new ImageIcon(getClass().getResource("contra.jpg"));
    ImageIcon ima1=new ImageIcon(getClass().getResource("demi.jpg"));
    ImageIcon ima2=new ImageIcon(getClass().getResource("funci.jpg"));
    ImageIcon ima3=new ImageIcon(getClass().getResource("paga.jpg"));
    JLabel imag=new JLabel();
    JLabel image=new JLabel();
    JLabel image1=new JLabel();
    JLabel image2=new JLabel();
    JLabel image3=new JLabel();
    JButton botao2=new JButton();
    JButton botao3=new JButton();
    JButton botao4=new JButton();
    JPanel painel=new JPanel();
    JLabel saldo=new JLabel("Saldo da Empresa");
   
   
    JLabel cont=new JLabel("Contratar");
    JLabel seccao=new JLabel("Seccao para contratos");
    JLabel demi=new JLabel("Demitir");
    JLabel fun=new JLabel("Meus Funcionarios");
    JLabel paga=new JLabel("Pagamentos");
  
    
    
    
   
    
 

    
    public void admin() {
        
        
        JPanel cima = new JPanel();
        cima.setBounds(0, 0, 700, 180);
        cima.setLayout(null);
        panel1.add(cima);
        
        JLabel cff = new JLabel("CFF Tintas");
        cff.setFont(new Font("28 Days Later",Font.BOLD, 70));
        cff.setForeground(new Color(248,146,6));
        cff.setBounds(200, 10, 500, 150);
        cima.add(cff);
        
              
      //VOLTAR
      ImageIcon i = new ImageIcon(getClass().getResource("voltar.png"));
      JButton voltar = new JButton(i);
      voltar.setBorder(null);
      voltar.setContentAreaFilled(false);
      voltar.setBounds(0, 0, 50, 50);
      
      cima.add(voltar);
        
        
        tela.setSize(700, 500);
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
        cima.setBackground(new Color(71,60,139));
        tela.add(panel);
        tela.add(panel1);
        panel1.setBounds(0, 0,700,250);
        panel1.setBackground(Color.WHITE);
        panel.setBounds(0,250,700,500);
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
        panel1.add(painel);
        painel.setBounds(0,170,700,250);
        painel.setLayout(null);
        painel.add(financa);
        financa.setBounds(300,5,100,20);
        financa.setEditable(false);
        financa.setBorder(null);
        painel.add(saldo);
      
        
        saldo.setBounds(5,20,150, 20);
        
        
        painel.add(s);
      
        s.setBounds(440, 20,250,20);
      

       
        
        image.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                new NovoUser().novoUser();
                tela.setVisible(false);
            }
        });
        
          image2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                new MeusFuncionarios().meusfu();
                tela.setVisible(false);
            }
        });
        
        image1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked (MouseEvent me){
                tela.setVisible(false);
                new Demitir().demitir();
            }
        });
        
        
             image3.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked (MouseEvent me){
                tela.setVisible(false);
                new Pagamento().pagar();

            }
        });
        
        
        
        
        botao3.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });
        
         botao2.addActionListener((ActionEvent ae) -> {
             tela.setExtendedState(JFrame.ICONIFIED);
        });
         
          botao4.addActionListener((ActionEvent ae) -> {
             tela.setVisible(false);
             new Relatorio().relatorio(Pagamento.relatorio);
        });
        
    
         
         voltar.addActionListener((ActionEvent ae) -> {
             tela.setVisible(false);
             new LoginAdmin().loginAdmin();
        });
    
    }
    
}
