package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        // Programa Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
      p1.setNome("Pedro");
      p2.setNome("Maria");
      p3.setNome("Cláudio");
      p4.setNome("Fabiana");
      
      p3.setSexo("M");
      p4.setSexo("F");
      p2.setIdade(18);
      p3.setIdade(50);
      p4.setIdade(30);
      p2.setSexo("F");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
               
    }
    
}
