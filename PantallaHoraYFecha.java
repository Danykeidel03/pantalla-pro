public class PantallaHoraYFecha {

    private PantallaDosDigitos dia;
    private PantallaDosDigitos mes;
    private PantallaDosDigitos ano;
    private PantallaDosDigitos horas;
    private PantallaDosDigitos minutos;

    public PantallaHoraYFecha() 
    {
        dia = new PantallaDosDigitos(0,30);
        mes = new PantallaDosDigitos(0,12);
        ano = new PantallaDosDigitos(0,99);
        horas = new PantallaDosDigitos(0,24);
        minutos = new PantallaDosDigitos(0,60);
    }


}  