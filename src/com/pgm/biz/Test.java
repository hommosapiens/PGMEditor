package com.pgm.biz;

/**
 *
 * @author Usuario
 */
public class Test {

    public static void main(String[] args) {
        Editor e = null;
        try {
            e = new Editor("perro.pgm");

            e.rotIzquierda();

            e.toInt();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
