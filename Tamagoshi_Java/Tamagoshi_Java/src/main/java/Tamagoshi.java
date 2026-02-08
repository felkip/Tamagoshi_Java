public class Tamagoshi {
     private String nome;
     private int fome;
     private int saude;
     private int idade;

     public Tamagoshi(String nome, int idade,int fome,int saude) {
          this.nome = nome;
          this.idade = idade;
          this.fome = fome;
          this.saude = saude;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public void setIdade(int idade){
          this.idade = idade;
     }

     public void setFome(int fome){
          this.fome = fome;
     }

     public void setSaude(int saude){
          this.saude = saude;
     }

     public String getNome(){
          return this.nome;
     }

     public int getIdade(){
          return this.idade;
     }

     public int getFome(){
          return this.fome;
     }

     public int getSaude(){
          return this.saude;
     }

     public void Imprimir(){
          System.out.println("Aqui está as informações do seu tamagoshi = "+ "Nome : "+ this.nome + ", Idade : " + this.idade + ", Fome atual : " + this.fome +", Saúde : "+ this.saude );
     }

}
