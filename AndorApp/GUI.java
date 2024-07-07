/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import javax.swing.JOptionPane;

public class GUI extends JFrame {
    private JMenuBar menuBar;
    private JLabel Wuerfel1K;
    private JLabel Wuerfel2K;
    private JPanel ausgabeBereichHeld;
    private JLabel ausgabeDifferenzH;
    private JLabel ausgabeDifferenzK;
    private JLabel ausgabeKampfwertH;
    private JLabel ausgabeKampfwertK;
    private JLabel ausgabeVerlustH;
    private JLabel ausgabeVerlustK;
    private JLabel ausgabeWinLossH;
    private JLabel ausgabeWinLossK;
    private JLabel ausgabeWuerfelwertH3;
    private JLabel ausgabeWuerfelwertK1;
    private JLabel ausgabeWuerfelwertK2;
    private JLabel ausgabeWuerrfelwertH1;
    private JLabel ausgabeWuerrfelwertH2;
    private JPanel auswahlBereichKampf;
    private JComboBox auswahlTypKreatur;
    private JLabel bBeschreibungHeld;
    private JLabel bDifferenz;
    private JLabel bDifferenzK;
    private JLabel bHeld;
    private JLabel bKampfwertH;
    private JLabel bKampfwertK;
    private JLabel bKreatur;
    private JLabel bNameHeld;
    private JLabel bStaerkeHeld;
    private JLabel bStaerkeKreatur;
    private JLabel bTypKreatur;
    private JLabel bVerlustH;
    private JLabel bVerlustK;
    private JLabel bWilleHeld;
    private JLabel bWilleKreatur;
    private JLabel bWuerfel1H;
    private JLabel bWuerfel2H;
    private JLabel bWuerfel3H;
    private JButton buttonFlucht;
    private JButton buttonKaempfen;
    private JPanel eingabeBereichBeschreibung;
    private JPanel eingabeBereichHeld;
    private JTextArea eingabeBeschreibungHeld;
    private JTextField eingabeNameHeld;
    private JTextField eingabeStaerkeHeld;
    private JTextField eingabeStaerkeKreatur;
    private JTextField eingabeWilleHeld;
    private JTextField eingabeWilleKreatur;
    private JPanel panel12;
    private JPanel panel5;
    private Kampfsimulator kampfsim1;

