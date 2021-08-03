package View;

import Controller.User;
import Model.Funcionario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;

public class Pagamento {
    
        static double relatorio;
        double salarial;
        double salarioFaltas;
        double salarioImposto;
        double salarioCortes;
        double salariodele;
        double corte;
        int impostos;
        int falta;
        static byte posi =0;
        static double salario;
        static double saldos;
        
      

            //JTEXTFIELD
    JTextField tfaltas = new JTextField();
    JTextField timposto = new JTextField();
   JTextField tcortes = new JTextField();
   JTextField status = new JTextField();
    JTextField Label= new JTextField();
    
    //LABEL
    JLabel faltas = new JLabel("Faltas:");
    JLabel imposto = new JLabel("Impostos:");
    JLabel cortes = new JLabel("Cortes:");
    JLabel saldo = new JLabel("Novo salario");



    //BOTAO
    JButton gerar = new JButton("Gerar saldo");
    JButton pagar = new JButton("Pagar");
   
    JButton voltar = new JButton();
    double sa;
    int ida;
    
    public void pagar(){
        
            


        JFrame tela = new JFrame();
        tela.setSize(455, 400);
        tela.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel.setLayout(null);
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        panel.setBackground(Color.BLACK);
        tela.add(panel);
        panel1.setBounds(0, 0, 300, 300);
        panel2.setBounds(302, 0, 455, 300);
        panel3.setBounds(0, 302, 455, 400);

        //PAINEL ADICIONA
        panel2.add(faltas);
        panel2.add(imposto);
        panel2.add(cortes);
        panel2.add(saldo);
        panel2.add(tfaltas);
        panel2.add(timposto);
        panel2.add(tcortes);
        panel2.add(status);
        panel3.add(voltar);
        panel3.add(gerar);
        panel3.add(pagar);

        //LABEL
        faltas.setBounds(5, 5, 100, 20);
        imposto.setBounds(5, 35, 100, 20);
        cortes.setBounds(5, 75, 100, 20);
        saldo.setBounds(5, 150, 100, 20);
        
        
        //botao
        voltar.setBounds(5, 5, 20, 20);
        voltar.setContentAreaFilled(false);
        voltar.setBorder(null);
        gerar.setBounds(60, 5, 100, 20);
        gerar.setContentAreaFilled(false);
        pagar.setBounds(175, 5, 100, 20);
        pagar.setContentAreaFilled(false);

        //foto
        voltar.setIcon(new ImageIcon(getClass().getResource("voltar.png")));

        //TEXTOS
        tfaltas.setBounds(80, 5, 50, 20);
        timposto.setBounds(80, 35, 50, 20);
        tcortes.setBounds(80, 75, 50, 20);
        status.setBounds(70, 150, 60, 20);
        
        status.setEditable(false);
    
        
        //Lista
        JList lista = new JList();
        lista.setBounds(0, 0, 600, 300);

        JScrollPane scrol = new JScrollPane(lista);
        scrol.setBounds(0, 0, 600, 300);
        DefaultListModel<Funcionario> dml = new DefaultListModel();
        
        
        lista.addListSelectionListener((ListSelectionEvent e) -> {
            
            try{
               ida=Integer.parseInt(cortes.getText());
            }catch(NumberFormatException c){
                
            }
           
            if (lista.getSelectedIndex()>=0) {
                
                posi = (byte) lista.getSelectedIndex();
                
                Label.setText(User.leitorUS.get(posi).toString());  
                  
        for(int i=0;i<User.leitorUS.size();i++){
            if(Label.getText().equals(User.leitorUS.get(posi).toString())){
  
            }
        }
       
            }
        });
        
      


        for (int n = 0; n < User.leitorUS.size(); n++) {
            dml.add(n, User.leitorUS.get(n));
        }

        lista.setModel(dml);

        panel1.add(scrol);

        gerar.addActionListener((ActionEvent ae) -> {
            
            falta = Integer.parseInt(tfaltas.getText());
            impostos = Integer.parseInt(timposto.getText());
            corte = Double.parseDouble(tcortes.getText());
            
            salarial=User.leitorUS.get(posi).getSalario();
            
            salarioFaltas=((salarial/30)*falta);
            salarioImposto=(impostos*0.03);
            salarioCortes=(corte);
            
            salariodele=(salarioFaltas+salarioImposto+salarioCortes);
            salario=User.leitorUS.get(posi).getSalario();
            salario=salario-salariodele;
            
            
            saldos=User.leitorUS.get(posi).getSaldo();
            saldos=saldos+salario;
            User.leitorUS.get(posi).setSaldo(saldos);
            
            DecimalFormat df = new DecimalFormat("###,##0.00");
            df.format(User.leitorUS.get(posi).getSaldo());
            
            String ss = Double.toString(salario);
            status.setText(ss);
         
              relatorio+=salario;
            
        });
        

        voltar.addActionListener((ActionEvent ae) -> {
            tela.setVisible(false);
            new OpcoesAdmin().admin();
        });
        
        
        pagar.addActionListener((ActionEvent ae) -> {
            
            
           
           
            try {
                User.gravaUser(User.leitorUS);
            } catch (IOException ex) {
               
            }
            
        });
        
        

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);

    
}
    

}
