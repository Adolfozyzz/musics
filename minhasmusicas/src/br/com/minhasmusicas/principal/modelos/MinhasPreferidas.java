package br.com.minhasmusicas.principal.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao()>=9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso dmss" +
                    " e preferido por todos");
        }else {
            System.out.println(audio.getTitulo() + " também é um dos que a grande maioria curti");
        }
    }
}
