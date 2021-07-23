package prova.lp2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gregory
 */
public class Data {
    private int dia;
  private int mes;
  private int ano;

  public Data() {
    Scanner scan = new Scanner(System.in);
    boolean dValido = false, mValido = false, aValido = false;
    String gotD, gotM, gotA;
    int d = 0, m = 0, a = 0;

    int[] maxDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };



    /* VALOR ANO*/
    do {
      System.out.println("Digite o ano: ");
      gotA = scan.nextLine();
      try {
        a = Integer.parseInt(gotA);

        if (bissexto(a))
          maxDias[1] = 29;
        aValido = true;
      } catch (NumberFormatException ex) {
        System.out.println("Valor inválido, tente novamente: ");
      }
    } while (!aValido);

    /* VALOR MES */
    do {
      System.out.println("Digite o mês");
      gotM = scan.nextLine();
      try {
        m = Integer.parseInt(gotM);

        if (m >= 1 && m <= 12)
          mValido = true;
        else
          System.out.println("Valor inválido, tente novamente: ");
      } catch (NumberFormatException ex) {
        System.out.println("Valor inválido, tente novamente: ");
      }
    } while (!mValido);

    /* VALOR DIA */
    do {
      System.out.println("Digite o dia: ");
      gotD = scan.nextLine();
      try {
        d = Integer.parseInt(gotD);

        if (d > 0 && d <= maxDias[m - 1])
          dValido = true;
        else
          System.out.println("Valor inválido, tente novamente: ");
      } catch (NumberFormatException ex) {
        System.out.println("Valor inválido, tente novamente: ");
      }
    } while (!dValido);


    dia = d;
    mes = m;
    ano = a;


  }

  public Data(int d, int m, int a) {
    dia = d;
    mes = m;
    ano = a;
  }

  public void setDia(int d) {
    dia = d;
  }

  public void setMes(int m) {
    mes = m;
  }

  public void setAno(int a) {
    ano = a;
  }

  public void setDia() {
    Scanner scan = new Scanner(System.in);
    String gotD;
    boolean dValido = false;
    int d;
    int[] maxDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    /* VALOR DIA */
    do {
      System.out.println("Digite o dia: ");
      gotD = scan.nextLine();
      try {
        d = Integer.parseInt(gotD);

        if (bissexto())
          maxDias[1] = 29;

        if (d > 0 && d <= maxDias[mes - 1])
          dValido = true;
        else
          System.out.println("Valor inválido, tente novamente: ");
      } catch (NumberFormatException ex) {
        System.out.println("Valor inválido, tente novamente: ");
      }
    } while (!dValido);

  }

  public void setMes() {
    Scanner scan = new Scanner(System.in);
    String gotM;
    int m;
    boolean mValido = false;
    /* VALOR MES */
    do {
      System.out.println("Digite o mês");
      gotM = scan.nextLine();
      try {
        m = Integer.parseInt(gotM);

        if (m >= 1 && m <= 12)
          mValido = true;
        else
          System.out.println("Valor inválido, tente novamente: ");
      } catch (NumberFormatException ex) {
        System.out.println("Valor inválido, tente novamente: ");
      }
    } while (!mValido);
  }

  public void setAno() {
    Scanner scan = new Scanner(System.in);
    String gotA;
    int a;
    boolean aValido = false;

    int[] maxDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    do {
      System.out.println("Digite o ano: ");
      gotA = scan.nextLine();
      try {
        a = Integer.parseInt(gotA);

        if (bissexto(a))
          maxDias[1] = 29;
        if (dia <= maxDias[mes - 1])
          aValido = true;
        else {
          System.out.println("Valor inválido, tente novamente: ");
        }
      } catch (NumberFormatException ex) {
        System.out.println("Valor inválido, tente novamente: ");
      }
    } while (!aValido);
    
  }

  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAno() {
    return ano;
  }

  public String mostra1() {
    return dia + "/" + mes + "/" + ano;
  }

  public String mostra3() {
    String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro" };

    return dia + "/" + meses[mes - 1] + "/" + ano;
  }

  public boolean bissexto(int a) {
    if (a % 400 == 0 || (a % 100 != 0 && a % 4 == 0))
      return true;
    return false;
  }

  public boolean bissexto() {
    if (ano % 400 == 0 || (ano % 100 != 0 && ano % 4 == 0))
      return true;
    return false;
  }

  public int diasTranscorridos() {
    int[] maxDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int diasTranscorridos = 0;
    if (bissexto())
      maxDias[1] = 29;

    for (int i = 0; i < (mes - 1); i++) {
      diasTranscorridos += maxDias[i];
    }

    diasTranscorridos += dia;

    return diasTranscorridos;
  }

  public void apresentaDataAtual() {
    Date data = new Date();
    String dataApresentavel = DateFormat.getDateInstance(DateFormat.FULL).format(data);

    System.out.println(dataApresentavel);
  }
}
