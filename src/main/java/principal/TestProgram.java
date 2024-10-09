
package principal;


import model.Empresa;
import model.Restaurante;

public class TestProgram {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.solicitarDados();
        empresa.imprimirDados();
        
        Restaurante restaurante = new Restaurante();
        restaurante.solicitarDados();
        restaurante.imprimirDados();
    }
}