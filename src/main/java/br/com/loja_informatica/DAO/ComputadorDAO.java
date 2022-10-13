package br.com.loja_informatica.DAO;

import br.com.loja_informatica.Computador;
import br.com.loja_informatica.factory.Conexao;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ComputadorDAO {

    //create
    public void save(Computador computador) {
        String sql = "Insert into Computador (hd, processador) VALUES (?, ?)";
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

    //read
    public List<Computador> getComputador() {

        String sql = "SELECT * FROM computador";

        List<Computador> computadors = new ArrayList<Computador>();

        Connection conn = null;
        PreparedStatement pstm = null;

        ResultSet rset = null;

        try {
            conn = Conexao.connectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Computador computador = new Computador();

                computador.setId(rset.getInt("id"));
                computador.setHd("HD");
                computador.setProcessador("Processador");

                computadors.add(computador);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
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
        return computadors;
    }

    //update
    public void update(Computador computador) {

        String sql = "UPDATE computador SET processador = ?,  HD = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = Conexao.connectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setString(1, computador.getHd());
            pstm.setString(2, computador.getProcessador());
            pstm.setInt(3, computador.getId());

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

    public void deleteById(int id) {

        String sql = "Delete from computador where id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = Conexao.connectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);

            pstm.setInt(1, id);
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
