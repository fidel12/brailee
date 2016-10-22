package braile;
public class Traductor implements InterfaceBraile{

    private String msj;

    public Traductor(String msj) {
        this.msj = msj;
    }

    public String getmsj() {
        return msj;
    }

    public void setmsj(String msj) {
        this.msj = msj;
    }

    @Override
    public void imp() {
        System.out.println("MENSAJE: "+msj);
        
    }
    
}
