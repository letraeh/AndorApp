
/**
 * Beschreiben Sie hier die Klasse Held.
 * 
 * @author DAP & HAI 
 * @version 20210324
 */
public class Held
{
    // Variablen
    private String name;
    private int staerkepunkte;
    private int willenspunkte;
    private Wuerfel wuerfel1H;
    private Wuerfel wuerfel2H;
    private Wuerfel wuerfel3H;
    private int kampfwert;
    private int differenz; 

    public Held() //Konstruktor String nameHeld, int staerkeHeld, int willeHeld
    {
        //name = nameHeld;
        staerkepunkte = 2;
        willenspunkte = 7;
        wuerfel1H = new Wuerfel();
        wuerfel2H = new Wuerfel();
        wuerfel3H = new Wuerfel();
    }

    public void kampfwertBerechnen() //Errechnet den Kampfwert
    {

        wuerfel1H.wuerfeln();
        wuerfel2H.wuerfeln();
        wuerfel3H.wuerfeln();

        if(wuerfel1H.getWuerfelwert() >= wuerfel2H.getWuerfelwert()) //Checkt ob Wuerfel1 größer oder gleich Wuerfel2 ist
        {
            if(wuerfel1H.getWuerfelwert() >= wuerfel3H.getWuerfelwert()) //Wenn Wuerfel1 größer oder gleich als Wuerfel2 & Wuerfel3 ist, ist Wuerfel1 im Kampfwert verrechnet
            {
                kampfwert = wuerfel1H.getWuerfelwert() + staerkepunkte;
            }
            else //Wenn Wuerfel1 kleiner als Wuerfel3 ist, wird Wuerfel3 im Kampfwer verrechnet
            {
                kampfwert = wuerfel3H.getWuerfelwert() + staerkepunkte; 
            }
        }
        else //Wuerfel1 ist kleiner als Wuerfel2
        {
            if(wuerfel2H.getWuerfelwert() >= wuerfel3H.getWuerfelwert()) //Wenn Wuerfel2 größer als Wuerfel3 ist, wird Wuerfel2 im Kampfwert verrechnet
            {
                kampfwert = wuerfel2H.getWuerfelwert() + staerkepunkte;
            }
            else //Wenn Wuerfel2 kleiner als Wuerfel3 ist, wird Wuerfel3 im Kampfwert verrechnet
            {
                kampfwert = wuerfel3H.getWuerfelwert() + staerkepunkte; 
            }
        }
    }

    public void ausgleichen()
    {
        /*
        if(willenspunkte <= 0 && staerkepunkte == 0)
        {

        }
         */
        willenspunkte = willenspunkte + differenz;

        while(willenspunkte <= 0)
        {

            if(willenspunkte >= -3)
            {
                staerkepunkte = staerkepunkte - 1;
                willenspunkte = willenspunkte + 3;
            }
            else
            {
                while(staerkepunkte > 0)
                {
                 
                    staerkepunkte = staerkepunkte - 1;
                    willenspunkte = willenspunkte + 3;
                        
                   
               
                }      
            }
            break;
        }

    }
    
    public void neustart()
    {
        staerkepunkte = 2;
        willenspunkte = 7;
    }

    public void gameOver()
    {
        setStaerkepunkte(0);
        setWillenspunkte(0);
    }

    public void setName(String nameHeld) //Legt den Namen fest
    {
        name = nameHeld;
    }

    public void setStaerkepunkte(int staerkeHeld) //Legt die Stärkepunkte fest
    {
        staerkepunkte = staerkeHeld;
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

    public String getName() //Gibt den Namen aus
    {
        return name;
    }

    public int getWillenspunkte() //Gibt die Willenspunkte aus
    {
        return willenspunkte;
    }

    public int getStaerkepunkte() //Gibt die Staerkepunkte aus
    {
        return staerkepunkte;
    }

    public int getWuerfel1H()
    {
        return wuerfel1H.getWuerfelwert();
    }

    public int getWuerfel2H()
    {
        return wuerfel2H.getWuerfelwert();
    }

    public int getWuerfel3H()
    {
        return wuerfel3H.getWuerfelwert();
    }

}

