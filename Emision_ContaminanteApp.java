/*Diseñe e implemente una clase Emision_Contaminante que contenga los siguientes atributos: 
código de tipo entero, medida de tipo String, 
emisión de tipo String, numEmision de tipo entero.
 */
package emision_contaminante;

/**
 *
 * @author Quishpe Urrutia Job Nicolás
 */
    class Emision_Contaminante {

    /*Atributos*/
    private int codigo;
    private String medida;
    private String emision;
    private int numEmision;
    
    /*Constructores*/
    public Emision_Contaminante(int pCodigo, String pMedida, String pEmision, int pNumEmision){
        
        codigo=pCodigo;
        medida=pMedida;
        emision=pEmision;
        numEmision=pNumEmision;
    } 
    
    /*Metodos*/
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    
    public String getMedida(){
        return medida;
    }
    public void setMedida(String medida){
        this.medida = medida;
    }
    
    
    public String getEmision(){
        return emision;
    }
    public void setEmision(String emision){
        this.emision = emision;
    } 
    
    
    public int getNumEmision(){
        return numEmision;
    }
    public void setNumEmision(int numEmision){
        this.numEmision = numEmision;
    }
    
    
    @Override
    public String toString(){
        return "Emisión Contaminante"+medida+" con CODIGO: "+codigo+" -- "
                + " Inspeccionado por el Analizador de Gases para " +emision+
                  " tiene registradas: " +numEmision+ " muestras extraidas del motor. ";
    }
}   
    public class Emision_ContaminanteApp {
 
    public static void main(String[] args) {
        
            System.out.println("  Paper:   MODELO BASADO EN REDES NEURONALES ARTIFICIALES DE UN MOTOR DE COMBUSTIÓN INTERNA \n");
        // TODO code application logic here
        // Creamos los objetos
        Emision_Contaminante emision1=new Emision_Contaminante(888," Medida1"," Emision1 ", 36);
        Emision_Contaminante emision2=new Emision_Contaminante(889," Medida2"," Emision2 ", 24);
        
        // Mostramos su estado
        System.out.println(emision1.toString());
        System.out.println(emision2.toString());
        
        // Modificamos el Atributo NumEmision de la emision1
        emision1.setNumEmision(70);
        
        // Comparamos quien tiene más emisiones
        if(emision1.getNumEmision()>emision2.getNumEmision()){
            System.out.println(emision1.getEmision()+" tiene más emisiones contaminantes");
        }else{
            System.out.println(emision2.getEmision()+" tiene más emisiones contaminantes");   
        }
    }
}    