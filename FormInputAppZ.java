import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormInputAppZ extends JFrame {
    private JTextField firstNameField, lastNameField, birthDateField, emailField;
    private JComboBox<String> sexComboBox;
    private JButton submitButton, clearButton;
    private JTextArea submissionsArea;
    private ArrayList<String> submissions;

    public FormInputAppZ() {
        setTitle("Form Input");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        submissions = new ArrayList<>();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(7, 2, 5, 5));

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField();
        mainPanel.add(firstNameLabel);
        mainPanel.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();
        mainPanel.add(lastNameLabel);
        mainPanel.add(lastNameField);

        JLabel birthDateLabel = new JLabel("Birth Date:");
        birthDateField = new JTextField();
        mainPanel.add(birthDateLabel);
        mainPanel.add(birthDateField);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        mainPanel.add(emailLabel);
        mainPanel.add(emailField);

        JLabel sexLabel = new JLabel("Sex:");
        String[] sexOptions = {"Male", "Female", "Other"};
        sexComboBox = new JComboBox<>(sexOptions);
        mainPanel.add(sexLabel);
        mainPanel.add(sexComboBox);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        mainPanel.add(submitButton);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ClearButtonListener());
        mainPanel.add(clearButton);

        submissionsArea = new JTextArea();
        submissionsArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(submissionsArea);
        mainPanel.add(scrollPane);

        add(mainPanel);
        setVisible(true);
    }

    private class SubmitButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String birthDate = birthDateField.getText();
            String email = emailField.getText();
            String sex = (String) sexComboBox.getSelectedItem();

            String submission = firstName + " " + lastName + " " + "(" + sex + ")" + "\n" +
            "Born on " + birthDate + "\n" + 
            email;

            submissions.add(submission);
            updateSubmissionsArea();
            clearFields();
        }
    }

    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            clearFields();
            clearSubmissions();
        }
    }

    private void clearFields() {
        firstNameField.setText("");
        lastNameField.setText("");
        birthDateField.setText("");
        emailField.setText("");
        sexComboBox.setSelectedIndex(0);
    }

    private void clearSubmissions() {
        submissions.clear();
        updateSubmissionsArea();
    }

    private void updateSubmissionsArea() {
        submissionsArea.setText("");
        for (String submission : submissions) {
            submissionsArea.append(submission + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FormInputAppZ();
            }
        });
    }
}
