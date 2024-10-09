package model;

import java.util.Scanner;

public class Restaurante extends Empresa {

    private String tipocomida;
    private double precoMedioPrato;

    public Restaurante() {
        this("", "", "", "", "", "", "", 0.0);
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone, String tipoComida, double precoMedioPrato) {
        super(nome, endereco, cidade, estado, cep, telefone);
        this.tipocomida = tipoComida;
        this.precoMedioPrato = precoMedioPrato;
    }

    public void setTipoComida(String tipoComida) {
        this.tipocomida = tipoComida;
    }

    public void setPrecoMedioPrato(double precoMedioPrato) {
        this.precoMedioPrato = precoMedioPrato;
    }

    public String getTipoComida() {
        return tipocomida;
    }

    public double getPrecoMedioPrato() {
        return precoMedioPrato;
    }

    public void solicitandoDados() {
        super.solicitarDados();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tipo de Comida: ");
        this.tipocomida = scanner.nextLine();
        System.out.print("Preco medio do Prato: ");
        this.precoMedioPrato = scanner.nextDouble();
    }

    public void imprimindoDados() {
        super.imprimirDados();
        System.out.println("Tipo de Comida: " + tipocomida);
        System.out.println("Preco medio do Prato: R$" + precoMedioPrato);
    }
}
