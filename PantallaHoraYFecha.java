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
        String fechaExacta = horas.getTextoDeLaPantalla() + ":" + minutos.getTextoDeLaPantalla() + " " + dia.getTextoDeLaPantalla() + "-" + mes.getTextoDeLaPantalla() + "-" + ano.getTextoDeLaPantalla();
        return fechaExacta;
    }

    /**
     * Método avanzarMinuto
     *
     */
    public void avanzarMinuto() {   
        minutos.incrementaValorAlmacenado();
        if (minutos.getValorAlmacenado() == 0){
            horas.incrementaValorAlmacenado();
            if (horas.getValorAlmacenado() == 0){
            dia.incrementaValorAlmacenado();
            if (dia.getValorAlmacenado() == 1){
            mes.incrementaValorAlmacenado();
            if (mes.getValorAlmacenado() == 1){
            ano.incrementaValorAlmacenado();
        }
        }
        }
        }

    }

    public void setHora(int minutos1, int horas2, int dia3, int mes4, int ano5) {
        minutos.setValorAlmacenado(minutos1);
        horas.setValorAlmacenado(horas2);
        dia.setValorAlmacenado(dia3);
        mes.setValorAlmacenado(mes4);
        ano.setValorAlmacenado(ano5);
    }
}  