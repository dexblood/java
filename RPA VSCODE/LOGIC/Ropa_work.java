package LOGIC;

public class Ropa_work extends Ropa{
   
 
    public Ropa_work(){
        System.out.println(id_ropa + "id_ropa Ropa_Work ANTES de incrementar");
        id_ropa = id_ropa +1;
        System.out.println(id_ropa + "id_ropa Ropa_Work DESPUES  de incrementar");
        Code = super.setCode(id_ropa, Code); 
        
    }
    public String getCode() {
        return Code;
    }
     static Integer id_ropa = 0;
    protected  String Code = "work";


}