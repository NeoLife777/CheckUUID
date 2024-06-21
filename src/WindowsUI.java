import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;

public class WindowsUI extends JFrame {

    private JTextField textField;
    private JPanel panel;

    public WindowsUI() {

        setTitle("Проверка UUID");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Создание панели
        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Добавление текстового поля
        textField = new JTextField();
        Dimension size = new Dimension(50, 50); // Ширина и высота текстового поля (в пикселях)
        textField.setSize(size); // Устанавливаем размер текстового поля
        textField.setColumns(10); // Количество столбцов в текстовом поле
        textField.setBackground(Color.cyan); // Устанавливаю цвет поля
        panel.add(textField, BorderLayout.NORTH); // Устанавливаю расположение поля вверху окна


        // Добавление поля, в которое нельзя писать
        //JLabel label = new JLabel("<html><center>Результат валидации</center></html>");
        JLabel label = new JLabel("Результат валидации", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16)); // Устанавливаем шрифт для надписи
        panel.add(label, BorderLayout.CENTER);

        // Добавление кнопки
        JButton button = new JButton("Проверить UUID");

        textField.addKeyListener(new KeyAdapter() { // Добавляем слушателя клавиш
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) { // Если нажата клавиша Enter
                    button.doClick(); // Нажимаем кнопку
                }
            }
        });



        button.addActionListener(e -> {
            label.setText(" ");
            //label.setOpaque(false);
            Check check = new Check();
            check.isValidUUID(textField.getText());
        });

        // System.out.println("Текст: " + textField.getText());

        panel.add(button, BorderLayout.SOUTH); // Добавление кнопки в нижнюю часть панели

        setContentPane(panel); // Установка панели как содержимого окна
        setVisible(true); // Отображение окна

    }
}
