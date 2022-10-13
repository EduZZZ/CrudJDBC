package br.com.loja_informatica.DAO;

import br.com.loja_informatica.Computador;
import br.com.loja_informatica.factory.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ComputadorDAO {

    public void save(Computador computador) {
        String sql = "";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = Conexao.connectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, computador.getHd());
            pstm.setString(2, computador.getProcessador());
            pstm.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
