# SpringSky

# 🌤️ SkyConnect API (Céu Aberto)

Esta é uma API REST robusta desenvolvida para consultar informações climáticas de qualquer cidade do mundo, consumindo os serviços da **OpenWeatherMap**. 

O projeto foi construído com o objetivo de aplicar conceitos modernos do ecossistema Java e Spring Boot 3.

## 🚀 Tecnologias Utilizadas
* **Java 17** (Linguagem principal)
* **Spring Boot 3.2+** (Framework)
* **Spring Web** (Criação de endpoints REST)
* **RestClient** (Consumo moderno de APIs síncronas)
* **Spring Cache** (Otimização de performance e redução de latência)
* **Jackson/Records** (Mapeamento eficiente de JSON)

## 🛠️ Funcionalidades
- [x] Consulta de temperatura, sensação térmica e umidade por nome da cidade.
- [x] Respostas em Português (PT-BR) e unidades em Celsius.
- [x] **Sistema de Cache:** Evita chamadas repetidas à API externa para a mesma cidade.
- [x] **Tratamento de Erros:** Respostas amigáveis para cidades não encontradas ou falhas de conexão.

## 📦 Como rodar o projeto
1. Clone o repositório: `git clone https://github.com/seu-usuario/seu-repositorio.git`
2. Obtenha uma API Key em [OpenWeatherMap](https://openweathermap.org/).
3. Adicione sua chave no arquivo `src/main/resources/application.properties`.
4. Execute o projeto via IntelliJ ou terminal: `./mvnw spring-boot:run`

## 🔗 Endpoint Principal
`GET /api/clima/{nome_da_cidade}`
