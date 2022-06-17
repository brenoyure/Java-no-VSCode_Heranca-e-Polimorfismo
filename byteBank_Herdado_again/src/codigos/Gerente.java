package codigos;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    // Método (SobreEscrito) para devolver a Bonificação do Gerente
    double getBonificacao() {
        /*
         * Utilizamos o super.getBonificacao() para evitar
         * repetição de código, caso a bonificação padrão mude.
         */
        System.out.println("Método Bonificação do Gerente");
        return super.getSalario();

    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;

    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Usuário autenticado com sucesso.");
            return true;
        } else {
            System.out.println("Falha na autenticação.");
            return false;
        }

    }

}