package tienda;
import java.util.*;

public class Principal {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        Tienda [] tienda = new Tienda[1];
        
        System.out.println("Ingrese el nombre de la tienda: ");
        String nombre = lector.nextLine();
        System.out.println("Ingrese la direccion: ");
        String direccion = lector.nextLine();
        System.out.println("Ingrese el RUC: ");
        String ruc = lector.nextLine();
        
        tienda[0] = new Tienda (nombre,direccion,ruc);
        System.out.println("El nombre de la tienda es: "+tienda[0].getNombre());
        System.out.println("La direccion es: "+tienda[0].getDireccion());
        System.out.println("El RUC es: "+tienda[0].getRuc());
       
        String marca;
        String codigo;
        String tipo;
        Double precio;
        int valor=0;
        int nproductos=0;
        Tienda[] producto = new Tienda[10];
        
        
        while (valor!=3){
            
            System.out.println("     MENU PRINCIPAL");
            System.out.println("  1.- Ingresar nuevo producto");
            System.out.println("  2.- Visualizar lista de productos");
            System.out.println("  3.- Salir");
            valor = lector.nextInt(); 
            
            switch(valor){
                case 1: 
                    lector.nextLine();
                    System.out.println("Ingrese la marca del producto: ");
                    marca = lector.nextLine();
                    System.out.println("Ingrese el codigo: ");
                    codigo = lector.nextLine();
                    System.out.println("Ingrese el tipo: (alimento, electrodoméstico, ropa)");
                    tipo = lector.nextLine();
                    System.out.println("Ingrese el precio: ");
                    precio = lector.nextDouble();
                    producto [nproductos] = new Tienda(marca,codigo,tipo,precio);
                    nproductos++;
                    System.out.println(" ");
                    break;
                case 2:

                    if(nproductos == 0){
                        System.out.println("Ingrese a opcion 1 y registre un producto: ");
                    }
                    
                        for(int i=0; i<nproductos ; i++){
                            System.out.println("Producto " + (i+1)+" :" );
                            System.out.println("Marca: " + producto[i].getMarca());
                            System.out.println("Codigo: " + producto[i].getCodigo());
                            System.out.println("Tipo: " + producto[i].getTipo());
                            System.out.println("Precio: " + producto[i].getPrecio()+" dolares");
                            System.out.println(" ");
                         }
                 
                    break;
                case 3: 
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
        }
        }
        
    }
}