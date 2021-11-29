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
        if (minutos.getValorAlmacenado() == 0){
            horas.incrementaValorAlmacenado();
        }
        if (horas.getValorAlmacenado() == 0){
            dia.incrementaValorAlmacenado();
        }
        if (dia.getValorAlmacenado() == 0){
            mes.incrementaValorAlmacenado();
        }
        if (mes.getValorAlmacenado() == 0){
            ano.incrementaValorAlmacenado();
        }

    }

    public void setHora(int numero1, int numero2, int numero3, int numero4, int numero5) {
        minutos.setValorAlmacenado(numero1);
        horas.setValorAlmacenado(numero2);
        dia.setValorAlmacenado(numero3);
        mes.setValorAlmacenado(numero4);
        ano.setValorAlmacenado(numero5);
    }
}  