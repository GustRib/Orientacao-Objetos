package br.ufjf.dcc.dcc025.parser;

public class Ponto2 {
    
    private int x;
    private int y;

    public Ponto2(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Método que recebe uma String no formato (NI,NI) e retorna um Ponto
     * @param pontoStr String no formato (NI,NI)
     * @return Objeto do tipo Ponto2
     */
    public static Ponto2 parser(String pontoStr){
        
        if(pontoStr.charAt(0) != '(' || 
                pontoStr.charAt(pontoStr.length()-1) != ')' )
            return null;
        
        String pontoManipulado = 
                pontoStr.substring(1,pontoStr.length()-1);
        
        String[] numerosStr = pontoManipulado.split(",");
        
        if(numerosStr.length != 2)
            return null;
        
        String primeiroInteiro = numerosStr[0];
        String segundoInteiro = numerosStr[1];
        
        if(!ehInteiro(primeiroInteiro) || !ehInteiro(segundoInteiro))
            return null;
        
        int x, y;
        x = Integer.parseInt(primeiroInteiro);
        y = Integer.parseInt(segundoInteiro);
        
        
        return new Ponto2(x,y);
    }
    
    private static boolean ehInteiro(String inteiro){
        
        for (int i = 0; i < inteiro.length(); i++) {
            if(inteiro.charAt(i) < '0' || inteiro.charAt(i) > '9')
                return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
        String ponto = "(3,5)";
        System.out.println(parser(ponto));
        
        
    }

    @Override
    public String toString() {
        return "("+ x + "," + y + ')';
    }
    
    
}
