package com.aluracursos.forohub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity(name = "Topico")
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fecha;
    private Boolean estatus;
    private int autor;
    private String curso;

    public Topico(DatosRegistroTopico datosRegistroTopico){
        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        this.fecha = fechaActual.format(formateador);
        this.estatus = true;
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
    }

    public void actualizarTopico(DatosActualizarTopico datosActualizarTopico){
        if(datosActualizarTopico.titulo() != null)
            this.titulo = datosActualizarTopico.titulo();
        if(datosActualizarTopico.mensaje() != null)
            this.mensaje = datosActualizarTopico.mensaje();
    }

    public void desactivarTopico(){
        this.estatus = false;
    }

}
