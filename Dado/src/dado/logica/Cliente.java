/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado.logica;

/**
 *
 * @author Estudiantes
 */
public class Cliente {

    public void Lanzamiento() {

        Dado d = new Dado();
        Dado d1 = new Dado();

        int n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0, n10 = 0, n11 = 0, n12 = 0;
        for (int i = 0; i < 1000; i++) {
            int sum = ((d.random()) + (d1.random()));

            if ((sum) == 2) {
                n2++;
            }
            if ((sum) == 3) {
                n3++;
            }
            if ((sum) == 4) {
                n4++;
            }
            if ((sum) == 5) {
                n5++;
            }
            if ((sum) == 6) {
                n6++;
            }
            if ((sum) == 7) {
                n7++;
            }
            if ((sum) == 8) {
                n8++;
            }
            if ((sum) == 9) {
                n9++;
            }
            if ((sum) == 10) {
                n10++;
            }
            if ((sum) == 11) {
                n11++;
            }
            if ((sum) == 12) {
                n12++;
            }

        }
        System.out.println("Frecuencia 2: " + n2);
        System.out.println("Frecuencia 3: " + n3);
        System.out.println("Frecuencia 4: " + n4);
        System.out.println("Frecuencia 5: " + n5);
        System.out.println("Frecuencia 6: " + n6);
        System.out.println("Frecuencia 7: " + n7);
        System.out.println("Frecuencia 8: " + n8);
        System.out.println("Frecuencia 9: " + n9);
        System.out.println("Frecuencia 10: " + n10);
        System.out.println("Frecuencia 11: " + n11);
        System.out.println("Frecuencia 12: " + n12);

    }
}
