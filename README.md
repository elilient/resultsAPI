# resultsAPI

## Prerequisites
Maven

## Build
```mvn spring-boot:build-image```

## Docker
```docker build -t results-api . && docker run -p 8888:8888 --name results-container results-api ```

PS! Ei saanud dockeriga resultsAPIt tööle. Lokaalselt jooksutada (kasutasin IntelliJ), siis töötas.

## RabbitMQ
```docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management```
