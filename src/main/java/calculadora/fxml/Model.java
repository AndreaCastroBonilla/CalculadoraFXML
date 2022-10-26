package calculadora.fxml;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Model {

	private StringProperty digito = new SimpleStringProperty();
	private StringProperty coma = new SimpleStringProperty();
	private StringProperty operador = new SimpleStringProperty();
	private StringProperty borrarTodo = new SimpleStringProperty();
	private StringProperty borrar = new SimpleStringProperty();
	private StringProperty pantalla = new SimpleStringProperty();

	public final StringProperty digitoProperty() {
		return this.digito;
	}

	public final String getDigito() {
		return this.digitoProperty().get();
	}

	public final void setDigito(final String digito) {
		this.digitoProperty().set(digito);
	}

	public final StringProperty comaProperty() {
		return this.coma;
	}

	public final String getComa() {
		return this.comaProperty().get();
	}

	public final void setComa(final String coma) {
		this.comaProperty().set(coma);
	}

	public final StringProperty operadorProperty() {
		return this.operador;
	}

	public final String getOperador() {
		return this.operadorProperty().get();
	}

	public final void setOperador(final String operador) {
		this.operadorProperty().set(operador);
	}

	public final StringProperty borrarTodoProperty() {
		return this.borrarTodo;
	}

	public final String getBorrarTodo() {
		return this.borrarTodoProperty().get();
	}

	public final void setBorrarTodo(final String borrarTodo) {
		this.borrarTodoProperty().set(borrarTodo);
	}

	public final StringProperty borrarProperty() {
		return this.borrar;
	}

	public final String getBorrar() {
		return this.borrarProperty().get();
	}

	public final void setBorrar(final String borrar) {
		this.borrarProperty().set(borrar);
	}

	public final StringProperty pantallaProperty() {
		return this.pantalla;
	}

	public final String getPantalla() {
		return this.pantallaProperty().get();
	}

	public final void setPantalla(final String pantalla) {
		this.pantallaProperty().set(pantalla);
	}

}
