# Etapa de build
FROM maven:3.9.8-eclipse-temurin-17 AS build
WORKDIR /app

# Copia POM y resuelve dependencias offline para acelerar builds
COPY lunchuis/pom.xml lunchuis/pom.xml
RUN mvn -q -f lunchuis/pom.xml -DskipTests dependency:go-offline

# Copia el código y compila
COPY lunchuis/src lunchuis/src
RUN mvn -q -f lunchuis/pom.xml -DskipTests clean package

# Etapa de runtime
FROM eclipse-temurin:17-jre
WORKDIR /app

ENV JAVA_OPTS=""
# Copia el jar generado
COPY --from=build /app/lunchuis/target/lunchuis-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8094
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /app/app.jar"]