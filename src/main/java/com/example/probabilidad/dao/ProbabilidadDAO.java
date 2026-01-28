package com.example.probabilidad.dao;

import com.example.probabilidad.db.ConexionOracle;
import com.example.probabilidad.model.Probabilidad;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProbabilidadDAO {

    public void insertar(Probabilidad p) throws Exception {

        String sql = """
                INSERT INTO PROBABILIDAD_MONEDA
                (EVENTO, PROBABILIDAD, FECHA_REGISTRO)
                VALUES (?, ?, SYSDATE)
                """;

        try (Connection cn = ConexionOracle.getConexion();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, p.getEvento());
            ps.setDouble(2, p.getProbabilidad() * 100); // porcentaje .
            ps.executeUpdate();
        }
    }
}
