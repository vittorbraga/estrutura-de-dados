/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados;

/**
 *
 * @author vitorbraga
 */
public class Array {
    String[] diasSemana;
    public Array() {
        diasSemana = new String[7];
        diasSemana[0] = "Segunda";
        diasSemana[1] = "Terca";
        diasSemana[2] = "Quarta";
        diasSemana[3] = "Quinta";
        diasSemana[4] = "Sexta";
        System.out.println(diasSemana.length);
        System.out.println(this.size());
        System.out.println(this.diasSemana[3]);
        this.imprimir();
        diasSemana[5] = "Sabado";
        this.imprimir();
        adicionarInicio("Domingo");
        this.imprimir();
        adicionarFinal("Sabado2");
        adicionarFinal("Domingo2");
        this.imprimir();
        this.diasSemana[diasSemana.length-1] = null;
        this.diasSemana[diasSemana.length-2] = null;
        this.imprimir();
    }
    
    public int size() {
        int tamanho = 0;
        for(int i=0; i<diasSemana.length-1; i++){
            if(diasSemana[i] != null){
                tamanho++;
            }
        }
        return tamanho;
    }
    
    public void imprimir() {
        String str = "";
        for(int i=0; i<=diasSemana.length-1; i++){
            str += diasSemana[i]+", ";
        }
        System.out.println(str);
    }
    
    public void adicionarInicio(String elemento) {
        for(int i=diasSemana.length-1; i>0; i--){
            this.diasSemana[i] = this.diasSemana[i-1];
        }
        this.diasSemana[0] = elemento;
    }
    
    public void adicionarFinal(String elemento) {
        boolean inserir = true;
        for(int i=0; i<=diasSemana.length-1; i++){
            if(diasSemana[i] == null){
                diasSemana[i] = elemento;
                inserir = false;
            }
        }
        if(inserir){
            String[] arrayAux = new String[diasSemana.length+1];
            for(int i=0; i<=diasSemana.length-1; i++){
                arrayAux[i] = diasSemana[i];
            }
            arrayAux[diasSemana.length] = elemento;
            diasSemana = arrayAux;
        }
    }
            
}
