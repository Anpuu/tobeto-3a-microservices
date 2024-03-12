# Eureka Sunucusu ve İstemcisi Kullanarak Servis Keşfi

Bu proje, Eureka sunucusu ve istemcisi kullanarak mikro servisler arasında iletişim sağlamak için API gateway ve discovery server (keşif sunucusu) sınıflarını içerir.

## API Gateway

API Gateway, gelen istekleri yönlendirmek ve mikro servisler arasında iletişimi kolaylaştırmak için kullanılır. Bu sınıf, bir Spring Boot uygulamasıdır ve 8080 numaralı bir port üzerinde çalışır.

### Yapılandırma

API Gateway, `application.yml` dosyasında yapılandırılır:

server:
  port: 8080

spring:
  application:
    name: api-gateway

eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka <br>


server.port: API Gateway'in çalışacağı port numarasını belirtir.<br>
spring.application.name: Uygulamanın adını belirtir.<br>
eureka.client.service-url.defaultZone: Eureka sunucusunun adresini belirtir. Diğer mikro servislerin kayıtlı olduğu sunucuya erişmek için kullanılır.<br>

-----

# Discovery Server
Discovery Server, mikro servislerin kaydedildiği ve bulunduğu yerdir. Bu proje, Eureka sunucusunu kullanarak servislerin keşfedilmesini sağlar. Discovery Server, bir Spring Boot uygulamasıdır ve 8761 numaralı bir port üzerinde çalışır.

Yapılandırma
Discovery Server, application.yml dosyasında yapılandırılır:

spring:
  application:
    name: eureka-server

server:
  port: 8761

eureka:
  client:
    fetch-registry: false
    register-with-eureka: false

    
spring.application.name: Uygulamanın adını belirtir.
server.port: Discovery Server'in çalışacağı port numarasını belirtir.
eureka.client.fetch-registry: Eureka sunucusundan hizmet kayıtlarını alıp almayacağını belirtir. Bu durumda false olarak ayarlanmıştır çünkü bu sunucu bir Eureka istemcisi değildir.
eureka.client.register-with-eureka: Bu sunucunun kendini Eureka sunucusuna kaydedip kaydetmeyeceğini belirtir. Bu durumda false olarak ayarlanmıştır çünkü bu sunucu bir Eureka istemcisi değildir.



Bu README dosyası, API Gateway ve Discovery Server'ın nasıl yapılandırılacağı ve kullanılacağı hakkında temel bilgiler sağlar. Kodun daha derinlemesine anlaşılması için proje dosyalarına bakılması önerilir.
