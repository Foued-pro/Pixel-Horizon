import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {

    // PARAMÈTRES ÉCRAN

    final int originalTitleSize = 16; // Taille originale d'une tuile (tile)
    final int scale = 3; // Facteur d'agrandissement pour les tuiles

    final int tileSize = originalTitleSize * scale; // Taille d'une tuile après agrandissement : 48 pixels
    final int maxScreenCol = 16; // Maximum de 16 tuiles horizontalement
    final int maxScreenRow = 12; // Maximum de 12 tuiles verticalement
    final int screenWidth = tileSize * maxScreenCol; // Largeur de l'écran : 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // Hauteur de l'écran : 576 pixels

    Thread gameThread;

    public GamePanel() {
        // Configuration du panneau de jeu
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); // Définit la taille préférée du panneau
        this.setBackground(Color.BLACK); // Définit la couleur de fond du panneau à noir
        this.setDoubleBuffered(true); // Active le double buffering pour réduire le scintillement lors du rendu
    }

    public void startGameThread() {

        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

    }
}
