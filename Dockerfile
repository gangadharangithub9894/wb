FROM  eclipse-temurin:17
COPY target/wb.jar wb.jar
CMD ["java","-jar","wb.jar"]
