# Projeto de Cache com Redis em Java

Este projeto é um pequeno exemplo de aplicação Java com **Spring Boot** que demonstra o uso de **cache com Redis** para otimizar consultas a uma tabela de produtos.

O projeto utiliza **PostgreSQL** como banco de dados para persistência e **Redis** como cache, ambos executados via Docker.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Cache (`@Cacheable`, `@CacheEvict`)
- PostgreSQL
- Redis
- Docker & Docker Compose

---

## 📦 Estrutura do Projeto

- `src/main/java` → Código-fonte da aplicação
- `src/main/resources` → Configurações, `application.yml`
- `docker-compose.yml` → Configuração do PostgreSQL e Redis
- `src/main/resources/data.sql` -> Script de inserção de produtos no banco de dados

---

## 🐳 Como Rodar o Projeto

1. Clone o repositório:

```bash
git clone https://github.com/alvaromottadev/cache-redis.git
cd cache-redis
```

2. Inicie os serviços via Docker Compose:
```bash
docker-compose up -d
```

3. Configure o application.yml com os dados do PostgreSQL e Redis (já pré-configurados no projeto).
4. Rode a aplicação Spring Boot

Isso irá iniciar:
- PostgreSQL na porta `5433`
- Redis na porta `6379`

## 🔹 Endpoints Disponíveis

- `GET /products` → Retorna a lista completa de produtos (cache aplicado com @Cacheable)
- `POST /products/cache/reset` → Reseta o cache de produtos (@CacheEvict)

## 📝 Licença

Este projeto foi desenvolvido apenas para fins de estudo.