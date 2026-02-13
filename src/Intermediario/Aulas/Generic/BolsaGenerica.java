package Intermediario.Aulas.Generic;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {

    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    //Colocar equipamentos:

    public void adicionarEquipamentos(T equipamento) {
        equipamentos.add(equipamento);
    }

    public String toString() {
        return "bolsa de equipamentos : " + equipamentos.toString();
    }

}
