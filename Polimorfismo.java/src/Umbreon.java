public class Umbreon extends Eevee{
    public Umbreon(String tipo, double peso, double altura, int hp) {
        this.tipo = tipo;
        this.peso = peso;
        this.altura = altura;
        this.hp = hp;
    }

    @Override
    public String Ataque(){
        return "* Chamado Sombrio *";
    }

    @Override
    public String Especial(){
        return "* Lança Negra *";
    }

    @Override
    public String Defesa(){
        return "* Escuridão Max *";
    }

    public void Imprimir(){

        System.out.println("*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");
        System.out.println("Nome: Umbreon");
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
