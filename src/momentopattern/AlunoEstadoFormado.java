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
public class AlunoEstadoFormado implements AlunoEstado{

    @Override
    public String getNome() {
        return "Formado";
    }

    @Override
    public String matricular() {
        return "Matricula não pode ser realizada";
    }
       
}
