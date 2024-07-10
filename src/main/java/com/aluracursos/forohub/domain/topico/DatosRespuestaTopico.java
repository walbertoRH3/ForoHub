package com.aluracursos.forohub.domain.topico;

import java.util.Date;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fecha,
        int autor,
        String curso ) {
    public DatosRespuestaTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getAutor(), topico.getCurso());
    }
}
