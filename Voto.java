import java.util.ArrayList;

public class Voto{
    
    private ArrayList<Candidato> candidatos= new ArrayList();
    
    public void addCandidato(Candidato a){
        candidatos.add(a);
    }
    
    public ArrayList<Candidato> canditatos(){
        return this.candidatos;
    }
    
    public void votar(){
        for(int i=0; i< candidatos.size(); i++){
            Candidato a= candidatos.get(i);
            a.setVoto();
        }
    }
}
