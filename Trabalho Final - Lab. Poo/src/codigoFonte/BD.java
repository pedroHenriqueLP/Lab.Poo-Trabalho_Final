package codigoFonte;

import java.util.*;
import java.time.LocalDate;

public class BD {

    private static List<Conta> contas = new LinkedList<>();
    
    private static int nConta = 1;

    public static void cadastra(Conta u) {
        u.setnConta(nConta++);
        u.setData(LocalDate.now());
        contas.add(u);
    }

    public static void deleta(Conta c) {
        contas.remove(c);
    }

    public static List<Conta> contas() {
        return contas;
    }

    public static void transfere() {
        contas.sort((c1, c2) -> Double.compare(c2.getSaldo(), c1.getSaldo()));
    }

    public static Conta procura(int nConta) {
        for (Conta c : contas) {
            if (c.getnConta() == nConta) {
                return c;
            }
        }return null;
    }

    public static Conta procura(String Cpf) {
        for (Conta c : contas) {
            if (c.getCpf().equals(Cpf)) {
                return c;
            }
        }return null;
    }

    public static void add(Conta conta) {
        throw new UnsupportedOperationException("Adicionado");
    }
}
