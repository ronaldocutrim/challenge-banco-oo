import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Conta> contasList = new ArrayList<Conta>();
		Banco banco = new Banco();

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		contasList.add(cc);
		contasList.add(poupanca);
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		banco.setContas(contasList);

		banco.imprimirContas();
	}

}