    //Constructor 
    public GUI(Kampfsimulator kampf){
        kampfsim1 = kampf;

        this.setTitle("GUI");
        this.setSize(1280,720);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);
        
        

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1280,720));
        contentPane.setBackground(new Color(192,192,192));

        Wuerfel1K = new JLabel();
        Wuerfel1K.setBounds(5,29,90,35);
        Wuerfel1K.setBackground(new Color(214,217,223));
        Wuerfel1K.setForeground(new Color(0,0,0));
        Wuerfel1K.setEnabled(true);
        Wuerfel1K.setFont(new Font("SansSerif",0,15));
        Wuerfel1K.setText("Wuerfel 1:");
        Wuerfel1K.setVisible(true);

        Wuerfel2K = new JLabel();
        Wuerfel2K.setBounds(5,68,90,35);
        Wuerfel2K.setBackground(new Color(214,217,223));
        Wuerfel2K.setForeground(new Color(0,0,0));
        Wuerfel2K.setEnabled(true);
        Wuerfel2K.setFont(new Font("SansSerif",0,15));
        Wuerfel2K.setText("Wuerfel 2:");
        Wuerfel2K.setVisible(true);

        ausgabeBereichHeld = new JPanel(null);
        ausgabeBereichHeld.setBorder(BorderFactory.createEtchedBorder(1));
        ausgabeBereichHeld.setBounds(340,49,200,400);
        ausgabeBereichHeld.setBackground(new Color(214,217,223));
        ausgabeBereichHeld.setForeground(new Color(0,0,0));
        ausgabeBereichHeld.setEnabled(true);
        ausgabeBereichHeld.setFont(new Font("sansserif",0,12));
        ausgabeBereichHeld.setVisible(true);

        ausgabeDifferenzH = new JLabel();
        ausgabeDifferenzH.setBounds(97,204,90,35);
        ausgabeDifferenzH.setBackground(new Color(214,217,223));
        ausgabeDifferenzH.setForeground(new Color(0,0,0));
        ausgabeDifferenzH.setEnabled(true);
        ausgabeDifferenzH.setFont(new Font("SansSerif",0,15));
        ausgabeDifferenzH.setText("x");
        ausgabeDifferenzH.setVisible(true);

        ausgabeDifferenzK = new JLabel();
        ausgabeDifferenzK.setBounds(97,202,90,35);
        ausgabeDifferenzK.setBackground(new Color(214,217,223));
        ausgabeDifferenzK.setForeground(new Color(0,0,0));
        ausgabeDifferenzK.setEnabled(true);
        ausgabeDifferenzK.setFont(new Font("SansSerif",0,15));
        ausgabeDifferenzK.setText("x");
        ausgabeDifferenzK.setVisible(true);

        ausgabeKampfwertH = new JLabel();
        ausgabeKampfwertH.setBounds(97,159,90,35);
        ausgabeKampfwertH.setBackground(new Color(214,217,223));
        ausgabeKampfwertH.setForeground(new Color(0,0,0));
        ausgabeKampfwertH.setEnabled(true);
        ausgabeKampfwertH.setFont(new Font("SansSerif",0,15));
        ausgabeKampfwertH.setText("x");
        ausgabeKampfwertH.setVisible(true);

        ausgabeKampfwertK = new JLabel();
        ausgabeKampfwertK.setBounds(97,160,90,35);
        ausgabeKampfwertK.setBackground(new Color(214,217,223));
        ausgabeKampfwertK.setForeground(new Color(0,0,0));
        ausgabeKampfwertK.setEnabled(true);
        ausgabeKampfwertK.setFont(new Font("SansSerif",0,15));
        ausgabeKampfwertK.setText("x");
        ausgabeKampfwertK.setVisible(true);

        ausgabeVerlustH = new JLabel();
        ausgabeVerlustH.setBounds(97,330,90,35);
        ausgabeVerlustH.setBackground(new Color(214,217,223));
        ausgabeVerlustH.setForeground(new Color(0,0,0));
        ausgabeVerlustH.setEnabled(true);
        ausgabeVerlustH.setFont(new Font("SansSerif",0,15));
        ausgabeVerlustH.setText("x");
        ausgabeVerlustH.setVisible(true);

        ausgabeVerlustK = new JLabel();
        ausgabeVerlustK.setBounds(97,334,90,35);
        ausgabeVerlustK.setBackground(new Color(214,217,223));
        ausgabeVerlustK.setForeground(new Color(0,0,0));
        ausgabeVerlustK.setEnabled(true);
        ausgabeVerlustK.setFont(new Font("SansSerif",0,15));
        ausgabeVerlustK.setText("x");
        ausgabeVerlustK.setVisible(true);

        ausgabeWinLossH = new JLabel();
        ausgabeWinLossH.setBounds(12,266,180,35);
        ausgabeWinLossH.setBackground(new Color(214,217,223));
        ausgabeWinLossH.setForeground(new Color(0,0,0));
        ausgabeWinLossH.setEnabled(true);
        ausgabeWinLossH.setFont(new Font("SansSerif",0,20));
        ausgabeWinLossH.setText("Gewonnen/Verloren");
        ausgabeWinLossH.setVisible(true);

        ausgabeWinLossK = new JLabel();
        ausgabeWinLossK.setBounds(12,266,180,35);
        ausgabeWinLossK.setBackground(new Color(214,217,223));
        ausgabeWinLossK.setForeground(new Color(0,0,0));
        ausgabeWinLossK.setEnabled(true);
        ausgabeWinLossK.setFont(new Font("SansSerif",0,20));
        ausgabeWinLossK.setText("Gewonnen/Verloren");
        ausgabeWinLossK.setVisible(true);

        ausgabeWuerfelwertH3 = new JLabel();
        ausgabeWuerfelwertH3.setBounds(97,105,90,35);
        ausgabeWuerfelwertH3.setBackground(new Color(214,217,223));
        ausgabeWuerfelwertH3.setForeground(new Color(0,0,0));
        ausgabeWuerfelwertH3.setEnabled(true);
        ausgabeWuerfelwertH3.setFont(new Font("SansSerif",0,15));
        ausgabeWuerfelwertH3.setText("x");
        ausgabeWuerfelwertH3.setVisible(true);

        ausgabeWuerfelwertK1 = new JLabel();
        ausgabeWuerfelwertK1.setBounds(97,28,90,35);
        ausgabeWuerfelwertK1.setBackground(new Color(214,217,223));
        ausgabeWuerfelwertK1.setForeground(new Color(0,0,0));
        ausgabeWuerfelwertK1.setEnabled(true);
        ausgabeWuerfelwertK1.setFont(new Font("SansSerif",0,15));
        ausgabeWuerfelwertK1.setText("x");
        ausgabeWuerfelwertK1.setVisible(true);

        ausgabeWuerfelwertK2 = new JLabel();
        ausgabeWuerfelwertK2.setBounds(97,67,90,35);
        ausgabeWuerfelwertK2.setBackground(new Color(214,217,223));
        ausgabeWuerfelwertK2.setForeground(new Color(0,0,0));
        ausgabeWuerfelwertK2.setEnabled(true);
        ausgabeWuerfelwertK2.setFont(new Font("SansSerif",0,15));
        ausgabeWuerfelwertK2.setText("x");
        ausgabeWuerfelwertK2.setVisible(true);

        ausgabeWuerrfelwertH1 = new JLabel();
        ausgabeWuerrfelwertH1.setBounds(97,28,90,35);
        ausgabeWuerrfelwertH1.setBackground(new Color(214,217,223));
        ausgabeWuerrfelwertH1.setForeground(new Color(0,0,0));
        ausgabeWuerrfelwertH1.setEnabled(true);
        ausgabeWuerrfelwertH1.setFont(new Font("SansSerif",0,15));
        ausgabeWuerrfelwertH1.setText("x");
        ausgabeWuerrfelwertH1.setVisible(true);

        ausgabeWuerrfelwertH2 = new JLabel();
        ausgabeWuerrfelwertH2.setBounds(97,67,90,35);
        ausgabeWuerrfelwertH2.setBackground(new Color(214,217,223));
        ausgabeWuerrfelwertH2.setForeground(new Color(0,0,0));
        ausgabeWuerrfelwertH2.setEnabled(true);
        ausgabeWuerrfelwertH2.setFont(new Font("SansSerif",0,15));
        ausgabeWuerrfelwertH2.setText("x");
        ausgabeWuerrfelwertH2.setVisible(true);

        auswahlBereichKampf = new JPanel(null);
        auswahlBereichKampf.setBorder(BorderFactory.createEtchedBorder(1));
        auswahlBereichKampf.setBounds(500,485,278,180);
        auswahlBereichKampf.setBackground(new Color(214,217,223));
        auswahlBereichKampf.setForeground(new Color(0,0,0));
        auswahlBereichKampf.setEnabled(true);
        auswahlBereichKampf.setFont(new Font("sansserif",0,12));
        auswahlBereichKampf.setVisible(true);

        auswahlTypKreatur = new JComboBox();
        auswahlTypKreatur.setBounds(65,109,150,50);
        auswahlTypKreatur.setBackground(new Color(214,217,223));
        auswahlTypKreatur.setForeground(new Color(0,0,0));
        auswahlTypKreatur.setEnabled(true);
        auswahlTypKreatur.setFont(new Font("sansserif",0,12));
        auswahlTypKreatur.setVisible(true);
        //Set action for button click
        //Call defined method
        auswahlTypKreatur.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    selectTypKreatur(evt);
                }
            });

        bBeschreibungHeld = new JLabel();
        bBeschreibungHeld.setBounds(5,5,300,35);
        bBeschreibungHeld.setBackground(new Color(214,217,223));
        bBeschreibungHeld.setForeground(new Color(0,0,0));
        bBeschreibungHeld.setEnabled(true);
        bBeschreibungHeld.setFont(new Font("SansSerif",0,15));
        bBeschreibungHeld.setText("Beschreibung des Helden");
        bBeschreibungHeld.setVisible(true);

        bDifferenz = new JLabel();
        bDifferenz.setBounds(5,205,90,35);
        bDifferenz.setBackground(new Color(214,217,223));
        bDifferenz.setForeground(new Color(0,0,0));
        bDifferenz.setEnabled(true);
        bDifferenz.setFont(new Font("SansSerif",0,15));
        bDifferenz.setText("Differenz:");
        bDifferenz.setVisible(true);

        bDifferenzK = new JLabel();
        bDifferenzK.setBounds(5,205,90,35);
        bDifferenzK.setBackground(new Color(214,217,223));
        bDifferenzK.setForeground(new Color(0,0,0));
        bDifferenzK.setEnabled(true);
        bDifferenzK.setFont(new Font("SansSerif",0,15));
        bDifferenzK.setText("Differenz:");
        bDifferenzK.setVisible(true);

        bHeld = new JLabel();
        bHeld.setBounds(115,20,45,35);
        bHeld.setBackground(new Color(214,217,223));
        bHeld.setForeground(new Color(0,0,0));
        bHeld.setEnabled(true);
        bHeld.setFont(new Font("SansSerif",0,20));
        bHeld.setText("Held");
        bHeld.setVisible(true);

        bKampfwertH = new JLabel();
        bKampfwertH.setBounds(5,160,90,35);
        bKampfwertH.setBackground(new Color(214,217,223));
        bKampfwertH.setForeground(new Color(0,0,0));
        bKampfwertH.setEnabled(true);
        bKampfwertH.setFont(new Font("SansSerif",0,15));
        bKampfwertH.setText("Kampfwert:");
        bKampfwertH.setVisible(true);

        bKampfwertK = new JLabel();
        bKampfwertK.setBounds(5,160,90,35);
        bKampfwertK.setBackground(new Color(214,217,223));
        bKampfwertK.setForeground(new Color(0,0,0));
        bKampfwertK.setEnabled(true);
        bKampfwertK.setFont(new Font("SansSerif",0,15));
        bKampfwertK.setText("Kampfwert:");
        bKampfwertK.setVisible(true);

        bKreatur = new JLabel();
        bKreatur.setBounds(100,20,75,35);
        bKreatur.setBackground(new Color(214,217,223));
        bKreatur.setForeground(new Color(0,0,0));
        bKreatur.setEnabled(true);
        bKreatur.setFont(new Font("SansSerif",0,20));
        bKreatur.setText("Kreatur");
        bKreatur.setVisible(true);

        bNameHeld = new JLabel();
        bNameHeld.setBounds(117,70,40,35);
        bNameHeld.setBackground(new Color(214,217,223));
        bNameHeld.setForeground(new Color(0,0,0));
        bNameHeld.setEnabled(true);
        bNameHeld.setFont(new Font("SansSerif",0,15));
        bNameHeld.setText("Name");
        bNameHeld.setVisible(true);

        bStaerkeHeld = new JLabel();
        bStaerkeHeld.setBounds(92,258,100,35);
        bStaerkeHeld.setBackground(new Color(214,217,223));
        bStaerkeHeld.setForeground(new Color(0,0,0));
        bStaerkeHeld.setEnabled(true);
        bStaerkeHeld.setFont(new Font("SansSerif",0,15));
        bStaerkeHeld.setText("Staerkepunkte");
        bStaerkeHeld.setVisible(true);

        bStaerkeKreatur = new JLabel();
        bStaerkeKreatur.setBounds(92,258,100,35);
        bStaerkeKreatur.setBackground(new Color(214,217,223));
        bStaerkeKreatur.setForeground(new Color(0,0,0));
        bStaerkeKreatur.setEnabled(true);
        bStaerkeKreatur.setFont(new Font("SansSerif",0,15));
        bStaerkeKreatur.setText("Staerkepunkte");
        bStaerkeKreatur.setVisible(true);

        bTypKreatur = new JLabel();
        bTypKreatur.setBounds(120,77,30,35);
        bTypKreatur.setBackground(new Color(214,217,223));
        bTypKreatur.setForeground(new Color(0,0,0));
        bTypKreatur.setEnabled(true);
        bTypKreatur.setFont(new Font("SansSerif",0,15));
        bTypKreatur.setText("Typ");
        bTypKreatur.setVisible(true);

        bVerlustH = new JLabel();
        bVerlustH.setBounds(5,331,90,35);
        bVerlustH.setBackground(new Color(214,217,223));
        bVerlustH.setForeground(new Color(0,0,0));
        bVerlustH.setEnabled(true);
        bVerlustH.setFont(new Font("SansSerif",0,15));
        bVerlustH.setText("Verlust:");
        bVerlustH.setVisible(true);

        bVerlustK = new JLabel();
        bVerlustK.setBounds(5,331,90,35);
        bVerlustK.setBackground(new Color(214,217,223));
        bVerlustK.setForeground(new Color(0,0,0));
        bVerlustK.setEnabled(true);
        bVerlustK.setFont(new Font("SansSerif",0,15));
        bVerlustK.setText("Verlust:");
        bVerlustK.setVisible(true);

        bWilleHeld = new JLabel();
        bWilleHeld.setBounds(94,161,150,50);
        bWilleHeld.setBackground(new Color(214,217,223));
        bWilleHeld.setForeground(new Color(0,0,0));
        bWilleHeld.setEnabled(true);
        bWilleHeld.setFont(new Font("SansSerif",0,15));
        bWilleHeld.setText("Willenspunkte");
        bWilleHeld.setVisible(true);

        bWilleKreatur = new JLabel();
        bWilleKreatur.setBounds(94,161,150,50);
        bWilleKreatur.setBackground(new Color(214,217,223));
        bWilleKreatur.setForeground(new Color(0,0,0));
        bWilleKreatur.setEnabled(true);
        bWilleKreatur.setFont(new Font("SansSerif",0,15));
        bWilleKreatur.setText("Willenspunkte");
        bWilleKreatur.setVisible(true);

        bWuerfel1H = new JLabel();
        bWuerfel1H.setBounds(5,29,90,35);
        bWuerfel1H.setBackground(new Color(214,217,223));
        bWuerfel1H.setForeground(new Color(0,0,0));
        bWuerfel1H.setEnabled(true);
        bWuerfel1H.setFont(new Font("SansSerif",0,15));
        bWuerfel1H.setText("Wuerfel 1:");
        bWuerfel1H.setVisible(true);

        bWuerfel2H = new JLabel();
        bWuerfel2H.setBounds(5,68,90,35);
        bWuerfel2H.setBackground(new Color(214,217,223));
        bWuerfel2H.setForeground(new Color(0,0,0));
        bWuerfel2H.setEnabled(true);
        bWuerfel2H.setFont(new Font("SansSerif",0,15));
        bWuerfel2H.setText("Wuerfel 2:");
        bWuerfel2H.setVisible(true);

        bWuerfel3H = new JLabel();
        bWuerfel3H.setBounds(5,106,90,35);
        bWuerfel3H.setBackground(new Color(214,217,223));
        bWuerfel3H.setForeground(new Color(0,0,0));
        bWuerfel3H.setEnabled(true);
        bWuerfel3H.setFont(new Font("SansSerif",0,15));
        bWuerfel3H.setText("Wuerfel 3:");
        bWuerfel3H.setVisible(true);

        buttonFlucht = new JButton();
        buttonFlucht.setBounds(89,100,90,35);
        buttonFlucht.setBackground(new Color(214,217,223));
        buttonFlucht.setForeground(new Color(0,0,0));
        buttonFlucht.setEnabled(true);
        buttonFlucht.setFont(new Font("sansserif",0,12));
        buttonFlucht.setText("Fluechten");
        buttonFlucht.setVisible(true);
        //Set action for button click
        //Call defined method
        buttonFlucht.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    fluechten(evt);
                }
            });

        buttonKaempfen = new JButton();
        buttonKaempfen.setBounds(59,20,150,50);
        buttonKaempfen.setBackground(new Color(214,217,223));
        buttonKaempfen.setForeground(new Color(0,0,0));
        buttonKaempfen.setEnabled(true);
        buttonKaempfen.setFont(new Font("SansSerif",0,15));
        buttonKaempfen.setText("Kaempfen");
        buttonKaempfen.setVisible(true);
        //Set action for button click
        //Call defined method
        buttonKaempfen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    wuerfeln(evt);
                }
            });

        eingabeBereichBeschreibung = new JPanel(null);
        eingabeBereichBeschreibung.setBorder(BorderFactory.createEtchedBorder(1));
        eingabeBereichBeschreibung.setBounds(23,485,400,200);
        eingabeBereichBeschreibung.setBackground(new Color(214,217,223));
        eingabeBereichBeschreibung.setForeground(new Color(0,0,0));
        eingabeBereichBeschreibung.setEnabled(true);
        eingabeBereichBeschreibung.setFont(new Font("sansserif",0,12));
        eingabeBereichBeschreibung.setVisible(true);

        eingabeBereichHeld = new JPanel(null);
        eingabeBereichHeld.setBorder(BorderFactory.createEtchedBorder(1));
        eingabeBereichHeld.setBounds(22,49,285,400);
        eingabeBereichHeld.setBackground(new Color(214,217,223));
        eingabeBereichHeld.setForeground(new Color(0,0,0));
        eingabeBereichHeld.setEnabled(true);
        eingabeBereichHeld.setFont(new Font("sansserif",0,12));
        eingabeBereichHeld.setVisible(true);

        eingabeBeschreibungHeld = new JTextArea();
        eingabeBeschreibungHeld.setBounds(5,47,345,148);
        eingabeBeschreibungHeld.setBackground(new Color(255,255,255));
        eingabeBeschreibungHeld.setForeground(new Color(0,0,0));
        eingabeBeschreibungHeld.setEnabled(true);
        eingabeBeschreibungHeld.setFont(new Font("sansserif",0,12));
        eingabeBeschreibungHeld.setText("");
        eingabeBeschreibungHeld.setBorder(BorderFactory.createBevelBorder(1));
        eingabeBeschreibungHeld.setVisible(true);

        eingabeNameHeld = new JTextField();
        eingabeNameHeld.setBounds(65,109,150,50);
        eingabeNameHeld.setBackground(new Color(255,255,255));
        eingabeNameHeld.setForeground(new Color(0,0,0));
        eingabeNameHeld.setEnabled(true);
        eingabeNameHeld.setFont(new Font("sansserif",0,12));
        eingabeNameHeld.setText("");
        eingabeNameHeld.setVisible(true);
        //Set action for button click
        //Call defined method
        eingabeNameHeld.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    setNameHeld(evt);
                }
            });

        eingabeStaerkeHeld = new JTextField();
        eingabeStaerkeHeld.setBounds(65,294,150,50);
        eingabeStaerkeHeld.setBackground(new Color(255,255,255));
        eingabeStaerkeHeld.setForeground(new Color(0,0,0));
        eingabeStaerkeHeld.setEnabled(true);
        eingabeStaerkeHeld.setFont(new Font("SansSerif",0,15));
        eingabeStaerkeHeld.setText("");
        eingabeStaerkeHeld.setVisible(true);
        //Set action for button click
        //Call defined method
        eingabeStaerkeHeld.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    setStaerkeHeld(evt);
                }
            });

        eingabeStaerkeKreatur = new JTextField();
        eingabeStaerkeKreatur.setBounds(65,294,150,50);
        eingabeStaerkeKreatur.setBackground(new Color(255,255,255));
        eingabeStaerkeKreatur.setForeground(new Color(0,0,0));
        eingabeStaerkeKreatur.setEnabled(true);
        eingabeStaerkeKreatur.setFont(new Font("SansSerif",0,12));
        eingabeStaerkeKreatur.setText("");
        eingabeStaerkeKreatur.setVisible(true);
        //Set action for button click
        //Call defined method
        eingabeStaerkeKreatur.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    setStaerkeKreatur(evt);
                }
            });

        eingabeWilleHeld = new JTextField();
        eingabeWilleHeld.setBounds(65,204,150,50);
        eingabeWilleHeld.setBackground(new Color(255,255,255));
        eingabeWilleHeld.setForeground(new Color(0,0,0));
        eingabeWilleHeld.setEnabled(true);
        eingabeWilleHeld.setFont(new Font("sansserif",0,12));
        eingabeWilleHeld.setText("");
        eingabeWilleHeld.setVisible(true);
        //Set action for button click
        //Call defined method
        eingabeWilleHeld.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    setWilleHeld(evt);
                }
            });

        eingabeWilleKreatur = new JTextField();
        eingabeWilleKreatur.setBounds(65,204,150,50);
        eingabeWilleKreatur.setBackground(new Color(255,255,255));
        eingabeWilleKreatur.setForeground(new Color(0,0,0));
        eingabeWilleKreatur.setEnabled(true);
        eingabeWilleKreatur.setFont(new Font("SansSerif",0,12));
        eingabeWilleKreatur.setText("");
        eingabeWilleKreatur.setVisible(true);
        //Set action for button click
        //Call defined method
        eingabeWilleKreatur.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    setWilleKreatur(evt);
                }
            });

        panel12 = new JPanel(null);
        panel12.setBorder(BorderFactory.createEtchedBorder(1));
        panel12.setBounds(735,49,200,400);
        panel12.setBackground(new Color(214,217,223));
        panel12.setForeground(new Color(0,0,0));
        panel12.setEnabled(true);
        panel12.setFont(new Font("sansserif",0,12));
        panel12.setVisible(true);

        panel5 = new JPanel(null);
        panel5.setBorder(BorderFactory.createEtchedBorder(1));
        panel5.setBounds(969,49,285,400);
        panel5.setBackground(new Color(214,217,223));
        panel5.setForeground(new Color(0,0,0));
        panel5.setEnabled(true);
        panel5.setFont(new Font("sansserif",0,12));
        panel5.setVisible(true);

        //adding components to contentPane panel
        panel12.add(Wuerfel1K);
        panel12.add(Wuerfel2K);
        contentPane.add(ausgabeBereichHeld);
        ausgabeBereichHeld.add(ausgabeDifferenzH);
        panel12.add(ausgabeDifferenzK);
        ausgabeBereichHeld.add(ausgabeKampfwertH);
        panel12.add(ausgabeKampfwertK);
        ausgabeBereichHeld.add(ausgabeVerlustH);
        panel12.add(ausgabeVerlustK);
        ausgabeBereichHeld.add(ausgabeWinLossH);
        panel12.add(ausgabeWinLossK);
        ausgabeBereichHeld.add(ausgabeWuerfelwertH3);
        panel12.add(ausgabeWuerfelwertK1);
        panel12.add(ausgabeWuerfelwertK2);
        ausgabeBereichHeld.add(ausgabeWuerrfelwertH1);
        ausgabeBereichHeld.add(ausgabeWuerrfelwertH2);
        contentPane.add(auswahlBereichKampf);
        panel5.add(auswahlTypKreatur);
        eingabeBereichBeschreibung.add(bBeschreibungHeld);
        ausgabeBereichHeld.add(bDifferenz);
        panel12.add(bDifferenzK);
        eingabeBereichHeld.add(bHeld);
        ausgabeBereichHeld.add(bKampfwertH);
        panel12.add(bKampfwertK);
        panel5.add(bKreatur);
        eingabeBereichHeld.add(bNameHeld);
        eingabeBereichHeld.add(bStaerkeHeld);
        panel5.add(bStaerkeKreatur);
        panel5.add(bTypKreatur);
        ausgabeBereichHeld.add(bVerlustH);
        panel12.add(bVerlustK);
        eingabeBereichHeld.add(bWilleHeld);
        panel5.add(bWilleKreatur);
        ausgabeBereichHeld.add(bWuerfel1H);
        ausgabeBereichHeld.add(bWuerfel2H);
        ausgabeBereichHeld.add(bWuerfel3H);
        auswahlBereichKampf.add(buttonFlucht);
        auswahlBereichKampf.add(buttonKaempfen);
        contentPane.add(eingabeBereichBeschreibung);
        contentPane.add(eingabeBereichHeld);
        eingabeBereichBeschreibung.add(eingabeBeschreibungHeld);
        eingabeBereichHeld.add(eingabeNameHeld);
        eingabeBereichHeld.add(eingabeStaerkeHeld);
        panel5.add(eingabeStaerkeKreatur);
        eingabeBereichHeld.add(eingabeWilleHeld);
        panel5.add(eingabeWilleKreatur);
        contentPane.add(panel12);
        contentPane.add(panel5);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        
        eingabeWilleKreatur.setText("" + kampfsim1.getKreatur().getWillenspunkte());
        eingabeWilleHeld.setText("" + kampfsim1.getHeld().getWillenspunkte());

        eingabeStaerkeKreatur.setText("" + kampfsim1.getKreatur().getStaerkepunkte());
        eingabeStaerkeHeld.setText("" + kampfsim1.getHeld().getStaerkepunkte());
    }

    //Method actionPerformed for auswahlTypKreatur
    private void selectTypKreatur (ActionEvent evt) {
        JComboBox<String> auswahlKreaturTyp = (JComboBox<String>) evt.getSource();
        String typen = (String) auswahlKreaturTyp.getSelectedItem();
    }

    //Method actionPerformed for buttonFlucht
    private void fluechten (ActionEvent evt) {
        kampfsim1.fluechten();
        ausgabeWinLossK.setText("Gewonnen");
        ausgabeWinLossH.setText("Verloren");
        
        eingabeWilleHeld.setText("0");

        eingabeStaerkeHeld.setText("0");
        
    }

    //Method actionPerformed for buttonKaempfen
    private void wuerfeln (ActionEvent evt) {
        kampfsim1.getHeld().kampfwertBerechnen();
        kampfsim1.getKreatur().kampfwertBerechnen();
        kampfsim1.kaempfen();
        kampfsim1.getHeld().ausgleichen();
        kampfsim1.getKreatur().ausgleichen();
        ausgabeDifferenzH.setText("" + kampfsim1.getDifferenzHeld());
        ausgabeDifferenzK.setText("" + kampfsim1.getDifferenzKreatur());
        ausgabeVerlustH.setText("" + kampfsim1.getDifferenzHeld());
        ausgabeVerlustK.setText("" + kampfsim1.getDifferenzKreatur());
        ausgabeKampfwertH.setText("" + kampfsim1.getHeld().getKampfwert());
        ausgabeKampfwertK.setText("" + kampfsim1.getKreatur().getKampfwert());

        eingabeWilleKreatur.setText("" + kampfsim1.getKreatur().getWillenspunkte());
        eingabeWilleHeld.setText("" + kampfsim1.getHeld().getWillenspunkte());

        eingabeStaerkeKreatur.setText("" + kampfsim1.getKreatur().getStaerkepunkte());
        eingabeStaerkeHeld.setText("" + kampfsim1.getHeld().getStaerkepunkte());

            
        if(kampfsim1.getSieger() == 1) {   
            ausgabeWinLossK.setText("Gewonnen");
            ausgabeWinLossH.setText("Verloren");
        } 
        else {
            ausgabeWinLossK.setText("Verloren");
            ausgabeWinLossH.setText("Gewonnen");
        }

        ausgabeWuerrfelwertH1.setText("" + kampfsim1.getHeld().getWuerfel1H());
        ausgabeWuerrfelwertH2.setText("" + kampfsim1.getHeld().getWuerfel2H());
        ausgabeWuerfelwertH3.setText("" + kampfsim1.getHeld().getWuerfel3H());
        ausgabeWuerfelwertK1.setText("" + kampfsim1.getKreatur().getWuerfel1K());
        ausgabeWuerfelwertK2.setText("" + kampfsim1.getKreatur().getWuerfel2K());
        
        kampfsim1.ausgleichen();
        
        eingabeWilleKreatur.setText("" + kampfsim1.getKreatur().getWillenspunkte());
        eingabeWilleHeld.setText("" + kampfsim1.getHeld().getWillenspunkte());

        eingabeStaerkeKreatur.setText("" + kampfsim1.getKreatur().getStaerkepunkte());
        eingabeStaerkeHeld.setText("" + kampfsim1.getHeld().getStaerkepunkte());

    }

    //Method actionPerformed for eingabeBeschreibungHeld
    private void setBeschreibungHeld (ActionEvent evt) {
        //TODO
    }

    //Method actionPerformed for eingabeNameHeld
    private void setNameHeld (ActionEvent evt) {
        kampfsim1.getHeld().setName(""); 
    }

    //Method actionPerformed for eingabeStaerkeHeld
    private void setStaerkeHeld (ActionEvent evt) {
        int number;

        String staerke = eingabeStaerkeHeld.getText();
        try{
            number = Integer.parseInt(staerke);

        }
        catch (NumberFormatException ex){
            number = 0;
        }

        kampfsim1.getHeld().setStaerkepunkte(number);
        eingabeStaerkeHeld.setText("" + kampfsim1.getHeld().getStaerkepunkte());

    }

    //Method actionPerformed for eingabeStaerkeHeld
    private void setStaerkeKreatur (ActionEvent evt) {
        int number;

        String staerke = eingabeStaerkeKreatur.getText();
        try{
            number = Integer.parseInt(staerke);

        }
        catch (NumberFormatException ex){
            number = 0;
        }

        kampfsim1.getKreatur().setStaerkepunkte(number);
        eingabeStaerkeKreatur.setText("" + kampfsim1.getKreatur().getStaerkepunkte());
    }

    //Method actionPerformed for eingabeWilleHeld
    private void setWilleHeld (ActionEvent evt) {
        int number;

        String wille = eingabeWilleHeld.getText();
        try{
            number = Integer.parseInt(wille);

        }
        catch (NumberFormatException ex){
            number = 0;
        }

        kampfsim1.getHeld().setWillenspunkte(number);
        eingabeWilleHeld.setText("" + kampfsim1.getHeld().getWillenspunkte());
    }

    //Method actionPerformed for eingabeWilleKreatur
    private void setWilleKreatur (ActionEvent evt) {
        int number;

        String wille = eingabeWilleKreatur.getText();
        try{
            number = Integer.parseInt(wille);

        }
        catch (NumberFormatException ex){
            number = 0;
        }

        kampfsim1.getKreatur().setWillenspunkte(number);
        eingabeWilleKreatur.setText("" + kampfsim1.getKreatur().getWillenspunkte());
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");

        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }


    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {

                }
            });
    }

}