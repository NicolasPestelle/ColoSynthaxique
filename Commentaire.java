import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Commentaire{

    public static void main(String [] args) throws IOException{
        System.out.println(args[0]);
        EnleveCommentaire yy = null;
        yy = new EnleveCommentaire(new FileReader(args[0]));
        Yytoken yytoken;
        while ((yytoken = yy.yylex())!=null){
            System.out.println(yytoken);
        }
    }

}
