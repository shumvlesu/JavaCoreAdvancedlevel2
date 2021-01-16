package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
  //1. Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна.
  //Однострочное текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели.
  //Сообщение должно отсылаться либо по нажатию кнопки на форме, либо по нажатию кнопки Enter.
  //При «отсылке» сообщение перекидывается из нижнего поля в центральное.

  @FXML
  private TextField textMessage;

  @FXML
  private TextArea areaMessage;

  @FXML
  public Button buttonMessage;

  //StringBuilder sb = new StringBuilder();

  public void sendMessage() {
    String userMessage = textMessage.getText();
    if (!userMessage.isBlank()) {//проверяю а есть ли что то в текстовом поле
      textMessage.clear();//очищаю текстовое поле на форме

      //пока оставлю
      //sb.append(userMessage).append("\n");

      //в общее поле добавляю сообщение
      areaMessage.appendText(userMessage+"\n");
    }

  }

}

