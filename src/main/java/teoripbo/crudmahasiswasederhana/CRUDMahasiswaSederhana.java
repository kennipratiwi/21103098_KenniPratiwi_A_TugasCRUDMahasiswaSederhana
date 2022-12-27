/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package teoripbo.crudmahasiswasederhana;

import javax.swing.SwingUtilities;
import teoripbo.crudmahasiswasederhana.views.MahasiswaJFrame;

/**
 *
 * @author Asus
 */
public class CRUDMahasiswaSederhana {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                MahasiswaJFrame form = new MahasiswaJFrame();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }
}

