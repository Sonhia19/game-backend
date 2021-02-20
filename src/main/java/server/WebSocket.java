package server;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import logic.facade.Facade;

@ServerEndpoint("/websocket")
public class WebSocket {

	private Facade facade;

	@OnOpen
	public void onOpen(final Session session) {
		System.out.println("Client connected: " + session.getId());

		facade = Facade.getInstance();
	}

	@OnClose
	public void onClose(final Session session) {
		System.out.println("Client disconnected: " + session.getId());

		facade.disconnectGameSession(session);
	}

	@OnMessage
	public void onMessage(final String message, final Session session) {
		// Convertimos el mensaje recibido en un objeto para su manejo.
//		JSONObject operation = (new JSONObject(mensaje)).getJSONObject("operacion");
//		JSONObject parametros = operacion.has("parametros") ? operacion.getJSONObject("parametros") : null;

		System.out.println("On message: " + session.getId());
		System.out.println("On message: " + message);
	}

	@OnError
	public void onError(final Throwable error) {

		error.printStackTrace();
	}
}
