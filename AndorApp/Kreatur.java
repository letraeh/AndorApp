
/**
 * Beschreiben Sie hier die Klasse Held.
 * 
 * @author DAP & HAI 
 * @version 20210324
 */

import java.util.ArrayList;

public class Kreatur
{
    // Variablen
    private String typ;
    private int staerkepunkte;
    private int willenspunkte;
    private Wuerfel wuerfel1K;
    private Wuerfel wuerfel2K;
    private int kampfwert;
    private int differenz;

    public Kreatur(String typKreatur, int staerkeKreatur, int willeKreatur) //Konstruktor String typKreatur, int staerkeKreatur, int willeKreatur
    {
        typ = "Skral";
        staerkepunkte = 2;
        willenspunkte = 4;
        wuerfel1K = new Wuerfel();
        wuerfel2K = new Wuerfel();
        

    }

    public void kampfwertBerechnen() //Errechnet den Kampfwert
    {

        wuerfel1K.wuerfeln();
        wuerfel2K.wuerfeln();

        if(wuerfel1K.getWuerfelwert() == wuerfel2K.getWuerfelwert()) //Checkt ob Wuerfel1 gleich Wuerfel2 ist
        {
            kampfwert = wuerfel1K.getWuerfelwert() + wuerfel2K.getWuerfelwert() + staerkepunkte; 
        }
        else
        {
            if((wuerfel1K.getWuerfelwert() > wuerfel2K.getWuerfelwert()))
            {
                kampfwert = wuerfel1K.getWuerfelwert() + staerkepunkte;
            }
            if((wuerfel1K.getWuerfelwert() < wuerfel2K.getWuerfelwert()))
            {
                kampfwert = wuerfel2K.getWuerfelwert() + staerkepunkte;
            }
        }
    }

    public void ausgleichen()
    {
        //if(willenspunkte == 0 && staerkepunkte == 0)
        //{

        //}
        willenspunkte = willenspunkte + differenz;
        if(willenspunkte <= 0)
        {
            while(willenspunkte <= 0)
            {
                while(staerkepunkte > 0)
                {
                    staerkepunkte = staerkepunkte - 1;
                    willenspunkte = willenspunkte + 3;
                }
                break;
            }
        }
    }
    
    public void neustart()
    {
        staerkepunkte = 6;
        willenspunkte = 6;
    }

    public void setTyp(String typKreatur) //Legt den Typ fest
    {
        typ = typKreatur;
    }

    public void setStaerkepunkte(int staerkeKreatur) //Legt die Stärkepunkte fest
    {
        staerkepunkte = staerkeKreatur;
    }

    public void setWillenspunkte(int willeHeld) //Legt die Willenspunkte fest
    {
        willenspunkte = willeHeld;
    }

    public void setDifferenz(int neueDifferenz)
    {
        differenz = neueDifferenz;
    }

    public int getKampfwert() //Gibt den Kampfwert aus
    {
        return kampfwert;
    }

    public String getTyp() //Gibt deie Typen aus?
    {
        return typ;
    }

    public int getWillenspunkte() //Gibt die Willenspunkte aus
    {
        return willenspunkte;
    }

    public int getStaerkepunkte() //Gibt die Staerkepunkte aus
    {
        return staerkepunkte;
    }

    public int getWuerfel1K()
    {
        return wuerfel1K.getWuerfelwert();
    }

    public int getWuerfel2K()
    {
        return wuerfel2K.getWuerfelwert();
    }

    public void gameOver()
    {
        if(willenspunkte <= 0)
        {
            staerkepunkte = staerkepunkte - 1;
            willenspunkte = willenspunkte +3;
        }
    }

}

