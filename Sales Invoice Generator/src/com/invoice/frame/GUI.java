package com.invoice.frame;

import com.invoice.model.InvoiceHeader;
import com.invoice.model.InvoiceLine;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Mohamed Kandeel
 */
public class GUI extends javax.swing.JFrame implements ActionListener {
    ArrayList <InvoiceHeader> invoiceHeaders = new ArrayList<>();
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">

    DefaultTableModel modelInvoice;
    DefaultTableModel modelItems;
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        invoiceNumLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        invoiceTotalLabel = new javax.swing.JLabel();
        addItem = new javax.swing.JButton();
        removeItem = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Inv. Num", "Date", "Customer", "Total"
                }
        ));
        jScrollPane1.setViewportView(invoiceTable);

        jLabel1.setText("Invoices Table");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Inv. Num", "Item Name", "Item Price", "Count"
                }
        ));
        jScrollPane2.setViewportView(itemsTable);

        jLabel2.setText("Invoice Items");

        jLabel3.setText("Invoice Number");

        invoiceNumLabel.setText("0");

        jLabel4.setText("Invoice Date");


        invoiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceTableMouseClicked(evt);
            }
        });


        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Customer Name");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        createButton.setText("Create new invoice");
        createButton.setActionCommand("createButton");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.setActionCommand("saveButton");
        saveButton.addActionListener(this);
        cancelButton.addActionListener(this);

        deleteButton.setText("Delete invoice");
        deleteButton.setActionCommand("deleteButton");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setActionCommand("cancelButton");

        jLabel6.setText("Invoice Total");

        invoiceTotalLabel.setText("0");

        addItem.setText("Add Item");
        addItem.setActionCommand("addItem");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        removeItem.setText("Remove Item");
        removeItem.setActionCommand("removeItem");
        removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        openMenuItem.setMnemonic('O');
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openMenuItem);

        saveMenuItem.setMnemonic('S');
        saveMenuItem.setText("Save");
        saveMenuItem.setActionCommand("saveMenuItem");
        saveMenuItem.addActionListener(this);
        jMenu1.add(saveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(148, 148, 148)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(14, 14, 14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(createButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(deleteButton)
                                                .addGap(58, 58, 58)))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addGap(33, 33, 33)
                                                                .addComponent(dateTextField))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(invoiceNumLabel)))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(invoiceTotalLabel)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addComponent(nameTextField))))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(removeItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(invoiceNumLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(invoiceTotalLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(removeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                        .addComponent(jSeparator2)
        );
        modelItems = (DefaultTableModel) itemsTable.getModel();
        modelInvoice = (DefaultTableModel) invoiceTable.getModel();
        pack();
    }// </editor-fold>

    //ACTION EVENTS
    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int count = modelInvoice.getRowCount();
        if (count == 0)
            modelInvoice.addRow(new Object[] {1});
        else {
            modelInvoice.addRow(new Object[] {
                    Integer.parseInt(invoiceTable.getValueAt(count - 1, 0).toString()) + 1
            });
        }
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = invoiceTable.getSelectedRow();
        if (selectedRow == -1)
            modelInvoice.removeRow(0);
        else {
            modelInvoice.removeRow(selectedRow);
            sel = -1;
            for (int i = 0; i < invoiceHeaders.size(); i++) {
                if (num == invoiceHeaders.get(i).getNum()){
                    sel = i;
                    break;
                }
            }
            invoiceHeaders.remove(sel);
        }
    }
    //TABLE ON-CLICK EVENTS
    public int selectedRow;
    public int sel;
    public int num;
    private void invoiceTableMouseClicked(java.awt.event.MouseEvent evt){
        selectedRow = invoiceTable.getSelectedRow();
        if (invoiceTable.getValueAt(selectedRow, 0) != null) {
            num = Integer.parseInt(invoiceTable.getValueAt(selectedRow, 0).toString());
            modelItems.setRowCount(0);
            importToItemsTable(num);
        }
        else {
            invoiceNumLabel.setText("0");
            dateTextField.setText("");
            nameTextField.setText("");
            invoiceTotalLabel.setText("0");
            modelItems.setRowCount(0);
        }
    }
    public void invoiceTableKeyClicked(KeyEvent evt){
        System.out.println("hi");
    }
    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this, "Please enter the invoice" +
                " header file", "Open file", JOptionPane.INFORMATION_MESSAGE);
        loadHeaderFile();
        JOptionPane.showMessageDialog(this, "Please enter the invoice" +
                " line file", "Open file", JOptionPane.INFORMATION_MESSAGE);
        loadLinesFile();
        JOptionPane.showMessageDialog(this, "Files imported successfully"
                , "Success", JOptionPane.INFORMATION_MESSAGE);
        importToInvoiceTable();
    }

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {
        selectedRow = invoiceTable.getSelectedRow();
        if (invoiceTable.getValueAt(selectedRow, 0) != null)
            modelItems.addRow(new Object[] {invoiceTable.getValueAt(selectedRow, 0)});
        else
            modelItems.addRow(new Object[] {});
    }

    private void removeItemActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = itemsTable.getSelectedRow();
        if (selectedRow == -1)
            modelItems.removeRow(0);
        else
            modelItems.removeRow(selectedRow);
    }


    public static void main(String args[]) {

        //TEST
//        invoiceHeaders.add(new InvoiceHeader(1, "Mohamed", "2022"));
//        invoiceHeaders.get(0).addInvLine(new InvoiceLine("Len",
//                22000, 1));
//        invoiceHeaders.get(0).addInvLine(new InvoiceLine("GG",
//                12000, 2));
//        System.out.println(invoiceHeaders.get(0));
        //TEST END
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addItem;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel invoiceNumLabel;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JTable itemsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel invoiceTotalLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JButton removeItem;
    private javax.swing.JButton saveButton;
    private javax.swing.JMenuItem saveMenuItem;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("saveButton"))
            saveInvoiceItems(sel);
        else if (e.getActionCommand().equals("cancelButton")) {
            modelItems.setRowCount(0);
            importToItemsTable(num);
        } else if (e.getActionCommand().equals("saveMenuItem")) {
            JOptionPane.showMessageDialog(this, "Please specify save location for" +
                    " header file", "Save header file", JOptionPane.INFORMATION_MESSAGE);
            saveHeaderFile();
            JOptionPane.showMessageDialog(this, "Please specify save location for" +
                    " items file", "Save items file", JOptionPane.INFORMATION_MESSAGE);
            saveLinesFile();
            JOptionPane.showMessageDialog(this, "Saved successfully"
                    , "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    // End of variables declaration
    void loadHeaderFile(){
        invoiceHeaders.clear();
        modelInvoice.setRowCount(0);
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION){
            String path = fc.getSelectedFile().getPath();
            String line = "";
            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                while ((line = br.readLine()) != null){
                    String[] values = line.split(",");
                    invoiceHeaders.add(new InvoiceHeader(Integer.parseInt(values[0]), values[1], values[2]));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace(); //TODO add a function dialogue
            } catch (IOException e) {
                e.printStackTrace(); //TODO add a function dialogue
            }
//            System.out.println(invoiceHeaders.get(1));    //TEST
        }
    }
    void loadLinesFile(){
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION){
            String path = fc.getSelectedFile().getPath();
            String line = "";
            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                while ((line = br.readLine()) != null){
                    String[] values = line.split(",");
                    for (int i = 0; i < invoiceHeaders.size(); i++) {
                        if (Integer.parseInt(values[0]) == invoiceHeaders.get(i).getNum()){
                            invoiceHeaders.get(i).addInvLine(new InvoiceLine(
                                    values[1], Double.parseDouble(values[2]),
                                    Integer.parseInt(values[3])));
                            break;
                        }
                    }
                 }
              System.out.println(invoiceHeaders);

            } catch (FileNotFoundException e) {
                e.printStackTrace(); //TODO add a function dialogue
            } catch (IOException e) {
                e.printStackTrace(); //TODO add a function dialogue
            }

        }
    }

    void saveInvoiceItems(int sel){
        String name = null;
        Double price = null;
        int count = 0;
        invoiceHeaders.get(sel).getLines().clear();
        for (int i = 0; i < itemsTable.getRowCount(); i++) {
            for (int j = 1; j < 4; j++) {
                if (j == 1)
                    name = itemsTable.getValueAt(i, j).toString();
                else if (j == 2)
                    price = Double.parseDouble(itemsTable.getValueAt(i, j).toString());
                else if (j == 3) {
                    count = Integer.parseInt (itemsTable.getValueAt(i, j).toString());
                }
            }
            invoiceHeaders.get(sel).addInvLine(new InvoiceLine(name, price, count));
        }
        modelItems.setRowCount(0);
        modelInvoice.setRowCount(0);
        importToInvoiceTable();
        importToItemsTable(num);
    }
    void importToInvoiceTable(){
        for (int i = 0; i < invoiceHeaders.size(); i++) {
            Object rowData[] = {invoiceHeaders.get(i).getNum(), invoiceHeaders.get(i).getDate(),
                    invoiceHeaders.get(i).getCustomerName(), invoiceHeaders.get(i).getInvTotal()};
            modelInvoice.addRow(rowData);   
        }
    }

    void importToItemsTable(int num){
        sel = -1;
        for (int i = 0; i < invoiceHeaders.size(); i++) {
            if (num == invoiceHeaders.get(i).getNum()){
                sel = i;
                break;
            }
        }
//        System.out.println(sel);
        if (sel != -1){
        invoiceNumLabel.setText(String.valueOf(invoiceHeaders.get(sel).getNum()));
        dateTextField.setText(invoiceHeaders.get(sel).getDate());
        nameTextField.setText(invoiceHeaders.get(sel).getCustomerName());
        invoiceTotalLabel.setText(String.valueOf(invoiceHeaders.get(sel).getInvTotal()));
        for (int i = 0; i < invoiceHeaders.get(sel).getLines().size(); i++) {
            Object rowData[] = {invoiceHeaders.get(sel).getNum(),
                    invoiceHeaders.get(sel).getLines().get(i).getItemName(),
                    invoiceHeaders.get(sel).getLines().get(i).getItemPrice(),
                    invoiceHeaders.get(sel).getLines().get(i).getItemCount()};
            modelItems.addRow(rowData);
            }
        }
        else if (invoiceTable.getValueAt(selectedRow, 1) != null &&
                invoiceTable.getValueAt(selectedRow, 2) != null
                )
        {
            int n = Integer.parseInt(invoiceTable.getValueAt(selectedRow, 0).toString());
            String cust = invoiceTable.getValueAt(selectedRow, 2).toString();
            String d = invoiceTable.getValueAt(selectedRow, 1).toString();
            invoiceHeaders.add(new InvoiceHeader(n, cust, d));
            importToItemsTable(n);
        } else {
            invoiceNumLabel.setText("0");
            dateTextField.setText("");
            nameTextField.setText("");
            invoiceTotalLabel.setText("0");
            modelItems.setRowCount(0);
        }
    }

    void saveHeaderFile(){
        JFileChooser fc = new JFileChooser();
        int result = fc.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION){
            String path = fc.getSelectedFile().getPath();
            File csvFile = new File(path);
            PrintWriter out = null;
            try {
                out = new PrintWriter(csvFile);
                for (InvoiceHeader invoiceHeader : invoiceHeaders) {
                    out.println(String.valueOf(invoiceHeader.getNum())+','+invoiceHeader.getCustomerName()+','+invoiceHeader.getDate());
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                out.close();
            }
        }
    }

    void saveLinesFile(){
        JFileChooser fc = new JFileChooser();
        int result = fc.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION){
            String path = fc.getSelectedFile().getPath();
            File csvFile = new File(path);
            PrintWriter out = null;
            try {
                out = new PrintWriter(csvFile);
                for (InvoiceHeader invoiceHeader : invoiceHeaders) {
                    for (int i = 0; i < invoiceHeader.getLines().size(); i++) {
                        out.println(String.valueOf(invoiceHeader.getNum()) + ',' +
                                invoiceHeader.getLines().get(i).getItemName() + ',' +
                                invoiceHeader.getLines().get(i).getItemPrice() + ',' +
                                String.valueOf(invoiceHeader.getLines().get(i).getItemCount()));
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }finally {
                out.close();
            }
        }
    }

//    @Override
//    public void keyTyped(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//
//    }
}
