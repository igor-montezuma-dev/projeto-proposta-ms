# API de Análise de Propostas com Microserviços

Este projeto é uma aplicação Spring Boot que utiliza uma arquitetura de microserviços para realizar a análise de propostas. A comunicação entre os microserviços é feita utilizando RabbitMQ e Amazon SNS.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Maven

## Pré-requisitos

- JDK 17 ou superior
- PostgreSQL (com banco de dados criado)

## Configuração do Banco de Dados

# Configuração do Banco de Dados com Docker

## Passo 1: Criar um banco de dados PostgreSQL com Docker

1. **Instale o Docker**: Se ainda não tiver o Docker instalado, baixe e instale-o a partir do [site oficial](https://www.docker.com/products/docker-desktop).

2. **Crie um arquivo `docker-compose.yml`**: Esse arquivo vai definir o contêiner do PostgreSQL. No seu diretório de projeto, crie um arquivo chamado `docker-compose.yml` com o seguinte conteúdo:

    ```yaml
    version: '3.8'
    services:
      db:
        image: postgres:latest
        container_name: postgres_sistema_vendas
        environment:
          POSTGRES_DB: sistema_vendas
          POSTGRES_USER: seu_usuario
          POSTGRES_PASSWORD: sua_senha
        ports:
          - "5432:5432"
        volumes:
          - postgres_data:/var/lib/postgresql/data

    volumes:
      postgres_data:
    ```

3. **Inicie o contêiner do PostgreSQL**: Abra o terminal, navegue até o diretório onde você criou o arquivo `docker-compose.yml` e execute o comando:

    ```bash
    docker-compose up -d
    ```

    Esse comando vai baixar a imagem do PostgreSQL (se ainda não tiver sido baixada) e iniciar um contêiner com o banco de dados `sistema_vendas`, utilizando o usuário e a senha especificados.

## Passo 2: Configurar as credenciais de acesso no `application.properties`

1. **Localize o arquivo `application.properties`**: Geralmente, este arquivo está no diretório `src/main/resources` do seu projeto Spring Boot.

2. **Edite o arquivo `application.properties`**: Adicione ou ajuste as seguintes propriedades para conectar ao banco de dados PostgreSQL em execução no contêiner Docker:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/propostadb
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    ```

    - `spring.datasource.url`: URL de conexão JDBC para o banco de dados PostgreSQL.
    - `spring.datasource.username`: Nome de usuário para acessar o banco de dados.
    - `spring.datasource.password`: Senha para acessar o banco de dados.
    - `spring.jpa.hibernate.ddl-auto`: Configuração do Hibernate para gerenciar o esquema do banco de dados. A opção `update` atualiza o esquema do banco de dados para se ajustar às entidades.

## Resumo

1. Criamos um contêiner Docker para PostgreSQL com um banco de dados chamado `propostadb` e configuramos as credenciais.
2. Configuramos o arquivo `application.properties` para que a aplicação Spring Boot possa se conectar ao banco de dados PostgreSQL.

Agora, você deve estar pronto para iniciar sua aplicação Spring Boot e conectá-la ao banco de dados PostgreSQL em execução no contêiner Docker.

````

## Contribuição

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/sua-feature`)
3. Commite suas alterações (`git commit -m 'Adiciona sua feature'`)
4. Faça um push para a branch (`git push origin feature/sua-feature`)
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

Feito por [Igor Montezuma](https://github.com/igor-montezuma-dev)
