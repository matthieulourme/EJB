import javax.naming.InitialContext;
import java.io.*;
import java.util.*;

public class Testeur {
    
    private static exoContact.session.ContactItf refBean ;
    
    public static void main(String[] args) throws Exception {
        
        try {
            
            InitialContext ctx = new InitialContext();
            refBean = (exoContact.session.ContactItf) ctx.lookup("exoDemo");
        }
        catch (Exception ex) {
            System.err.println("erreur dans le lookup");
            ex.printStackTrace();
        }
        
        List<String> lesNoms = refBean.getLesNoms();
        for (String nom : lesNoms)
             System.out.println(nom);
    }
}

