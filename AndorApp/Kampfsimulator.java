/**
 * Beschreiben Sie hier die Klasse Kampfsimulator.
 * 
 * @author DAP & HAI
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Kampfsimulator
{
    private int sieger; //0 = Held, 1 = Kreatur, 2 = aufgeben sieger =/= verlierer
    private int verlierer; //0 = Held, 1 = Kreatur, 2 = aufgeben sieger =/= verlierer
    private int differenz;
    private int aufgeben; //aufgeben == 1 = True else false
    //private String held; *GELÖSCHT*
    //private String kreatur; *GELÖSCHT*
    private Held held1;
    private Kreatur kreatur1;
    public GUI gui;
    private int differenzHeld;
    private int differenzKreatur;
    private Popup popup; //Speichert eine Popup-Klasse um die Verwendung von Static zu vermeiden
    private int YNval;
    //private int neuesLebenK; *GELÖSCHT*
    //private int neuesLebenH; *GELÖSCHT*
    //private String unentschieden; *GELÖSCHT*
    
    public Kampfsimulator()
    {
        held1 = new Held();
        kreatur1 = new Kreatur("Skral", 6, 6);
        gui = new GUI(this);
        popup = new Popup();

    }
    
    

    public int getDifferenzHeld()
    {
        return differenzHeld;
    }

    public int getDifferenzKreatur()
    {
        return differenzKreatur;
    }

    public Held getHeld()
    {
        return held1;
    }

    public Kreatur getKreatur()
    {
        return kreatur1;
    }

    public void kaempfen()
    {

        held1.kampfwertBerechnen();
        kreatur1.kampfwertBerechnen(); 

        if(kreatur1.getKampfwert() == held1.getKampfwert() )
        {
            unentschieden();
        }
        if (kreatur1.getKampfwert() > held1.getKampfwert() )
        {
            differenzHeld = held1.getKampfwert() - kreatur1.getKampfwert();
            differenzKreatur = kreatur1.getKampfwert() - held1.getKampfwert();
            //neuesLebenH = held1.getWillenspunkte() - differenzKreatur; *GELÖSCH*
            held1.setDifferenz(differenzHeld);
            sieger = 1;
            verlierer = 0;
        }
        else
        {
            differenzKreatur = kreatur1.getKampfwert() - held1.getKampfwert();
            differenzHeld = held1.getKampfwert() - kreatur1.getKampfwert();
            //neuesLebenK = kreatur1.getWillenspunkte() - differenzHeld; *GELÖSCHT*
            kreatur1.setDifferenz(differenzKreatur);
            sieger = 0;
            verlierer = 1;
        }

    }
    
    public void ausgleichen()
    {
        if(held1.getWillenspunkte() <= 0)
        {
            popup.Eingabe();
            //popup.Benachrichtigung();
            YNval = popup.getOption();
            if(YNval == 0)
            {
                System.exit(0);
            }
            else
            {
                held1.neustart();
                kreatur1.neustart();
            }
        }
    }
    
    public void neustart()
    {
           
    }

    public void unentschieden()
    {
        kaempfen();
    }

    public void fluechten()
    {
        sieger = 1;
        verlierer = 0;
    }

    public int getSieger()
    {
        return sieger;
    }

    public int getVerlierer()
    {
        return verlierer;
    }
}