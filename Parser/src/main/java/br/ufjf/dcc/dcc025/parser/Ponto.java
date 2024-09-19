package br.ufjf.dcc.dcc025.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ponto {
   private int x; 
   private int y;
   private static Pattern pattern;
   
   static {
       String regex = "\\(([0-9]+),([0-9]+)\\)";
       pattern = Pattern.compile(regex);
       
   }
   
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    public static Ponto parser(String ponto){
       
       Matcher matcher = pattern.matcher(ponto);
        if(matcher.matches()){
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            
            return new Ponto(x, y);
        }
        
        return null;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
    
    
    public static void main(String[] args) {
        System.out.println(Ponto.parser("(90,30)"));
        System.out.println(Ponto.parser("(9a,30)"));
        
    }
    
}
