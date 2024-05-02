package com.pgm.dao.interfaces;

import com.pgm.biz.pojo.Imagen;

/**
 *
 * @author Juan Pedro
 */
public interface ImagenDAO {

    public Imagen getImagenPGM(String ruta) throws Exception;

}
