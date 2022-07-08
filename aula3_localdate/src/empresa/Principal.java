package empresa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {
//		LocalDate captura a data de hoje.
		LocalDate dataHoje = LocalDate.now();
		System.out.println(dataHoje);
		
//		DateTimeFormatter formata a data para o padrão especificado.
//		dd = dia do mês.
//		MM = mês.
//		yyyyy = ano.
//		HH = horas, até 23.
//		hh = horas, até 12.		
//		mm = minutos.
//		ss = segundos
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE");
		System.out.println(dataHoje.format(formatador));
	}

}
