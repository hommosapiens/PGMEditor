package com.pgm.dao.implementations;

import com.pgm.biz.pojo.ImagenPGM;
import com.pgm.dao.interfaces.ImagenDAO;
import java.io.File;

/**
 *
 * @author Juan Pedro
 */
public class ImagenDAOImp implements ImagenDAO {

    @Override
    public ImagenPGM getImagenPGM(String ruta) throws Exception {
        File f = new File(ruta);

        try {
            ImagenPGM imagen = new ImagenPGM(f);
            return imagen;
        } catch (Exception e) {
            throw e;
        }
    }

}
