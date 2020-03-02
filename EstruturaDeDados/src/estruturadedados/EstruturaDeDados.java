package estruturadedados;

public class EstruturaDeDados {
    public static void main(String[] args) {
        // TODO code application logic here
        //Array arr = new Array();
        Pilha pilha = new Pilha();
        int numero = 29;
        while(numero>0){
            pilha.push(numero%2);
            numero = numero/2;
        }
        while(pilha.size()>0){
            System.out.println(pilha.pop());
        }
    }
    
}
