/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.exercicioTarefas.entidades;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;


/**
 *
 * @author mario
 */
@Entity
public class Tarefa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 1000)
    private String descricao;
    
    // Status pode ser:
    // 0 - Não iniciado
    // 1 - Em andamento
    // 2 - Concluido
    private int status = 0;

    @Column(nullable = false)
    private Date dataInicioPrevisto;

    @Column(nullable = false)
    private Date dataTerminoPrevisto;

    // Configurada quando o status passar de 0 para 1.
    private Date dataInicioReal;

    // Configurada quando o status passar de 1 para 2 (Conclusão da tarefa)
    private Date dataTerminoReal;

    // Nota pode ser valor de 1 a 5
    private int nota;

    @Column(nullable = false)
    private Date dataUltimaAlteracao;

    public Date getDataInicioPrevisto() {
        return dataInicioPrevisto;
    }

    public void setDataInicioPrevisto(Date dataInicioPrevisto) {
        this.dataInicioPrevisto = dataInicioPrevisto;
    }

    public Date getDataTerminoPrevisto() {
        return dataTerminoPrevisto;
    }

    public void setDataTerminoPrevisto(Date dataTerminoPrevisto) {
        this.dataTerminoPrevisto = dataTerminoPrevisto;
    }

    public Date getDataInicioReal() {
        return dataInicioReal;
    }

    public void setDataInicioReal(Date dataInicioReal) {
        this.dataInicioReal = dataInicioReal;
    }

    public Date getDataTerminoReal() {
        return dataTerminoReal;
    }

    public void setDataTerminoReal(Date dataTerminoReal) {
        this.dataTerminoReal = dataTerminoReal;
    }

    public Date getDataUltimaAlteracao() {
        return dataUltimaAlteracao;
    }

    public void setDataUltimaAlteracao(Date dataUltimaAlteracao) {
        this.dataUltimaAlteracao = dataUltimaAlteracao;
    }

    @ManyToOne (fetch = FetchType.LAZY)// REMOVER O @Transient e USAR A ANOTAÇÃO DE ASSOCIAÇÃO COM A CLASSE Pessoa
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }


    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
}
