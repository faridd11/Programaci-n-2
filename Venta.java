public class Venta extends Celular{
    
    private int precio = 15000;


    public Venta (String mar){
        super(mar);
    }
     
    public Venta(String mar, int precio){
        super (mar);
        this.precio = precio;
    }

    public void SetPrecio(int p){
        this.precio = p;
    }

    public int getPrecio(){
        return this.precio;
    }

    public String toString(){
        return super.toString()+ "--"+this.getPrecio();
    }
  

    

}