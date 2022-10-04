package aula011;
public class Bolsista extends Aluno {
    private float bolsa;
    private String getNome;
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() +  " é bolsista! Pagamento facilitado!"); 
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public String getGetNome() {
        return getNome;
    }

    public void setGetNome(String getNome) {
        this.getNome = getNome;
    }
    
}
