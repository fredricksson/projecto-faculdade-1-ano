/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Paga {
    JFrame tela=new JFrame();
    JPanel painel=new JPanel();
    
    String[] cabecalho={"Nome","Apelido","faltas","Cortes","Bonus"};
    String linhas [][]={{""},{""},{""},{""},{""},{""}};
    JTable tabela=new JTable(linhas,cabecalho);
    public void paga(){
        tela.setSize(500, 350);
        tela.setResizable(false);
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(3);
        tela.add(painel);
        painel.setLayout(null);
        painel.add(tabela);
        tabela.setBounds(0, 0,500,350);
        
    }
    public static void main(String[] args) {
        new Paga().paga();
    }
    
}
