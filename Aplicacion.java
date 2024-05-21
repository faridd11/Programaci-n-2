public class Aplicacion {
    public static void main(String[] args) {
        
   
     Venta miVenta = new Venta("Xiaomi");
     miVenta.setModelo("10pro");
     miVenta.setAnio(2016);
     miVenta.SetPrecio(15000);
     miVenta.setFunciona(true);

     System.out.println("Venta origen");
     System.out.println(miVenta);
     System.out.println("----");

     Celular celularDes = (Celular) miVenta;
     System.out.println("Cel casteado");
     System.out.println(celularDes);
     System.out.println("----");

     System.out.println("Cel origen");
     Celular miCelular = new Celular("Motorola", false);
     miCelular.setAnio(2019);
     miCelular.setModelo("9AT");
     System.out.println(miCelular);










}
}
