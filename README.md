
# 📝 Todolist API

API REST simples de gerenciamento de tarefas, criada com Spring Boot 3, PostgreSQL e Docker.

## 🚀 Funcionalidades

- ✅ Criar tarefas
- ✅ Listar tarefas
- 🛠️ Atualizar e deletar tarefas *(em breve)*
- 📋 Validação de dados com Bean Validation
- 📦 Integração com PostgreSQL (via Docker)
- 🔍 Documentação Swagger disponível

## 🛠️ Tecnologias utilizadas

- Java 21
- Spring Boot 3
- Spring Data JPA
- PostgreSQL
- Docker + Docker Compose
- Lombok
- Swagger (SpringDoc OpenAPI)
- Postman (coleção pronta para testes)

---

## ▶️ Como rodar localmente

### 1. Subir com Docker Compose

```bash
docker compose up --build
```

Esse comando:
- Constrói e sobe a aplicação Spring Boot
- Sobe o banco de dados PostgreSQL
- Já conecta tudo automaticamente

A aplicação estará em: [http://localhost:8080](http://localhost:8080)

---

### 2. Acessar o Swagger

Documentação interativa da API:

- [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- ou
- [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

### 3. Testar no Postman

Importe o arquivo: [`Todolist_API.postman_collection.json`](./Todolist_API.postman_collection.json)

- POST: `http://localhost:8080/tarefas`
- GET: `http://localhost:8080/tarefas`

---

## 📂 Estrutura de diretórios

```
todolist-api/
├── src/
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── README.md
└── Todolist_API.postman_collection.json
```

---

## 📄 Licença

Este projeto está sob a licença MIT.  
Feito com 💛 por [Tharlley Bertunes](https://github.com/bertunes)
