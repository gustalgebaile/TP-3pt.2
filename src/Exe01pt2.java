import java.util.LinkedList;
import java.util.List;

class CartaoWEB {
    private String email;
    private String nome;

    public CartaoWEB(String email, String nome) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            this.email = "email invalido";
        }
        this.nome = nome;
    }

    private boolean isValidEmail(String email) {
        return email.contains("@");
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
}

interface MensagemCartao {
    String showMessage();
}

class DiaDosNamorados extends CartaoWEB implements MensagemCartao {
    public DiaDosNamorados(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "Mensagem para: " + getEmail() + "\nParabéns, " + getNome() + " pelo Dia dos Namorados.\n=====================================";
    }
}

class Natal extends CartaoWEB implements MensagemCartao {
    public Natal(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "Mensagem para: " + getEmail() + "\nParabéns, " + getNome() + " pelo Natal.\n=====================================";
    }
}

class Aniversario extends CartaoWEB implements MensagemCartao {
    public Aniversario(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "Mensagem para: " + getEmail() + "\nParabéns, " + getNome() + " pelo Aniversário.\n=====================================";
    }
}

class Pascoa extends CartaoWEB implements MensagemCartao {
    public Pascoa(String email, String nome) {
        super(email, nome);
    }

    @Override
    public String showMessage() {
        return "Mensagem para: " + getEmail() + "\nParabéns, " + getNome() + " pela Páscoa.\n=====================================";
    }
}

public class Main {
    public static void main(String[] args) {
        List<MensagemCartao> cartoes = new LinkedList<>();

        cartoes.add(new DiaDosNamorados("email1@exemplo.com", "José"));
        cartoes.add(new Natal("email2@exemplo.com", "Maria"));
        cartoes.add(new Aniversario("email3@exemplo.com", "João"));
        cartoes.add(new Pascoa("email4@exemplo.com", "Alfredo"));
        cartoes.add(new Aniversario("email5@exemplo.com", "Gilberto"));

        cartoes.forEach(cartao -> {
            String mensagem = cartao.showMessage();
            System.out.println(mensagem);
        });
    }
}
