package java.sql;

import java.util.Calendar;
import java.util.Date;

public class App {
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/bilheteAereo",
					"postgres",
					"unicesumar");
			
			criarTabelaBilheteAereo(conn);
			
			excluirTodas(conn);
			

		

			
			System.out.println("Conectado!");
			conn.close();
			System.out.println("Fechado.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Fim.");
	}
	}
}
