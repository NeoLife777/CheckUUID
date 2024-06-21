import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.UUID;

public class Check {

    public void isValidUUID(final String input) {
        try {
            UUID.fromString(input);

            WindowsUI windowsUI = new WindowsUI();


//            JLabel label = new JLabel("Валидация прошла успешно", SwingConstants.CENTER);
//            label.setFont(new Font("Arial", Font.PLAIN, 16)); // Устанавливаем шрифт для надписи
//            windowsUI.add(label, BorderLayout.CENTER);


            //System.out.println("Проверка прошла");
            //JOptionPane.showMessageDialog(null, "Проверка прошла");

        } catch (Exception e) {

            WindowsUI windowsUI = new WindowsUI();
            JLabel label = new JLabel("Валидация не прошла", SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.PLAIN, 16)); // Устанавливаем шрифт для надписи
            windowsUI.add(label, BorderLayout.CENTER);


            //System.out.println("Проверка не прошла");
            //JOptionPane.showMessageDialog(null, "Проверка не прошла");
        }
    }
}
