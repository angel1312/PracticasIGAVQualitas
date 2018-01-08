package com.qualitas.modelo;

import asjava.uniclientlibs.UniDynArray;
import asjava.uniobjects.UniCommand;
import asjava.uniobjects.UniCommandException;
import asjava.uniobjects.UniFile;
import asjava.uniobjects.UniFileException;
import asjava.uniobjects.UniSelectList;
import asjava.uniobjects.UniSelectListException;
import asjava.uniobjects.UniSession;
import asjava.uniobjects.UniSessionException;
import com.qualitas.modelo.entities.TipoEndoso;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectaUniverse {

    private String server = "110.10.0.176"; // ip server
    private String userName = "gaquino";    // usuario
    private String password = "angel13";   // contraseña
    private String accountPath = "/sise";    // cuenta
    public String DBtype = "UNIVERSE";       // tipo de cuenta
    public UniSession session;              // UniVerse session

    public ConectaUniverse() {
        session = new UniSession();
        procesar();
    }

    public void procesar() {
        try {
            session.setHostName(server);
            session.setUserName(userName);
            session.setPassword(password);
            session.setAccountPath(accountPath);
            session.setDataSourceType(DBtype);
            System.out.println("Termino asignar valores");

            session.connect();
            System.out.println("Conexion establecida");

        } catch (UniSessionException e) {
            System.out.println("Error en la conexion ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error en la conexion " + e.getMessage());
        }
    }

    public List<TipoEndoso> leer() {
        String cmdString;
        UniCommand command = null;
        
        System.out.println("\nEjecuta Comando inicio >>>\n");
        
        List <TipoEndoso> lista = new ArrayList<>();
        
        try {
            cmdString = "SSELECT TENDOSO";
            command = session.command();
            
            command.setCommand(cmdString);
            command.exec();
            
            UniSelectList uvslLista = session.selectList(0);
            UniFile uvfBDSise = session.openFile("TENDOSO");
            
            while(!uvslLista.isLastRecordRead()) {
                String idBDSise = uvslLista.next().toString();
                if (!idBDSise.isEmpty()) {
                    System.out.println("Encontro registro " + idBDSise);
                     uvfBDSise.setRecordID(idBDSise);
                    UniDynArray uvdRegBDSise = new UniDynArray(uvfBDSise.read().toString());
                    String descripcion = uvdRegBDSise.extract(1).toString();
                    String tipo = uvdRegBDSise.extract(2).toString();
                    
                    TipoEndoso tipoEndoso = new TipoEndoso(idBDSise, descripcion, tipo);
                    lista.add(tipoEndoso);
                }
            }
            
            
            System.out.println(command.response());
        } catch (UniSessionException e) {
            System.out.println("   ERROR:UniSessonException:" + e.getMessage() + "\n");
        } catch (UniCommandException e) {
            System.out.println("   ERROR:UniCommandException:" + e.getMessage() + "\n");
        } catch (UniSelectListException e) {
            System.out.println("   ERROR:UniSelectListException:" + e.getMessage() + "\n");
        } catch (UniFileException e) {
            System.out.println("   ERROR:UniFileException:" + e.getMessage() + "\n");
        }
        System.out.println("Ejecuta Comando fin <<<\n"); 
        return lista;
    }
}
