package aep2bimestre2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
	
public class App {
	public static void main(String[] args) {
		Connection conexão = DriverManager.getConnection("jdbc:postgresql://localhost:5432/3esoft2019", "postgres",
				"unicesumar");
		Calendar calendario = Calendar.getInstance();

		calendario.set(Calendar.DAY_OF_MONTH, 07);
		calendario.set(Calendar.MONTH, 6);
		calendario.set(Calendar.YEAR, 2019);
		Date data = calendario.getTime();

		BilheteAereo bilhete1 = new BilheteAereo(1, 1, "Maringá", "São Paulo", data);

		System.out.println("Voo: " + bilhete1.getVoo() + "Destino: " + bilhete1.getDestino() + "Origem: "
				+ bilhete1.getOrigem() + "Data: " + bilhete1.getData());

		}
}