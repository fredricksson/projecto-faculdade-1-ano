
package teste;

import Controller.Admin;
import Controller.User;
import View.TelaPrincipal;
import java.io.IOException;

public class teste {
    
    public static void main(String[] args) {
       
        
        try {
            new User().le();
        } catch (ClassNotFoundException | IOException ex) {
           
        }
        try {

            new Admin().le();
        } catch (IOException | ClassNotFoundException ex) {
           
        }
         new TelaPrincipal().TelaPrincipal();
       
}}
