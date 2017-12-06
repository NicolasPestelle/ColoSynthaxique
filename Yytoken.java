import java.io.*;

//la classe Yytoken
public class Yytoken{
private String description;
    private int valeur;
    public Yytoken(String d){
	this.description = d;
	this.valeur = 0;
}
    public Yytoken(String d, int v){
	this(d);
	this.valeur = v;
    }

    public String toString(){
	return this.description+"("+valeur+")";
    }
}

