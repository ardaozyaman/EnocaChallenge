# EnocaChallenge-6
## Giriş

Merhaba Enoca ben Arda,

Senaryo olarak araç kiralama senaryosu kullanıldı. Bu senaryoya göre  Brand (marka) ve Model arasında "one-to-many" ilişkisi kuruldu.

Brand için operasyonlar;
 - Yeni veri girişi (POST)
 - Tüm verilerin listelenmesi (GET)
 - Veri güncellenmesi (PUT)
 - "id" ye göre veri çaprılması (GET)
 - "id" ye göre veri silinmesi (DELETE)
  
Model için Operasyonlar;
 - Yeni veri girişi (POST)
 - Tüm verilerin listelenmesi (GET)
 

## Projeyi ayağa kaldırmak
Öncelikle istenilen proje yapım aşamasında;

 - Swagger
 - PostgreSQL
 - Java 19
 - Spring Boot
 - Intellij IDE

Teknolojilerinden yararladım projenin kararlı çalışması için belirttiğim teknolojileri kullanmanızı tavsiye ederim.


 1. Öncelikle ide üzerinden Run Configuration' ı "EnocaDemoApplication" olacak şekilde ayarlayınız.
 2. "\src\main\resources\application.properties" dosyası hazır olarak gelecektir. Bu dosyayı konfigüre ediniz.
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect  
    spring.jpa.hibernate.ddl-auto=update  
    spring.jpa.hibernate.show-sql=true  
    spring.datasource.url=jdbc:postgresql://localhost:5432/enocaDemo  
    spring.datasource.username=kullanıcıAdı 
    spring.datasource.password=parola  
    spring.jpa.properties.javax.persistence.validation.mode=none

 kullanıcıAdı ve palola alanlarını mevcut PostgreSQL' e erişim sağlarken kullandığınız Şifre ve kullanıcı adıdır.
 
 3. PostgreSQL de "enocaDemo" adında yeni bir database oluşturun.
 
 4. EndPointlere erişmek için Swagger'ın html arayüzüne ulaşmanız gerekmektedir.

http://localhost:8080/swagger-ui/index.html#/ Bu linke tıklayarak ulaşabilirsiniz. 
  
![https://i.hizliresim.com/keqoxs8.jpg](https://i.hizliresim.com/keqoxs8.jpg)
 Endpoint' ler


Java 17 kullanım zorunluluğu için pom.xml kodu;

    <?xml version="1.0" encoding="UTF-8"?>
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>
        <parent>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-parent</artifactId>
            <version>2.7.5</version>
            <relativePath/> <!-- lookup parent from repository -->
        </parent>
       <groupId>enoca.io</groupId>  
    <artifactId>EnocaChallenge</artifactId>  
    <version>0.0.1-SNAPSHOT</version>  
    <name>Demo</name>  
    <description>Demo project for Enoca</description>
            <properties>
                <java.version>17</java.version>
            </properties>
            <dependencies>
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-data-jpa</artifactId>
                </dependency>
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-validation</artifactId>
                </dependency>
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-web</artifactId>
                </dependency>
        
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-devtools</artifactId>
                    <scope>runtime</scope>
                    <optional>true</optional>
                </dependency>
                <dependency>
                    <groupId>org.postgresql</groupId>
                    <artifactId>postgresql</artifactId>
                    <scope>runtime</scope>
                </dependency>
                <dependency>
                    <groupId>org.projectlombok</groupId>
                    <artifactId>lombok</artifactId>
                    <optional>true</optional>
                </dependency>
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-test</artifactId>
                    <scope>test</scope>
                </dependency>
                <dependency>
                    <groupId>org.springdoc</groupId>
                    <artifactId>springdoc-openapi-ui</artifactId>
                    <version>1.6.6</version>
                </dependency>
                <dependency>
                    <groupId>org.modelmapper</groupId>
                    <artifactId>modelmapper</artifactId>
                    <version>3.1.1</version>
                </dependency>
        
            </dependencies>
        
            <build>
                <plugins>
                    <plugin>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-maven-plugin</artifactId>
                        <configuration>
                            <excludes>
                                <exclude>
                                    <groupId>org.projectlombok</groupId>
                                    <artifactId>lombok</artifactId>
                                </exclude>
                            </excludes>
                        </configuration>
                    </plugin>
                </plugins>
            </build>
        
        </project>

Bu kodu proje içinde ki pom.xml dosyası içine kopyalayarak, java 17 ile de çalıştırabilirsiniz.


