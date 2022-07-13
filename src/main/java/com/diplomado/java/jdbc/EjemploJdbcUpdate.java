package com.diplomado.java.jdbc;

import com.diplomado.java.jdbc.models.Producto;
import com.diplomado.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.diplomado.java.jdbc.repositorio.Repositorio;
import com.diplomado.java.jdbc.util.ConexionBD;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {

        try (Connection conn = ConexionBD.getInstance()){
             Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
             System.out.println("========== listar =========");
             repositorio.listar().forEach(System.out::println);

             System.out.println("========== obtener por id =========");
             System.out.println(repositorio.porId(1L));

             System.out.println("========== Editar producto =========");
             Producto producto = new Producto();
             producto.setId(3L);
            producto.setNombre("Teclado Razer mecanico");
             producto.setPrecio(700);
             repositorio.guardar(producto);
             System.out.println("Producto editado con exito");
             repositorio.listar().forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}