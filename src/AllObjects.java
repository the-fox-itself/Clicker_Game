import javax.swing.*;
import java.awt.*;

abstract class AllObjects {
    long intPrice1 = 100;
    long intPrice2 = 200;
    long intPrice3 = 300;
    long intPrice4 = 400;
    long intPoints = 0;
    long intEveryPlusPoints = 1;

    JFrame frame = new JFrame("Кликер");

    JButton buttonPlusPoint = new JButton("+1 очко");
    JButton buttonShop1point = new JButton("+1 очко к одному нажатию. Стоимость: " + intPrice1 + " очков.");
    JButton buttonShop2point = new JButton("+2 очка к одному нажатию. Стоимость: " + intPrice2 + " очков.");
    JButton buttonShop3point = new JButton("+3 очка к одному нажатию. Стоимость: " + intPrice3 + " очков.");
    JButton buttonShop4point = new JButton("+4 очка к одному нажатию. Стоимость: " + intPrice4 + " очков.");
    JButton buttonShop$point = new JButton("+1154643749 очка к одному нажатию. Стоимость: 1999 очков.");
    JButton buttonStartGame = new JButton("Начать игру");

    JPanel panelForPoint = new JPanel();
    JPanel panelForShop = new JPanel();

    JLabel labelPoints = new JLabel("Ваши очки: " + intPoints);
    JLabel labelShop = new JLabel("Магазин: ");

    Font fontLabelShop = new Font("", Font.BOLD, 30);
}
