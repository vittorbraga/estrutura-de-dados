package estruturadedados;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        String[] diasDaSemana = new String[5];
        diasDaSemana[0] = "Segunda";
        diasDaSemana[1] = "Teca";
        diasDaSemana[2] = "Quarta";
        diasDaSemana[3] = "Quinta";
        diasDaSemana[4] = "Sexta";
        System.out.println("Tamanho do array: " + diasDaSemana.length);
        System.out.println(diasDaSemana[3]);
        System.out.println(diasDaSemana[2]);
        System.out.println("-----------------------");
        for(int i=0; i<diasDaSemana.length; i++) {
            System.out.println("Dia: " + diasDaSemana[i]);
        }
        String[] diasDaSemanaMaior = new String[9];
        for(int i=0; i<diasDaSemana.length; i++) {
            diasDaSemanaMaior[i] = diasDaSemana[i];
        }
        diasDaSemana = diasDaSemanaMaior;
        diasDaSemanaMaior[5] = "Sabado";
        diasDaSemanaMaior[6] = "Domingo";
        diasDaSemanaMaior[7] = "Sabado 2";
        diasDaSemanaMaior[8] = "Domingo 2";
        diasDaSemanaMaior[7] = "";
        diasDaSemanaMaior[8] = "";
        System.out.println("-----------------------");
        for(int i=0; i<diasDaSemana.length; i++) {
            System.out.println("Dia: " + diasDaSemana[i]);
        }
        
        // Exemplo classe
        Pessoa p = new Pessoa();
        p.nome = "Vitor";
        p.sobrenome = "Braga";
        p.idade = 29;
        System.out.println(p.nomeCompleto());
        */
        /*Stack pilha = new Stack();
        pilha.push(82);
        pilha.push(95);
        pilha.push(57);
        System.out.println(pilha.peek());
        pilha.push(23);
        System.out.println(pilha.peek());
        pilha.pop();
        System.out.println(pilha.peek());
        System.out.println(pilha.toString());
        
        System.out.println("fim");*/
        
        Stack pilha = new Stack();
        int decimal = 70;
        while(decimal > 0) {
            pilha.push(decimal % 2);
            decimal = decimal / 2;
        }
        System.out.println(pilha.toString());
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
    }

}
