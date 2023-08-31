package orientacaoobjetos;
//Ctrl + X Apaga linha
public class Cliente implements AluguelFilme, CadastroCliente{
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        if (this.email == null) {
        return "Cliente{" + "nome=" + nome + '}';
        } else {
            return "Cliente{" + "nome=" + nome + ", email=" + email + '}';
        }
    }

    /**
     * Calcula o valor da locação do filme
     * Regra para filmes comuns.
     * @param qtdeDias
     * @return 
     */
    public double calcularLocacao(int qtdeDias) {
        return qtdeDias * VALOR_FILMES_SIMPLES;
    }
    
    /**
     * Calcula o valor da locação do filme
     * Regra para filmes novos.
     * @param qtdeDias
     * @param lancamento
     * @return 
     */
    
    public double calcularLocao(int qtdeDias, boolean lancamento) {
        return qtdeDias * VALOR_FILMES_LANCAMENTO;
    }
    
    // Codigos do contrato do CadastroCliente

    @Override
    public boolean validarNome(String nome) {
        if (nome.length() < 10) {
            System.out.println("Nome " + nome + "do cliente é valido");
            return true;
        } else {
             System.out.println("Nome " + nome + "do cliente é invalido");
            return false;
        }
    }

    @Override
    public boolean vefificarEmailDominioGoogle(String email) {
        if (email == null) {
            return false;
        }
        if (email.contains("@gmail.com")) {
        System.out.println("O email " + email + " é do google");
            return true;
        } else 
            System.out.println("O email " + email + " não é do google");
            return true;
        }
    }

