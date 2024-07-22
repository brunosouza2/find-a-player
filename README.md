# API de Futebol com Design Pattern Facade

Esta é uma API simples que aplica o design pattern **Facade** para interagir com uma API externa e buscar informações sobre jogadores de futebol. A API externa utilizada é o [Football Data API](https://www.football-data.org).

## Funcionalidades

- **Facade**: A API utiliza o design pattern Facade para simplificar a interação com a API externa de dados de jogadores de futebol.
- **Endpoints**:
    - Buscar informações de jogadores de futebol.
    - Consultar dados de competições e times.

## Documentação

A documentação da API está disponível em Swagger. Para acessá-la, visite:

[http://localhost:8080/swagger-ui/index.html#/](http://localhost:8080/swagger-ui/index.html#/)

**Nota:** Este URL funcionará apenas se a porta do servidor estiver configurada como `8080`. Se o servidor estiver usando uma porta diferente, ajuste o número da porta na URL de acordo com a configuração do seu servidor.

## Configuração

Para que a API funcione corretamente, você precisa se cadastrar no site do Football Data API e obter suas credenciais de acesso.

### 1. Cadastro

- Acesse o [Football Data API](https://www.football-data.org/client/register) e faça seu cadastro.

### 2. Configuração das Variáveis de Ambiente

- Após o cadastro, você receberá um e-mail com o `header name` e `header value`.
- Defina as variáveis de ambiente `API_HEADER_NAME` e `API_HEADER_VALUE` com os valores fornecidos no e-mail.

  **Exemplo para configuração em sistemas macOS/Linux**:

    - **Em `.bashrc`, `.bash_profile`, ou `.zshrc`**:
      ```sh
      export API_HEADER_NAME=<seu-header-name>
      export API_HEADER_VALUE=<seu-header-value>
      ```
      Salve o arquivo e recarregue-o com o comando:
      ```sh
      source ~/.bashrc  # ou ~/.bash_profile ou ~/.zshrc
      ```

  **Exemplo para configuração em Windows**:

    - **Via Interface Gráfica**:
        1. Clique com o botão direito em “Este PC” ou “Computador” e selecione “Propriedades”.
        2. Clique em “Configurações avançadas do sistema”.
        3. Na aba “Avançado”, clique em “Variáveis de Ambiente”.
        4. Na seção “Variáveis do sistema” ou “Variáveis de usuário”, clique em “Novo...”.
        5. Insira `API_HEADER_NAME` como o nome da variável e o valor fornecido no e-mail como o valor.
        6. Clique em “OK” para salvar.
        7. Repita o processo para `API_HEADER_VALUE`.

### 3. Configuração Hardcoded (Opcional)

- Se preferir, você pode definir os valores diretamente no arquivo `application.properties` da sua aplicação. Isso pode ser útil para ambientes de desenvolvimento ou teste.

  Adicione as seguintes linhas ao arquivo `application.properties`:

  ```properties
  api.header.name=<seu-header-name>
  api.header.value=<seu-header-value>
