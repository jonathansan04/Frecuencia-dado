/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado.logica;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Dado {

    public int random() {

        int num = (int) (Math.random() * 6) + 1;
        return num;
    }
}
