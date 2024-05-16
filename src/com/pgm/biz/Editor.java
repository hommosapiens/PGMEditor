package com.pgm.biz;

import com.editor.pgm.exceptions.FileWriteError;
import com.pgm.biz.pojo.ImagenPGM;
import com.pgm.dao.implementations.ImagenDAOImp;
import java.io.FileWriter;

/**
 *
 * @author Juan Pedro
 */
public class Editor {

    private ImagenPGM pgm;

    public Editor(String ruta) throws Exception {
        try {
            ImagenDAOImp idi = new ImagenDAOImp();
            pgm = idi.getImagenPGM(ruta);

        } catch (Exception e) {
            throw e;
        }
    }

    public void rotIzquierda() {
        double[][] fliped = new double[pgm.getnColumnas()][pgm.getnFilas()];

        for (int f = 0; f < pgm.getnFilas(); f++) {
            for (int c = 0; c < pgm.getnColumnas(); c++) {
                fliped[pgm.getnColumnas() - 1 - c][f] = pgm.getDatos()[f][c];
            }
        }

        pgm.setDatos(fliped);
    }

    public void rotDerecha() {
        double[][] fliped = new double[pgm.getnColumnas()][pgm.getnFilas()];

        for (int f = 0; f < pgm.getnFilas(); f++) {
            for (int c = 0; c < pgm.getnColumnas(); c++) {
                fliped[c][pgm.getnFilas() - 1 - f] = pgm.getDatos()[f][c];
            }
        }

        pgm.setDatos(fliped);
    }

    public void flipHorizontal() {
        double temp;
        for (int f = 0; f < pgm.getnFilas(); f++) {
            for (int c = 0; c < pgm.getnColumnas() / 2; c++) {
                temp = pgm.getDatos()[f][c];
                pgm.getDatos()[f][c] = pgm.getDatos()[f][pgm.getnColumnas() - c - 1];
                pgm.getDatos()[f][pgm.getnColumnas() - c - 1] = temp;
            }
        }
    }

    public void flipVertital() {
        double[] temp;
        for (int f = 0; f < (pgm.getnFilas() / 2); f++) {
            temp = pgm.getDatos()[f];
            pgm.getDatos()[f] = pgm.getDatos()[pgm.getnFilas() - f - 1];
            pgm.getDatos()[pgm.getnFilas() - f - 1] = temp;
        }
    }

    public void negativo() {
        for (int f = 0; f < pgm.getnFilas(); f++) {
            for (int c = 0; c < pgm.getnColumnas(); c++) {
                pgm.getDatos()[f][c] = pgm.getBlancoAbs() - pgm.getDatos()[f][c];
            }
        }
    }

    public void normalize() {
        for (int f = 0; f < pgm.getnFilas(); f++) {
            for (int c = 0; c < pgm.getnColumnas(); c++) {
                pgm.getDatos()[f][c] = (pgm.getDatos()[f][c] * 255) / pgm.getBlancoAbs();
            }
        }
        pgm.setBlancoAbs(255);
    }

    public void desenfocar() {

        double sum;
        int cont, rowStart, rowEnd, columnStart, columnEnd;

        if (pgm.getBlancoAbs() != 255) {
            normalize();
        }

        double[][] blurData = new double[pgm.getnFilas()][pgm.getnColumnas()];

        for (int f = 0; f < pgm.getnFilas(); f++) {
            for (int c = 0; c < pgm.getnColumnas(); c++) {
                sum = pgm.getDatos()[f][c];
                cont = 1;

                rowStart = Math.max(f - 1, 0);
                rowEnd = Math.min(f + 1, pgm.getnFilas() - 1);
                columnStart = Math.max(c - 1, 0);
                columnEnd = Math.min(c + 1, pgm.getnColumnas() - 1);

                for (int i = rowStart; i <= rowEnd; i++) {
                    for (int j = columnStart; j <= columnEnd; j++) {
                        sum += pgm.getDatos()[i][j];
                        cont++;
                    }
                }

                blurData[f][c] = sum / cont;
            }
        }

        pgm.setDatos(blurData);
    }

    public void toWrite(String fileName) throws FileWriteError {

        try (FileWriter fw = new FileWriter(fileName);) {

            fw.write("P2\n");
            fw.write("# CREADO POR MI PARA TI, PORQUE SI\n");
            fw.write(pgm.getnColumnas() + " " + pgm.getnFilas() + "\n");
            fw.write(pgm.getBlancoAbs() + "\n");

            for (int f = 0; f < pgm.getnFilas(); f++) {
                for (int c = 0; c < pgm.getnColumnas(); c++) {
                    fw.write((int) Math.round(pgm.getDatos()[f][c]) + "\n");
                }
            }

        } catch (Exception e) {
            throw new FileWriteError("Error al guardar la imagen");
        }
    }

    public int[][] toRGB() {

        if (pgm.getBlancoAbs() != 255) {
            normalize();
        }

        int[][] salida = new int[pgm.getnFilas()][pgm.getnColumnas()];

        for (int f = 0; f < pgm.getnFilas(); f++) {
            for (int c = 0; c < pgm.getnColumnas(); c++) {
                salida[f][c] = (int) Math.round(pgm.getDatos()[f][c]);
            }
        }
        return salida;
    }

    public ImagenPGM getPgm() {
        return pgm;
    }

}
