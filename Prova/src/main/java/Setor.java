/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public enum Setor {
   ENGENHARIA ("Engenharia"),
   SAUDE ("Saude"),
   JURIDICO ("Juridico"),
   RECURSOS_HUMANOS ("Recursos_Humanos"),
   MARKETING ("Marketing"),
   OPERACOES ("Operacoes");
   
   private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

   
    }
     

