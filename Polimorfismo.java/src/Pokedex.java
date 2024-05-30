public class Pokedex {
    public static void main(String[] args) throws Exception {

       Eevee Ev = new Eevee("Normal",6.5,0.3,4);
       Ev.Imprimir();

       Espeon Es = new Espeon("Psiquico", 26.5,0.9,4);
       Es.Imprimir();

       Flareon Fl = new Flareon("Fogo", 25, 0.9, 4);
       Fl.Imprimir();

       Glaceon Gl = new Glaceon("Gelo", 25.9, 0.8, 4);
       Gl.Imprimir();

       Jolteon Jo = new Jolteon("Eletrico", 24.5, 0.8, 4);
       Jo.Imprimir();

       Leafeon Le = new Leafeon("Planta", 25.5, 1.0, 4);
       Le.Imprimir();

       Sylveon Sy = new Sylveon("Fada", 23.5, 1.0, 6);
       Sy.Imprimir();

       Umbreon Um = new Umbreon("Sombrio", 27.0, 1.0, 6);
       Um.Imprimir();

       Vaporeon Va = new Vaporeon("Agua", 29.0, 1.0, 8);
       Va.Imprimir();




    }
}
