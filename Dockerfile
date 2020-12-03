FROM openjdk
WORKDIR /app
COPY  target/cadastro-demanda-0.0.1.jar /app/servico-cadastro-demanda.jar
ENTRYPOINT ["java","-jar","servico-cadastro-demanda.jar"]