package View;

import Controller.User;
import Model.Funcionario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
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

public class MeusFuncionarios {
    
    static byte posi =0;

    JTextField Label= new JTextField();
    //LABEL
    JLabel nome = new JLabel("Nome:");
    JLabel apelido = new JLabel("Apelido:");
    JLabel idade = new JLabel("Idade:");
    JLabel departamento = new JLabel("departamento:");
    JLabel cargo = new JLabel("Cargo:");
    JLabel salario = new JLabel("Salario:");
    JLabel saldo = new JLabel("Saldo:");

    //JTEXTFIELD
    JTextField tnome = new JTextField();
    JTextField tapelido = new JTextField();
    JTextField tidade = new JTextField();
    JTextField tdepartamento = new JTextField();
    JTextField tcargo = new JTextField();
    JTextField tsalario = new JTextField();
    JTextField captura = new JTextField();

    //BOTAO
    JButton aumento = new JButton("Actualizar salario");
    JButton done = new JButton("concluir");
   
    JButton voltar = new JButton();
    double sa;
    int ida;

    public void meusfu() {
        JFrame tela = new JFrame();
        tela.setSize(600, 400);
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
        panel2.setBounds(302, 0, 600, 300);
        panel3.setBounds(0, 302, 600, 400);

        //PAINEL ADICIONA
        panel2.add(nome);
        panel2.add(apelido);
        panel2.add(idade);
        panel2.add(departamento);
        panel2.add(cargo);
        panel2.add(salario);
        panel2.add(saldo);
        panel2.add(tnome);
        panel2.add(tapelido);
        panel2.add(tidade);
        panel2.add(tdepartamento);
        panel2.add(tcargo);
        panel2.add(tsalario);
        panel3.add(voltar);
        panel3.add(aumento);
        panel3.add(done);

        //LABEL
        nome.setBounds(5, 5, 100, 20);
        apelido.setBounds(5, 35, 100, 20);
        idade.setBounds(5, 75, 100, 20);
        departamento.setBounds(5, 115, 100, 20);
        cargo.setBounds(5, 155, 100, 20);
        salario.setBounds(5, 195, 100, 20);
        
        
        //botao
        voltar.setBounds(5, 5, 20, 20);
        voltar.setContentAreaFilled(false);
        voltar.setBorder(null);
        aumento.setBounds(45, 5, 200, 20);
        aumento.setContentAreaFilled(false);
        done.setBounds(250, 5, 100, 20);
        done.setContentAreaFilled(false);

        //foto
        voltar.setIcon(new ImageIcon(getClass().getResource("voltar.png")));

        //TEXTOS
        tnome.setBounds(120, 5, 150, 20);
        tapelido.setBounds(120, 35, 150, 20);
        tidade.setBounds(120, 75, 150, 20);
        tdepartamento.setBounds(120, 115, 150, 20);
        tcargo.setBounds(120, 155, 150, 20);
        tsalario.setBounds(120, 195, 150, 20);
        
        tnome.setEditable(false);
        tapelido.setEditable(false);
        tidade.setEditable(false);
        tdepartamento.setEditable(false);
        tcargo.setEditable(false);
        tsalario.setEditable(false);

    
        
        //Lista
        JList lista = new JList();
        lista.setBounds(0, 0, 600, 300);

        JScrollPane scrol = new JScrollPane(lista);
        scrol.setBounds(0, 0, 600, 300);
        DefaultListModel<Funcionario> dml = new DefaultListModel();
        
        
        lista.addListSelectionListener((ListSelectionEvent e) -> {
            
            try{
               ida=Integer.parseInt(idade.getText());
            }catch(NumberFormatException c){
                
            }
            try{
                sa=Double.valueOf(tsalario.getText());
            }catch(NumberFormatException ed){
            
        }
           
            if (lista.getSelectedIndex()/*getSelectedValue()!= null*/>=0) {
                
                posi = (byte) lista.getSelectedIndex();
                //lista.getSelectedValue();
                Label.setText(User.leitorUS.get(posi).toString());  
                  
        for(int i=0;i<User.leitorUS.size();i++){
            if(Label.getText().equals(User.leitorUS.get(posi).toString())){
  
               tnome.setText(User.leitorUS.get(posi).getNome());
               tapelido.setText(User.leitorUS.get(posi).getApelido());
               
               
               ida=(User.leitorUS.get(posi).getIdade());
               String id = Integer.toString(ida);
               tidade.setText(id);
               
               tdepartamento.setText(User.leitorUS.get(posi).getDepartamento());
               tcargo.setText(User.leitorUS.get(posi).getCargo());
               
               sa=(User.leitorUS.get(posi).getSalario());
               String sla = Double.toString(sa);
               tsalario.setText(sla);
            }
        }
       
            }
        });
        
      
    

        Funcionario funcionario = new Funcionario();

        for (int n = 0; n < User.leitorUS.size(); n++) {
            dml.add(n, User.leitorUS.get(n));
        }

        lista.setModel(dml);

        panel1.add(scrol);

        aumento.addActionListener((ActionEvent ae) -> {
            tsalario.setEditable(true);
        });

        voltar.addActionListener((ActionEvent ae) -> {
            tela.setVisible(false);
            new OpcoesAdmin().admin();
        });
        done.addActionListener((ActionEvent ae) -> {
            try{
                sa=Double.valueOf(tsalario.getText());
            }catch(NumberFormatException e){
            
        }
            
            for(int i=0;i<User.leitorUS.size();i++){
                User.leitorUS.get(posi).setSalario(sa);
                try {
                    User.gravaUser(User.leitorUS);
                } catch (IOException ex) {
                    
                }
            }
            tsalario.setEditable(false);
        });
        
        

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);

    }

   

}
