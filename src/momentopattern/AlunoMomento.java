/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momentopattern;

/**
 *
 * @author gabri
 */
public class AlunoMomento {
    private AlunoEstado estado;

    public AlunoMomento(AlunoEstado estado) {
        this.estado = estado;
    }

    public AlunoEstado getEstado() {
        return estado;
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return estado.getNome();
    }
    
    
}
