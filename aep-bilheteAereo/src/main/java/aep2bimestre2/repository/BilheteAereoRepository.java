package aep2bimestre2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;
	
public interface bilheteAereoRepository {
	public static void excluirVoo(Connection conex�o,Integer Id) {
		String sql = "delete from bilheteAereo where id=?";
		PreparedStatement statement = conex�o.prepareStatement(sql);
		statement.setInt(1, Id);
		Statement statement = conex�o.createStatement();
		statement.execute(sql);
		statement.close();
		System.out.println(Id+" Foi excluido!");
	}

	public static void inserirVoo(Connection conex�o, Integer voo, Integer id, String origem, String destino, Date data){
		String sql = "insert into bilheteAereo (id, voo, origem, destino, data) values (?,?,?,?)";
		PreparedStatement statement = conex�o.prepareStatement(sql);
		statement.setInt(1, id);
		statement.setInt(2, voo);
		statement.setString(3, origem);
		statement.setString(4, destino);
		statement.setDate(5, new java.sql.Date(data.getTime()));
		statement.execute();
		statement.close();
		System.out.println("Voo " + id + " Inserido com sucesso!");
	}

}