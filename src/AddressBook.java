import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class AddressBook extends JFrame{
    private JList<BuddyInfo> collection;
    private JFrame popupFrame;

    public AddressBook(){
        super("AddressBook");
        popupFrame = new JFrame();
        popupFrame.setSize(200,200);
        DefaultListModel<BuddyInfo> listModel = new DefaultListModel<>();
        collection = new JList<>(listModel);

        this.setLayout(new BorderLayout());
        JPanel headPanel = new JPanel();
        JPanel bodyPanel = new JPanel();
        bodyPanel.setLayout(new FlowLayout());

        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bodyPanel.removeAll();
                bodyPanel.revalidate();
                bodyPanel.repaint();
                BuddyInfo newBuddy = new BuddyInfo("","","");
                JOptionPane.showMessageDialog(popupFrame,"Please enter the name,address and phone number of the new buddy");

                JTextField nameInput = new JTextField("NAME: ");
                bodyPanel.add(nameInput);
                nameInput.setPreferredSize(new Dimension(200,50));

                JTextField addressInput = new JTextField("ADDRESS: ");
                bodyPanel.add(addressInput);
                addressInput.setPreferredSize(new Dimension(200,50));


                JTextField numberInput = new JTextField("PHONE NUMBER: ");
                bodyPanel.add(numberInput);
                numberInput.setPreferredSize(new Dimension(200,50));

                JButton submitButton = new JButton("Submit");
                bodyPanel.add(submitButton);
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        newBuddy.setName(nameInput.getText());
                        newBuddy.setAddress(addressInput.getText());
                        newBuddy.setNumber(numberInput.getText());
                        if (nameInput.getText().equals("") || nameInput.getText().equals("") || nameInput.getText().equals("")) {
                            JOptionPane.showMessageDialog(popupFrame, "One of the fields is missing");
                        }
                        listModel.addElement(newBuddy);
                        bodyPanel.removeAll();
                        bodyPanel.revalidate();
                        bodyPanel.repaint();
                        bodyPanel.add(collection);
                    }

                });
            }
        });

        JButton displayButton = new JButton("Display");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bodyPanel.removeAll();
                bodyPanel.revalidate();
                bodyPanel.repaint();
                bodyPanel.add(collection);
            }
        });

        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bodyPanel.removeAll();
                bodyPanel.revalidate();
                bodyPanel.repaint();
                bodyPanel.add(collection);
                JButton deleteButton = new JButton ("Delete");
                bodyPanel.add(deleteButton);
                deleteButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int selectedIndex = collection.getSelectedIndex();
                        if(selectedIndex != -1){
                            listModel.remove(selectedIndex);
                        }
                        bodyPanel.removeAll();
                        bodyPanel.revalidate();
                        bodyPanel.repaint();
                        bodyPanel.add(collection);
                    }
                });

            }
        });

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(displayButton);
        menuBar.add(addButton);
        menuBar.add(removeButton);
        headPanel.add(menuBar);

        this.add(headPanel,BorderLayout.NORTH);
        this.add(bodyPanel, BorderLayout.CENTER);
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
       new AddressBook();
    }
}
