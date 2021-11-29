public class PantallaHoraYFecha {

    private PantallaDosDigitos dia;
    private PantallaDosDigitos mes;
    private PantallaDosDigitos ano;
    private PantallaDosDigitos horas;
    private PantallaDosDigitos minutos;

    public PantallaHoraYFecha() 
    {
        dia = new PantallaDosDigitos(1,31);
        mes = new PantallaDosDigitos(1,13);
        ano = new PantallaDosDigitos(1,100);
        horas = new PantallaDosDigitos(0,24);
        minutos = new PantallaDosDigitos(0,60);
    }
    
    public String getFecha() {
        String fechaExacta = minutos.getTextoDeLaPantalla() + ":" + horas.getTextoDeLaPantalla() + dia.getTextoDeLaPantalla() + "-" + mes.getTextoDeLaPantalla() + "-" + ano.getTextoDeLaPantalla();
        return fechaExacta;
    }
    
     public void avanzarMinuto() {
        minutos.incrementaValorAlmacenado();
    }
    
     public void setHora(PantallaDosDigitos nuevoMinuto, PantallaDosDigitos nuevoHora, PantallaDosDigitos nuevoDia, PantallaDosDigitos nuevoMes, PantallaDosDigitos nuevoAno) {
        minutos = nuevoMinuto;
        horas = nuevoHora;
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
}  