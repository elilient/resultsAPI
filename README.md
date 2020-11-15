# resultsAPI

## Prerequisites
Maven

## Build
```mvn spring-boot:build-image```

## Docker
```docker build -t results-api . && docker run -p 8888:8888 --name results-container --network mynetwork results-api ```
