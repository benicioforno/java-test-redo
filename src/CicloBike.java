
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
//TODO: defina CicloBike como uma especializacao de Veiculo
public class CicloBike {
    
    private String cor;

    //TODO: escreva o construtor de CicloBike
   

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        if (cor == null || cor.isEmpty()) throw new IllegalArgumentException("Cor nao pode ser nulo ou vazio");
        this.cor = cor;
    }

    @Override
    //TODO: sobrescreva o metodo mover

    @Override
    public String toString() {
        return super.toString() + "CicloBike{" + "cor=" + cor + '}';
    }
    
}
