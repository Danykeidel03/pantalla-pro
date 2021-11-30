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

    public void setHora(int newMinutos, int newHoras, int newDia, int newMes, int newAno) {
        minutos.setValorAlmacenado(newMinutos);
        horas.setValorAlmacenado(newHoras);
        dia.setValorAlmacenado(newDia);
        mes.setValorAlmacenado( newMes);
        ano.setValorAlmacenado(newAno);
    }
}  