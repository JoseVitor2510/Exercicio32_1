package model;

import java.util.Scanner;

public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;

    public Empresa() {
        
        this("", "", "", "", "", ""); 
       
    }
    
    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void solicitarDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();
        System.out.print("Endereco: ");
        this.endereco = scanner.nextLine();
        System.out.print("Cidade: ");
        this.cidade = scanner.nextLine();
        System.out.print("Estado: ");
        this.estado = scanner.nextLine();
        System.out.print("CEP: ");
        this.cep = scanner.nextLine();
        System.out.print("Telefone: ");
        this.telefone = scanner.nextLine();
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
        System.out.println("Telefone: " + telefone);
    }
}
