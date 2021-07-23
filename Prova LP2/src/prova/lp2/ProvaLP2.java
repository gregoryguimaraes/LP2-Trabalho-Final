package prova.lp2;

import java.util.Scanner;

/**
 *
 * @author Gregory
 */
public class ProvaLP2 {

 
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
		int h, mi, s, d, m, a;
		String p, me;

	
		System.out.println("Digite a hora");
		h = scan.nextInt();

		System.out.println("Digite o minuto");
		mi = scan.nextInt();

		System.out.println("Digite o segundo");
		s = scan.nextInt();

		System.out.println("Digite o dia");
		d = scan.nextInt();

		System.out.println("Digite o mês");
		m = scan.nextInt();

		System.out.println("Digite o ano");
		a = scan.nextInt();
		scan.nextLine();

		System.out.println("Digite o nome do paciente");
		p = scan.nextLine();

		System.out.println("Digite o nome do medico");
		me = scan.nextLine();

		ConsultaAgendada p1 = new ConsultaAgendada(h, mi, s, d, m, a, p, me);

		String nomePaciente1 = p1.getNomePaciente();
		String nomeMedico1 = p1.getNomeMedico();
		String data1 = p1.getData();
		String hora1 = p1.getHora();

		System.out.println(" ");
		System.out.println("Valores de p1\n");

		System.out.println("paciente p1: " + nomePaciente1);
		System.out.println("medico p1: " + nomeMedico1);
		System.out.println("data p1: " + data1);
		System.out.println("hora p1: " + hora1);

		System.out.println(" ");

		ConsultaAgendada p2 = new ConsultaAgendada();

		String nomePaciente2 = p2.getNomePaciente();
		String nomeMedico2 = p2.getNomeMedico();
		String data2 = p2.getData();
		String hora2 = p2.getHora();

		System.out.println(" ");
		System.out.println("Valores de p2\n");

		System.out.println("paciente p2: " + nomePaciente2);
		System.out.println("medico p2: " + nomeMedico2);
		System.out.println("data p2: " + data2);
		System.out.println("hora p2: " + hora2);

		System.out.println(" ");
		System.out.println("Alterando p1");

		p1.setData();
		p1.setHora();

		System.out.println("Digite novo nome do paciente");
		p1.setNomePaciente();

		System.out.println("Digite o novo nome do medico");
		p1.setNomeMedico();

		System.out.println(" ");
		System.out.println("Valores de p1 alterados");

		System.out.println("paciente p1: " + nomePaciente1);
		System.out.println("medico p1: " + nomeMedico1);
		System.out.println("data p1: " + data1);
		System.out.println("hora p1: " + hora1);

		System.out.println(" ");

		int quantidade = ConsultaAgendada.getQuantidade();
		System.out.println("quantidade: " + quantidade);

    }
    
}
