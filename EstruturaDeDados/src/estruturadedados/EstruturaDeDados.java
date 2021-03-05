package estruturadedados;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // TODO code application logic here
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
    }
}
