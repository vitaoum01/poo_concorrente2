public class Processo extends Thread{
   private String nome;
   private int numeroInteracoes;
   public String getNome() {
       return nome;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public int getNumeroInteracoes() {
       return numeroInteracoes;
   }
   public void setNumeroInteracoes(int numeroInteracoes) {
       this.numeroInteracoes = numeroInteracoes;
   }
 public Processo(){

 }
public Processo(String nome, int numeroInteracoes){
    this.nome=nome;
    this.numeroInteracoes=numeroInteracoes;
}

public void run(){

   for (int i = 0; i < numeroInteracoes; i++) {
        System.out.println("Processo: "+nome+ ": "+i);
   }
}
}
//método run, no corpo dele estrutrura de repeticao
//10 interacoes
//nome e as interacoes