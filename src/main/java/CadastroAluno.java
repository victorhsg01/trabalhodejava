public class CadastroAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("");
        aluno1.setIdade(0);
        aluno1.setCurso("");
        aluno1.setCpf("12345678912");

        Aluno aluno2 = new Aluno("Victor", 25, "Desenvolvimento de Sistemas","513.019.150-17");
        Aluno aluno3 = new Aluno("Pimentel", 19, "Desenvolvimento de Sistemas","570.290.740-09");
        Aluno aluno4 = new Aluno("Maria", 23, "Desenvolvimento de Sistemas","011.382.320-76");
        Aluno aluno5 = new Aluno("Enzo", 21, "Desenvolvimento de Sistemas", "150.207.330-75");
             
        System.out.println("Aluno 1 com contrutor vazio e setters");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println("Cpf: " + aluno1.getCpf());
        System.out.println();

        System.out.println("Aluno 2 com contrutor com parametros");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Curso: " + aluno2.getCurso());
        System.out.println("Cpf: " + aluno2.getCpf());
        System.out.println();

        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Idade: " + aluno3.getIdade());
        System.out.println("Curso " + aluno3.getCurso());
        System.out.println("Cpf: " + aluno3.getCpf());
        System.out.println();

        System.out.println("Nome: " + aluno4.getNome());
        System.out.println("Idade: " + aluno4.getIdade());
        System.out.println("Curso " + aluno4.getCurso());
        System.out.println("Cpf: " + aluno4.getCpf());
        System.out.println();

        System.out.println("Nome: " + aluno5.getNome());
        System.out.println("Idade: " + aluno5.getIdade());
        System.out.println("Curso " + aluno5.getCurso());
        System.out.println("Cpf: " + aluno5.getCpf());

    }
}
