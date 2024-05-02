package com.pgm.biz.pojo;

import com.editor.pgm.exceptions.FileLoadError;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Juan Pedro
 */
public class Imagen {

    private double[][] datos;
    private int nFilas;
    private int nColumnas;
    private int blancoAbs;

    public Imagen(File imageFile) throws FileLoadError {
        String[] pixels;
        String header1, header2;
        try (Scanner scFile = new Scanner(imageFile);) {
            //Verificamos las 2 primeras lineas
            header1 = scFile.nextLine();
            header2 = scFile.nextLine();

            if (!header1.equals("P2") || header2.charAt(0) != '#') {
                throw new FileLoadError("Error al cargar, verifique la integridad de la imagen.");
            }

            //Obtenemos la informacion de la imagen
            pixels = scFile.nextLine().split(" ");
            nColumnas = Integer.parseInt(pixels[0]);
            nFilas = Integer.parseInt(pixels[1]);
            datos = new double[nFilas][nColumnas];
            blancoAbs = Integer.parseInt(scFile.nextLine());

            //Guardamos los pixeles
            for (int f = 0; f < nFilas; f++) {
                for (int c = 0; c < nColumnas; c++) {
                    datos[f][c] = scFile.nextDouble();
                }
            }
        } catch (Exception e) {
            throw new FileLoadError("Error al cargar, verifique la integridad de la imagen.");
        }
        System.out.println(this.nFilas + " : " + this.nColumnas);

    }

    public double[][] getDatos() {
        return datos;
    }

    public int getnFilas() {
        return nFilas;
    }

    public int getnColumnas() {
        return nColumnas;
    }

    public int getBlancoAbs() {
        return blancoAbs;
    }

    public void setDatos(double[][] datos) {
        this.nFilas = datos.length;
        this.nColumnas = datos[0].length;
        this.datos = datos;
    }

    public void setnFilas(int nFilas) {
        this.nFilas = nFilas;
    }

    public void setnColumnas(int nColumnas) {
        this.nColumnas = nColumnas;
    }

    public void setBlancoAbs(int maxValor) {
        this.blancoAbs = maxValor;
    }

}
