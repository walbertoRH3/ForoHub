# 🌟 ForoHub WRH3 🌟

¡Bienvenido a ForoHub WRH3! Este programa es un API que te permite Realizar diferentes solicitudes REST:
* Iniciar Sesion
* Registrar un topico
* Actualizar un Topico
* Eliminar un topico
* Listar topicos

## 🚀 Servidores
La API se despliega localmente en:
* Base URL: http://localhost:8080

##  Autorización
La API requiere autorización mediante tokens JWT para acceder a ciertas funciones.

## ✅ Tecnologías Utilizadas
- Java 🔧
- Maven 🔧
- Spring Boot 🔧
- Spring Data JPA 🔧
- MySQL 🔧
- JWT (JSON Web Tokens) 🔧

## 🌟 Endpoints
### Tópicos (`topico-controller`)

- **Actualizar un tópico**
   - `PUT /topico/actualizar`
   - Body: `DatosActualizarTopico`

- **Crear un nuevo tópico**
   - `POST /topico`
   - Body: `DatosRegistroTopico`

- **Listar todos los tópicos**
   - `GET /topico/listar`
   - Respuesta: `List<PageDatosListadoTopico>`


- **Dar de alta un tópico**
   - `GET /topico/alta/{id}`

- **Eliminar un tópico (lógico)**
   - `DELETE /topico/eliminar/{id}`

### Autenticación (`autenticacion-controller`)

- **Iniciar sesión (login)**
   - `POST /login`
   - Body: `DatosAutenticacionUsuario`
   - Respuesta: `DatosJWTtoken`

## 🤝 Contribución
mis profesores de Alura Latam que me han ensañado mucho y siempre muy profesionales.

## 📝 Licencia

Este proyecto está bajo la licencia MIT.

¡Gracias por utilizar ForoHub WRH3! Espero que te sea útil y que tengas una excelente experiencia. ¡Feliz ForHub! 🚀✨

## Autores

1. Walberto Roblero Hernández
