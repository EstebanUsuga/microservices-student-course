# Microservices Student & Course

Este proyecto implementa una arquitectura de microservicios usando Spring Boot. Contiene los siguientes módulos:

## 🧩 Módulos integrados:

- **Eureka Server**: Registro y descubrimiento de servicios.
- **Spring Cloud Gateway**: Gateway API que enruta las peticiones a los microservicios.
- **Config Server**: Centraliza la configuración externa de todos los servicios.
- **Microservicio Student**: Gestión de estudiantes, usa **MySQL** como base de datos.
- **Microservicio Course**: Gestión de cursos, usa **PostgreSQL** como base de datos.

## 📦 Tecnologías utilizadas:

- Java 17
- Spring Boot
- Spring Cloud (Eureka, Gateway, Config)
- Spring Data JPA
- MySQL y PostgreSQL
- Maven

## 🚀 Cómo ejecutar el proyecto

1. Levanta primero:
   - `Config Server`
   - `Eureka Server`

2. Luego inicia:
   - `Student Service`
   - `Course Service`
   - `Gateway`

3. Accede a los endpoints a través del Gateway.
