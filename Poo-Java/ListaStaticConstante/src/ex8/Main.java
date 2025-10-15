package ex8;

public class Main {
    public static void main(String[] args) {

       Usuario arantes = new Usuario("arantes.gabriel",
               "arantesteste", "123");

       arantes.setEmail("teste@gmail.com");
        System.out.println(arantes.getEmail());
       arantes.setEmail("oi");
        System.out.println(arantes.getEmail());


    }
}
