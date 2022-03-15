import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StartWindow extends AllObjects {
    void start() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setResizable(false);
        frame.setVisible(true);

        buttonStartGame.addActionListener(new StartGame());
        buttonStartGame.setFont(fontLabelShop);
        frame.add(buttonStartGame);
    }
    class StartGame implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            frame.remove(buttonStartGame);
            frame.setVisible(false);
            new Game().game();
        }
    }
}
