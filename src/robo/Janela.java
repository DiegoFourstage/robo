package robo;

import javax.swing.JFrame;

/**
 *
 * @author D1350
 */
public class Janela {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Mr.Robot");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(1280, 720);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);

        janela.setVisible(true);
    }

}
