# tiny-url-pavis (Hola Mundo)

Base de práctica con:

- Java + Spring Boot
- Maven
- Hibernate (JPA)
- Postgres
- Dockerfile + docker-compose

## Levantar con Docker

```bash
docker compose up --build
```

- App: `http://localhost:8080/` → `{"message":"Hola Mundo"}`
- Postgres: `localhost:5432` (db: `tinyurl`, user: `postgres`, pass: `postgres`)

## Crear la tabla automáticamente

Al iniciar, Flyway ejecuta `src/main/resources/db/migration/V1__init.sql` y crea la tabla `demo_items`.

## Parar y borrar volúmenes (reiniciar BD)

```bash
docker compose down -v
```
