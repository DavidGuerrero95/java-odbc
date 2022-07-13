package com.diplomado.java.jdbc;

import com.diplomado.java.jdbc.models.Producto;
import com.diplomado.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.diplomado.java.jdbc.repositorio.Repositorio;
import com.diplomado.java.jdbc.util.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) {

        try (Connection conn = ConexionBD.getInstance()){
             Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
             System.out.println("========== listar =========");
             repositorio.listar().forEach(System.out::println);

             System.out.println("========== obtener por id =========");
             System.out.println(repositorio.porId(1L));

             System.out.println("========== Eliminar producto =========");
             repositorio.eliminar(3L);
             System.out.println("Producto eliminado con exito");
             repositorio.listar().forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}