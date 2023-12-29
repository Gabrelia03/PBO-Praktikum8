package Nomor1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KonversiCombo extends JFrame {

    private JPanel basePanel = null;
    private JComboBox<String> jComboBoxR = null;
    private JTextField fieldInput = null;
    private JButton buttonKonversi = null;
    private JComboBox<String> jComboBoxS = null;
    private JTextField fieldOutput = null;
    private String[] label = new String[]{
        "KM", "HM", "DAM", "M", "DM", "CM", "MM"
    };

    public KonversiCombo() {
        initUI();
    }

    private void initUI() {
        setContentPane(getBasePanel());
        setSize(600, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private JPanel getBasePanel() {
        if (basePanel == null) {
            basePanel = new JPanel();
            basePanel.add(getJComboBoxR());
            basePanel.add(getFieldInput());
            basePanel.add(getButtonKonversi());
            basePanel.add(getJComboBoxS());
            basePanel.add(getFieldOutput());
            basePanel.setBackground(Color.CYAN);

        }
        return basePanel;
    }

    private JComboBox<String> getJComboBoxR() {
        if (jComboBoxR == null) {
            jComboBoxR = new JComboBox<>(label);
        }
        return jComboBoxR;
    }

    private JComboBox<String> getJComboBoxS() {
        if (jComboBoxS == null) {
            jComboBoxS = new JComboBox<>(label);
        }
        return jComboBoxS;
    }

    private JTextField getFieldInput() {
        if (fieldInput == null) {
            fieldInput = new JTextField();
            fieldInput.setPreferredSize(new Dimension(80, 20));
        }
        return fieldInput;
    }

    private JButton getButtonKonversi() {
        if (buttonKonversi == null) {
            buttonKonversi = new JButton("Convert-->");
            buttonKonversi.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int indexIn = jComboBoxR.getSelectedIndex();
                    int indexOut = jComboBoxS.getSelectedIndex();
                    String sInput = fieldInput.getText();
                    double input = Double.parseDouble(sInput);
                    double output = convert(indexIn, indexOut, input);
                    fieldOutput.setText("" + String.format("%.06f",output));
//                    if (input > output){
//                        fieldOutput.setText("" + String.format("%.06f", output));
//                    }else{
//                          fieldOutput.setText("" + output);
//                    }

                }
            });
        }
        return buttonKonversi;
    }

    private double convert(int dari, int ke, double value) {
        double result = value;
        //convert ke KM
        double km = value / Math.pow(10, dari);
        result = km * Math.pow(10, ke);
        return result;
    }

    private JTextField getFieldOutput() {
        if (fieldOutput == null) {
            fieldOutput = new JTextField();
            fieldOutput.setPreferredSize(new Dimension(80, 20));
        }
        return fieldOutput;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                KonversiCombo myWindow = new KonversiCombo();
            }

        }
        );

    }
}
