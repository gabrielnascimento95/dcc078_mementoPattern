/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momentopattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author gabri
 */
public class MementoPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<AlunoMomento> estadosSalvos = new ArrayList();
        
        Aluno aluno = new Aluno();
        aluno.setNome("Marco");
        aluno.setEstado(new AlunoEstadoTrancado());
        estadosSalvos.add(aluno.saveToMomento());
        aluno.setEstado(new AlunoEstadoAtivo());
        estadosSalvos.add(aluno.saveToMomento());
        aluno.setEstado(new AlunoEstadoFormado());
        estadosSalvos.add(aluno.saveToMomento());
        
        for(Iterator i = estadosSalvos.iterator(); i.hasNext();)
            System.out.println(i.next());
        aluno.restoreFromMomento(estadosSalvos.get(1));
        System.out.println("\n" + aluno.getEstado().getNome());
    }
    
}
