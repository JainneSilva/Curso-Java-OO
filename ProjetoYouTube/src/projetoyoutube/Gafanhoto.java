package projetoyoutube;
public class Gafanhoto extends Pessoa {
    private string login;
    private int totAssistido;

    public Gafanhoto(string login, int totAssistido, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    Gafanhoto(String jubileu, int i, String m, String juba) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    public string getLogin() {
        return login;
    }

    public void setLogin(string login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    
}
