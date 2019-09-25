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
public class AlunoEstadoTrancado implements AlunoEstado{

    @Override
    public String getNome() {
        return "Trancado";
    }

    @Override
    public String matricular() {
        return "Matricula não pode ser realizada";
    }
    
}
