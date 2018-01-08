/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.dao.impl;

import com.qualitas.dao.BaseDAO;
import com.qualitas.modelo.ConectaUniverse;
import com.qualitas.modelo.entities.TipoEndoso;
import java.util.List;

/**
 *
 * @author iaquino
 */
public class TipoEndosoDAO implements BaseDAO {

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoEndoso> read() {
        ConectaUniverse conecta = new ConectaUniverse();
        return conecta.leer();
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
