package codigos;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Usuário " + super.getNome() + " autenticado com sucesso.");
            return true;
        } else {
            System.out.println("Falha na autenticação.");
            return false;
        }

    }

}