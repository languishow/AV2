
import java.time.LocalDate;
import java.time.Month;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
     Engenheiro engenheiro = new Engenheiro("567","gabriel", "896543467-08", "345678",  Endereco, Setor.ENGENHARIA, Genero.MASCULINO, 1500.00, EstadoCivil.CASADO, LocalDate.of(2003, Month.APRIL, 25), rua da beira mar, 10, casa, 40430570, Salvador, UnidadeFederativa.BAHIA),
     Motoboy motoboy = new Motoboy("2345", "diego", "5465567-78", "34567",  Endereco, Setor.OPERACOES, Genero.MASCULINO, 2000,00, EstadoCivil.CASADO, LocalDate.of(2003, Month.MARCH, 15), rua do fogo, 10, apartamento, 40420550, Rio_De_Janeiro, UnidadeFederativa.RIO_DE_JANEIRO)
     Gerente gerente = new Gerente(bonificacao, "angela", "45667789-56","45576565", engenheiro, Setor.MARKETING, Genero.FEMININO, 0, EstadoCivil.CASADO, LocalDate.of(2003, Month.MARCH, 15), rua resende costa, 5, ap102,  Salvador, UnidadeFederativa.BAHIA)
     Diretor diretor = new Diretor(bonificacao, "natalia", "06745678-66", "576567565", engenheiro, Setor.JURIDICO, Genero.FEMININO, 0, EstadoCivil.CASADO, LocalDate.of(2005, Month.MARCH, 17), rua do beco, 5, casa, 40420570, Sao_Paulo, UnidadeFederativa.SAO_PAULO)
       
     Engenheiro.admitir(motoboy);
     Diretor.admitir(engenheiro);    
       }
 
}
