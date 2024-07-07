import javax.swing.JOptionPane;
public class Popup
{
    private int YNval;
    
    public Popup()
    {

    }

    /*
    public void Benachrichtigung(){
        JOptionPane.showMessageDialog(null,
            "Ihre Auswahl wird jetzt ausgeführt!",
            "GAME OVER",                     
            JOptionPane.INFORMATION_MESSAGE);
    }
    */

    public void Eingabe()
    {
        int option = JOptionPane.showConfirmDialog(null, "Ihre Willenspunkte sind aufgebraucht!",
                "GAME OVER",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
        if(option == JOptionPane.YES_OPTION)
        {
            int YNval = 1;
        }
        else if(option == JOptionPane.NO_OPTION)
        {
            int YNval = 0;
        }
        else if(option == JOptionPane.CLOSED_OPTION)
        {
         int YNval = 0;
        }
    }
    
    public int getOption()
    {
        return YNval;
    }
    

}
