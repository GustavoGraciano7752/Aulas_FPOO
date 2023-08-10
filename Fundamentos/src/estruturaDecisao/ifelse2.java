package estruturaDecisao;

public class ifelse2 {
    public static void main(String[] args) {
        int temperatura = 15;
        
        if (temperatura == 15) {
            System.out.println("Esta frio");
        } else if (temperatura == 20) {
            System.out.println("Esta agradavel");
        } else if (temperatura == 30) {
            System.out.println("Esta calor");
        }
        
        switch (temperatura) {
            case 15:
                System.out.println("Esta frio");
                break;
            case 20:
                System.out.println("Esta agradavel");
                break;
            case 30:
                System.out.println("Esta frio");
                break;
            default:
                System.out.println("Dado nao reconhecido");
                break;
        }
    }
}
