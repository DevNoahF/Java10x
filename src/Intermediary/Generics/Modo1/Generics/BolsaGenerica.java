package Intermediary.Generics.Modo1.Generics;

import java.util.ArrayList;
import java.util.List;

// Adicionar um T é uma boa pratica
// T = TYPE
public class BolsaGenerica <T> { // '<>' faz com que voce faça uma classe se tornar generica
    private List<T> equipamentos; // faz com que a lista seja uma lista generica

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();

    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    // colocar equipamentos genericos
    public void addEquipamentos(T equipamento) {
        equipamentos.add(equipamento);
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
