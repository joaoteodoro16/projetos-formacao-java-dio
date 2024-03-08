package br.com.joaoteodoro.estruturadados.encadeamento;

public class Main {
    public static void main(String[] args) {

        No<String> no1 = new No("Conteudo No1");

        No<Integer> no2 = new No(2);
        no1.setProximoNo(no2);

        No<String> no3 = new No("Conteudo No3");
        no2.setProximoNo(no3);

        No<String> no4 = new No("Conteudo No4");
        no3.setProximoNo(no4);

        //Referencia de Memoria
        //No1 -> No2 -> No3 -> No4

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

    }
}
