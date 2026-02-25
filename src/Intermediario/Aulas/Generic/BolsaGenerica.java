package Intermediario.Aulas.Generic;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> ferramentas;

    public BolsaGenerica() {
        this.ferramentas = new ArrayList<>();
    }

    public List<T> getFerramentas() {
        return ferramentas;
    }

    public void setFerramentas(List<T> ferramentas) {
        this.ferramentas = ferramentas;
    }

    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    public void mostrarFerramentas() {
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
    public String toString() {
        return "bolsa de equipamentos : " + ferramentas.toString();
    }

}
