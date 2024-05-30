public class Eevee {
    // declarando atributos

    String tipo;
    double peso;
    double altura; 
    int hp;


    // métodos

    public String Ataque(){
        return "* Ataque Rapido *";
    }


    public String Defesa(){
        return "* Desvio *";
    }


     public String Especial(){
        return "* Tri-Ataque *";
    }

     // construtor 
    public Eevee(String tipo, double peso, double altura, int hp) {
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.hp = hp;
    }

    // sobrecarga de construtor 
    public Eevee (){

    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }


    public int getHp() {
        return hp;
    }


    public void setHp(int hp) {
        this.hp = hp;
    };


   public void Imprimir(){

    System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
    System.out.println("Nome: Eevee");
    System.out.println("Tipo: " + getTipo());
    System.out.println("Peso: " + getPeso());
    System.out.println("Altura: " + getAltura());
    System.out.println("Hp: " + getHp());
    System.out.println("Ataque: " + Ataque());
    System.out.println("Defesa: " + Defesa());
    System.out.println("Especial: " + Especial());
    System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\n");

   }

    


   
    
      




}
