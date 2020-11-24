public class Candidato extends Pessoa implements Candidatura{  
    private int eleitoresVotantes=0;
    private int deputado;
    private int presidente;
    private int governador;

   public Candidato(String nome,String titulo, String cpf){
        super(nome,titulo,cpf);
   }
        
   public void setVoto(){
       totalVotos=+1;
   }
   public void getVoto(){
       return totalVotos;
   }
   
    @Override
    public void setPresidente(int numeroCandidato){
        this.presidente= numeroCandidato;
   }
    @Override
    public void setGovernador(int numeroCandidato){
        this.governador= numeroCandidato;
   }
    @Override
    public void setDeputado(int numeroCandidato){
        this.deputado= numeroCandidato;
   }
    @Override
    public int getPresidente(){
        return this.presidente;
   }
    @Override
    public int getGovernador(){
    return this.governador; 
   }
    @Override
    public int getDeputado(){
        return this.deputado;
   }

}
