package jokerBoxes;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import domain.Box;
import tiles.Tile;

/**
 * 
 * Clase correspondiente al comodin con requerimiento: El jugador en turno due�o
 * de la ficha que adquiere el comod�n elije una ficha de alguno de sus
 * oponentes para enviarla a la c�rcel.
 * 
 * @author Rocha y Rojas
 *
 */
public class DropHome extends JokerBox {
	private Tile tile;

	/**
	 * Costructor de la clase dropHome
	 * 
	 * @param selectedBox referencia de la casilla en la que se aplica el comodin
	 */
	public DropHome(Box selectedBox) {
		super(selectedBox);
		selectedBox.getInstance().add(new JLabel("D.H"));
		// showOption = true;
	}

	/**
	 * ficha selencionada con este comod�n se ir� directamente a la c�rcel.
	 */
	@Override
	public void use() {
		tile.getOwner().moveToHouse(tile);
		selectedBox.getInstance().setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	/**
	 * define la ficha a la cual enviar a la carcel
	 * 
	 * @param tile Tile ficha objetivo
	 */
	public void pickTarget(Tile tile) {
		this.tile = tile;
	}

}