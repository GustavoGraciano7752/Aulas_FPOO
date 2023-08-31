
package orientacaoobjetos.atividades;

public class Post implements ClassificacaoPost{
    
    private String descricao;
    private String nome;
    private ClassificacaoPost estrelas;
    private EnumTipoPost tipoPost;

    public Post(String descricao, String nome, EnumTipoPost tipoPost) {
        this.descricao = descricao;
        this.nome = nome;
        this.tipoPost = tipoPost;
    }

    @Override
    public String toString() {
        return "Post{" + "descricao=" + descricao + ", nome=" + nome + ", estrelas=" + estrelas + ", tipoPost=" + tipoPost + '}';
    }
    
    public int classificarPost(int estrelas){
        switch (estrelas) {
            case 1:
                System.out.println("Seu post é comum");
                break;
            case 2:
                System.out.println("Seu post é legal");             
                break;
            case 3:
                System.out.println("Seu post é super legal");
                break;
            default:
                break;
        }
        return estrelas;
    }
    
}
