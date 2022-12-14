### 馃弳 Reto De Excepciones Para Automatizaci贸n De Pruebas En Web

#### 馃殌 Descripci贸n
Proyecto de Automatizaci贸n web en Screenplay y con el framework SerenityBDD, usando excepciones.

#### Feature: Validate has been Add product to cart for shipment to Colombia
> **As** an automator
> **I** want to select a product to add to cart from the aliexpress page
> **To** validate that the product has been added to the cart with shipment to Colombia

#### Feature: Validate control pop-ups platform
> **As** an automator
> **I** want to control the popup windows of the aliexpress page
> **To** validate that functionality

#### 馃幆 Caracter铆sticas del Proyecto
En la construcci贸n del proyecto de automatizacion web en la plataforma aliexpress se implementa:
- Patr贸n de dise帽o de Screemplay.
- Framework SerenityBDD.
- Gestor de paquetes Gradle.
- Desarrollado en java en su versi贸n 8.
- Uso de excepciones.

#### 馃洜 Versionado
| Repository       | Version |
|------------------|---------|
| Serenity         | 3.3.4   |
| SerenityCucumber | 3.3.4   |
| SerenityEnsure   | 3.2.5   |
| Slf4jSimple      | 1.7.36  |
| Junit            | 4.13.2  |

#### 馃棐 Precondiciones
- [x] 1.0: Instar Java en su versi贸n 8.
- [x] 1.1: Configurar variable de entorno JAVA_HOME
- [x] 2.0: Instar Gradle en su versi贸n 7.2
- [x] 2.1: Configurar variable de entorno GRADLE_HOME
- [x] 3.0: Descargar o clonar con git el repositorio en Github.
- [x] 3.1: Ubicarse en la raiz principal de proyecto.

#### 馃懆馃徑鈥嶐煉? Ejecuci贸n del proyecto
Para la ejecuci贸n del proyecto usando un navegor o pagina especifica, hacer uso de los siguientes comandos en la raiz principal del proyecto:

> 馃挰 Nota: Si quiere usar el **Gradle Wrapper** en Windows, debe usar el siguiente comando:
 ```sh
 ./gradlew
 ```
> En vez de:
```sh
gradle
```

鈿★笍锔? Por defecto el proyecto ya esta configurado con el navegor **Chrome** y con la pagina por **Defecto**, solo debes ejecutar el siguiente comando:
```sh
gradle clean test
```
鈿★笍 Si desea un navegor especifico, usar alguno de los siguiente comandos:
- Con **Chrome** :
```sh
gradle clean test -Dwebdriver.driver=chrome
```
-  Con **Firefox**:
```sh
gradle clean test -Dwebdriver.driver=firefox
```
- Con **Edge**:
```sh
gradle clean test -Dwebdriver.driver=edge
```
鈿★笍Si desea usar un ambiente especifico, para ejecutar las pruebas automatizadas, usar alguno de los siguientes comandos:
-  Para **Default**:
```sh
gradle clean test -Denvironment=default
```
- Para **Desarrollo**:
```sh
gradle clean test -Denvironment=dev
```
- Para **Staging**:
```sh
gradle clean test -Denvironment=stg
```
- Para **Producci贸n**:
```sh
gradle clean test -Denvironment=prod
```

鈿★笍 Si desea una combinaci贸n espeficica, solo tener de **referencia** el siguiente ejemplo:
```sh
gradle clean test -Dwebdriver.driver=firefox -Denvironment=stg 
```



