package LOGIC;

//import java.text.SimpleDateFormat;



public  class  Ropa {
//Variables de Clase

   
    public Ropa(){

    } 

	
    
    private enum Talle{};    
   /* private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String Fecha_fab = sdf.format("01/01/1973"); */
    private double Price;

    

      protected  String  setCode(int pid_actual, String pCode)  {
        System.out.println(pid_actual + pCode+"parametro actual superclase");
       String id_ropa_aux =Integer.toString(pid_actual);
    //   return  pCode.join("-", pCode, id_ropa_aux);
       return  id_ropa_aux;
   }

/*
    public String getFecha_fab() {
        return Fecha_fab;
    }

    public void setFecha_fab(String fecha_fab) {
        Fecha_fab = fecha_fab;
    }*/

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
    
   // public TALLE mitalle;






}