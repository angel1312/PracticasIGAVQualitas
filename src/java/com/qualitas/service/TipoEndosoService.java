/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.service;

import com.qualitas.dao.BaseDAO;
import com.qualitas.dao.impl.TipoEndosoDAO;
import com.qualitas.modelo.entities.TipoEndoso;
import java.util.List;

/**
 *
 * @author iaquino
 */
public class TipoEndosoService {
    
    private BaseDAO tipoEndosoDAO;
    
    public TipoEndosoService() {
        tipoEndosoDAO = new TipoEndosoDAO();
    }
    
    public List<TipoEndoso> getTipoEndosos() {
        return tipoEndosoDAO.read();
    }

    public BaseDAO getTipoEndosoDAO() {
        return tipoEndosoDAO;
    }

    public void setTipoEndosoDAO(BaseDAO tipoEndosoDAO) {
        this.tipoEndosoDAO = tipoEndosoDAO;
    }
    
}
