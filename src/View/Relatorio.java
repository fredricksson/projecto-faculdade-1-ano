/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static View.Pagamento.salario;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CELSO
 */
public class Relatorio {
    JTextField tcontratos=new JTextField();
    JTextField tcompras=new JTextField();
    JTextField toutro=new JTextField();
    JTextField ttotal=new JTextField();
    
    JButton voltar=new JButton();
   
    
    JLabel valor=new JLabel("VALOR GASTO");
    JLabel contratos=new JLabel("Contratos=====================");
    JLabel compras=new JLabel("Compras======================");
    JLabel outro=new JLabel("Outros========================");
    JLabel total=new JLabel("Total==========================");
    
    JFrame tela=new JFrame();
    JPanel painel=new JPanel();
    
    
    public void relatorio(double valo){
        tela.setResizable(false);
        tela.setSize(300,200);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(3);
        tela.setVisible(true);
        tela.add(painel);
        painel.setBackground(Color.LIGHT_GRAY);
        painel.add(valor);
        painel.add(contratos);
        painel.add(compras);
        painel.add(outro);
        painel.add(total);
        painel.add(voltar);
        
        String ss = Double.toString(Pagamento.relatorio);
        tcontratos.setText(ss);
        
        String s = Double.toString(Pagamento.relatorio);
        ttotal.setText(s);
        
        painel.add(tcontratos);
        painel.add(tcompras);
        painel.add(toutro);
        painel.add(ttotal);
        
        painel.setLayout(null);
        valor.setBounds(100, 5, 100, 20);
        contratos.setBounds(5, 30,220, 20);
        compras.setBounds(5, 55, 220, 20);
        outro.setBounds(5, 80, 220, 20);
        total.setBounds(5, 125, 220, 20);
        
        voltar.setBounds(2,150, 20, 20);
        voltar.setContentAreaFilled(false);
        voltar.setBorder(null);
         voltar.setIcon(new ImageIcon(getClass().getResource("voltar.png")));
        
        tcontratos.setBounds(230, 30,50, 20);
        tcompras.setBounds(230, 55, 50, 20);
        toutro.setBounds(230, 80, 50, 20);
        ttotal.setBounds(230, 125, 50, 20);
        
        tcontratos.setEditable(false);
        tcompras.setEditable(false);
        toutro.setEditable(false);
        ttotal.setEditable(false);
        
        
         voltar.addActionListener((ActionEvent ae) -> {
            tela.setVisible(false);
            new OpcoesAdmin().admin();
        });
        
    }
   
    
}
