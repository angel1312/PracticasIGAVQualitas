/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.dao;

import com.qualitas.modelo.entities.TipoEndoso;
import java.util.List;

/**
 *
 * @author iaquino
 */
public interface BaseDAO {
    
    void create();
    List<TipoEndoso> read();
    void update();
    void delete();
    
}
