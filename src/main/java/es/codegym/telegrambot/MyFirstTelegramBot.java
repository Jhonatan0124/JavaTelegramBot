package es.codegym.telegrambot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Map;

import static es.codegym.telegrambot.TelegramBotContent.*;

public class MyFirstTelegramBot extends MultiSessionTelegramBot {

    public static final String NAME = "Lara01241988_bot";
    public static final String TOKEN = "6729087375:AAHIUP3PWHMZ35Awh7_rubpWdJrvJtKT8s8";

    public MyFirstTelegramBot() {
        super(NAME, TOKEN);
    }

    @Override
    public void onUpdateEventReceived(Update update) {
        // TODO: escribiremos la funcionalidad principal del bot aquí

        //Si me escriben hola -> Contestar ->
        if(getMessageText().equals("/start")){
            setUserGlory(0);
            sendPhotoMessageAsync("step_1_pic");
            sendTextMessageAsync(STEP_1_TEXT,
                    Map.of("Hackear la nevera", "step_1_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_1_btn")) {
            setUserGlory(20);
            sendPhotoMessageAsync("step_2_pic");
            sendTextMessageAsync(STEP_2_TEXT,
                    Map.of("Tomar una salchicha! +20 de fama", "step_2_btn",
                    "Tomar una pescado! +20 de fama", "step_2_btn",
                    "!Tirar una lata de pepinillos! + 20 de fama", "step_2_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_2_btn")) {
            setUserGlory(20);
            sendPhotoMessageAsync("step_3_pic");
            sendTextMessageAsync(STEP_3_TEXT,
                    Map.of("Hackear al robot aspirador", "step_3_btn"
                    ));
        }

        if (getCallbackQueryButtonKey().equals("step_3_btn")) {
            addUserGlory(30);
            sendPhotoMessageAsync("step_4_pic");
            sendTextMessageAsync(STEP_4_TEXT,
                    Map.of("Enviar al robot aspirador a por comida! +30 de fama", "step_4_btn",
                    "Dar un paseo en el robot aspirador", "step_4_btn",
                    "!Huir en el robot aspirador! + 30 de fama", "step_4_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_4_btn")) {
            addUserGlory(30);
            sendPhotoMessageAsync("step_5_pic");
            sendTextMessageAsync(STEP_5_TEXT, Map.of("Ponerte y encender la GoPro","step_5_btn",
                    "Ponerte a dormir", "step_5_btn",
                    "Jugar con la lana de tu mamá humana","step_5_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_5_btn")) {
            addUserGlory(30);
            sendPhotoMessageAsync("step_6_pic");
            sendTextMessageAsync(STEP_6_TEXT,
                    Map.of("Sabrosas golosinas especialmente formuladas para gatos", "step_6_btn",
                            "Ratones de juguete, pelotas con sonido o juguetes con plumas", "step_6_btn",
                            "Sesión de juego divertida o caricias relajantes", "step_6_btn"));
        }

        if (getCallbackQueryButtonKey().equals("step_6_btn")) {
            addUserGlory(40);
            sendPhotoMessageAsync("step_7_pic");
            sendTextMessageAsync(STEP_7_TEXT,
                    Map.of(
                            "Transferir material grabado a la computadora", "step_7_btn"
                    ));
        }

        if (getCallbackQueryButtonKey().equals("step_7_btn")) {
            addUserGlory(50);
            sendPhotoMessageAsync("step_8_pic");
            sendTextMessageAsync(STEP_8_TEXT,
                    Map.of(
                            "Felicidades Gato haz llegado final", "step_8_btn"
                    ));
        }

        if (getCallbackQueryButtonKey().equals("step_8_btn")) {
            sendPhotoMessageAsync("final_pic");
            sendTextMessageAsync(FINAL_TEXT,
                    Map.of(
                            "Felicidades por llegar al final gato videobloguero de nivel 5 ", "final_test"
                    ));
        }
    }

    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyFirstTelegramBot());
    }
}