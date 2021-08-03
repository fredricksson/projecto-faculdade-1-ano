package Controller;
import Model.Funcionario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class User {
    
    
        
   public static  ArrayList<Funcionario> leitorUS=new ArrayList<>();
   
    public static void lerUser(Funcionario funcionario) throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream file=new FileInputStream("user.txt");
        ObjectInputStream objecto= new ObjectInputStream(file);
        ArrayList<Funcionario> us=(ArrayList<Funcionario>)objecto.readObject();
        us.add(funcionario);
        gravaUser(us);
        objecto.close();
       
    }
    
    
    public static void  gravaUser(ArrayList<Funcionario> funcionarios)throws IOException{
        FileOutputStream file=new FileOutputStream("user.txt",false);
       
        ObjectOutputStream objecto=new ObjectOutputStream(file);
        objecto.writeObject(funcionarios);
        objecto.close();
        
        
    }
    
   
    
        static public void le() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream file=new FileInputStream("user.txt");
        ObjectInputStream objecto= new ObjectInputStream(file);
        leitorUS=(ArrayList<Funcionario>)objecto.readObject();
        Iterator<Funcionario> iterator=leitorUS.iterator();
        while(iterator.hasNext()){
            Funcionario fu=iterator.next();
            
        }
        
        objecto.close();
    }
}
