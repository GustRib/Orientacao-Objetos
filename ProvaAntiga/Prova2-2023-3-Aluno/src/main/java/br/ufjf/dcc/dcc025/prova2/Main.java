package br.ufjf.dcc.dcc025.prova2;

public class Main {

    public static void main(String[] args) {

        /*String telefone = null;

        try {
            telefone = "(32)999998888";
            Telefone.parser(telefone);
        } catch (TelefoneException ex) {
            System.out.println("Telefone inválido: " + telefone);
        }

        try {
            telefone = "(32)99999-8888";
            Telefone.parser(telefone);
        } catch (TelefoneException ex) {
            System.out.println("Telefone inválido: " + telefone);
        }

        try {
            telefone = "(32)9999-8888";
            Telefone.parser(telefone);
        } catch (TelefoneException ex) {
            System.out.println("Telefone inválido: " + telefone);
        }

        try {
            telefone = "(323)9999-8888";
            Telefone.parser(telefone);
        } catch (TelefoneException ex) {
            System.out.println("Telefone inválido: " + telefone);
        }

        try {
            telefone = "(3239999-8888";
            Telefone.parser(telefone);
        } catch (TelefoneException ex) {
            System.out.println("Telefone inválido: " + telefone);
        }

        try {
            telefone = "(32)9999-8888";
            Pessoa passageiro = new Pessoa("Joao", Telefone.parser(telefone), 19);
        } catch (TelefoneException ex) {
            System.out.println("Telefone inválido: " + telefone);
        } catch (Exception ex) {
            System.out.println("A origem é maior que o destino");
        }

        try {
            telefone = "(32)9999-8888";
            Pessoa passageiro = new Pessoa("Joao", Telefone.parser(telefone), 45);
            System.out.println("João está com os dados corretos");
        } catch (TelefoneException ex) {
            System.out.println("Telefone inválido: " + telefone);
        } catch (Exception ex) {
            System.out.println("A origem é maior que o destino");
        }

        try {
            List<Pessoa> passageiros = new ArrayList<>();
            //Passageiro intra
            passageiros.add(new Pessoa("Joao Intra", Telefone.parser("(21)99999-8888"), 21));
            passageiros.add(new Pessoa("Maria  Intra", Telefone.parser("(21)99999-8887"), 21));
            passageiros.add(new Pessoa("Antonio Intra", Telefone.parser("(21)99999-8886"), 21));
            passageiros.add(new Pessoa("Jose Intra", Telefone.parser("(21)99999-8885"), 21));
            passageiros.add(new Pessoa("Natalia Intra", Telefone.parser("(21)99999-8884"), 21));
            passageiros.add(new Pessoa("Enzo Intra", Telefone.parser("(21)99999-8883"), 21));
            passageiros.add(new Pessoa("Vicente Intra", Telefone.parser("(21)99999-8882"), 21));

            //Passageiros Inter
            passageiros.add(new Pessoa("Joao Inter", Telefone.parser("(21)99999-8888"), 27));
            passageiros.add(new Pessoa("Maria  Inter", Telefone.parser("(21)99999-8887"), 27));
            passageiros.add(new Pessoa("Antonio Inter", Telefone.parser("(21)99999-8886"), 27));
            passageiros.add(new Pessoa("Atrasado Inter", Telefone.parser("(21)99999-8886"), 27));
            passageiros.add(new Pessoa("Jose Inter", Telefone.parser("(22)99999-8885"), 28));
            passageiros.add(new Pessoa("Natalia Inter", Telefone.parser("(28)99999-8884"), 31));
            passageiros.add(new Pessoa("Enzo Inter", Telefone.parser("(31)99999-8883"), 38));
            passageiros.add(new Pessoa("Vicente Inter", Telefone.parser("(31)99999-8882"), 32));
            passageiros.add(new Pessoa("Fora Inter", Telefone.parser("(31)99999-8882"), 40));
            
            List<Carona> caronas = new ArrayList<>();
            caronas.add(new CaronaIntra(new Pessoa("Maria Motorista", Telefone.parser("(21)99999-9910"), 21)));
            caronas.add(new CaronaInter(new Pessoa("Joao Motorista", Telefone.parser("(21)99999-9999"), 38)));
            
            for (Pessoa passageiro : passageiros) {
                for (Carona carona : caronas) {
                    carona.embarque(passageiro);
                }
            }
            
            for (Carona carona : caronas) {
                System.out.println("Carona do(a) " + carona.getMotorista().getNome());
                System.out.println("Passageiros: ");
                for (Pessoa passageiro : carona.getPassageiros()) {
                    System.out.println("\t" + passageiro.getNome() + " Trajeto:" + passageiro.getTelefone().getDdd()+"-"+passageiro.getDestino());
                }
                System.out.println("Total: " + carona.valorTotal());
            }
            
            
            
        } catch (TelefoneException ex) {
            System.out.println("Telefone inválido: " + telefone);
        } catch (Exception ex) {
            System.out.println("A origem é maior que o destino");
        }*/

    }

}
