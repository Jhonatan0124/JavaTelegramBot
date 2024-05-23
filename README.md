# Java Telegram Bot

Este es un proyecto Java que implementa un chat bot para Telegram utilizando la API oficial de Telegram.

## Funcionalidades

- Envío y recepción de mensajes.
- Gestión de comandos personalizados.
- Interacción con usuarios a través de conversaciones.

## Requisitos

- Java 8 o superior.
- Biblioteca TelegramBots (incluida en el proyecto).
- Token de acceso a la API de Telegram.

## Instalación y Uso

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu entorno de desarrollo Java (por ejemplo, IntelliJ IDEA).
3. Configura el token de acceso a la API de Telegram en el archivo `BotConfig.java`.
4. Ejecuta el programa desde la clase `Main.java`.
5. Abre Telegram y busca el bot utilizando su nombre o enlace.
6. ¡Empieza a interactuar con el bot!

## Configuración del Token de Acceso

Para configurar el token de acceso a la API de Telegram, sigue estos pasos:

1. Ve a la página de [Telegram BotFather](https://t.me/botfather) y crea un nuevo bot.
2. Copia el token generado por BotFather.
3. Abre el archivo `BotConfig.java` en el proyecto y reemplaza `"TOKEN_AQUI"` con tu token.

## Ejemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        // Inicializar y ejecutar el bot
        BotHandler bot = new BotHandler();
        bot.run();
    }
}



