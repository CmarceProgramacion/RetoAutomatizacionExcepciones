### 🏆 Reto De Excepciones Para Automatización De Pruebas En Web

#### 🚀 Descripción
Proyecto de Automatización web en Screenplay y con el framework SerenityBDD, usando excepciones.

#### Feature: Validate has been Add product to cart for shipment to Colombia
> **As** an automator
> **I** want to select a product to add to cart from the aliexpress page
> **To** validate that the product has been added to the cart with shipment to Colombia

#### Feature: Validate control pop-ups platform
> **As** an automator
> **I** want to control the popup windows of the aliexpress page
> **To** validate that functionality

#### 🎯 Características del Proyecto
En la construcción del proyecto de automatizacion web en la plataforma aliexpress se implementa:
- Patrón de diseño de Screemplay.
- Framework SerenityBDD.
- Gestor de paquetes Gradle.
- Desarrollado en java en su versión 8.
- Uso de excepciones.

#### 🛠 Versionado
| Repository       | Version |
|------------------|---------|
| Serenity         | 3.3.4   |
| SerenityCucumber | 3.3.4   |
| SerenityEnsure   | 3.2.5   |
| Slf4jSimple      | 1.7.36  |
| Junit            | 4.13.2  |

#### 🗒 Precondiciones
- [x] 1.0: Instar Java en su versión 8.
- [x] 1.1: Configurar variable de entorno JAVA_HOME
- [x] 2.0: Instar Gradle en su versión 7.2
- [x] 2.1: Configurar variable de entorno GRADLE_HOME
- [x] 3.0: Descargar o clonar con git el repositorio en Github.
- [x] 3.1: Ubicarse en la raiz principal de proyecto.

#### 👨🏽‍💻 Ejecución del proyecto
Para la ejecución del proyecto usando un navegor o pagina especifica, hacer uso de los siguientes comandos en la raiz principal del proyecto:

> 💬 Nota: Si quiere usar el **Gradle Wrapper** en Windows, debe usar el siguiente comando:
 ```sh
 ./gradlew
 ```
> En vez de:
```sh
gradle
```

⚡️️ Por defecto el proyecto ya esta configurado con el navegor **Chrome** y con la pagina por **Defecto**, solo debes ejecutar el siguiente comando:
```sh
gradle clean test
```
⚡️ Si desea un navegor especifico, usar alguno de los siguiente comandos:
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
⚡️Si desea usar un ambiente especifico, para ejecutar las pruebas automatizadas, usar alguno de los siguientes comandos:
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
- Para **Producción**:
```sh
gradle clean test -Denvironment=prod
```

⚡️ Si desea una combinación espeficica, solo tener de **referencia** el siguiente ejemplo:
```sh
gradle clean test -Dwebdriver.driver=firefox -Denvironment=stg 
```



