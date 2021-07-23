
package prova.lp2;

import java.util.Scanner;

/**
 *
 * @author Gregory
 */
public class ConsultaAgendada {
    private Data data;
	private Hora hora;
	private String nomePaciente;
	private static int quantidade;
	private String nomeMedico;

	public ConsultaAgendada() {
		Scanner scan = new Scanner(System.in);
		this.data = new Data();
		this.hora = new Hora();

		System.out.println("Digite o nome do paciente");
		this.nomePaciente = scan.nextLine();

		System.out.println("Digite o nome do médico");
		this.nomeMedico = scan.nextLine();
		// scan.close();

		quantidade++;
	}

	public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String me) {
		this.hora = new Hora(h, mi, s);
		this.data = new Data(d, m, a);
		this.nomePaciente = p;
		this.nomeMedico = me;

		quantidade++;
	}

	public ConsultaAgendada(Data d, Hora h, String p, String m) {
		this.data = d;
		this.hora = h;
		this.nomePaciente = p;
		this.nomeMedico = m;

		quantidade++;
	}

	public void setData(int a, int b, int c) {
		this.data = new Data(a, b, c);
	}

	public void setData() {
		this.data = new Data();
	}

	public void setHora(int a, int b, int c) {
		this.hora = new Hora(a, b, c);
	}

	public void setHora() {
		this.hora = new Hora();
	}

	public void setNomePaciente(String p) {
		this.nomePaciente = p;
	}

	public void setNomePaciente() {
		Scanner scan = new Scanner(System.in);
		this.nomePaciente = scan.nextLine();
		// scan.close();
	}

	public void setNomeMedico(String m) {
		this.nomeMedico = m;
	}

	public void setNomeMedico() {
		Scanner scan = new Scanner(System.in);
		this.nomeMedico = scan.nextLine();
		// scan.close();
	}

	public String getData() {
		return this.data.mostra1();
	}

	public String getHora() {
		return this.hora.getHora1();
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public static int getQuantidade() {
		return quantidade;
	}
}
