package View;

import Controller.User;
import Model.Funcionario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NovoUser {
    ArrayList<Funcionario> funcionarios=new ArrayList<>();
    
     public int idades;
     public double salado;
     public double salaro;
     
 
    static String sexo;
    String [] departamentos = {"Recursos Humanos","Financas","Producao","Marketing","Juridico Legal"};
    String [] academico = {"Nivel Secundario", "Nivel Tecnico","Lincenciado","Mestre"};
    String [] car = {"Caixa", "Gerente","Administrador","Chefe"};
    
    //BUTTON
    JButton botaoc=new JButton();
    JButton botaov=new JButton();
    JButton path=new JButton();
    
    //JTEXTFIELD
    JTextField nome=new JTextField();
    JTextField apelido=new JTextField();
    JFormattedTextField idade=new JFormattedTextField();
    JComboBox cargo=new JComboBox(car);
    JTextField nacionalidade=new JTextField();
    JTextField dataDeNascimento=new JTextField();
    JTextField saldo=new JTextField();
    JTextField salario=new JTextField("");
    
    
    //JRADIO E GROUP
    JRadioButton sexoM=new JRadioButton();
    JRadioButton sexoF=new JRadioButton();
    ButtonGroup g=new ButtonGroup();
    
    //JCOMBOBOX
    JComboBox departamento=new JComboBox(departamentos);
    JComboBox nivelAcademico=new JComboBox(academico);
    
    
    
    //JPASSWORDFIELD
    JPasswordField pin=new JPasswordField();
    
    
    //TELA
    JFrame tela=new JFrame();
    JPanel painel=new JPanel();
   
    JPanel contratos=new JPanel();
    JPanel ncontratos=new JPanel();
   
    
    public void novoUser(){
        //converti
        
        
        
         //CONFIGURACOES DA TELA
        tela.setResizable(false);
        tela.setSize(498,400);
        tela.setDefaultCloseOperation(3);
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        tela.add(painel);
        
         //CONFIGURACOES DO PAINEL
        painel.setLayout(null);
//        painel.setBackground(Color.LIGHT_GRAY);
       
        contratos.setBackground(Color.LIGHT_GRAY);
      
        contratos.setBounds(0,30,498,400);
        ncontratos.setBounds(0,2,498,26);
        ncontratos.setBackground(Color.LIGHT_GRAY);
        
         
        //LABEL
        JLabel criar = new JLabel("cire um ficheiro=>");
        JLabel nm = new JLabel("Nome:");
        JLabel ap = new JLabel("Apelido:");
        JLabel se = new JLabel("Sexo:");
        JLabel m = new JLabel("M");
         JLabel f = new JLabel("F");
         JLabel id = new JLabel("Idade:");
         JLabel bilhete = new JLabel("B.I:");
         JLabel carg = new JLabel("Cargo:");
         JLabel nacio = new JLabel("Nacionalidade:");
         JLabel nivel = new JLabel("Nivel academico:");
         
          JLabel da=new JLabel("Data de Nascimento: ");
          JLabel sh = new JLabel("Senha:");
          JLabel dpt = new JLabel("Departamento:");
          JLabel sal = new JLabel("salario:");
          
          
        nm.setBounds(10,8,50,20);
        ap.setBounds(250,8,50,20);
        nivel.setBounds(10,58,100,20);
        dpt.setBounds(10,108,100,20);
        id.setBounds(250,58,120,20);
        carg.setBounds(10,158,120,20);
        nacio.setBounds(250,108,120,20);
        sh.setBounds(10,208,120,20);
        sal.setBounds(10,278,120,20);
        se.setBounds(360,58,120,20);
        m.setBounds(360,80,20,20);
        f.setBounds(410,80,20,20);
        //ADICOES NO PAINEL
      
      
        painel.add(contratos);
        painel.add(ncontratos);
        contratos.setLayout(null);
       
        contratos.add(nome);
        contratos.add(apelido);
        contratos.add(idade);
        contratos.add(cargo);
        contratos.add(nacionalidade);
        contratos.add(dataDeNascimento);
        contratos.add(salario);
        contratos.add(departamento);
        contratos.add(nivelAcademico);
        contratos.add(pin);
        contratos.add(sexoM);
        contratos.add(sexoF);
        contratos.add(nm);
        contratos.add(ap);
        contratos.add(se);contratos.add(m);contratos.add(f);contratos.add(id);contratos.add(bilhete);contratos.add(carg);contratos.add(nacio);contratos.add(nivel);contratos.add(da);contratos.add(sh);contratos.add(dpt);contratos.add(sal);
        contratos.add(botaoc);
        contratos.add(botaov);
        contratos.add(path);
        contratos.add(criar);
        criar.setVisible(false);
        criar.setBounds(350,5,120,20);
        
         
        
        
        
        //JButton
        botaoc.setIcon(new ImageIcon(getClass().getResource("done.png")));
        botaov.setIcon(new ImageIcon(getClass().getResource("voltar.png")));
        botaoc.setBounds(430,310,50,20);
        botaov.setBounds(360,310,50,20);
        botaoc.setContentAreaFilled(false);
        botaoc.setBorder(null);
        path.setIcon(new ImageIcon(getClass().getResource("file.png")));
        path.setBounds(470,5,20,20);
        path.setContentAreaFilled(false);
        path.setBorder(null);
        
        botaov.setContentAreaFilled(false);
        botaov.setBorder(null);
        
        
        //TEXTOS
        nome.setBounds(10,30,200,20);
     
        apelido.setBounds(250,30,200,20);
        idade.setBounds(250,80,60,20);
        cargo.setBounds(10,180,200,20);
        nacionalidade.setBounds(250,130,200,20);
        pin.setBounds(10,230,100,20);
        
        nome.setBorder(null);
        apelido.setBorder(null);
        idade.setBorder(null);
        cargo.setBorder(null);
        nacionalidade.setBorder(null);
        pin.setBorder(null);
        salario.setBounds(10,300,100,20);
        
        //BOX
        nivelAcademico.setBounds(10,80,200,20);
        departamento.setBounds(10,130,200,20);
        g.add(sexoM);
        g.add(sexoF);
        
        //RADIO
        sexoM.setBounds(370,80,20,20);
        sexoF.setBounds(429,80,20,20);
        sexoF.setBackground(Color.LIGHT_GRAY);
        sexoM.setBackground(Color.LIGHT_GRAY);
        
        
        //EVENTOS
        
                   
           

           path.addActionListener((ActionEvent ae)-> {
               criar.setVisible(false);
            try {
                User.gravaUser(funcionarios);
               
            } catch (IOException ex) {
                Logger.getLogger(NovoAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
      
        });
        
        botaov.addActionListener((ActionEvent ae) -> {
            tela.setVisible(false);
            new OpcoesAdmin().admin();
        });
        
        
        
      
        
      
            
           
       
           
           
           
           botaoc.addActionListener((ActionEvent ae) -> {
               
               
           //CONVERTENDO
           String niv=(String)nivelAcademico.getSelectedItem();
           String depa=(String)departamento.getSelectedItem();
            String ca=(String)cargo.getSelectedItem();
           
           if(sexoF.isSelected()){
               sexo="Femenino";
           }else
               if(sexoM.isSelected()){
                   sexo="Masculino";
               }
               
         
                
                
            String sidades=(String)idade.getText();
           
            try{
            
            idades=Integer.parseInt(sidades);
              
           }
           catch(NumberFormatException er){
               System.out.println(er);
      
           JOptionPane.showMessageDialog(null,idades+" nao e uma idade");
               
           } 
           
           
           try {
                         
           
           
       
           
           try{
               salado=0;
            salado=Double.parseDouble(saldo.getText());
              
        }catch(NumberFormatException er){
               System.out.println("raio1");
        }
           
           try{
            salaro=Double.valueOf(salario.getText());
               System.out.println(salaro);
        }catch(NumberFormatException er){
               System.out.println("rio");
        }
        
                
           
                Funcionario funcionario=new Funcionario(nome.getText(),apelido.getText(),
                        idades,ca,nacionalidade.getText(),salado,salaro,pin.getText(),niv,depa,sexo);
                
                User.lerUser(funcionario);
                
                try {
            new User().le();
            tela.setVisible(false);
            new OpcoesAdmin().admin();
           
        } catch (IOException | ClassNotFoundException ex) {
           
        }
            } catch (IOException | ClassNotFoundException ex) {
               criar.setVisible(true);
            }
            
            
        });
       
         if(!User.leitorUS.isEmpty()){
             criar.setVisible(false);
             path.setVisible(false);
         }
        
        
    }
    
    
}
