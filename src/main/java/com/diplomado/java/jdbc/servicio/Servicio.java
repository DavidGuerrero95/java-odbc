package com.diplomado.java.jdbc.servicio;

import com.diplomado.java.jdbc.models.Categoria;
import com.diplomado.java.jdbc.models.Producto;

import java.sql.SQLException;
import java.util.List;

public interface Servicio {

    List<Producto> listar() throws SQLException;

    Producto porId(Long id) throws SQLException;

    Producto guardar(Producto producto) throws SQLException;

    void eliminar(Long id) throws SQLException;

    List<Categoria> listarCategoria() throws SQLException;

    Categoria porIdCategoria(Long id) throws SQLException;

    Categoria guardarCategoria(Categoria categoria) throws SQLException;

    void eliminarCategoria(Long id) throws SQLException;

    void guardarProductosConCategoria(Producto producto, Categoria categoria) throws SQLException;

}
