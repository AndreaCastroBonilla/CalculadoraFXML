package calculadora.fxml;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

	// model
	Model model = new Model();
	private Calculadora calculadora;

	// view
	@FXML
	private GridPane view;
	@FXML
	private TextField resultadoText;
	@FXML
	private Button sieteButton, ochoButton, nueveButton, unoButton, seisButton, cincoButton, cuatroButton, ceroButton,
			tresButton, dosButton, comaButton, igualButton, ceButton, sumaButton, restaButton, divisionButton,
			multiplicacionButton, cButton;

	public Controller() throws IOException {

		calculadora = new Calculadora();

		// cargar FXML
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/calculadora.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// bindings

//		model.pantallaProperty().bindBidirectional(resultadoText.textProperty()); -> ERROR
		resultadoText.textProperty().bindBidirectional(calculadora.getPantalla());

	}

	@FXML
	void onMultiplicacionAction(ActionEvent event) {
		calculadora.operar(Calculadora.MULTIPLICAR);
	}

	@FXML
	void onRestaAction(ActionEvent event) {
		calculadora.operar(Calculadora.RESTAR);
	}

	@FXML
	void onSumaAction(ActionEvent event) {
		calculadora.operar(Calculadora.SUMAR);
	}

	@FXML
	void onDivisionAction(ActionEvent event) {
		calculadora.operar(Calculadora.DIVIDIR);
	}

	@FXML
	void onBorrarTodoAction(ActionEvent event) {
		calculadora.borrarTodo();
	}

	@FXML
	void onComaAction(ActionEvent event) {
		calculadora.insertarComa();
	}

	@FXML
	void onIgualAction(ActionEvent event) {
		calculadora.operar(Calculadora.IGUAL);
	}

	@FXML
	void onBorrarAction(ActionEvent event) {
		calculadora.borrar();
	}

	@FXML
	void onInsertarCeroAction(ActionEvent event) {
		calculadora.insertar('0');
	}

	@FXML
	void onInsertarCincoAction(ActionEvent event) {
		calculadora.insertar('5');
	}

	@FXML
	void onInsertarCuatroAction(ActionEvent event) {
		calculadora.insertar('4');
	}

	@FXML
	void onInsertarDosAction(ActionEvent event) {
		calculadora.insertar('2');
	}

	@FXML
	void onInsertarNueveAction(ActionEvent event) {
		calculadora.insertar('9');
	}

	@FXML
	void onInsertarOchoAction(ActionEvent event) {
		calculadora.insertar('8');
	}

	@FXML
	void onInsertarSeisAction(ActionEvent event) {
		calculadora.insertar('6');
	}

	@FXML
	void onInsertarSieteAction(ActionEvent event) {
		calculadora.insertar('7');
	}

	@FXML
	void onInsertarTresAction(ActionEvent event) {
		calculadora.insertar('3');
	}

	@FXML
	void onInsertarUnoAction(ActionEvent event) {
		calculadora.insertar('1');
	}

	public GridPane getView() {
		return view;
	}

}
