import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme l'application à la fermeture de la fenêtre
        window.setResizable(false); // La fenêtre ne peut pas être redimensionnée
        window.setTitle("Pixel Horizon"); // Titre de la fenêtre

        // Création du panneau de jeu et ajout à la fenêtre
        GamePanel gamePanel = new GamePanel(); // Instanciation du GamePanel
        window.add(gamePanel); // Ajout du panneau à la fenêtre
        window.pack(); // Ajuste la taille de la fenêtre à celle du panneau de jeu

        window.setLocationRelativeTo(null); // Centre la fenêtre sur l'écran
        window.setVisible(true); // Rendre la fenêtre visible
    }
}
