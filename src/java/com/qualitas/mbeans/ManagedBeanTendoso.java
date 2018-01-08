
package com.qualitas.mbeans;

import com.qualitas.modelo.ConectaUniverse;
import com.qualitas.modelo.entities.TipoEndoso;
import com.qualitas.service.TipoEndosoService;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ManagedBeanTendoso {
    
    private List<TipoEndoso> endosos;
    

    
    public ManagedBeanTendoso() {
               
        TipoEndosoService endosoService= new TipoEndosoService();
        endosos = endosoService.getTipoEndosos();
        System.out.println("Encontre: " + endosos.size()+" Registros");
        
    }

    public List<TipoEndoso> getEndosos() {
        return endosos;
    }

    public void setEndosos(List<TipoEndoso> endosos) {
        this.endosos = endosos;
    }

       
}
