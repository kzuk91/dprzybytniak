package wat.edu.pl.pz.gui.front.listeners;


import org.jdesktop.swingx.JXDatePicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseClickedValueListener implements MouseListener {

    JTextField field;
    JTextArea area;
    JXDatePicker datePicker;

    public MouseClickedValueListener(JTextField field) {
        this.field = field;
    }

    public MouseClickedValueListener(JTextArea area) {
        this.area = area;
    }

    public MouseClickedValueListener(JXDatePicker datePicker) {
        this.datePicker = datePicker;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == field)
            field.setBackground(Color.WHITE);
        if (e.getSource() == area)
            area.setBackground(Color.WHITE);
        if (e.getSource() == datePicker)
            datePicker.setBackground(Color.WHITE);
    }


    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

}
