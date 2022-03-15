import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Game extends StartWindow {
    void game() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setResizable(false);

        labelShop.setFont(fontLabelShop);

        buttonPlusPoint.addActionListener(new plusPoint());
        buttonShop1point.addActionListener(new shopPoints());
        buttonShop2point.addActionListener(new shop2Point());
        buttonShop3point.addActionListener(new shop3Point());
        buttonShop4point.addActionListener(new shop4Point());
        buttonShop$point.addActionListener(new shop1154643749Point());

        panelForPoint.add(labelPoints);
        panelForPoint.add(buttonPlusPoint);

        panelForShop.setLayout(new BoxLayout(panelForShop, BoxLayout.Y_AXIS));
        panelForShop.add(labelShop);
        panelForShop.add(buttonShop1point);
        panelForShop.add(buttonShop2point);
        panelForShop.add(buttonShop3point);
        panelForShop.add(buttonShop4point);
        panelForShop.add(buttonShop$point);

        frame.getContentPane().add(BorderLayout.SOUTH, panelForPoint);
        frame.getContentPane().add(BorderLayout.NORTH, panelForShop);
        frame.setVisible(true);
    }

    class plusPoint implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            intPoints += intEveryPlusPoints;
            labelPoints.setText("Ваши очки: " + intPoints);
        }
    }
    class shopPoints implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            if (intPoints >= intPrice1) {
                intEveryPlusPoints += 1;
                intPoints -= intPrice1;
                buttonPlusPoint.setText("+" + intEveryPlusPoints + " очка (ов)");
                labelPoints.setText("Ваши очки: " + intPoints);
                intPrice1 += intPrice1 / 2;
                buttonShop1point.setText("+1 очко к одному нажатию. Стоимость: " + intPrice1 + " очков.");

            }
        }
    }
    class shop2Point implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            if (intPoints >= intPrice2) {
                intEveryPlusPoints += 2;
                intPoints -= intPrice2;
                buttonPlusPoint.setText("+" + intEveryPlusPoints + " очка (ов)");
                labelPoints.setText("Ваши очки: " + intPoints);
                intPrice2 += intPrice2 / 2;
                buttonShop2point.setText("+2 очка к одному нажатию. Стоимость: " + intPrice2 + " очков.");
            }
        }
    }
    class shop3Point implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            if (intPoints >= intPrice3) {
                intEveryPlusPoints += 3;
                intPoints -= intPrice3;
                buttonPlusPoint.setText("+" + intEveryPlusPoints + " очка (ов)");
                labelPoints.setText("Ваши очки: " + intPoints);
                intPrice3 += intPrice3 / 2;
                buttonShop3point.setText("+3 очка к одному нажатию. Стоимость: " + intPrice3 + " очков.");
            }
        }
    }
    class shop4Point implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            if (intPoints >= intPrice4) {
                intEveryPlusPoints += 4;
                intPoints -= intPrice4;
                buttonPlusPoint.setText("+" + intEveryPlusPoints + " очка (ов)");
                labelPoints.setText("Ваши очки: " + intPoints);
                intPrice4 += intPrice4 / 2;
                buttonShop4point.setText("+4 очка к одному нажатию. Стоимость: " + intPrice4 + " очков.");
            }
        }
    }
    class shop1154643749Point implements ActionListener {
        public void actionPerformed(ActionEvent actionEvent) {
            intEveryPlusPoints += 1154643749;
            buttonPlusPoint.setText("+" + intEveryPlusPoints + " очка (ов)");
            labelPoints.setText("Ваши очки: " + intPoints);
        }
    }
}
