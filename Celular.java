class Celular{
    private String marca;
    private String modelo;
    private int anio;
    private boolean funciona;

    public Celular(String mar){
        this.marca = mar;
    }

 public Celular(String mar, boolean fun){
    this.marca = mar;
    this.funciona = fun;
 }   

public void setMarca(String marca) {
    this.marca = marca;
}
public String getMarca() {
    return marca;
} 
public void setModelo(String modelo) {
    this.modelo = modelo;
}
public String getModelo() {
    return modelo;
}
public void setAnio(int anio) {
    this.anio = anio;
}
public int getAnio() {
    return anio;
}
public void setFunciona(boolean funciona) {
    this.funciona = funciona;
}
public boolean getFunciona(){
    return funciona;
}    


public Celular (String marca, String modelo, int anio, boolean funciona) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.funciona = funciona;
}

public String toString(){
    String str = "";

        if(this.getFunciona()){
            str = "si";
        }else{
            str = "no";
        }

    return "Marca:"+getMarca() +" Modelo:"+getModelo()+" Año de lanzamiento:"+getAnio()+" Funciona:"+str;
}
public Celular (String marca, int anio, boolean funciona ){
    this.marca = marca;
    this.anio = anio;
    this.funciona = funciona;
}
 public void setV (String marca){
    this.marca = marca;
}
public void setV(String marca, boolean funciona){
this.marca = marca;
this.funciona = funciona;
} 



}
