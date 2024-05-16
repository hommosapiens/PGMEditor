package com.pgm.dao.interfaces;

import com.pgm.biz.pojo.ImagenPGM;

/**
 *
 * @author Juan Pedro
 */
public interface ImagenDAO {

    public ImagenPGM getImagenPGM(String ruta) throws Exception;

}
