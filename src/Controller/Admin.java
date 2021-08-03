package Controller;

import Model.Administrador;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Admin {

    
    
   public static  ArrayList<Administrador> leitor=new ArrayList<>();
   
    public static void lerAdmin(Administrador administrador) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream file=new FileInputStream("admin.txt");
        ObjectInputStream objecto= new ObjectInputStream(file);
        ArrayList<Administrador> ad=(ArrayList<Administrador>)objecto.readObject();
        ad.add(administrador);
        gravadAdmin(ad);
        objecto.close();
       
    }
    
    
    public static void  gravadAdmin(ArrayList<Administrador> administradores)throws IOException{
        FileOutputStream file=new FileOutputStream("admin.txt",false);
       
        ObjectOutputStream objecto=new ObjectOutputStream(file);
        objecto.writeObject(administradores);
        objecto.close();
        
        
    }
    
   
    
        public void le() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream file=new FileInputStream("admin.txt");
        ObjectInputStream objecto= new ObjectInputStream(file);
        leitor=(ArrayList<Administrador>)objecto.readObject();
        Iterator<Administrador> iterator=leitor.iterator();
        while(iterator.hasNext()){
            Administrador ad=iterator.next();
           
        }
        
        objecto.close();
    }
  
}
