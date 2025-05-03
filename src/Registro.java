
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
//TODO: Crie o registro como um Java record. Todo registro tem um numero, local e data
public record Registro () {
    
    //TODO: Crie um construtor para o Registro que trate as situacoes de excecao
    
    @Override
    public String toString() {
        return "Registro{" + "numero=" + numero + ", local=" + local + ", data=" + data + '}';
    }
    
      @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Registro other = (Registro) obj;
        return this.numero == other.numero;
    }
    
};
