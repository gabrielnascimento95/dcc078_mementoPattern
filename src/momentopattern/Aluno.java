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
public class Aluno {
    private String nome;
    private AlunoEstado estado;

    public Aluno() {
        this.estado = new AlunoEstadoAtivo();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AlunoEstado getEstado() {
        return estado;
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }
    
    public AlunoMomento saveToMomento(){
        return new AlunoMomento(estado);
    }
    
    public void restoreFromMomento(AlunoMomento momento){
        estado = momento.getEstado();
    }
    
}
