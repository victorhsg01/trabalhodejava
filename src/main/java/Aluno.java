public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private String cpf;

    public Aluno() {
        this.nome = "";
        this.idade = 0;
        this.curso = "";
    }
    
    public Aluno(String nome, int idade, String curso, String cpf) {
        this.nome = nome;
        setIdade(idade);
        this.curso = curso;
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }
    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade não pode ser negativa");
            return;
        }
        else if (idade > 150) {
            System.out.println("Idade não pode ser maior que 150");
            return;
        }
            this.idade = idade;        
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setCpf(String cpf) {
        Cpf cpfutil = new Cpf();
        if(cpfutil.validarCpf(cpf)) {
            this.cpf = cpf;

        }
        else {
            System.out.println("Cpf invalido");

        }
    }
    
}
