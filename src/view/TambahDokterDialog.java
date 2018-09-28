/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import model.Dokter;
import model.RumahSakit;

/**
 *
 * @author jarkom
 */
public class TambahDokterDialog extends JDialog implements ActionListener {

    private JLabel namaLabel;
    private JTextField namaText;
    private JLabel nomorPegawaiLabel;
    private JTextField nomorPegawaiText;
    private JToggleButton tambahButton;
    private JLabel tambahDokterLabel;

    public TambahDokterDialog(JFrame parent, boolean modal) {
        super(parent, modal);
        setSize(350, 300);
        init();
    }

    public void init() {

        tambahDokterLabel = new JLabel("Formulir Penambahan Dokter");
        tambahDokterLabel.setBounds(120, 30, 250, 25);
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 60, 120, 25);
        nomorPegawaiLabel = new JLabel("Nomor Pegawai");
        nomorPegawaiLabel.setBounds(20, 90, 120, 25);

        namaText = new JTextField();
        namaText.setBounds(120, 60, 180, 25);

        nomorPegawaiText = new JTextField();
        nomorPegawaiText.setBounds(120, 90, 180, 25);

        tambahButton = new JToggleButton("TAMBAH");
        tambahButton.setBounds(150, 190, 140, 40);
        tambahButton.addActionListener(this);

        this.add(tambahDokterLabel);
        this.add(namaLabel);
        this.add(namaText);
        this.add(nomorPegawaiLabel);
        this.add(nomorPegawaiText);
        this.add(tambahButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == tambahButton) {
            Dokter dok = new Dokter();
            dok.setNama(namaText.getText());
            dok.setNomorPegawai(nomorPegawaiText.getText());
            FrameUtama.rumahSakit.tambahDokter(dok);
            DokterTableModel dokterModel = new DokterTableModel(FrameUtama.rumahSakit.getDaftarDokter());
            FrameUtama.lihatDokter.setDokterTableModel(dokterModel);
            FrameUtama.lihatDokter.updateTable();
            this.dispose();
        }
    }
}
