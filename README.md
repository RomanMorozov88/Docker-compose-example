# Простой пример Docker Compose с PostgreSql + Spring Boot (+ pgAdmin4 в качестве бонуса)

Docker-desktop;  
Java 11;   
PostgreSql 12;  
pgAdmin4;  

Spring-приложение очень простое- контроллер для обработки GET и POST запросов, репозиторий для работы с БД и модель.  
Для запуска в консоли перейти в директорию с файлом __docker-compose.yml__ и выполнить __docker-compose up__

pgAdmin4 доступен по http://localhost  
(ip для подключения к серверу БД можно глянуть с помощью __ip a__ в консоли.)

Для работы с БД:  
__psql -h localhost -U postgres -d postgres__  
или  
__docker exec -it docker_db psql  -U postgres__

Для запросов к spring-приложению можно использовать Postman  
или прописать в консоли:  
__curl -d '{"name":"value1", "description":"value2"}' -H "Content-Type: application/json" -X POST http://localhost:8090/post    
curl -X GET http://localhost:8090/post__

Удаление в Docker:  
всех контейнеров:  
__docker rm $(docker ps -a -q)__  
образов:  
__docker rmi__ %id образа%
