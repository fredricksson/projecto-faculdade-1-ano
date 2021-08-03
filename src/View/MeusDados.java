package View;

import Controller.User;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MeusDados {
    
    //LABEL
    JLabel nome=new JLabel("Nome:");
    JLabel apelido=new JLabel("Apelido:");
    JLabel idade=new JLabel("Idade:");
    JLabel departamento=new JLabel("departamento:");
    JLabel cargo=new JLabel("Cargo:");
    JLabel salario=new JLabel("Salario:");
    JLabel saldo=new JLabel("Saldo:");
    
    JButton voltar=new JButton();
    
    //JTEXTFIELD
    JTextField tnome=new JTextField();
    JTextField tapelido=new JTextField();
    JTextField tidade=new JTextField();
    JTextField tdepartamento=new JTextField();
    JTextField tcargo=new JTextField();
    JTextField tsalario=new JTextField();
    JTextField tsaldo=new JTextField();
    
    JFrame tela=new JFrame();
    JPanel painel=new JPanel();
    
    public static String veri;
    
    public void meusDados(){
        tela.setResizable(false);
        tela.setVisible(true);
        tela.setSize(400, 300);
        tela.setDefaultCloseOperation(3);
        tela.setLocationRelativeTo(null);
        tela.add(painel);
        painel.setLayout(null);
        painel.add(voltar);
        voltar.setBounds(2,250,20,20);
        
        int idad;
        double salari;
        double sald;
        //PAINEL ADICIONA
        painel.add(nome);
        painel.add(apelido);
        painel.add(idade);
        painel.add(departamento);
        painel.add(cargo);
        painel.add(salario);
        painel.add(saldo);
        painel.add(tnome);
        painel.add(tapelido);
        painel.add(tidade);
        painel.add(tdepartamento);
        painel.add(tcargo);
        painel.add(tsalario);
        painel.add(tsaldo);
        
        //LABEL
        nome.setBounds(5, 5,100,20);
        apelido.setBounds(5, 35,100,20);
        idade.setBounds(5, 75,100,20);
        departamento.setBounds(5, 115,100,20);
        cargo.setBounds(5, 155,100,20);
        salario.setBounds(5,195,100,20);
        saldo.setBounds(250,245,100,20);
        
        //TEXTOS
        tnome.setBounds(120, 5,200,20);
        tapelido.setBounds(120, 35,200,20);
        tidade.setBounds(120, 75,200,20);
        tdepartamento.setBounds(120, 115,200,20);
        tcargo.setBounds(120, 155,200,20);
        tsalario.setBounds(120,195,200,20);
        tsaldo.setBounds(290,245,90,20);
        
          tnome.setEditable(false);
          tapelido.setEditable(false);
          tidade.setEditable(false);
          tdepartamento.setEditable(false);
          tcargo.setEditable(false);
          tsalario.setEditable(false);
          tsaldo.setEditable(false);
        
        try{
            idad=Integer.parseInt(tidade.getText());
        }catch(NumberFormatException err){}
        
         try{
            salari=Double.valueOf(tsalario.getText());
        }catch(NumberFormatException er){
            
        }
         
           try{
            sald=Double.valueOf(tsaldo.getText());
        }catch(NumberFormatException er){
            
        }
        
        for(int i=0;i<User.leitorUS.size();i++){
            if(User.leitorUS.get(i).getNome().equals(veri)){
                tnome.setText(User.leitorUS.get(i).getNome());
                tapelido.setText(User.leitorUS.get(i).getApelido());
                
                idad=User.leitorUS.get(i).getIdade();
                String ida= Integer.toString(idad);
                tidade.setText(ida);
                
                tdepartamento.setText(User.leitorUS.get(i).getDepartamento());
                tcargo.setText(User.leitorUS.get(i).getCargo());
                
                salari=User.leitorUS.get(i).getSalario();
                String sal = Double.toString(salari);
                tsalario.setText(sal);
                
                sald=User.leitorUS.get(i).getSaldo();
                String sld =Double.toString(sald);
                tsaldo.setText(sld);
                
            }
            
        }
        painel.setBackground(Color.LIGHT_GRAY);
       voltar.setIcon(new ImageIcon(getClass().getResource("voltar.png")));
       voltar.setContentAreaFilled(false);
       voltar.setBorder(null);
        
        voltar.addActionListener((ActionEvent ae) -> {
            tela.setVisible(false);
            new Usuario().usuarioMenu();
        });
        
    }
    public static void main(String[] args) {
        new MeusDados().meusDados();
    }
    
}
