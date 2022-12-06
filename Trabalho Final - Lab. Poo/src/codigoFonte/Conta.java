package codigoFonte;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Conta {

    private int nConta;
    private double saldo;
    private String usuario;
    private String cpf;
    private String senha;
    private LocalDate data;

    
    public boolean saca(double saque) {
        if (saque > this.saldo) {
            JOptionPane.showMessageDialog(null, "O valor do Saque não pode ser maior que seu saldo!");
            return false;
        }this.saldo -= saque;
        return true;
    }

    public boolean deposito(double deposito) {
        if (deposito < 0) {
            JOptionPane.showMessageDialog(null, "O valor do depósito não pode ser menor que R$0!");
            return false;
        }this.saldo += deposito;
        return true;
    }

    public void transfere(Conta c, double deposito) {
        this.saca(deposito);
        c.deposito(deposito);
    }

    @Override
    public String toString() {
        return"\n===================\nNome do Usuário: " +this.getUsuario()+ "\nNº Da Conta:" +this.getnConta()+ "\nCPF:" +this.getCpf()+ "\nSaldo: R$" +this.getSaldo()+ "\nData do Cadastro: " +this.getData()+ "\n===================\n";
    }
    
    public Conta(String usuario, String cpf, String senha) {
        this.usuario = usuario;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return this.senha;
    }

    protected void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
