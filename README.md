# Backend de Login, Registro e envio de Email

Backend completo de login e registro usando Spring Boot.

- [x] Spring Boot
- [x] Spring Security
- [x] Java Mail
- [x] Email verification with expiry
- [x] Spring Boot

Instalar o mailDev para teste:

$ npm install -g maildev

$maildev

Se preferir utilizando docker:

$ docker run -p 1080:1080 -p 1025:1025 maildev/maildev

Para acessar o email:

http://0.0.0.0:1080

## Diagrama
![Screenshot 2021-01-13 at 23 38 08](https://user-images.githubusercontent.com/40702606/104789980-15581a00-578e-11eb-998d-30f2e6a9f461.png)

## Exemplos de requisições
### Postman
![Screenshot 2021-01-13 at 23 37 57](https://user-images.githubusercontent.com/40702606/104790087-7a137480-578e-11eb-8141-307a8850c39e.png)

### CURL
```
curl --location --request POST 'localhost:8080/api/v1/registration' \
--header 'Content-Type: application/json' \
--data-raw '{
    "firstName": "Fernando",
    "lastName": "Spring",
    "email": "brouklins@gmail.com",
    "password": "password"
}'
```
