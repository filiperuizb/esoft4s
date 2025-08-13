package utils;

public class Formatacoes {
    public String maskCpf(String cpf) {
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    }

    public String maskRa(String ra) {
        return ra.substring(0, 8) + "-" + ra.charAt(8);// 240420692 (Tenho que formatar um - antes do 2
    }
}
