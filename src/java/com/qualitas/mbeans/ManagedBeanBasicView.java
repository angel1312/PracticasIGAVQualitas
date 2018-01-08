package com.qualitas.mbeans;
 
import com.qualitas.service.ManagedBeanCarService;
import com.qualitas.modelo.entities.Car;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

 
@ManagedBean(name="dtBasicView")
@ViewScoped
public class ManagedBeanBasicView implements Serializable {
     
    private List<Car> cars;
     
    @ManagedProperty("#{managedBeanCarService}")
    private ManagedBeanCarService service;
 
    @PostConstruct
    public void init() {
        cars = service.createCars(10);
    }
     
    public List<Car> getCars() {
        return cars;
    }
 
    public void setService(ManagedBeanCarService service) {
        this.service = service;
    }
}
