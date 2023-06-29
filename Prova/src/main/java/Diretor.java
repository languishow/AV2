
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca implements Contratacao{
 private final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento, logradouro, numero, complemento, cep, cidade, uf);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    
    @Override
    public double getSalarioFinal() {
      return 0;
        
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo o funcionario" + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
         System.out.println("Demitindo o funcionario" + funcionario);
    }

    @Override
    public String toString() {
        return super.toString()+
        "\n PREMIO:" + (PREMIO * 100) + '}';
      
    }
    
}
    

 

  
