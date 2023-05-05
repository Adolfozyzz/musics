package br.com.minhasmusicas.principal.principal;

import br.com.minhasmusicas.principal.modelos.MinhasPreferidas;
import br.com.minhasmusicas.principal.modelos.Musica;
import br.com.minhasmusicas.principal.modelos.PodCast;

public class principal {public static void main(String[] args) {
    Musica minhaMusica = new Musica();
    minhaMusica.setTitulo("Mirin");
    minhaMusica.setCantor("JP");

    for (int i = 0; i <1000; i++){
        minhaMusica.reproduz();
    }
    for (int i = 0; i <50; i++){
        minhaMusica.curte();
    }
    PodCast meuPodcast = new PodCast();
    meuPodcast.setTitulo("Zyzz");
    meuPodcast.setApresentador("ChestBraah");

    for (int i = 0; i <5000; i++){
        meuPodcast.reproduz();
    }
    for (int i = 0; i <1000; i++){
        meuPodcast.reproduz();
    }

    MinhasPreferidas preferidas = new MinhasPreferidas();
    preferidas.inclui(meuPodcast);
    preferidas.inclui(minhaMusica);





}

}
