# Fuel API – Spring Boot

API REST desenvolvida em Java + Spring Boot, responsável por receber e persistir os dados de consumo enviados pela aplicação desktop FuelDesktopGui.

O projeto representa a camada online da solução, centralizando os dados em um banco PostgreSQL e possibilitando evolução para dashboards, relatórios e integrações futuras.

# 🚀 Funcionalidades

Receber consumos via REST API

Persistir dados em PostgreSQL

Suporte a UUID

Pronto para autenticação JWT

Base para validações de negócio

Preparado para evolução com mensageria e eventos

# 🛠️ Tecnologias Utilizadas

| Camada       | Tecnologia      |
| ------------ | --------------- |
| Linguagem    | Java            |
| Framework    | Spring Boot     |
| Persistência | Spring Data JPA |
| Banco        | PostgreSQL      |
| Pool         | HikariCP        |
| Infra        | Docker          |
| Build        | Maven / Gradle  |


# 🐳 Banco de Dados (PostgreSQL – Docker)

docker compose up -d


# Credenciais Banco de Dados

| Campo   | Valor     |
| ------- | --------- |
| Host    | localhost |
| Porta   | 5455      |
| Banco   | ms_fuel   |
| Usuário | postgres  |
| Senha   | postgres  |
