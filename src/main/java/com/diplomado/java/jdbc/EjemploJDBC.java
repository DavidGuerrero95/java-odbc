package com.diplomado.java.jdbc;

import com.diplomado.java.jdbc.models.Categoria;
import com.diplomado.java.jdbc.models.Producto;
import com.diplomado.java.jdbc.repositorio.CategoriaRepositorioImpl;
import com.diplomado.java.jdbc.repositorio.ProductoRepositorioImpl;
import com.diplomado.java.jdbc.repositorio.Repositorio;
import com.diplomado.java.jdbc.servicio.CatalogoServicio;
import com.diplomado.java.jdbc.servicio.Servicio;
import com.diplomado.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJDBC {
    public static void main(String[] args) throws SQLException{
        Servicio servicio = new CatalogoServicio();
        System.out.println("======== Listar ======");
        servicio.listar().forEach(System.out::println);
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminacion");

        Producto producto = new Producto();
        producto.setNombre("Lampara led escritorio");
        producto.setPrecio(990);
        producto.setFechaRegistro(new Date());
        producto.setSku("abcdefgh12");
        servicio.guardarProductosConCategoria(producto, categoria);
        System.out.println("Producto guardado con exito: " + producto.getId());
        servicio.listar().forEach(System.out::println);

    }
}