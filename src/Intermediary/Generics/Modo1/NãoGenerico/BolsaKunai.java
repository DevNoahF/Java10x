package Intermediary.Generics.Modo1.NãoGenerico;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai {
    private List<Kunai> kunais;

    public BolsaKunai() {
        kunais = new ArrayList<>();
    }

    public List<Kunai> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai> kunais) {

    }

    public void addKunai(Kunai kunai){
        kunais.add(kunai);
    }

    @Override
    public String toString() {
        return "Bolsa de Kuanis: " + kunais.toString();
    }
}
