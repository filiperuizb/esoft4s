package ex8;

public class ValidacaoUtil {

    private ValidacaoUtil() {

    }

    public static boolean isEmailValido(String email) {
        return email.contains("@");
    }
}
