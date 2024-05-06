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




