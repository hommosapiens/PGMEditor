package com.pgm.dao.implementations;

import com.pgm.biz.pojo.Imagen;
import com.pgm.dao.interfaces.ImagenDAO;
import java.io.File;

/**
 *
 * @author Juan Pedro
 */
public class ImagenDAOImp implements ImagenDAO {

    @Override
    public Imagen getImagenPGM(String ruta) throws Exception {
        File f = new File(ruta);

        Imagen imagen = new Imagen(f);

        return imagen;
    }

}
